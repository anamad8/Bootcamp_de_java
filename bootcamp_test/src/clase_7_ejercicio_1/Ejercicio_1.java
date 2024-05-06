package clase_7_ejercicio_1;

import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {
		/*
		 Hacer un programa que permita al usuario ingresae 5 números y mostrarlos. 
		 */
		int[] numeros = new int[5];
        Scanner teclado = new Scanner(System.in);

        int i = 0;
        while (i < 5) {
            System.out.println("Ingresa el número " + (i + 1) + ":");
            numeros[i] = teclado.nextInt();
            i++;
        }

        System.out.println("Los números ingresados son:");
        i = 0;
        while (i < 5) {
            System.out.println(numeros[i]);
            i++;
        }
	}

}
