package br.com.inmetrics.service;

import org.springframework.stereotype.Service;

@Service
public class SampleService {
	
	public String index() {
		return "Main Page";
	}
	
	public String hello() {
		return "Spring Boot Application Sample";
	}

}
