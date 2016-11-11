package routes;

import org.apache.camel.builder.RouteBuilder;

import processor.AvroSerializeProcessor;

public class EmployeeInfoRoute extends RouteBuilder {
	
	@Override
	public void configure() throws Exception {
		System.out.println("In EmployeeInfoRoute ... ");
		from("direct:source").process(new AvroSerializeProcessor()).to("stream:out");
	}

}
