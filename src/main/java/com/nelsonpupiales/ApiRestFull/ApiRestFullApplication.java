package com.nelsonpupiales.ApiRestFull;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiRestFullApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiRestFullApplication.class, args);                
	}
        
	public void run(String... args) throws Exception {		
		inicioServidor();
	}
        
        
        public void inicioServidor() {
		System.out.println("Inicio la Conexion con la DB.");		
	}

}
