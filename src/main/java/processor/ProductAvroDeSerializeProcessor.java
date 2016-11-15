package processor;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.avro.file.DataFileStream;
import org.apache.avro.io.DatumReader;
import org.apache.avro.reflect.ReflectDatumReader;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import beans.Product;

public class ProductAvroDeSerializeProcessor implements Processor  {

	@Override
	public void process(Exchange exchange) throws Exception {
		System.out.println("In ProductAvroDeSerializeProcessor ... ");
		byte[] serializedContent = exchange.getIn().getBody(byte[].class);
		InputStream inputStream = new ByteArrayInputStream(serializedContent);
		
		
		DatumReader<Product> datumReader = new ReflectDatumReader<>(Product.class);
		DataFileStream<Product> dataFileStream = new DataFileStream<Product>(inputStream, datumReader);
		
		List<Product> products = new ArrayList<>();
		while (dataFileStream.hasNext()) {
			products.add(dataFileStream.next());
		}
		
		dataFileStream.close();
		System.out.println("Products deserialized ... "+products);
	}

}
