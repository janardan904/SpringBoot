package com.app.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Employee;
@RestController
@RequestMapping("/home")
public class HomeRestController {
	
	@GetMapping("/show")
	private String show(){
		return  "HELLO GET";
	}
	@GetMapping("/showa")
	public ResponseEntity<String >showA(){
		return new ResponseEntity<String>(
				"FROM GET",HttpStatus.NO_CONTENT);
	}
	@PostMapping("/save")
	public Employee save() {
		return new Employee(10,"AA");
		
	}
	@PostMapping("/all")
	public List<Employee> all(){
		return Arrays.asList( new Employee(11,"AB"),
				 new Employee(12,"Ac"),
				 new Employee(13,"Ad")
				);
	}
	@PostMapping("/update")
	public String modify() {
		return "FROM UPDATE";
				}
	@DeleteMapping("/remove")
	public String del() {
		return"FROM DELETE";
	}
	@PatchMapping("updatea")
public String partial() {
	return"FROM MODIFY FEW";
}

}
