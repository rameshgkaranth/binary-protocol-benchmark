package processor;

import java.io.File;
import java.util.List;

import org.apache.avro.Schema;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.reflect.ReflectData;
import org.apache.avro.reflect.ReflectDatumWriter;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.commons.io.FileUtils;

import beans.Product;

public class ProductAvroSerializeProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		System.out.println("In ProductAvroSerializeProcessor ... ");
		
		List<Product> products = (List<Product>) exchange.getIn().getBody();
		Schema productSchema = ReflectData.get().getSchema(Product.class);
		
		File file = new File("products.avro");
		DatumWriter<Product> datumWriter = new ReflectDatumWriter<Product>(productSchema);
		DataFileWriter<Product> dataFileWriter = new DataFileWriter<>(datumWriter);
		dataFileWriter.create(productSchema, file);
		for (Product product : products) {
			dataFileWriter.append(product);
		}
		dataFileWriter.close();
		
		byte[] serializedData = FileUtils.readFileToByteArray(file);
		exchange.getOut().setBody(serializedData);
	}

}
