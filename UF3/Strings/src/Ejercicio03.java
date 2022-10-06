import java.util.Scanner;

// Escriu un programa que demani una lletra i digui si és vocal o consonant.
public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		// Pido letra
		System.out.println("Escribe una letra: ");
		String letra = teclado.nextLine();
		
		// Miro si es vocal
		if (letra.equalsIgnoreCase("a")) {
			System.out.println("Es la vocal " + letra);
		} else if (letra.equalsIgnoreCase("e")) {
			System.out.println("Es la vocal " + letra);
		} else if (letra.equalsIgnoreCase("i")) {
			System.out.println("Es la vocal " + letra);
		}else if (letra.equalsIgnoreCase("o")) {
			System.out.println("Es la vocal " + letra);
		}else if (letra.equalsIgnoreCase("u")) {
			System.out.println("Es la vocal " + letra);
		} else {
			
			// Si no es vocal, es consonante
			
			System.out.println("Es la consonante " +  letra);
		}
	}
}
