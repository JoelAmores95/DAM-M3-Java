import java.util.Scanner;

// Fes un programa que generi una matriu de 4x4, demani els valors a l'usuari i després determini quin és el número més gran i més petit.

public class Ejercicio01 {

	public static void main(String[] args) {
		// Creo matriz
		int[][] matriz = new int [4][4];
		
		//Pido valores al usuario
		Scanner teclado = new Scanner(System.in);
		for (int fil = 0; fil < matriz.length; fil++) {
			for (int col = 0; col < matriz[fil].length; col++) {
				System.out.println("Introduce el valor de la fila " + (fil+1) + " y columna " + (col+1));
				matriz[fil][col] =  teclado.nextInt();
			}
		}
		// Busco el numero más grande y el más peque
		int grande = matriz [0][0];
		int peque = matriz [0][0];
		
		for (int fila = 0; fila < matriz.length; fila++) {
			for (int col = 0; col < matriz[fila].length; col++) {
				
				// Miro si es más grande
				if (matriz[fila][col] >= grande) {
					grande = matriz[fila][col];
				}
				// Miro si es más peque
				if (matriz[fila][col] <= peque) {
					peque = matriz[fila][col];
				}
			}
		}
		System.out.println("El número más grande es: " + grande +"\nEl más peque es: " + peque);

	}

}
