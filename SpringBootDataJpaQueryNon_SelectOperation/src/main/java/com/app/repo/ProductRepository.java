package com.app.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.app.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    
    @Modifying
    @Transactional
	@Query("delete from product p where p.prodId=:id")
	public int removeData(Integer prodId);
}
