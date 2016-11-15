package routes;

import org.apache.camel.builder.RouteBuilder;

import processor.ProductAvroDeSerializeProcessor;

public class ProductInfoDeSerializeRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		System.out.println("In ProductInfoDeSerializeRoute ... ");
		from("direct:productinfodeserialize").process(new ProductAvroDeSerializeProcessor());
	}

}
