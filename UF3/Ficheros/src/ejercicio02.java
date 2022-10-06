import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

// Realitza una funció que donada una seqüència de caràcters i el nom d'un fitxer escrigui dins d’aquest fitxer la mateixa seqüència però en majúscules.

public class ejercicio02 {

	public static void main(String[] args) throws FileNotFoundException {

		escriboEnMayusculas();


	}

	public static void escriboEnMayusculas() throws FileNotFoundException {

		Scanner teclado = new Scanner(System.in);

		// Pedir nombre fichero
		System.out.println("Dime el nombre del fichero: ");
		String nombreFichero = teclado.nextLine();
		
		// Crear el fichero
		PrintWriter fichero = new PrintWriter(nombreFichero + ".txt");

		// Pedir palabras
		System.out.println("Escribeme algo, te lo pongo en mayúsculas: ");
		String textoIntroducido = teclado.nextLine();

		// Escribir palabra en mayuscula
		fichero.println(textoIntroducido.toUpperCase());

		// Mostrar el contenido
		Scanner ficheroParaMostrar = new Scanner(new File(nombreFichero + ".txt"));
		
		while(ficheroParaMostrar.hasNext()) {
			System.out.println(ficheroParaMostrar.nextLine());
		}
		ficheroParaMostrar.close();
	}

}
