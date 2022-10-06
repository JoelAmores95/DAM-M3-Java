import java.util.Scanner;

// Donada una matriu M x N, fer un programa que escrigui la matriu que resulta de restar a cada element la mitjana aritmètica de la seva columna.

public class Ejercicio07 {

	public static void main(String[] args) {

		// Pedir dimensiones matriz
		Scanner teclado = new Scanner(System.in);

		System.out.println("Número de filas: ");
		int numFilas = teclado.nextInt();

		System.out.println("Número de columnas: ");
		int numColumnas = teclado.nextInt();

		// Llenar matriz
		int[][] matriz = new int[numFilas][numColumnas];
		
		for (int fil = 0; fil < matriz.length; fil++) {
			for (int col = 0; col < matriz[fil].length; col++) {
				System.out.println("Introduce el valor de la fila " + (fil+1) + " y columna " + (col+1));
				matriz[fil][col] =  teclado.nextInt();
			}
		}
		// Calcular suma columna
		for (int fila = 0; fila < matriz.length-1; fila++) {
			
		}
	}

}
