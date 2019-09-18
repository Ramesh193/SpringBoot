package com.verinon.email.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.verinon.email.emailcofig.EmailConfig;
@Component
public class ConsoleRunner implements CommandLineRunner {

	@Autowired
	EmailConfig cnfg;
	@Override
	public void run(String... args) throws Exception {
	boolean b=	cnfg.emailSend();
	System.out.println("true vale "+b);
		
	}

}
