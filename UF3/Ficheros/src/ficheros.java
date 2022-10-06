import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ficheros {

	public static void main(String[] args) throws FileNotFoundException {
		// Usaremos los ficheros para:
		// - Leer datos de ellos
		// - Escribir datos en ellos
		
		// La principal caraceristica es que nos permiten guardar informaci�n
		// en disco, evitando as� que se pierda entre ejecuciones del programa
		
		// ESCRITURA EN FICHEROS
		// Necesitamos una nueva clase llamada PrintWriter
		
		// SINTAXIS
		// PrintWriter nombreQueLePongo = new PrintWriter('nombreFicheroSalida.txt'); - Por defecto en la carpeta del proyecto
		// para cambiarle la ruta: '\salida\fichero.txt' o su equivalente
		
		// ficheroSalida.println("Hola");
		PrintWriter ficheroSalida = new PrintWriter("ficheroSalida.txt");
		ficheroSalida.println("Hola");
		// Tenemos que cerrar el PrintWriter para que se guarden los cambios
		ficheroSalida.close(); // ERROR COM�N
		
		// LECTURA DE FICHEROS
		// Usamos la conocida Scanner
		
		// SINTAXIS
		// Scanner ficheroEntrada = new Scanner(new File("nombreFichero.txt"));
		
		// File fichero = new File("nombreFichero.txt");
		// Scanner ficheroEntrada = newScanner(fichero);
		
		//Para leer desde un fichero usamos los mismos m�todos que para leer desde la consola: nextInt()...
		
		// La diferencia es que previamente a leer hemos de asegurarnos de que hay datos en el fichero: hasNextInt(),...
		
		Scanner ficheroEntrada = new Scanner(new File("nombreFichero.txt"));
		
		// Recorremos todo el fichero para imprimir cada l�nea
		while(ficheroEntrada.hasNextLine()) {
			String linea = ficheroEntrada.nextLine();
			System.out.println(linea);
		}
		ficheroEntrada.close();
	}


}
