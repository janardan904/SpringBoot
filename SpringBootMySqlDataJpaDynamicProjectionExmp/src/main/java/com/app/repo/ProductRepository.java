package com.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	<T> List<T> findByProdCode(String prodCode, Class<T> type);
	<T> List<T> findByProdCost(Double prodCost, Class<T> type);
	interface mydata{
	String getProdCode();
	String getProdModel();


}
interface MyView{
	String getProdVendor();
	Double getProdCost();
	
	
}


}


