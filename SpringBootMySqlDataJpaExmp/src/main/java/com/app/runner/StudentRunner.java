package com.app.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Student;
import com.app.repo.StudentRepository;
@Component
public class StudentRunner implements CommandLineRunner {
	@Autowired
	private StudentRepository srepo;

	@Override
	public void run(String... args) throws Exception {
		srepo.save(new Student(10,"raj","5647B54"));
		srepo.save(new Student(11,"geeta","67H8546"));
		srepo.save(new Student(12,"ravi","5674G57"));
		//bulk insert
		/*
		 * List<Student> stud=Arrays.asList(new Student(101,"R","4673H546"), new
		 * Student(102,"S","4567F465")); srepo.saveAll(stud);
		 */
		//fetch one row
		
		 Optional<Student> st1=null; st1=srepo.findById(11); 
		  if(st1.isPresent()) {
		  Student stud1=st1.get(); System.out.println(stud1.getPassportNumber()); }
		  else {
			  System.out.println("Row not found");
		  
		  }
		 
		//fetch all rows
		
		  List<Student> list=(List<Student>) srepo.findAll();
		  list.forEach(System.out::println);
		 
		
		

	}

}
