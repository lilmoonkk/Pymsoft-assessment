package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
class SushiController {
	private final SushiRepository repository;
	
	SushiController(SushiRepository repository){
		this.repository = repository;
	}
	
	@GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
    }
	
	@GetMapping("/sushis")
	List<Sushi> all() {
		return repository.findAll();
	}
}
