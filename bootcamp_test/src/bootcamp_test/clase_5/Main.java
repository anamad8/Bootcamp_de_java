package bootcamp_test.clase_5;

import java.util.Scanner;

import Ejercicio_1.Ejercicio_1;
import Ejercicio_2.Ejercicio_2;
import Ejercicio_3.Ejercicio_3;
import Ejercicio_4.Ejercicio_4;

public class Main {
	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Seleccione el ejercicio que desea ejecutar:");
	        System.out.println("1. Ejercicio 1");
	        System.out.println("2. Ejercicio 2");
	        System.out.println("1. Ejercicio 3");
	        System.out.println("2. Ejercicio 4");
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
	            case 4:
	                Ejercicio_4.main(args);
	                break;
	            default:
	                System.out.println("Opción no válida");
	        }
	        
	        scanner.close();
	    }
		
		
}
