package com.ejemploinyeccion;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ejemploinyeccion.inyeccion.component.Nombre;

@SpringBootApplication
public class InyeccionApplicacion implements CommandLineRunner {

	private Nombre nombre;

	//constructor
	public InyeccionApplicacion(@Qualifier("apellidoImpl") Nombre nombre) {
		this.nombre = nombre;
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(InyeccionApplicacion.class, args);
	}
	
	
	@Override
	public void run(String... args) throws Exception {
		nombre.mostrarNombre();
	}
}
