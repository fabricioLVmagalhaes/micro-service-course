package com.fabricio.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabricio.hruser.entities.User;

public interface UserRepository  extends JpaRepository<User, Long>{
	
	User findByEmail(String emaail);
}
