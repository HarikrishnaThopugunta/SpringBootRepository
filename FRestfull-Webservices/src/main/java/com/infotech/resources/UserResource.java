package com.infotech.resources;

import java.net.URI;
import java.util.List;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.infotech.beans.User;
import com.infotech.dao.UserDaoService;
import com.infotech.exceptions.UserNotFoundException;
import org.springframework.hateoas.*;

@RestController				
public class UserResource {
	
	@Autowired
	private UserDaoService userDaoService;
	
	//retrieve all the users 
	@GetMapping("/users")
	public List<User> retrieveAllUsers() {
		return userDaoService.findAll();
	}

	//retrieveUser(int id)
	@GetMapping("/user/{id}")
	public User retrieveUser(@PathVariable int id) {
		User user =  userDaoService.findOne(id);
		if(user == null) {
			throw new UserNotFoundException("id-"+id);
		}
		//"all-users", SERVER_PATH +"/users"
		
		//HATEOAS
		//ResourceSupport
		
		return user;
	}
	
	//Post -- URI 	
	//input --details of users 
	//output -- CREATED and Retuen the created URI
	@PostMapping("/adduser")
	public ResponseEntity<Object> createUser(@RequestBody User user) {
		User savedUser = userDaoService.save(user);
		//CREATED -- return a status of cerate dresource
		//create resouce uri -- adduser/1
		URI location = ServletUriComponentsBuilder
					.fromCurrentRequest()
					.path("/{id}")
					.buildAndExpand(savedUser.getId()).toUri();
			
		return ResponseEntity.created(location).build();
	}
	
	
	@DeleteMapping("/deleteuser/{id}")
	public void deleteUser(@PathVariable int id) {
		User user = userDaoService.deleteUser(id);
		if(user == null) {
			throw new UserNotFoundException("id-"+id);
		}
	}
	
	
	
	
	
}
