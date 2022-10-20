package com.example.demo.Repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.*;
public interface LoginRepository extends JpaRepository<LoginRegistration, Long>{

}
