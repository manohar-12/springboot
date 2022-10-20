package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repository.LoginRepository;
import com.example.demo.model.LoginRegistration;

@RestController
@CrossOrigin
@RequestMapping("/LoginRegistration")
public class LoginRegistrationController {

	@Autowired 
	LoginRepository lp;
	
	@PostMapping("/register")
	public ResponseEntity Register(@RequestBody LoginRegistration Lr) {
		return new ResponseEntity(lp.save(Lr),HttpStatus.OK);
	}
	
	@PutMapping("RegisterUpdate")
	public ResponseEntity RegisterUpdate(@RequestBody LoginRegistration Lr) {
		return new ResponseEntity(lp.save(Lr),HttpStatus.OK);
	}
	@GetMapping("/ShowLogins")
	public ResponseEntity<List<LoginRegistration>> Show(){
		return new ResponseEntity(lp.findAll(),HttpStatus.OK);
	}
	
}
