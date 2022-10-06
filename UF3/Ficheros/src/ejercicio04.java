import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

// Escriu una funció que donada un fitxer i una paraula llegida per teclat, 
// la desi dins d'una fila nova al fitxer.

// Set true for append mode
// FileWriter fileWriter = new FileWriter("fitxer.txt", true);
// PrintWriter printWriter = new PrintWriter(fileWriter);

public class ejercicio04 {

	public static void main(String[] args) throws IOException {

		// Importar teclado e iniciarlo
		Scanner teclado = new Scanner(System.in);

		// Pido el nombre el fichero y lo guardo en una variable
		System.out.println("Nombre del fichero acabado en .txt: ");
		String nombreFichero = teclado.nextLine();

		// Creo el fichero
		//PrintWriter crearFichero = new PrintWriter(nombreFichero); Solo era necesario una vez, SINO MACHACA!

		// Añado la palabra
		System.out.println("Palabra a añadir: ");
		añadoPalabra(nombreFichero, teclado.nextLine());
		
		// Preparo el Scanner para leer
		Scanner leerFichero = new Scanner(new File(nombreFichero));

		// Leo palabras
		System.out.println("Leo palabras: ");

		while(leerFichero.hasNext()) {
			System.out.println(leerFichero.nextLine());
		}

	}

	/**
	 * Añade a un fichero un String SIN BORRAR
	 * @param nombreFichero El nombre del fichero
	 * @param palabra Palabra a añadir
	 * @throws IOException
	 */

	public static void añadoPalabra(String nombreFichero, String palabra) throws IOException {

		// Activo el append: 
		FileWriter fileWriter = new FileWriter(nombreFichero, true);
		PrintWriter printWriter = new PrintWriter(fileWriter);
		
		// Otra opción válida es: PrintWriter printWriter = new PrintWriter(new FileWriter(nombreFichero, true));

		// Escribo la palabra en el texto
		printWriter.println(palabra);

		// CIERRO PARA GUARDAR
		printWriter.close();
	}
}
