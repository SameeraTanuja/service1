package com.capgemini.configservice1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Message {
	public void setMessage(String message) {
		this.message = message;
	}
	
	@Value("${message:Default Hello}")
	private String message;
	@GetMapping("/message")
	public String getMessage() {
		return message;
	}



}
