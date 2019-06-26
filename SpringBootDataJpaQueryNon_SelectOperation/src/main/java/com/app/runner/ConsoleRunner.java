package com.app.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repo.ProductRepository;
@Component
public class ConsoleRunner implements CommandLineRunner {
	@Autowired
	private ProductRepository repo;

	@Override
	public void run(String... args) throws Exception {

		repo.save(new Product(100,"A",3.4,"abc"));
		repo.save(new Product(101,"D",5.4,"tbc"));
		repo.save(new Product(102,"G",6.4,"jbc"));
		repo.save(new Product(103,"H",2.4,"ahc"));
		repo.save(new Product(104,"J",5.4,"agc"));
		
		List<Product> list=repo.findAll();
		list.forEach(System.out::println);
		
		
		int count =repo.removeData(100);
		System.out.println(count);

	}

}
