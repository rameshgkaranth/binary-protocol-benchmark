package processor;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;

import org.apache.avro.Schema;
import org.apache.avro.file.DataFileStream;
import org.apache.avro.io.DatumReader;
import org.apache.avro.reflect.ReflectDatumReader;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.model.dataformat.AvroDataFormat;

import beans.Employee;

public class EmployeeAvroSerializeProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		System.out.println("In EmployeeAvroSerializeProcessor processor ... ");
		byte[] serializedContent = ((byte[]) exchange.getIn().getBody());
		InputStream inputStream = new ByteArrayInputStream(serializedContent);
		
		Schema schema = new Schema.Parser().parse(new File("/Users/rkaranth/Workspace-Private/binary-protocol-benchmark/src/main/resources/avro/employee.avsc"));
		AvroDataFormat avroDataFormat = new AvroDataFormat("beans.Employee");
		avroDataFormat.setSchema(schema);
		
		DatumReader<Employee> empDatumReader = new ReflectDatumReader<Employee>(Employee.class);
		DataFileStream<Employee> empFileReader = new DataFileStream<Employee>(inputStream, empDatumReader);
		Employee readEmployee = empFileReader.next();
		System.out.println("Employee read : "+readEmployee);
		empFileReader.close();
		
		exchange.getOut().setBody(readEmployee);
	}

}
