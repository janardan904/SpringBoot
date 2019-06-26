package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Student;
import com.app.repo.StudentRepository;
@Component
public class ConsoleRunner implements CommandLineRunner {
	@Autowired
	private StudentRepository repo;
	
	

	@Override
	public void run(String... args) throws Exception {
	System.out.println(repo.getClass().getName());	
	Student st1=null;
	st1=repo.save(new Student("raj","56A466B"));
	System.out.println(st1.getSid());
	repo.save(new Student("B","6345BN567"));


	}

}
