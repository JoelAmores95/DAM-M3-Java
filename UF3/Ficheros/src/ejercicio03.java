import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

// Realitza una funció que donat un fitxer de text, 
// crei un altre fitxer a partir d'aquest canviant les 
// majúscules per minúscules i les minúscules per majúscules.
public class ejercicio03 {

	public static void main(String[] args) throws FileNotFoundException {
		
		System.out.println(convertirFicheroMinMay("a.txt"));
		
	}
	
	
	/**
	 * Dado el nombre de un fichero crea otro cambiando mayúsculas 
	 * por minúsculas y viceversa
	 * @param nombreFichero Nombre del fichero a modificar
	 * @return El nombre del nuevo fichero
	 * @throws FileNotFoundException 
	 */
	public static String convertirFicheroMinMay(String nombreFicheroEntrada) throws FileNotFoundException {
		
		// Creamos el fichero de salida
		String nombreFicheroSalida = "f2.txt";
		PrintWriter ficheroSalida = new PrintWriter(nombreFicheroSalida);
		
		// Abrimos el fichero de entrada
		Scanner ficheroEntrada = new Scanner(new File(nombreFicheroEntrada));
		
		
		// Recorremos el fichero de entrada
		while (ficheroEntrada.hasNextLine()) {

			String linea = ficheroEntrada.nextLine();

			// Recorremos cada línea del fichero
			for (int i = 0; i < linea.length(); i++) {

				char caracter = linea.charAt(i);

				// Comprobamos si es may/min y hacemos el cambio
				if (Character.isLowerCase(caracter)) {

					ficheroSalida.print(Character.toUpperCase(caracter));

				} else if (Character.isUpperCase(caracter)) {

					ficheroSalida.print(Character.toLowerCase(caracter));

				} else {

					ficheroSalida.print(caracter);
				}


			}
			
			ficheroSalida.println();

		}
		ficheroSalida.close();
		
		// Devolvemos el nombre del fichero de salida
		return nombreFicheroSalida;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	/**
//	 * Dado el nombre de un fichero crea otro cambiando mayúsculas 
//	 * por minúsculas y viceversa
//	 * @param nombreFichero Nombre del fichero a modificar
//	 * @return El nombre del nuevo fichero
//	 * @throws FileNotFoundException 
//	 */
//	public static String convertirFicheroMinMay(String nombreFicheroEntrada) throws FileNotFoundException {
//		
//		// Creamos el fichero de salida
//		String nombreFicheroSalida = "f2.txt";
//		
//		PrintWriter ficheroSalida = new PrintWriter(nombreFicheroSalida);
//		
//		// Abrimos el fichero de entrada
//		Scanner ficheroEntrada = new Scanner(new File(nombreFicheroEntrada));
//		
//		// Recorremos el fichero
//		while (ficheroEntrada.hasNextLine()) {
//		
//			// Leemos una linea
//			String linea = ficheroEntrada.nextLine();
//		
//			// Recorremos la linea
//			for (int i = 0; i < linea.length(); i++) {
//				
//				// Intercambiamos may/min
//				char caracter = linea.charAt(i);
//				
//				if (Character.isLowerCase(caracter)) {
//					
//					ficheroSalida.print(Character.toUpperCase(caracter));
//					System.out.print(Character.toUpperCase(caracter));
//				
//				} else if (Character.isUpperCase(caracter)) {
//					
//					ficheroSalida.print(Character.toLowerCase(caracter));
//					System.out.print(Character.toLowerCase(caracter));
//				
//				} else {
//					ficheroSalida.print(caracter);
//					System.out.print(caracter);
//				}
//				
//			}
//			
//			ficheroSalida.println();
//			System.out.println();
//		}
//		
//		ficheroSalida.close();
//		ficheroEntrada.close();
//			
//		return nombreFicheroSalida;
//	}

}
