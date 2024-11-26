package com.julio.curso.springboot.app.springboot_crudjpa.services;

import java.util.List;

import com.julio.curso.springboot.app.springboot_crudjpa.models.User;

public interface UserService {

    List<User> findAll();

    User save(User user);

    boolean existsByUsername(String username);
} 