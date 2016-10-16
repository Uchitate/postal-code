package com.exapmle;

import org.springframework.stereotype.Component;

@Component
public class SampleBean {
	public String sampleMethod(String input) {
		return "Called sampleMethod : arg = " + input;
	}
}
