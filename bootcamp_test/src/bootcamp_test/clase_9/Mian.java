package bootcamp_test.clase_9;

import java.util.Scanner;

/* Ejercicios prácticos 
 * 1- Busqueda de personas*/
public class Mian {
	public static void main(String[] args) {
		
		String[] personas = {"Lucas Moy","Aldo Angelini", "Julia Gomez", "Manuel Santillan", "Juan Torres" };
		
		/*
		String[] personas = new String[10];
		personas[0]= "Lucas Moy";
		personas[1]= "Aldo Angelini";
		personas[2]= "Julia Gomez";
		*/
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese su búsqueda:");
		String busqueda = teclado.nextLine();
		
		for(String nombrePersona : personas) {
			if(nombrePersona.toLowerCase().contains(busqueda.toLowerCase()) ) {
				System.out.println("La persona es:" + nombrePersona);
			}
			
			
		}
		
		/*for(int i = 0; i < personas.length; i++) {
			String personasEncontradas = personas[i];
			if(busqueda.equals(personasEncontradas)) {
				System.out.println("La persona es:" + personasEncontradas);
			}
		}*/
		
		//System.out.println(personasEncontradas);
	}
}
