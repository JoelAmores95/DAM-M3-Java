import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class evaluable_2 {
	
	// Prova Escrita UF2-UF3 DAM1M/DAW1M - 21/22 Joel Amores

	public static void main(String[] args) throws FileNotFoundException {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Nombre del fichero (sin .txt): ");
		String nombreFichero = teclado.nextLine() + ".txt";
		
		// OPCIONAL - Creo el fichero - 
		// Se puede borrar/comentar una vez creado el fichero o si se quiere usar un fichero propio
		
		PrintWriter printwriter = new PrintWriter(nombreFichero);
		
		// OPCIONAL - Lleno ese fichero con datos - Igual que arriba
		
		printwriter.println("4 4\r\n"
				+ "3 5 3 2\r\n"
				+ "7 2 1 4\r\n"
				+ "4 4 3 6\r\n"
				+ "7 2 1 9");
		printwriter.close();

		// Guardo la matriz importada en una variable
		int[][] matrizdeFichero = CrearMatrizDeFichero(nombreFichero);

		// Muestro la matriz importada
		System.out.println("La matriz del fichero es:\n");
		
		mostrarMatriz(matrizdeFichero);
		
		// Muestro la suma de los interiores
		System.out.println("\nLa suma de los números interiores es: " + sumaInteriores(matrizdeFichero));
		
		// Muestro la suma de los bordes
		System.out.println("La suma de los bordes es: " + cuentaBordes(matrizdeFichero)+"\n");
		
		// Muestro la nueva matriz con la suma de su interior
		System.out.println("La nueva matriz es: \n");
		
		int[][] nuevaMatriz = nuevaMatrizConRelleno(matrizdeFichero);
		
		mostrarMatriz(nuevaMatriz);
		
		// Opcional - para evitar el warning
		teclado.close();
	}
	
	/**
	 * Función que dado el nombre de un fichero, devuelve una matriz con los datos del fichero
	 * 
	 * @param nombreFichero
	 * @return
	 * @throws FileNotFoundException
	 */
	
	public static int[][] CrearMatrizDeFichero(String nombreFichero) throws FileNotFoundException{

		// Abro el Scanner para leer
		Scanner lector = new Scanner(new File(nombreFichero));

		// Guardo el primer numero en la variable f (filas), el segundo en c (columnas)
		int f = lector.nextInt();
		int c = lector.nextInt();

		// Creo la matriz
		int[][] matriz = new int[f][c];

		// Relleno la matriz con los números del fichero
		for (int fila = 0; fila < f; fila++) {
			for (int col = 0; col < c; col++) {
				matriz[fila][col] = lector.nextInt();
			}
		}
		// retorno la matriz
		return matriz;
	}
	
	/**
	 * Función que recibida una matriz,
	 * cuenta las casillas del interior, ignorando los bordes.
	 * @param matriz
	 * @return
	 */
	
	public static int sumaInteriores(int[][] matriz) {
		
		// Varible donde iré guardando la suma
		int suma = 0;
		
		// Recorro la matriz ignorando los bordes
		for (int fila = 1; fila < matriz.length - 1; fila++) {
			for (int col = 1; col < matriz[fila].length - 1; col++) {
				
				suma += matriz[fila][col];
			}
		}
		return suma;
	}
	
	/**
	 * Función que recibida una matriz, 
	 * cuenta la cantidad de casillas que hay en la parte exterior.
	 * 
	 * @param matriz
	 * @return cantidad de casillas
	 */
	
	public static int cuentaBordes(int[][] matriz) {
		
		int contador = 0;
		
		// Los bordes son: fila, columna = 0, fila, columna = matriz.length - 1 
		
		for (int fila = 0; fila < matriz.length; fila++) {
			for (int col = 0; col < matriz[fila].length; col++) {
				if (fila == 0 || col == 0 || fila == matriz.length-1 || col== matriz.length-1) {
					contador ++;
				}
			}
		}
		
		// Version super PRO		
		// return (matriz.length * 2) - 4;
		
		// Si NO ES CUADRADA		
		// return ((matriz.length * 2) -2) + ((matriz[0] * 2) -2);
		return contador;
	}
	
	/**
	 * Función que recibida una matriz, devuelve una nueva matriz
	 * con los valores anteriores MÁS la suma de los nombres internos
	 * 
	 * @param matriz
	 * @return nuevaMatriz
	 */
	
	public static int[][] nuevaMatrizConRelleno(int[][] matriz){
		
		// Nueva matriz con los datos de la matriz importada		
		int nuevaMatriz[][] = new int[matriz.length][matriz[0].length];
		
		// Variable donde guardo la suma del interior
		int sumaInterior = sumaInteriores(matriz);
		
		for (int fila = 0; fila < nuevaMatriz.length; fila++) {
			for (int col = 0; col < nuevaMatriz[fila].length; col++) {
				
				nuevaMatriz[fila][col] = (matriz[fila][col] + sumaInterior);				
			}
		}		
		return nuevaMatriz;
	}
	
	/**
	 * Función que sencillamente muestra una matriz
	 * @param matriz
	 */
	
	public static void mostrarMatriz(int[][] matriz) {
		
		for (int fila = 0; fila < matriz.length; fila++) {
			for (int col = 0; col < matriz[fila].length; col++) {
				
				// Imprime la posición
				System.out.print(matriz[fila][col] + " ");
			}
			
			// Salta de línea
			System.out.println();
		}
	}

}
