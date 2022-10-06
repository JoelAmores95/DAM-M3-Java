import java.util.Scanner;

// 1. Programa per inserir 5 números en un vector A, copiar en un vector B totes les dades parells del vector A,
// i posteriorment visualitzar les dades del vector B.

public class Ejercicio05 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		// Creo Array para guardar numeros
		int [] arrayNumeros = new int[5];
		int iPares = 0;

		//Pido y guardo datos en array
		for (int i = 0; i < arrayNumeros.length; i++) {
			System.out.println("Numero " + (i+1));

			arrayNumeros[i] = teclado.nextInt();
			// Miro si es par para contador
			if (arrayNumeros[i] % 2 == 0) {
				iPares++;
			}
		}
		// Guardo los numeros pares de la arrayA en arrayB

		int[] arrayNumerosB = new int[iPares];
		int iArrayB = 0;
		for (int iArrayA = 0; iArrayA < arrayNumeros.length; iArrayA++) {
			if(arrayNumeros[iArrayA] % 2 == 0) {
				arrayNumerosB[iArrayB] = arrayNumeros[iArrayA];
				iArrayB++;
			}
		}
		// Muestro los valores de la array B
		if(iPares == 0) {
			System.out.println("No hay ningún dato guardado. No hay pares");
		} else {
			for (int i = 0; i < arrayNumerosB.length; i++) {
				System.out.print(arrayNumerosB[i]+ " "); // ¡¡¡¡TRUUUCOOOO!!!! ¡Para mostrar un vector sin saltar de linea!
			}
		}

	}

}
