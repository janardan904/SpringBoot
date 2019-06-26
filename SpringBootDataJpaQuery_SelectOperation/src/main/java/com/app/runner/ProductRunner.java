package com.app.runner;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repo.ProductRepository;
@Component
public class ProductRunner implements CommandLineRunner {
	@Autowired
	private ProductRepository repo;


	@Override
	public void run(String... args) throws Exception {
		repo.save(new Product(100,"A", "abc", "xyz", 3.4));
		repo.save(new Product(101,"G", "apd", "gfh", 3.3));
		repo.save(new Product(102,"B", "ahc", "xuz", 4.5));
		repo.save(new Product(103,"F", "jkl", "xyz", 8.4));
		repo.save(new Product(104,"H", "klm", "gkz", 9.4));
		repo.save(new Product(105,"S", "fhc", "xkz", 3.9));
		
	
			List<Product> list=repo.findAll();
			list.forEach(System.out::println);
			
			repo.getCostOnly().forEach(System.out::println);
        repo.getInfo().forEach(System.out::println);
         
			
	}
}
			
		
	


