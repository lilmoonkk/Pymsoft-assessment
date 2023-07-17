package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

interface SushiRepository extends JpaRepository<Sushi, Long> {
	
	@Query("select s from Sushi s where s.category = ?1")
	List<Sushi> findByCategory(String category);

}
