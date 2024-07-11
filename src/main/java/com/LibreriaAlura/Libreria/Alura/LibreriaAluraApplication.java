package com.LibreriaAlura.Libreria.Alura;

import com.LibreriaAlura.Libreria.Alura.main.Principal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibreriaAluraApplication implements CommandLineRunner {

	private final Principal principal;

	@Autowired
	public LibreriaAluraApplication(Principal principal) {
		this.principal = principal;
	}

	public static void main(String[] args) {
		SpringApplication.run(LibreriaAluraApplication.class, args);
	}

	@Override
	public void run(String... args) {
		principal.verMenu();
	}
}

