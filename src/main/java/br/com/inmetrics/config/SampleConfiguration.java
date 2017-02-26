package br.com.inmetrics.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SampleConfiguration {

	@Value("${sample.config.1}")
	private String configuration1;
	
	@Value("${sample.config.2}")
	private String configuration2;
	
	@Value("${sample.config.3}")
	private String configuration3;

	public SampleConfiguration() {
	}

	public String getConfiguration1() {
		return configuration1;
	}

	public void setConfiguration1(String configuration1) {
		this.configuration1 = configuration1;
	}

	public String getConfiguration2() {
		return configuration2;
	}

	public void setConfiguration2(String configuration2) {
		this.configuration2 = configuration2;
	}

	public String getConfiguration3() {
		return configuration3;
	}

	public void setConfiguration3(String configuration3) {
		this.configuration3 = configuration3;
	}
	
}
