package com.azardo5300.oproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.azardo5300.oproject.Model.User;

public @Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
    User findByUsername(String username);
    
}
