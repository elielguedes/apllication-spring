package com.projeto.project_spring.services;

import com.projeto.project_spring.entities.User;
import com.projeto.project_spring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UseService {

    @Autowired
    private UserRepository repository;

    public List<User> finAll(){
        return repository.findAll();
    }

    public User findById(Long id){
        Optional<User> obj = repository.findById(id);
        return obj.get();
    }

    public User create(User obj){
        return repository.save(obj);
    }
}
