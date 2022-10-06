
import java.util.Scanner;

public class matrices {

	public static void main(String[] args) {
		// Una matriz es un array de arrays

		//Sintaxis
		// TipoDeDatos [][] nombreDeMatriz = tipoDeDatos[numFilas][numColumnas]
		// TipoDeDatos [][] nombreDeMatriz = tipoDeDatos[dimensionArrayGrande][dimensionArrayPequeño]

		int[][] matrizNumeros = new int[5][4];

		// Acceso lectura y escritura
		matrizNumeros[0][3] = 5;
		System.out.println(matrizNumeros[0][3] = 5); // Saldrá 5

		// Igual que creábamos arrays directamente con los valores en código
		int[] arrayNumeros = {12,52,13};
		// ... podemos crear matrices con los valores en código
		char[][] matrizChars = {{'a','b','c'},
								{'d','e','f'}};
		
		// Recorremos la matriz para imprimirla
		for (int fil = 0; fil < matrizChars.length; fil++) {
			
			for (int col = 0; col < matrizChars[fil].length; col++) {
				System.out.print(matrizChars[fil][col] + " ");
			}
			System.out.println();
		}
		
		//VAMO A PRACTICARLLL
		// Crear una matriz de n * m filas (cargar n y m por teclado)
		// Intercambiar la primera fila por la segunda
		// Imprimir resultado
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce cuantas filas tiene: ");
		int n = teclado.nextInt();
		System.out.println("introduce cuantas columnas tiene: ");
		int m = teclado.nextInt();
		
		int[][] matrizEjercicio = new int[n][m];
		int numAsignado = 1;
		
		System.out.println("Llenamos matriz...");
		for (int fila = 0; fila < matrizEjercicio.length; fila++) {
			for (int col = 0; col < matrizEjercicio[fila].length; col++) {
				matrizEjercicio[fila][col] = numAsignado;
				numAsignado += 1;
				System.out.print(matrizEjercicio[fila][col] + " ");
			}
			System.out.println();
			
		}
		System.out.println("Voy a intercambiar valores de la primera fila a la segunda y viceversa");
		// Intercambio la primera fila (0) por la segunda(1)
		
		// Recorro la columna
		for (int col = 0; col < matrizEjercicio[0].length; col++) {
			
			// En cada columna cambio el valor de la fila 1 por la 2
			
			int aux=matrizEjercicio[0][col];
			matrizEjercicio[0][col]=matrizEjercicio[1][col];
			matrizEjercicio[1][col]=aux;
		}

		// Muestro resultado
		for (int fila = 0; fila < matrizEjercicio.length; fila++) {
			for (int col = 0; col < matrizEjercicio[fila].length; col++) {
				System.out.print(matrizEjercicio[fila][col] + " ");
			}
			System.out.println();
		}
		
		// Tambien se puede girar la fila
		int matrizAux[] = matrizEjercicio[0];
		matrizEjercicio[0]=matrizEjercicio[1];
		matrizEjercicio[1] = matrizAux;
				
	}



}
