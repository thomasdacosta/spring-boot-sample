package br.com.inmetrics.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.inmetrics.config.SampleConfiguration;
import br.com.inmetrics.service.SampleService;

@Controller
public class SampleController {
	
	@Autowired
	private SampleService sampleService; 
	
	@Autowired
	private SampleConfiguration sampleConfiguration;

	@RequestMapping("/")
	@ResponseBody
	public String index() {
		return sampleService.index();
	}
	
	@RequestMapping("/sample/hello")
	@ResponseBody
	public String hello() {
		return sampleService.hello();
	}
	
	@RequestMapping("/sample/config")
	@ResponseBody
	public String config() {
		return sampleConfiguration.getConfiguration1() + " - "
				+ sampleConfiguration.getConfiguration2() + " - "
				+ sampleConfiguration.getConfiguration3();
	}

}
