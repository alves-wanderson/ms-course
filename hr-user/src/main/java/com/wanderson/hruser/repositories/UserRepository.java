package com.wanderson.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wanderson.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByEmail(String email);
}
