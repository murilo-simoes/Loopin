package com.loopino.loopino.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loopino.loopino.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	User findByEmail(String email);
	Optional<User> findByUuid(UUID id);
	
	/*
	Exemplos
	
	Optional<User> findById(Integer id);
	
	
	User save(User user);
	
	List<User> findAll();
	
	
	void deleteById(int id);

	@Query("SELECT u FROM User u WHERE u.id_company = ?1")
	List<User> findAllByIdCompany(Integer id_company); 
	*/
}

