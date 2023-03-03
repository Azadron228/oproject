package com.azardo5300.oproject.Repository;

public @Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
    User findByUsername(String username);
    
}
