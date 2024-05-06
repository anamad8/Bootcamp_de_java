package clase_7_ejercicio_3;

import java.util.Scanner;

public class Ejercicio_3 {

	public static void main(String[] args) {
		/* Ahora, que mostrar el promedio. para hacer esto se suman todos los Número y se divide por 5, 
		 * ya que el usuario agregó 5 números.
		 * */
		int[] numeros = new int[5];
        Scanner teclado = new Scanner(System.in);

        int i = 0;
        while (i < 5) {
            System.out.println("Ingresa el número " + (i + 1) + ":");
            numeros[i] = teclado.nextInt();
            i++;
        }

        int suma = 0;
        for (i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        double promedio = (double) suma / numeros.length; 

        System.out.println("El promedio es: " + promedio);
        
        
	}

}
