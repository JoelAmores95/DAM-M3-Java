import java.util.Iterator;
import java.util.Scanner;

public class Vectores_Teoria {

	public static void main(String[] args) {
		// Pedir al usuario 5 numeros y mostrar los que son mayores a la media
		Scanner teclado = new Scanner(System.in);

		int suma = 0;

		// Con esta forma perdemos los numeros
		// y no se puede comparar con la media
		//		for(int i = 0; i<5; i++) {
		//			System.out.println("Numero: ");
		//
		//			suma += teclado.nextInt();
		//		}
		//
		//		double media = (double)suma / 5;
		//		System.out.println(media);

		//Inviable, no se pueden hacer tantas variables
		//
		//		System.out.println("numero1:");
		//		int num1 = teclado.nextInt();


		// La solucion son los ARRAYS (o Vector)
		//
		// ¿Qué es?
		//
		// Un conjunto de variables DEL MISMO TIPO
		// al cual se puede acceder por su posición
		// Es como una estanteria en la cual es estante 0
		// tenemos un dato, en el 1 otro...

		// Las posiciones van numeradas desde el 0 a tamaño-1

		// SINTAXIS para crear vector
		// tipoDeDatos[] nombreVector = new tipoDeDatos[tamaño]; * añadir al nombre del vector la muletilla array:

		int[] arrayNumeros = new int[5];

		// ¿Como acceder a una posicion?
		// nombreArray[posicion]

		// Lectura
		// syso(arrayNumeros[3]);

		// Escritura
		// arrayNumeros[3] = 5
		// arrayNumeros[3] = teclado.nextInt;
		// arrayNumeros[3] = 3 + (8 * 17);

		// Para saber el tamaño de una array tenemos el
		// .length
		// arrayNumeros.length

		// Recorremos una array para escribir datos
		for (int i = 0; i < arrayNumeros.length; i++) {
			System.out.println("numero " + (i+1) + ":");
			arrayNumeros[i] = teclado.nextInt();

			suma += arrayNumeros[i];
		}
		// Calcular media
		double media = (double)suma/5;
		System.out.println(media);

		// Recorrer array para leer datos
		for (int i = 0; i < arrayNumeros.length; i++) {

			if (arrayNumeros[i]>media) {
				System.out.println(arrayNumeros[i]);
			}
		}
		// ¿Qué pasa si accedemos a una posición inexistente?
		// Error ArrayIndexOutOfBoundsException
		
		// A veces necesitamos crear una array y darle valores directamente
		// sin necesidad de leerlos o pedirlos
		
		 String[] arrayNombres = {"Joel", "Sheila", "Gordi"};
	}


}
