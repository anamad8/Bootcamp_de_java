package clase_7_ejercicio_2;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) {
		
		/*
		 Hacer del ejercicio anterir que muestre el numero mayor y el numero menor.
		 */
		int[] numeros = new int[5];
       Scanner teclado = new Scanner(System.in);

       int i = 0;
       while (i < 5) {
           System.out.println("Ingresa el número " + (i + 1) + ":");
           numeros[i] = teclado.nextInt();
           i++;
       }
       
       int mayor = 0;
       int menor = 0;
       
       System.out.println("Los número que usted ingresos son: ");
       for (i=0; i < numeros.length; i++) {
           System.out.println(numeros[i]);
           
       }
       
       for (i=0; i < numeros.length; i++) {
          int num = numeros[i];
          if(num >= mayor || i == 0 ) mayor = num;
          if(num <= menor || i <= 0) menor = num;
       }
       
       
       System.out.println("El número mayor que ingresaste es: " + mayor);
       
       System.out.println("El número menor que ingresaste es: " + menor);
		
		
	
       
       
	}

}
