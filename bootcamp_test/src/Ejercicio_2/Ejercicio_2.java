package Ejercicio_2;

import java.util.Scanner;

public class Ejercicio_2 {
	public static void main(String[] args) {
		System.out.println("Ejercico 2");
		/*
		 Conversor de millas a Kilometros:
		 Pidele al usuario que ingrese una distancia en milla.
		 Conviverte la distancia a kilometros utilizando la formula: kilometros = millas * 1.60934.
		 Mustra la distancia en kilometros al usuario. 
		  
		*/
		Scanner cargaDato = new Scanner(System.in);
		System.out.println("Ingresa la distancia en millas que quieras convertir a kilometros: ");
		
		double millas = cargaDato.nextDouble();
		
		double kilometros = millas * 1.60934;
		
		System.out.println("La distancia en kilometros es: "+ kilometros);
	}
}