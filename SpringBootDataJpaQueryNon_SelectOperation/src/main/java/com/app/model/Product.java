package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Product {
	@Id
	private Integer prodId;
	private String prodCode;
	private Double ProdCost;
	private String prodModel;
	public Product() {
		super();
	}
	public Product(Integer prodId, String prodCode, Double prodCost, String prodModel) {
		super();
		this.prodId = prodId;
		this.prodCode = prodCode;
		ProdCost = prodCost;
		this.prodModel = prodModel;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int id) {
		this.prodId = prodId;
	}
	public String getProdCode() {
		return prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}
	public Double getProdCost() {
		return ProdCost;
	}
	public void setProdCost(Double prodCost) {
		ProdCost = prodCost;
	}
	public String getProdModel() {
		return prodModel;
	}
	public void setProdModel(String prodModel) {
		this.prodModel = prodModel;
	}
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodCode=" + prodCode + ", ProdCost=" + ProdCost + ", prodModel=" + prodModel
				+ "]";
	}
	
}
