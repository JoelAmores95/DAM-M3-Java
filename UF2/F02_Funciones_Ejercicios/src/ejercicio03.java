// Queda por acabar la ultima parte

import java.util.Scanner;

public class ejercicio03 {

	public static void main(String[] args) {

		// Crear matriz
		Scanner teclado = new Scanner(System.in);
		System.out.println("Tamaño matriz filas: ");
		int tamañoMatrizFilas = teclado.nextInt();
		System.out.println("Tamaño matriz columnas: ");
		int tamañoMatrizColumnas = teclado.nextInt();
		
		int[][] matriz = new int[tamañoMatrizFilas][tamañoMatrizColumnas];
		
		// Llenar matriz 
		for (int fil = 0; fil < matriz.length; fil++) {
			for (int col = 0; col < matriz.length; col++) {
				System.out.println("fila " + fil +", columna " + col + ":");
			}
		}
		// Mostrar resultados
		System.out.println("Máximo: " + buscarValorMax(matriz));
		System.out.println("Mínimo: " + buscarValorMin(matriz));
		System.out.println("Media: " + buscarValorMedio(matriz));
		
	}
	
	// 1. Valor MÁXIMO de matriz
	public static int buscarValorMax(int[][] matriz) {
		int valorMax = Integer.MIN_VALUE;
		for (int fil = 0; fil < matriz.length; fil++) {
			for (int col = 0; col < matriz.length; col++) {
				if(matriz[fil][col] > valorMax) {
					valorMax = matriz[fil][col];
				}
			}
		}
		return valorMax;
	}
	
	// 2. Valor MÍNIMO de matriz
	public static int buscarValorMin(int[][] matriz) {
		int valorMin = Integer.MAX_VALUE;
		for (int fil = 0; fil < matriz.length; fil++) {
			for (int col = 0; col < matriz.length; col++) {
				if(matriz[fil][col] < valorMin) {
					valorMin = matriz[fil][col];
				}
			}
		}
		return valorMin;
	}
	
	// 3. Valor MEDIO de matriz
	public static double buscarValorMedio(int[][] matriz) {
		double valorMedio = 0;
		for (int fil = 0; fil < matriz.length; fil++) {
			for (int col = 0; col < matriz.length; col++) {
				valorMedio+= matriz[fil][col];
			}
		}
		valorMedio = valorMedio / (matriz[0].length * matriz.length);
		return valorMedio;
	}

}
