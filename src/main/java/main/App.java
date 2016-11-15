package main;

import java.util.List;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.impl.DefaultCamelContext;

import beans.Product;
import routes.ProductInfoDeSerializeRoute;
import routes.ProductInfoSerializeRoute;
import service.ProductListService;

public class App {

	public static void main(String[] args) throws Exception {
		System.out.println("Starting camel context ... ");
		
		CamelContext camelContext = new DefaultCamelContext();
		camelContext.addRoutes(new ProductInfoSerializeRoute());
		camelContext.addRoutes(new ProductInfoDeSerializeRoute());
		camelContext.start();
		
		ProducerTemplate template = camelContext.createProducerTemplate();
		
		ProductListService productListService = new ProductListService(1);
		List<Product> products = productListService.getAllProducts();
		template.sendBody("direct:productinfoserialize", products);
		
        Thread.sleep(5000);
        
        System.out.println("I'm done ... ");
	}
}
