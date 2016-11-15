package service;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.avro.Schema;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.reflect.ReflectData;
import org.apache.avro.reflect.ReflectDatumWriter;
import org.apache.avro.specific.SpecificDatumWriter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import beans.Product;
import beans.Products;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

public class ProductListService {
	
	private int allProductsSize;
	
	public ProductListService(int allProductsSize) {
		this.allProductsSize = allProductsSize;
	}
	
	private static Schema productSchema;
	
	static {
		try {
			productSchema = ReflectData.get().getSchema(Product.class);
			//productSchema = new Schema.Parser().parse(new File("/Users/rkaranth/Workspace-Private/binary-protocol-benchmark/src/main/resources/avro/products.avsc"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<Product> getAllProducts() {
		PodamFactory factory = new PodamFactoryImpl();
		List<Product> productLists = new ArrayList<>();
		
		for (int i = 0; i < allProductsSize; i++) {
			productLists.add(factory.manufacturePojo(Product.class));
		}
		
		return productLists;
	}
	
	private long serializeProductsInAvro(List<Product> products) throws IOException {
		//File file = new File("products.avro");
		long startTime = System.currentTimeMillis();
		OutputStream outputStream = new ByteArrayOutputStream();
		DatumWriter<Product> datumWriter = new ReflectDatumWriter<Product>(productSchema);
		DataFileWriter<Product> dataFileWriter = new DataFileWriter<>(datumWriter);
		dataFileWriter.create(productSchema, outputStream);
		
		for (Product product : products) {
			dataFileWriter.append(product);
		}
		
		dataFileWriter.close();
		long endTime = System.currentTimeMillis();
		return endTime - startTime;
	}
	
	private long serializeProductsInJson(List<Product> products) throws IOException {
		OutputStream outputStream = new ByteArrayOutputStream();
		long startTime = System.currentTimeMillis();
		ObjectMapper mapper = new ObjectMapper();
		//String json = mapper.writeValueAsString(products);
		mapper.writeValue(outputStream, products);
		
		long endTime = System.currentTimeMillis();
		return endTime - startTime;
		
	}
	
	public static void main(String[] args) throws IOException {
		ProductListService service = new ProductListService(20);
		List<Product> products = service.getAllProducts();
		
		long avroTime = service.serializeProductsInAvro(products);
		long jsonTime = service.serializeProductsInJson(products);
		
		System.out.println("AVRO TIME : "+avroTime);
		System.out.println("JSON TIME : "+jsonTime);
		
	}
}
