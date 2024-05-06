package bootcamp_test.clase_7;

import java.util.Scanner;

import clase_6_ejercicio_1.Ejercicio_1;
import clase_6_ejercicio_2.Ejercicio_2;
import clase_6_ejercicio_3.Ejercicio_3;

public class Main {
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
	
		
	}

}
