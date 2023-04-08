package com.diy4rent.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.diy4rent.backend.model.Herramienta;
import com.diy4rent.backend.model.Usuario;
import com.diy4rent.backend.repository.HerramientaRepository;
import com.diy4rent.backend.repository.UsuarioRepository;

@SpringBootApplication
public class Diy4rentBackendApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Diy4rentBackendApplication.class, args);
	}
	
	@Autowired
	private HerramientaRepository herramientaRepository;
	
	@Autowired
	private UsuarioRepository  usuarioRepository;

	@Override
	public void run(String... args) throws Exception {
		this.herramientaRepository.save(new Herramienta("Martillo VK67", "Martillo", 2, 1, 5.99, "Martillo muy bonito", "https://www.suteva.com/wp-content/uploads/2021/02/leo-moko-B4YHKz6lLrQ-unsplash.jpg"));
		this.herramientaRepository.save(new Herramienta("Alicate VK67", "Alicate", 2, 1,5.99, "Martillo muy bonito", "https://i.ytimg.com/vi/JL4QyQFEboA/hqdefault.jpg"));
		this.herramientaRepository.save(new Herramienta("Sierra VK67", "Sierra", 2, 2,5.99, "Martillo muy bonito", "https://woodgears.ca/homemade_tablesaw/build12.jpg"));
		this.herramientaRepository.save(new Herramienta("Pistola de silicona VK67", "Silicona", 2, 3,5.99, "Martillo muy bonito", "https://www.decorablog.com/wp-content/2014/06/P1050058.jpg"));
		this.herramientaRepository.save(new Herramienta("Martillo thor", "Martillo", 2, 3, 5.99, "Martillo muy bonito", "https://cdn.s7.shopdisney.eu/is/image/DisneyStoreES/461062536720-5?fmt=jpeg&qlt=90&wid=652&hei=652&defaultImage=no-image-es_es"));
		this.herramientaRepository.save(new Herramienta("Pistola de silicona Many", "Silicona", 2, 2,5.99, "Martillo muy bonito", "https://www.lidl.es/media/product/0/0/5/2/0/6/9/pistola-para-cartuchos-zoom--1.jpg"));
		
		
		this.usuarioRepository.save(new Usuario("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRfjyK1KVJ7045K2AV_-GWlD_cxu5hV4fKp0btPj_IuFXPvsOhWmqx3hT-lvvzS_lTm0n0&usqp=CAU","Joselito", "@gmail.com", 23564, "@paypal.com", "c/joselito", "1234"));
		this.usuarioRepository.save(new Usuario("https://images.ecestaticos.com/wzJULuyjO5Pdrlb1SOgVGGJ1dk8=/6x21:1023x555/600x315/filters:fill(white):format(jpg)/f.elconfidencial.com%2Foriginal%2Ff1f%2F64f%2F716%2Ff1f64f7169e758f3cdc00624fe0f4250.jpg","Marisol", "@gmail.com", 23564, "@paypal.com", "c/marison", "1234"));
		this.usuarioRepository.save(new Usuario("https://img.a.transfermarkt.technology/portrait/big/t_20728_12_2010_1.jpg?lm=1","Rafel", "@gmail.com", 23564, "@paypal.com", "c/rafel", "1234"));
		
	}

}
