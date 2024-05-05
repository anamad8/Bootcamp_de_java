package bootcamp_test.clase_6;

import java.util.Scanner;

public class Clase_6 {
	public static void main(String[] args) {
		// Cargar 3 num. y mostrar el menor y el mayor
		Scanner teclado = new Scanner(System.in);
		System.out.println("Carge el primer numero:");
		int numero1 = teclado.nextInt();
		System.out.println("Carge el segundo numero:");
		int numero2 = teclado.nextInt();
		System.out.println("Carge el tercer numero:");
		int numero3 = teclado.nextInt();
		
		if(numero1 > numero2 && numero1 > numero3) {
			System.out.println("El numero mas grande es: " + numero1);
		}
		
		if(numero3 > numero2 && numero3 > numero1) {
			System.out.println("El numero mas grande es: " + numero3);
		}
		
		if(numero2 > numero1 && numero2 > numero3) {
			System.out.println("El numero mas grande es: " + numero2);
		}
	}
}
