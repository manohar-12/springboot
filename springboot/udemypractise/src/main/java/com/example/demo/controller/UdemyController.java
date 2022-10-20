package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Model;

@RestController
@CrossOrigin(origins = "http://localhost:62421")
@RequestMapping("/udemy")
public class UdemyController {

	
	@GetMapping("/welcome")
	public Model response() {
		return new Model("welcome to the world");
	}
   
	@GetMapping("/welcome/{name}")
	public Model response1(@PathVariable String name) {
		return new  Model("welcome to the world"+" "+name);
	}
}
