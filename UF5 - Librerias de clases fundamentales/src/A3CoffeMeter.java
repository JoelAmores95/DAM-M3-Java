import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class A3CoffeMeter {

	public static void main(String[] args) throws FileNotFoundException {

		// ###########################
		// ## v1 Array preestablecida
		// ###########################

		System.out.println("v1: Leer de array en Main\n");
		double[] mediciones = {5.6, 6.2, 6.0, 5.5, 5.7, 6.1, 7.4, 5.5, 5.5, 6.3, 6.4, 4.0, 6.9};
		double media = calcularMedia(mediciones);

		// Mostrar media
		System.out.println("Media de las mediciones: " + media);

		// Mostrar elemento más distante
		double numDistante = numeroMasDistante(mediciones, media);
		System.out.println("Número más distante de la media: " + numDistante);

		// Restar a la media el número más distante
		double auxMedia = mediciones[0];
		for (int i = 1; i < mediciones.length; i++) {
			auxMedia += mediciones[i];
		}
		// Resto el número más distante
		auxMedia -= numDistante;
		// Calculo nueva media
		auxMedia /= (mediciones.length - 1);
		System.out.println("Nueva media: " + auxMedia);

		// ###########################
		// ## v2 Leer de archivo
		// ###########################
		
		System.out.println("\nv2: Leer de archivo.txt\n");
		
		// Creo array con la longitud del primer int del archivo
		Scanner lector = new Scanner(new File("CoffeMeter.txt"));
		double[] arrayFile = new double[lector.nextInt()];
		
		// Relleno array
		for (int i = 0; i < arrayFile.length; i++) {
			arrayFile[i]= lector.nextDouble();
		}
		
		media = calcularMedia(arrayFile);
		
		// Mostrar media
		System.out.println("Media de las mediciones: " + media);

		// Mostrar elemento más distante
		numDistante = numeroMasDistante(arrayFile, media);
		System.out.println("Número más distante de la media: " + numDistante);

		// Restar a la media el número más distante
		auxMedia = arrayFile[0];
		for (int i = 1; i < arrayFile.length; i++) {
			auxMedia += arrayFile[i];
		}
		
		// Resto el número más distante
		auxMedia -= numDistante;
		
		// Calculo nueva media
		auxMedia /= (arrayFile.length - 1);
		System.out.println("Nueva media: " + auxMedia);
		
		
	}

	public static double calcularMedia(double[] array) {
		double media = 0.0;

		// Recorrer array
		for (int i = 0; i < array.length; i++) {

			// Voy acumulando cada elemento
			media += array[i];
		}
		// Directamente retorno la media
		return media/(array.length);
	}

	public static double numeroMasDistante(double[]array, double media) {

		// Guardo valores de referencia
		double numDistante = array[0];
		double distancia = Math.abs(array[0] - media);

		// Recorro la array
		for (int i = 1; i < array.length; i++) {

			// Busco el elemento que tiene más distancia de su media
			if(Math.abs(array[i] - media) > distancia) {
				distancia = Math.abs(array[i] - media);
				numDistante = array[i];
			}

		}
		return numDistante;
	}

}
