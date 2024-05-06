package bootcamp_test.clase_6;

import java.util.Scanner;

import clase_6_ejercicio_1.Ejercicio_1;
import clase_6_ejercicio_2.Ejercicio_2;
import clase_6_ejercicio_3.Ejercicio_3;



public class Clase_6 {
	public static void main(String[] args) {
			
			 Scanner scanner = new Scanner(System.in);
		        
		        System.out.println("Seleccione el ejercicio que desea ejecutar:");
		        System.out.println("1. Ejercicio 1");
		        System.out.println("2. Ejercicio 2");
		        System.out.println("1. Ejercicio 3");
		        System.out.print("Ingrese el número del ejercicio: ");
		        
		        int opcion = scanner.nextInt();
		        
		        switch(opcion) {
		            case 1:
		                Ejercicio_1.main(args);
		                break;
		            case 2:
		                Ejercicio_2.main(args);
		                break;
		            case 3:
		                Ejercicio_3.main(args);
		                break;
		            default:
		                System.out.println("Opción no válida");
		        }
		        
		        scanner.close();
		

		
		// Ejercico en la clase
		// Cargar 3 num. y mostrar el menor y el mayor
		/*Scanner teclado = new Scanner(System.in);
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
		*/
	}
}
