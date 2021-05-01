package com.infotech.controller;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.infotech.beans.HelloWorldBan;

@RestController
public class HelloWorldController {

	//GET
	@RequestMapping(method=RequestMethod.GET, path="/hello-world")
	public String helloWorld() {
		return "Hello World";
	}

    @GetMapping(path="/hello-world-bean")
	public HelloWorldBan helloWorldBean() {
		return new HelloWorldBan("Hello World");
	}
	//hello-world/path-variable/in28minutes
    @GetMapping(path="/hello-world/path-variable/{name}")
  	public HelloWorldBan helloWorldBean(@PathVariable String name) {
  		return new HelloWorldBan(String.format("Hello World, %s", name));
  	}
  	
    
    @GetMapping(path="/hello-world-internationalization")
	public HelloWorldBan helloWorldInternationalized() {
		return new HelloWorldBan("Hello World");
	}
	
	
}
