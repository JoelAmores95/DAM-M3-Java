import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

// Escriu una funció que donat el nom d'un fitxer, retorni el nombre de paraules que té dins.

public class ejercicio01 {

	public static void main(String[] args) throws IOException {
		
		// Creo el archivo de salida
		PrintWriter ficheroSalida = new PrintWriter("textoParaContar.txt");
		
		// Corrijo el error usando el throws FileNotFoundException
		
		// Escribo una palabra para que no esté vacío
		ficheroSalida.println("He escrito algo");
		ficheroSalida.close();
		
		// Llamo a la función que me devuelve el número de palabras
		System.out.println("Número de palabras: " + cuentaPalabras());
		
	}
	
	public static int cuentaPalabras() throws IOException {
		
		int numPalabras = 0;
		
		// Para leer el archivo necesito el Scanner
		Scanner ficheroLeer = new Scanner(new File("textoParaContar.txt"));
		
		// hasNext lee una palabra hasta encontrar un espacio
		while(ficheroLeer.hasNext()) {
			
			// Muestro la palabra hasta encontrar un espacio
			System.out.print(ficheroLeer.next() + " ");
			numPalabras +=1;
		}
		System.out.println();
		
		return numPalabras;
	}

}
