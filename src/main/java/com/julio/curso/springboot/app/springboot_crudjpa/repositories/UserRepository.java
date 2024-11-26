package com.julio.curso.springboot.app.springboot_crudjpa.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.julio.curso.springboot.app.springboot_crudjpa.models.User;

public interface UserRepository extends CrudRepository<User,Long>{

    boolean existsByUsername(String username);

    Optional<User> findByUsername(String username);
    
} 