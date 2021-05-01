package com.infotech.com;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/api/users/{id}")
	public String getUserEmailId(@PathParam("id") int userId) {
		
		if(userId == 1) {
			return "abc@gmail.com";
		}
		
		return null;
		
	}
	
}
