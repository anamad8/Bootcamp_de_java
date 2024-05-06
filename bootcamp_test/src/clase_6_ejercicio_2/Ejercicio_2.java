package clase_6_ejercicio_2;

import java.util.Scanner;

public class Ejercicio_2 {
	public static void main(String[] args) {
	/*
	 	Armar un buscador de twitter.com. Es  bastante similar al anterior.
	 	Primero pidele al usuario que ingrese el nombre de una celebridad (de una sola palabra), (Ej: Messi).
	 	Despues muestra en consola la concatenacion de:
	 	"https://twitter.com/search/" + palabra
	 	Entosnces cuiando hagas click ene le link uqe aparesca en la consola, te abrira esa ubicacion.
	 */
	
		Scanner cargaDatos = new Scanner(System.in);
	
	    System.out.println("Ingresa el nombre de una celebridad (Ej: Messi): ");
	    String nombre = cargaDatos.nextLine(); 
	
	    String url = "https://twitter.com/search/" + nombre;
	    System.out.println("URL generada: " + url);
	    cargaDatos.close();
	}
}
