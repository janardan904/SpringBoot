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
		repo.save(new Product(100,"Ankit" , 3.4));
		repo.save(new Product(101,"Geeta" , 3.2));
		repo.save(new Product(102,"Ravi" , 5.3));
		repo.save(new Product(103,"pam",2.4));
		repo.save(new Product(104,null,2.4));
		System.out.println(repo.getClass().getName());
		
		/*
		  List<Product> list= repo. findByProdCostLessThanEqual(3.4);
		  list.forEach(System.out::println);*/
		 
		List<Product> list= repo.findByProdCodeIsNotNull();
	list.forEach(System.out::println);
	}

}
