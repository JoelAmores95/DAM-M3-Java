import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class AA1_JoelAmores {
	
	// ######### PROGRAMA PRINCIPAL ##############

	public static void main(String[] args) throws FileNotFoundException {

		// Creo matriz
		char[][] matrizRestaurante = { 	{' ', ' ', 'W', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
										{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'W', ' '},
										{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
										{' ', ' ', ' ', ' ', 'W', ' ', ' ', ' ', ' ', ' '},
										{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
										{' ', ' ', ' ', ' ', ' ', 'W', ' ', ' ', ' ', ' '},
										{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
										{' ', ' ', ' ', ' ', 'W', ' ', ' ', ' ', ' ', ' '},
										{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
										{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}	};

		// Ejercicio 1: miro si tiene un lavabo a una distancia correcta
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("Fila: ");
		int fila = teclado.nextInt();
		System.out.println("Columna: ");
		int columna = teclado.nextInt();
		
		// Pongo el Scanner en su sitio
		teclado.nextLine();
		
		// OPCIONAL - mayor visibilidad, rellena los espacios en blanco con '-'
		for (int fil = 0; fil < matrizRestaurante.length; fil++) {
			for (int col = 0; col < matrizRestaurante[0].length-1; col++) {
				if(matrizRestaurante[fil][col]!='W') {
					matrizRestaurante[fil][col]='-';
				}				
			}
		}

		// Muestro resultado
		
		if(wcEnRango(matrizRestaurante, fila, columna)) {
			System.out.println("Hay un WC cerca, sin estar pegado.\n");
		} else {
			System.out.println("No hay WC cerca, o está pegado.\n");
		}
		
		// Ejercicio 2: Dibuja las mesas
		char[][] matrizConMesas = mostrarPosiciones(matrizRestaurante);
		
		// mostrarPosiciones(matrizRestaurante);
		
		// Ejericio 3: Guardar en fichero
		System.out.println("Nombre del fichero (sin .txt): ");
		String nombreFichero = teclado.nextLine();
		guardarEnFichero(matrizConMesas, nombreFichero);
		
		// Forma "elegante": guardarEnFichero(matrizConMesas, teclado.nextLine());
		
		System.out.println(nombreFichero +".txt guardado correctamente.");

	}
	
	// ############ DECLARACIÓN FUNCIONES ########################
	
	/**
	 * Dada una posición, dirá si está dentro de la matriz o no.
	 * @param matriz
	 * @param fil
	 * @param col
	 * @return true si está dentro,
	 * false si está index out of bounds
	 */
	
	public static boolean estaDentroMatriz(char[][] matriz, int fil, int col) {

		// Número de filas y columnas
		int numFil = matriz.length;
		int numCol = matriz[0].length;

		// Si está dentro devuelve true, si no, false
		return (fil >= 0 && fil < numFil && col >= 0 && col < numCol);
	}


	/**
	 * Dada una matriz MxN, una fila y una columna, dice si tiene un WC a una distancia adecuada.
	 * Distancia adecuada: W a 2 o 3 casillas adyacentes.
	 * @param matriz
	 * @param fila
	 * @param columna
	 * @return true si tiene un WC, false si no
	 */

	public static boolean wcEnRango(char[][] matriz, int fila, int columna) {

		// Miro si esa posición está dentro de límites
		if(!estaDentroMatriz(matriz, fila, columna)) {

			// Está fuera
			System.out.println("ERROR - Posición inválida");
			return false;

		} else {

			// Está dentro
			// Si tiene un WC al lado, no puedo poner mesa
			if(wcPegado(matriz, fila, columna)) {
				return false;
			} else {

				// Miro si tiene una W en alguna de sus casillas vecinas (Rango 3 casillas)
				for (int f = fila - 3; f <= fila + 3; f++) {
					for (int c = columna-3; c <= columna + 3; c++) {

						// Hay que mirar que la posicion esté dentro de la matriz
						if (estaDentroMatriz(matriz, f, c)) {

							// Si la posición está dentro, miro si es W
							if(matriz[f][c]=='W') {

								// Hay WC
								return true;
							} 
							// No hay W

						}
						// Está fuera de matriz, no hago nada
					}	
				}
			}
			// Se ha recorrido toda la mini matriz, no hay WC
			return false;
		}
	}
	
	/**
	 * Dada una matriz, muestra las posiciones válidas para las mesas
	 * @param matriz
	 */
	
	public static char[][] mostrarPosiciones(char[][] matriz) {
		
		System.out.println("Plano de mesas: \n");
		
		char[][] matrizConMesas = new char[matriz.length][matriz[0].length];
		
		// Recorro matriz
		for (int fila = 0; fila < matriz.length; fila++) {
			for (int columna = 0; columna < matriz[0].length-1; columna++) {
				
				// Si la posición es una W, no la toco
				if(matriz[fila][columna] != 'W') {
					
					// Si tiene un W cerca, pongo mesa
					if(wcEnRango(matriz, fila, columna)) {
						matriz[fila][columna]= 'M';
						matrizConMesas[fila][columna]= 'M';
					}
					// NO tiene baño en rango, no pongo mesa
					
				} else {
					// Es una W, la guardo
					matrizConMesas[fila][columna]= 'W';
				}
				
				System.out.print(matriz[fila][columna]);
			}
			// Cambio de fila
			System.out.println();
		}
		return matrizConMesas;
		
	}
	
	/**
	 * Función que mira si hay una W en las casillas adyacentes
	 * @param matriz
	 * @param fila
	 * @param columna
	 * @return
	 */
	
	public static boolean wcPegado(char[][] matriz , int fila, int columna) {

		for (int f = fila - 1; f <= fila + 1; f++) {
			for (int c = columna -1; c <= columna + 1; c++) {

				// Primero tengo que mirar que esté en rango
				if(estaDentroMatriz(matriz, f, c)) {
					if(matriz[f][c]=='W') {
						return true;
					}
					// No tiene W

				} // Está fuera de rango
			}
		} // Si recorre todo y no hay baño, retorna falso
		return false;
	}
	
	/**
	 * Función que dada una matriz y un nombre de fichero, guarda la matriz en el fichero
	 * @param matriz
	 * @param fichero
	 * @throws FileNotFoundException
	 */
	
	public static void guardarEnFichero(char[][] matriz, String fichero) throws FileNotFoundException {
		PrintWriter printwriter = new PrintWriter(fichero + ".txt");

		// Recorro matriz
		for (int fila = 0; fila < matriz.length; fila++) {
			for (int columna = 0; columna < matriz[0].length-1; columna++) {

				printwriter.print(matriz[fila][columna]);
			}
			// Cambio de fila
			printwriter.println();
		}
		printwriter.close();
	}
}
