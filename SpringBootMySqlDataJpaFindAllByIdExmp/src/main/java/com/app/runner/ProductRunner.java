package com.app.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Example;
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
		repo.save(new Product(101,"Geeta" , 3.4));
		repo.save(new Product(102,"Ravi" , null));
		repo.save(new Product(103,"pam",2.4));
		repo.save(new Product(104,"jan",3.5));
		repo.save(new Product(103,"ram",3.4));
		repo.save(new Product(103,"anju",null));
		System.out.println(repo.getClass().getName());
		
List<Product> list=repo.findAll();
list.forEach(System.out::println); 

repo.findAllById(Arrays.asList(2,4,6)).forEach(System.out::println);
	}

}