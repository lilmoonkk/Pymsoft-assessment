/*package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {
	private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

	@Bean
	CommandLineRunner initDatabase(SushiRepository repository) {

		return args -> {
			log.info("Preloading " + repository.save(new Sushi("Unagi sushi", 6.50, "sushi")));
			log.info("Preloading " + repository.save(new Sushi("Seaweed crab wrap", 5.50, "sushi")));
			log.info("Preloading " + repository.save(new Sushi("Tamago sushi", 2.20, "sushi")));
			log.info("Preloading " + repository.save(new Sushi("Curry don", 15.50, "don")));
			log.info("Preloading " + repository.save(new Sushi("Unagi don", 24.50, "don")));
	    };
	}
}*/
