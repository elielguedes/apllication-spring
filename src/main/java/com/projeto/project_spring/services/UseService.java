package com.projeto.project_spring.services;

import com.projeto.project_spring.entities.User;
import com.projeto.project_spring.repositories.UserRepository;
import com.projeto.project_spring.services.exception.DataBaseException;
import com.projeto.project_spring.services.exception.ResourceNotFoudException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
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
        return obj.orElseThrow(() -> new ResourceNotFoudException(id));
    }

    public User create(User obj){
        return repository.save(obj);
    }

    public void delete(Long id){
        try {
            repository.deleteById(id);
            if(repository.existsById(id)){
                throw new ResourceNotFoudException(id);
            }
        }catch(DataIntegrityViolationException e){
            throw new DataBaseException(e.getMessage());
        }
    }

    public User update(Long id, User obj){
        try{

            User entity = repository.getReferenceById(id); // pegar um objeto do banco de dados
            updateData(entity, obj);
            return repository.save(entity);
        }catch(EntityNotFoundException e){
            throw new ResourceNotFoudException(id);
        }
    }

    private void updateData(User entity, User obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
    }
}
