import java.util.Scanner;

// Fes un programa que generi una matriu de 4x4, 
// demani els valors a l'usuari i després determini la suma de cadascuna de les files i les columnes 
// (guardant a dos variables, una per suma files, i altre per suma columnes).

public class Ejercicio02 {
	public static void main(String[]args) {
		Scanner teclado = new Scanner(System.in);
		
		// Genero matriz
		int[][] matriz = new int [4][4];
		int sumaFilas=0;
		int sumaColumnas=0;
		
		// Pido datos para la matriz
		for (int fil = 0; fil < matriz.length; fil++) {
			for (int col = 0; col < matriz[fil].length; col++) {
				System.out.println("Introduce el valor de la fila " + (fil+1) + " y columna " + (col+1));
				matriz[fil][col] =  teclado.nextInt();
			}
		}
		// Sumo filas
		for (int fil = 0; fil < matriz.length; fil++) {
			for (int col = 0; col < matriz[fil].length; col++) {
				sumaFilas += matriz[fil][col];
			}
			System.out.println("La suma de la fila " + (fil+1) + " es " + sumaFilas);
		}
		// Sumo columnas
		for (int col = 0; col < matriz.length; col++) {
			for (int fil = 0; fil < matriz[col].length; fil++) {
				sumaColumnas += matriz[fil][col];
			}
			System.out.println("La suma de la columna " + (col+1) + " es " + sumaColumnas);
		}
	}

}
