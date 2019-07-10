package com.app.runner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class ConsoleRunner implements CommandLineRunner {

	//Apache log4j
	private static Logger log=LogManager.getLogger(ConsoleRunner.class);
	@Override
	public void run(String... args) throws Exception {
		try {
			log.info("consoleRunner started");
			int a=10,b=20,c=1;
			log.info("data init done");
			if(a>0 &&b>0) {
				c=a+b;
				log.info("if block executed");
			}
			else {
				
			
				c=a-b;
			log.info("else block executed");
			
		}
			log.debug("finala result is: "+c);
			if(c>0) {
				throw new RuntimeException("hello sample");
				
			}
		}
			catch(Exception e) {
				//e.printStackTrace();
				log.error("problem found"+e);
			}
			//stop server
			System.exit(0);
			}
		}
	
