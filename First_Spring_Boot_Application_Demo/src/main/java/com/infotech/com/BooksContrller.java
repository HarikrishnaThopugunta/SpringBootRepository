package com.infotech.com;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksContrller {

	@GetMapping("/books")
	public List<Book> getAllBooks(){
		return Arrays.asList(new Book(1,"Spring japa","Rangakaran"));	
	}
}
