package calse_5_ejercicio_1;

import java.util.Scanner;

public class Ejercicio_1 {
	public static void main(String[] args) {
		// Ejercicio 1:
		/*
			Calculadora de edad de perros:
			Pidele al usuario quq ingrese la edad de sus perros.
			Convierte esa edad a años de perros (se dice uq 1 año de humano equvale a 7 años de perro).
		* */
		Scanner cargaDatos = new Scanner(System.in);
		
		System.out.println("Ingresa la edad de tu perro: ");
		int edadPerro = cargaDatos.nextInt();
		
		int edadCalulada = edadPerro * 7;
		
		System.out.println("La edad de tu perro es: " + edadCalulada);
		
		
		
	}
}