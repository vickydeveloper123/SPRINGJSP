package com.intelsoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intelsoft.entity.User;

public interface BookRepo extends JpaRepository<User, String>{

}
