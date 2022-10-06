import java.util.Scanner;

// Escriure un programa que llegeixi una matriu de 3 files i 3 columnes de valors enters. 
// A continuaci�, el programa ha de demanar el n�mero d'una fila. 
// El programa haur� de retornar el m�xim d'aquesta fila.

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
		System.out.println("N�mero de fila buscado: ");
		int numFila = teclado.nextInt() - 1 ;
		
		// Buscar el n�mero m�s grande de la fila
		int numGrande = matriz[numFila][0];
		for (int fila = numFila; fila < numFila+1; fila++) {
			for (int col = 0; col < matriz.length; col++) {
				if(matriz[fila][col] > numGrande) {
					numGrande = matriz[fila][col];
				}
			}
		}
		// Muestro el n�mero m�s grande de la fila
		System.out.println("El n�mero m�s grande de la fila " + numFila + " es: " + numGrande);
	}

}
