package com.nttdata.bootcamp.RetoProgrFuncional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.bootcamp.Clases.Usuario;

@SpringBootApplication
public class RetoProgrFuncionalApplication {

	static Usuario user1 = new Usuario ("Maria","12-04-2001","maria@gmail.com","femenino");
	static Usuario user2 = new Usuario ("Pedro","28-09-1978","pedro@gmail.com","masculino");
	static Usuario user3 = new Usuario ("Anselmo","23-06-2005","anselmo@gmail.com","masculino");
	static List<Usuario> listaUser = new ArrayList<>(Arrays.asList(user1,user2,user3));
	
	static List<String> ciudades = new ArrayList<>(Arrays.asList("Sevilla","Malaga","Gerona","Granada","Madrid","Murcia"));
	
	static List<Integer> numeros = new ArrayList<>(Arrays.asList(33,67,58,2,44,13));
	
	public static void main(String[] args) {
		SpringApplication.run(RetoProgrFuncionalApplication.class, args);
		System.out.println(filtraCiudad());
		System.out.println(sumaImpar());
	}
	
	public static List<String> filtraCiudad() {
		return ciudades.stream().filter(x ->x.startsWith("M")).collect(Collectors.toList());
	}
	
	public static int sumaImpar() {
		return numeros.stream().filter(x ->x%2==1).collect(Collectors.summingInt(Integer::intValue));
	}
	
	public static String obtieneGmail() {
		return null;
		
	}


}
