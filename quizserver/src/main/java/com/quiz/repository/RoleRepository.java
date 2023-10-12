package com.quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quiz.entities.Role;

public interface RoleRepository extends JpaRepository<Role,Integer> {

}
