package com.example;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReadEnvVarsController {
	
	@Value("${server.tomcat.max-threads}")
	private Integer maxThreads;

	public ReadEnvVarsController() {
		// TODO Auto-generated constructor stub
	}

	@RequestMapping(value="/random", method=RequestMethod.GET)
	public Integer randomInteger() {
		Random rand = new Random();
		int n = rand.nextInt(100) + 1;
		return new Integer(n);
	}
	
	@RequestMapping(value="/maxThreads", method=RequestMethod.GET)
	public Integer maxThreads(){
		return maxThreads;
	}
}
