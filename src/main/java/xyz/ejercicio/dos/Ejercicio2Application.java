/*Hacer un programa que calcule e imprima el salario semanal de un empleado 
a partir de sus horas semanales trabajadas y de su salario por hora.*/
package xyz.ejercicio.dos;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ejercicio2Application {

	public static void main(String[] args) {
		SpringApplication.run(Ejercicio2Application.class, args);
		
		System.out.println("Probando");
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		float salarioHora, pagoTotal;
		int horasTrabajadas;
		
		System.out.print("Digite el valor a pagar por hora: ");
		salarioHora = entrada.nextFloat();
		
		System.out.print("Digite la cantidad de horas laboradas: ");
		horasTrabajadas = entrada.nextInt();
		
		pagoTotal = salarioHora * horasTrabajadas;
		
		System.out.println("\nEl valor a pagar al trabajador es: "+pagoTotal);
		
	}

}
