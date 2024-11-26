package com.julio.curso.springboot.app.springboot_crudjpa.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.julio.curso.springboot.app.springboot_crudjpa.models.Role;

public interface RoleRepository extends CrudRepository<Role,Long> {

    Optional<Role> findByName(String name);
    
} 
