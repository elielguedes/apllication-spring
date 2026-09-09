package com.projeto.project_spring.repositories;

import com.projeto.project_spring.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
