package com.mb.api.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.mb.api.persistance.repository.ProductRepository;

@Component
public class TestRunner implements CommandLineRunner
{
	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public void run(String... args) throws Exception
	{
		
		//productRepository.getProductData("BTL", "HTC").forEach(System.out::println);
		//productRepository.getAllProductInfo().forEach(System.out::println);
		//		productRepository.getProductDataByVenderAndCost()
		//		.stream()
		//		.map(obj -> obj[0] + "=====" + obj[1])
		//		.forEach(System.out::println);
		
		
		//productRepository.getProductDataFromCost().forEach(System.out::println);
		
		//productRepository.searchProductByCode("%D%").forEach(System.out::println);
	
		//productRepository.filterProduct(1.1, 2.2).forEach(System.out::println);
			
		
		/** NOT SELECT OPERATION ...............**/
		
//		Integer rows  = productRepository.removeData(2.1);
//		System.out.println(rows);

	
//		Integer rows  = productRepository.modifyData(10.7, "PWD");
//		System.out.println(rows);
		
		//productRepository.findAll().forEach(System.out::println);
	
//		 Integer rows = productRepository.updateProductCostById(9, 10.8);
//		 
//		 System.out.println(rows);
		
//		 	Integer affectedRows = productRepository.deleteProductByCost(10.8);
	
	}

}
