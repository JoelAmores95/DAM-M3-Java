import java.util.Scanner;

// Crear un programa que permeti introduir un quadrat per teclat i determini si aquest quadrat és màgic o no. 
// El programa ha de comprovar que els números introduïts són correctes, és a dir, estan entre l'1 i el 9.

public class Ejercicio06 {

	public static void main(String[] args) {
		// Introducir valores
		Scanner teclado = new Scanner(System.in);

		// Matriz 3x3
		int[][] cuadradoMagico = new int [3][3];

		// Llenar matriz
		for (int fil = 0; fil < cuadradoMagico.length; fil++) {
			for (int col = 0; col < cuadradoMagico[fil].length; col++) {
				System.out.println("Introduce el valor de la fila " + (fil+1) + " y columna " + (col+1));
				cuadradoMagico[fil][col] =  teclado.nextInt();
			}
		}

		// Sumar filas
		int fila1 = 0;
		int fila2 = 0;
		int fila3 = 0;

		// Todas las filas de una pasada
		for (int col = 0; col < cuadradoMagico[0].length; col++) {
			fila1 += cuadradoMagico[0][col];
			fila2 += cuadradoMagico[1][col];
			fila3 += cuadradoMagico[2][col];
		}
		System.out.println(fila1 + " " + fila2 + " " + fila3); // OK
		
		// Sumar columnas
		int col1 = 0;
		int col2 = 0;
		int col3 = 0;
		
		for (int fil = 0; fil < cuadradoMagico[0].length; fil++) {
			col1 += cuadradoMagico[fil][0];
			col2 += cuadradoMagico[fil][1];
			col3 += cuadradoMagico[fil][2];
		}
		System.out.println(col1 + " " + col2 + " " + col3); // OK

		// Sumar diagonales, solo hay 2, sumo 1 a la fila y la columna
		int diag1 = 0;
		int diag2 = 0;
		
		// Primera diagonal
		for (int diag = 0; diag < cuadradoMagico.length; diag++) {
			diag1 += cuadradoMagico[diag][diag];
		}
		System.out.println(diag1); // OK
		// Segunda diagonal
		for (int fil = 0; fil < cuadradoMagico.length; fil++) {
			diag2 += cuadradoMagico[fil][cuadradoMagico.length-1-fil];
		}
		System.out.println(diag2); // OK
		
		// Comprobar sumas
		if(fila1 == fila2 && fila1 == fila3 && fila1 == col1 && fila1 == col2 && fila1 == diag1 && fila1 == diag2) {
			System.out.println("Es un cuadrado mágico");
		} else {
			System.out.println("Las sumas no coinciden, no es un cuadrado mágico");
		}
	}

}
