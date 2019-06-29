package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.model.Product;
import com.app.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductService service;
	
	//show product form with baking object
	@RequestMapping("/reg")
	public String showReg(Model map) {
	map.addAttribute("product",new Product());
	return "Register";
	
	}
	//read form data on click submit
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String saveData(@ModelAttribute Product product ,Model map)
	{
		Integer id=service.SaveProduct(product);
		map.addAttribute("message", "Product ' "+id+" ' created!!");
		map.addAttribute("product",new Product());
		return  "Register";
		
	}
	//fetch all rows from db
	@RequestMapping("/all")
	public String showAll(Model map) {
		List<Product>ob=service.getAllProducts();
		map.addAttribute("list",ob);
		
		return "Data";
		
	}
//Delete row based id
	@RequestMapping("/delete")
	public String remove(@RequestParam Integer id) {
		service.deleteProduct(id);
		return"redirect:all";
	}
}
