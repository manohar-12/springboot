//package com.example.demo.service;
//
//import java.util.*;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.example.demo.model.Todos;
//
//@Service
//public class TodosService {
//	
//	private static List<Todos> todos=new ArrayList();
//	private static long idCounter=0;
//	
//	static {
//		 todos.add(new Todos(++idCounter,"Manohar","JavaFsd",new Date(),true));
//		 todos.add(new Todos(++idCounter,"Laxman","PythonFsd",new Date(),false));
//		 todos.add(new Todos(++idCounter,"Dinesh","DotNetFsd",new Date(),true));
//		 todos.add(new Todos(++idCounter,"Suresh","Cloud",new Date(),true));
//		 todos.add(new Todos(++idCounter,"Mahesh","SeleniumTester",new Date(),false));
//		 todos.add(new Todos(++idCounter,"Venaktesh","CyberSecurity",new Date(),true));
//		 todos.add(new Todos(++idCounter,"Lokesh","Javafsd",new Date(),true));
//		 todos.add(new Todos(++idCounter,"Ranveer","javaFsd",new Date(),false));
//		 todos.add(new Todos(++idCounter,"Ganesh","DotNetFsd",new Date(),true));
//		
//	}
//	public List<Todos> findAll()
//	{
//		return todos;
//	}
//	public Todos deleteById(Long id) {
//		Todos todo=findById(id);
//		if(todo==null) return null;
//		if(todos.remove(todo)) {
//			return todo;
//		}
//		return null;
//	}
//	public Todos findById(long id) {
//		for(Todos todo:todos) {
//			if(todo.getId()==id) {
//				return todo;
//			}
//		}
//		return null;
//	}
//	
//}
