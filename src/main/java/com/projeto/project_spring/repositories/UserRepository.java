package com.projeto.project_spring.repositories;

import com.projeto.project_spring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
