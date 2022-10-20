package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Todos;

public interface  UdemyRepository extends JpaRepository<Todos, Long> {

}
