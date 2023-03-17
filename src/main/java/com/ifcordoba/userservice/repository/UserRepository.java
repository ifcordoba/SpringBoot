package com.ifcordoba.userservice.repository;


import com.ifcordoba.userservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface UserRepository extends JpaRepository<User, Integer> {



}
