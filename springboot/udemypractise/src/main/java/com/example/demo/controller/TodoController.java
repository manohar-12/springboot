package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repository.UdemyRepository;
import com.example.demo.model.Todos;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/todos")
public class TodoController {
	@Autowired
	private UdemyRepository rep;;
	
	@PostMapping("/save")
	public Todos Save(@RequestBody Todos todo){
		return rep.save(todo) ;
	}
	@GetMapping("/show")
	public List<Todos> Show(){
		return rep.findAll();
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteTodo(@PathVariable long id){
		rep.deleteById(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	@GetMapping("/Show/{id}")
	public ResponseEntity DisplaybyId(@PathVariable long id){
		Optional<Todos> todo=rep.findById(id);
		return new ResponseEntity(todo,HttpStatus.ACCEPTED);
	}
	@PutMapping("/update")
	public Todos Update(@RequestBody Todos todo) {
		return rep.save(todo);
	}
}
