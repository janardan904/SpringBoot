package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import com.app.util.EmailUtil;
@Component
public class ConsoleRennur implements CommandLineRunner {
	@Autowired
	private EmailUtil util;
	

	@Override
	public void run(String... args) throws Exception {
		ClassPathResource file=new ClassPathResource("abc.txt");
		boolean flag=util.Send("janardannarvate904@gmail.com","AA", "Hello", file);
       if(flag)System.out.println("SENT");
       else
    	   System.out.println("CHECK PROBLEMS ");
	}

}
