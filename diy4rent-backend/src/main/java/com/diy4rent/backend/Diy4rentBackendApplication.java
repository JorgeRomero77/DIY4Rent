package com.diy4rent.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.diy4rent.backend.model.Herramienta;
import com.diy4rent.backend.repository.HerramientaRepository;

@SpringBootApplication
public class Diy4rentBackendApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Diy4rentBackendApplication.class, args);
	}
	
	@Autowired
	private HerramientaRepository herramientaRepository;

	@Override
	public void run(String... args) throws Exception {
		this.herramientaRepository.save(new Herramienta("Martillo VK67", "Martillo", 2, 5.99, "Martillo muy bonito", "https://www.suteva.com/wp-content/uploads/2021/02/leo-moko-B4YHKz6lLrQ-unsplash.jpg"));
		this.herramientaRepository.save(new Herramienta("Alicate VK67", "Alicate", 2, 5.99, "Martillo muy bonito", "https://i.ytimg.com/vi/JL4QyQFEboA/hqdefault.jpg"));
		this.herramientaRepository.save(new Herramienta("Sierra VK67", "Sierra", 2, 5.99, "Martillo muy bonito", "https://woodgears.ca/homemade_tablesaw/build12.jpg"));
		this.herramientaRepository.save(new Herramienta("Pistola de silicona VK67", "Silicona", 2, 5.99, "Martillo muy bonito", "https://www.decorablog.com/wp-content/2014/06/P1050058.jpg"));
		
	}

}
