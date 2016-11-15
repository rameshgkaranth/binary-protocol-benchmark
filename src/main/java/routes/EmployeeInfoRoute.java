package routes;

import org.apache.camel.builder.RouteBuilder;

import processor.EmployeeAvroSerializeProcessor;

public class EmployeeInfoRoute extends RouteBuilder {
	
	@Override
	public void configure() throws Exception {
		System.out.println("In EmployeeInfoRoute ... ");
		from("direct:source").process(new EmployeeAvroSerializeProcessor()).to("stream:out");
	}

}
