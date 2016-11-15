package routes;

import org.apache.camel.builder.RouteBuilder;

import processor.ProductAvroSerializeProcessor;

public class ProductInfoSerializeRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		System.out.println("In ProductInfoSerializeRoute ... ");
		
		from("direct:productinfoserialize").process(new ProductAvroSerializeProcessor()).to("direct:productinfodeserialize");
	}


}
