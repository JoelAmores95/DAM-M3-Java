import java.util.Scanner;

// Escriu un programa que demani 1 paraula, 
// i digui si està entre alguna de les tres següents: 
// “Arxiu”, “Buscar”, “Sortir”, 
// en cas que no hi estigui, indicar que hi ha un error.

public class Ejercicio02 {

	public static void main(String[] args) {
		// Pedir palabra
		System.out.println("Dime una palabra: ");
		Scanner teclado = new Scanner(System.in);
		String palabra = teclado.nextLine();
		
		// Comprobar si es "Arxiu", " Buscar", "Sortir"
		if ( (palabra.equalsIgnoreCase("Arxiu")) || (palabra.equalsIgnoreCase("buscar")) || (palabra.equalsIgnoreCase("sortir"))) {
			System.out.println(palabra + " es correcta.");
		} else {
			System.out.println("No es una palabra válida");
		}

	}

}
