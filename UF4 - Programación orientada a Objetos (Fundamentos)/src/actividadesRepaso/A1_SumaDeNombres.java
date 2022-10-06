package actividadesRepaso;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Fes una funció que donat el nom d'un fitxer (que només contingui nombres enters),
// el recorri i retorni la suma de tots els seus nombres.

public class A1_SumaDeNombres {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Nombre fichero: ");
		System.out.println(sumaNumerosFichero(teclado.nextLine()+".txt"));

	}

	public static int sumaNumerosFichero(String nombreFichero) throws FileNotFoundException {
		int suma = 0;

		// Cargo el lector
		Scanner leerFichero = new Scanner(new File(nombreFichero));

		// Leo el fichero
		while(leerFichero.hasNextInt()) {
			suma += leerFichero.nextInt();
		}

		return suma;
	}

}
