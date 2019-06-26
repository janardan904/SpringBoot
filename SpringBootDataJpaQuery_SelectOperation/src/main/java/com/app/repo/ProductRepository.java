package com.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	@	Query("select  p.prodCost from com.app.model.Product p")
	public List<Double>getCostOnly();
	@Query("select p.prodCost,p.prodCode from com.app.model.Product p")
	public List<Object[]> getInfo();
	
	

}

