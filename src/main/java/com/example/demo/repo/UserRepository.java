package com.example.demo.repo;

import java.util.List; 
import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository; 
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	List<User> findByFirstName(String firtsName);  
	List<User> findByEmailContaining(String keyword);

}
