package com.quiz.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.quiz.entities.Category;

//import com.quiz.entities.category;
public interface CategoryRepository extends JpaRepository<Category,Long> {

}
