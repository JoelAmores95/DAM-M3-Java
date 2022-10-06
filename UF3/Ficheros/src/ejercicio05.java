import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

//5. Desenvolupa els següents apartats:
//
//    1. Realitza una funció que desi dins d’un fitxer dates importants de la nostra vida en un fitxer amb la següent estructura:
//        
//        12 5 2015 1r premi programame
//        13 2 2016 1r premi websalpunt
//        
//        
//        La funció ha d'anar demanant les dates a l'usuari en format (DD/MM/AAAA) i desant-les en el fitxer en el format anterior.
//        
//        
//        
//    2. Realitza una funció que trobi una data concreta dins del fitxer i retorni en quina fila està. En cas que no estigui en cap fila ha de retornar -1.
//        
//        L'usuari ho ha de posar en format DD/MM/AAAA.
//        
//        
//    3. Realitza una funció que trobi una descripció o part d'una descripció concreta dins del fitxer i retorni en quina fila està. 
//		En cas que no estigui en cap fila ha de retornar -1.

public class ejercicio05 {

	public static void main(String[] args) throws IOException {
		Scanner teclado = new Scanner(System.in);

		guardoFecha();

		System.out.println("Texto a buscar: ");
		int numFila = buscoFila(teclado.nextLine());

		if(numFila == -1) {
			System.out.println("No se encuentra en el archivo.");
		} else {
			System.out.println("Está en la fila número: "+ numFila);
		}
	}

	/**
	 * Guarda dentro un fichero .txt una fecha en formato DD/MM/AAAA
	 * @throws IOException 
	 */

	public static void guardoFecha() throws IOException {
		int dia, mes, anyo;
		String fecha = "";

		// Activo el Scanner
		Scanner teclado = new Scanner(System.in);

		// Pido la fecha en formato DD/MM/AAAA
		System.out.println("Introduce la fecha en formato DD/MM/AAAA: ");

		// Guardo en el fichero
		PrintWriter escribir = new PrintWriter(new FileWriter("ejercicio05.txt", true));

		escribir.println(teclado.nextLine());

		//Guardo escritura
		escribir.close();

	}
	/**
	 * Entrado un String, devuelve la fila donde se encuentra.
	 * @param fecha
	 * @return int número de fila o -1 si no está
	 * @throws FileNotFoundException 
	 */
	public static int buscoFila(String texto) throws FileNotFoundException {

		// Empiezo dando por hecho que la fecha está en la linea 1
		int numLinea = 1;
		String linea = "";

		// Cargo el fichero
		Scanner leer = new Scanner (new File("ejercicio05.txt"));

		// Recorro el archivo
		while(leer.hasNextLine()) {
			linea = leer.nextLine();

			// Miro si existe -> APARECE NUEVA FUNCIÓN : contains() # Retorna true o false si el String que le pasamos tiene el que buscamos
			if(linea.contains(texto)) {
				return numLinea;
			}

			// No está, sigo mirando
			numLinea++;
		}

		// No está en el texto
		numLinea = -1;
		return numLinea;
	}

}
