package Ejercicio_4;

import java.util.Scanner;

public class Ejercicio_4 {
public static void main(String[] args) {
		
		System.out.println("Ejercico 4");
		
		/*
		 Calcualadora de propinas:
		 Pidele al usuario que ingrese el total de la cuanta en un restaurante.
		 Pidele al uauario que ingrese el porcentaje de propina que desea dejar.
		 Calucla el monto de la propina utilizado la formula:
		 propina = totalCuenta * (totalPropina / 100).
		 muestra el precio final ala usuario.
		  
		*/
		
		Scanner cargaDato = new Scanner(System.in);
		System.out.println("Ingrese el total de la cuanta en un restaurante: ");
		double totalCuenta = cargaDato.nextDouble();
		
		System.out.println("Ingrese el porcentaje de propina que desea dejar: ");
		double propina = cargaDato.nextDouble();
		
		double totalPropina = totalCuenta * (propina / 100);
		
		System.out.println("La propina que desea dejar es: " + totalPropina);
	}
}
