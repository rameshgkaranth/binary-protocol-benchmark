package main;

import java.io.File;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.commons.io.FileUtils;

import routes.EmployeeInfoRoute;

public class App {

	public static void main(String[] args) throws Exception {
		System.out.println("Starting camel context ... ");
		
		CamelContext camelContext = new DefaultCamelContext();
		camelContext.addRoutes(new EmployeeInfoRoute());
		camelContext.start();
		
		ProducerTemplate template = camelContext.createProducerTemplate();
		byte[] content = FileUtils.readFileToByteArray(new File("/Users/rkaranth/Workspace-Private/binary-protocol-benchmark/src/main/resources/avro/employee.avro"));
		template.sendBody("direct:source", content);
		
        Thread.sleep(5000);
        
        System.out.println("I'm done ... ");
	}
}
