package clase_5_ejercicio_ejercicio_3;

import java.util.Scanner;

public class Ejercicio_3 {
public static void main(String[] args) {
		
		System.out.println("Ejercico 3");
		
		/*
		 Calcualadora de descuanto:
		 Pidele al usuario que ingrese un precio original de un producto.
		 Pidele al uauario que ingrese el porsentaje de descuento.
		 Calucla el precio final despues de aplicar el descuanto utilizado la formula:
		 preciafinal = preciaOriginal - (precioOriginal * descuento / 100).
		 muestra el precio final ala usuario.
		  
		*/
		
		Scanner cargaDato = new Scanner(System.in);
		System.out.println("Ingrese el precio de su producto: "); 
		double precio = cargaDato.nextDouble();
		System.out.println("Ingrese el porcentaje de descuento: "); 
		double descuento = cargaDato.nextDouble();
		
		double total = precio - (precio * descuento / 100);
		
		System.out.println("Su descuento es de: " + total); 
	}
}
