import java.util.Scanner;

// Escriure un programa que llegeixi una matriu de 3 files i 3 columnes de valors enters. 
// A continuació, el programa ha de demanar el número d'una fila. 
// El programa haurà de retornar el màxim d'aquesta fila.

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		// Crear matriz
		int[][] matriz = new int [3][3];
		
		// Llenar matriz
		for (int fil = 0; fil < matriz.length; fil++) {
			for (int col = 0; col < matriz[fil].length; col++) {
				System.out.println("Introduce el valor de la fila " + (fil+1) + " y columna " + (col+1));
				matriz[fil][col] =  teclado.nextInt();
			}
		}
		// Pedir numero de fila
		System.out.println("Número de fila buscado: ");
		int numFila = teclado.nextInt() - 1 ;
		
		// Buscar el número más grande de la fila
		int numGrande = matriz[numFila][0];
		for (int fila = numFila; fila < numFila+1; fila++) {
			for (int col = 0; col < matriz.length; col++) {
				if(matriz[fila][col] > numGrande) {
					numGrande = matriz[fila][col];
				}
			}
		}
		// Muestro el número más grande de la fila
		System.out.println("El número más grande de la fila " + numFila + " es: " + numGrande);
	}

}
