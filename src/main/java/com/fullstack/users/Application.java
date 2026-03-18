package com.fullstack.users;

import com.fullstack.users.models.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);


		User user = new User();

		user.setRut("16545687-2");
		user.setNombre("Juan");
		user.setApellido("Perez");


		System.out.println(user.toString());
	}

}
