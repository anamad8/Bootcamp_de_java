package clase_8_ejercicio_3;

public class Ejercicio_3 {

	public static void main(String[] args) {
		/* Crear una funcion que sea un generador de contrseña. Al llamarla debe devolver una
		   contraseña (por ejemplo, puede utilizar Math.random() para devolver un número 
		   aleatorio que podria ser una ontraseña)
 		
		 */
		
		String nuevaPassoword = generarPassoword();
		System.out.println(nuevaPassoword);
	}
	
	private static String generarPassoword() {
		double aleatorio = Math.random() * 1000000;
		long numeroAleatorio = Math.round(aleatorio);
		
		String passoword = "asdaskd" + numeroAleatorio;
		return passoword;
			
	}

	
	

}
