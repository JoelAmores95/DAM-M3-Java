import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class laberinto {

	public static void main(String[] args) throws IOException {
		// 		Personajes
		//		▒ = pared  
		//		☺ = pepito
		//		♥ = meta
		// 		☼ = moneda
		// 		◙ = trampa
		//		♪ = llave
		//		X = estadoPuerta
		
		Scanner teclado = new Scanner(System.in);
		int menu = 0;
		
		// Menú Principal dentro de un while
		while (menu != 3) {
			System.out.println("Elige tu opción: ");
			System.out.println("1 - Jugar Partida");
			System.out.println("2 - Ver Resultados");
			System.out.println("3 - Salir");
	
			menu = teclado.nextInt();
			
			switch(menu) {
			case 1: // Jugar Partida
				System.out.println("Selecciona el nivel de dificultad: \n1 - Fácil\n2 - Medio\n3 - Difícil\n4 - Cargar de fichero");
				int dificultad = teclado.nextInt();
				jugar(dificultad);
				break;
				
			case 2: // Ver Resultados
				muestraResultado();
				break;
				
			case 3: // Salir 
				System.out.println("¡Hasta luego!");
				menu = 3;
				break;
				
			default: System.out.println("Opción no válida.");
			}		
		}
	}

	// Funciones

	/**
	 * Mostrar laberinto
	 * @param laberinto
	 */
	
	public static void mostrarMatriz(char[][] laberinto) {

		for (int fil = 0; fil < laberinto.length; fil++) {
			for (int col = 0; col < laberinto.length; col++) {
				System.out.print(laberinto[fil][col]);
			}
			System.out.println();
		}
	}

	/** pedirMovimiento
	 * Coge la letra introducida por el usuario
	 * @return
	 */
	
	public static char pedirMovimiento() {
		Scanner teclado = new Scanner(System.in);
		return teclado.next().charAt(0);
	}
	
	/**
	 * Función que contiene el bucle principal del juego. 
	 * Saldrá una vez la partida acabe por haber llegado a la meta o porque el usuario ha decidido salir.
	 * @param laberinto Matriz del laberinto
	 * @throws IOException 
	 */
	
	public static void jugar(int dificultad) throws IOException {

		char[][] laberinto = cargarLaberinto(dificultad);
		
		// Array donde guardamos la posición de Pepito
		int[] posicionPepito = {0, 0};
		int numPasos = 0;
		int puntuacion = 0;
		
		// Puertas - Llaves
		boolean quedanLlaves = hayLlave(laberinto);
		
		int[] posicionMeta = {buscaFilMeta(laberinto), buscaColMeta(laberinto)};

		// Booleano para saber si la partida ha acabado y debemos salir del bucle
		boolean acabar = false;

		// Booleano para saber si gana o sale de la partida
		boolean ganar = false;

		// Mostramos el laberinto inicial
		mostrarMatriz(laberinto);

		// Mientras la partida no acabe, seguimos jugando
		while (!acabar) {

			// Pedimos un movimiento al usuario
			char mover = pedirMovimiento();

			// Según la tecla que entre el usuario, nos movemos en la dirección correspondiente
			switch (mover) {
			case 'w': puntuacion += moverArriba(laberinto, posicionPepito);
			numPasos++;
			break;
			
			case 'd': puntuacion += moverDerecha(laberinto, posicionPepito);
			numPasos++;
			break;
			
			case 's': puntuacion += moverAbajo(laberinto, posicionPepito);
			numPasos++;
			break;
			
			case 'a': puntuacion += moverIzquierda(laberinto, posicionPepito);
			numPasos++;
			break;
			
			// Si el usuario introduce q, la partida acaba
			case 'q': acabar = true;
			break;
			
			// Tecla no válida
			default: System.out.println("Error");
			}
			mostrarMatriz(laberinto);
			
			System.out.println("Puntuación: " + puntuacion);
			// Después de cada input comprobamos si hemos llegado a la meta
			// Esto ocurre cuando las posiciones de la meta y de Pepito coinciden
			
			if (posicionMeta[0] == posicionPepito[0] && posicionMeta[1] == posicionPepito[1]) {
				acabar = true;
				ganar = true;
			}
			
			// Extra: juego de llaves			
			if(quedanLlaves) {
				if(!hayLlave(laberinto)) {
					
					// Abro las puertas
					for (int fila = 0; fila < laberinto.length; fila++) {
						for (int columna = 0; columna < laberinto[fila].length-1; columna++) {
							if(laberinto[fila][columna] == 'X') {
								laberinto[fila][columna] = ' ';
							}
						}
					}
					quedanLlaves = false;
				}				
			}
			
		}
		guardarResultado(dificultad, numPasos, ganar, puntuacion);
	}


	/** MoverAbajo
	 * Mueve la cara de pepito hacia abajo.
	 * @param letra
	 * @param laberinto
	 * @param fil
	 * @param col
	 */
	
	public static int moverAbajo(char[][]laberinto, int[] posicionPepito) {
		
		// Si muevo hacia abajo significa que:
		// - La posicion laberinto[fil +1][col] está dentro de límites
		// - la nueva posición no es ▒ (pared)
		
		// Asignamos la posicion
		int fil = posicionPepito[0];
		int col = posicionPepito[1];
		int puntuacion = 0;
		
		// Miro si está dentro de límites
		if(fil + 1 <= laberinto.length - 1) {

			// Comprobar que NO es pared o estadoPuerta
			if(laberinto[fil + 1][col] != '▒' && laberinto[fil + 1][col] != 'X') {
				
				puntuacion += mirarValorCasillaSiguiente(laberinto, fil + 1, col);

				// Borro la posición actual con un char vacío
				laberinto[fil][col] = ' ';
				
				// Sumo 1 a la posición fila
				posicionPepito[0]++;				
				
				
				return puntuacion;

			}
			// Hay una pared. No puedo bajar
			return puntuacion;
			
		}
		// Está fuera de límites. No puedo bajar.
		return puntuacion;
	
	}

	/** MoverArriba
	 * Mueve la cara de pepito hacia abajo.
	 * @param letra
	 * @param laberinto
	 * @param fil
	 * @param col
	 */
	public static int moverArriba(char[][]laberinto, int[] posicionPepito) {
		
		// Si muevo hacia arriba significa que:
		// - La posicion laberinto[fil -1][col] está dentro de límites
		// - la nueva posición no es ▒ (pared)
		
		int fil = posicionPepito[0];
		int col = posicionPepito[1];
		int puntuacion = 0;
		
		// Miro si está dentro de límites
		if(fil - 1 >= 0) {

			// Comprobar que NO es pared o estadoPuerta
			if(laberinto[fil - 1][col] != '▒' && laberinto[fil - 1][col] != 'X') {
				
				puntuacion += mirarValorCasillaSiguiente(laberinto, fil - 1, col);

				// Borro la posición actual con un char vacío
				laberinto[fil][col] = ' ';
				
				// Resto 1 a la posición fila
				posicionPepito[0]--;
				
				return puntuacion;

			}
			// Hay una pared. No puedo subir
			return puntuacion;
			
		}
		// Está fuera de límites. No puedo subir.
		return puntuacion;
	}

	/** MoverDerecha
	 * Mueve la cara de pepito hacia la derecha.
	 * @param letra
	 * @param laberinto
	 * @param fil
	 * @param col
	 */
	
	public static int moverDerecha(char[][]laberinto, int[] posicionPepito) {
		
		// Si muevo hacia arriba significa que:
		// - La posicion laberinto[fil][col + 1] está dentro de límites
		// - la nueva posición no es ▒ (pared)
		
		int fil = posicionPepito[0];
		int col = posicionPepito[1];
		int puntuacion = 0;

		// Miro si está dentro de límites
		if(col + 1 <= laberinto[fil].length - 1) {

			// Comprobar que NO es pared o estadoPuerta
			if(laberinto[fil][col + 1] != '▒' && laberinto[fil][col + 1] != 'X') {
				
				puntuacion += mirarValorCasillaSiguiente(laberinto, fil, col + 1);

				// Borro la posición actual con un char vacío
				laberinto[fil][col] = ' ';
				
				// Sumo 1 a la posición columna
				posicionPepito[1]++;
				
				return puntuacion;

			}
			// Hay una pared. No puedo ir a la derecha
			return puntuacion;
		}
		// Está fuera de límites. No puedo ir a la derecha.
		return puntuacion;
	}

	/** MoverIzquierda
	 * Mueve la cara de pepito hacia la izquierda.
	 * @param letra
	 * @param laberinto
	 * @param fil
	 * @param col
	 */
	public static int moverIzquierda(char[][]laberinto, int[] posicionPepito) {
		
		// Si muevo hacia arriba significa que:
		// - La posicion laberinto[fil][col - 1] está dentro de límites
		// - la nueva posición no es ▒ (pared)
		
		int fil = posicionPepito[0];
		int col = posicionPepito[1];
		int puntuacion = 0;
		
		// Miro si está dentro de límites
		if(col - 1 >= 0) {

			// Comprobar que NO es pared o estadoPuerta
			if(laberinto[fil][col - 1] != '▒' && laberinto[fil][col - 1] != 'X') {
				
				puntuacion += mirarValorCasillaSiguiente(laberinto, fil, col - 1);

				// Borro la posición actual con un char vacío
				laberinto[fil][col] = ' ';
				
				// Resto 1 a la posición columna
				posicionPepito[1]--;
				
				return puntuacion;

			}
			// Hay una pared. No puedo ir a la izquierda
			return puntuacion;
		}
		// Está fuera de límites. No puedo ir a la izquierda.
		return puntuacion;
	}
	/** buscaFilMeta
	 * Busca y retorna la fila donde está posicionada la meta
	 * @param laberinto
	 * @return fila de la meta
	 */
	
	public static int buscaFilMeta(char[][] laberinto) {
		for (int fil = 0; fil < laberinto.length; fil++) {
			for (int col = 0; col < laberinto[fil].length; col++) {
				if (laberinto[fil][col]=='♥') {
					return fil;
				}
			}
		}
		return -1;
	}
	
	/** buscaColMeta
	 * Busca y retorna la columna donde está la meta
	 * @param laberinto
	 * @return
	 */
	
	public static int buscaColMeta(char[][] laberinto) {
		for (int fil = 0; fil < laberinto.length; fil++) {
			for (int col = 0; col < laberinto[fil].length; col++) {
				if (laberinto[fil][col]=='♥') {
					return col;
				}
			}
		}
		return -1;
	}
	
	/**
	 * Carga un laberinto desde un fichero
	 * @param nivel
	 * @return
	 * @throws FileNotFoundException
	 */

	public static char[][] cargarLaberinto(int nivel) throws FileNotFoundException{
		Scanner cargarFichero = new Scanner(new File("Laberinto.txt"));

		int f = cargarFichero.nextInt();
		int c = cargarFichero.nextInt();
		char[][] laberintoCargado = new char[f][c];
		cargarFichero.nextLine();

		for(int fila = 0; fila < laberintoCargado.length; fila++) {
			String lab = cargarFichero.nextLine();
			for (int col = 0; col < laberintoCargado.length; col++) {
				laberintoCargado[fila][col] = lab.charAt(col);
			}

		}
		cargarFichero.close();


		// Laberinto nivel fácil
		char[][] laberintoFacil = { {'☺','◙','☼'},
									{'☼','▒','▒'},
									{'☼','☼','♥'}};
		// Laberinto nivel medio
		char[][] laberintoMedio = { {'☺','☼','▒','☼','☼'},
									{'▒','☼','▒','☼',' '},
									{'☼',' ','X','☼','◙'},
									{'♪','☼','▒','▒','☼'},
									{'▒','▒',' ',' ','♥'}};

		// Laberinto nivel difícil
		char[][] laberintoDificil = { 	{'☺','☼','▒','☼','▒','◙','♪','▒','▒','☼'},
										{'▒','☼','X','◙','▒',' ','☼',' ',' ','♪'},
										{'☼','☼','▒',' ','▒','☼','▒','◙','▒','☼'},
										{'☼','▒','▒','☼',' ','☼',' ','◙','☼','◙'},
										{' ','☼','▒',' ','▒',' ','▒',' ',' ','☼'},
										{'▒',' ','◙',' ',' ','▒','X','▒','▒','▒'},
										{'☼',' ',' ','▒','▒',' ','▒',' ','X',' '},
										{'▒',' ','▒','☼',' ','☼',' ',' ','▒','◙'},
										{' ',' ','☼','♪','▒',' ','▒','X','▒',' '},
										{'♪','▒',' ','☼',' ','▒',' ','◙','☼','♥'}};
		
		switch(nivel) {
		case 1: return laberintoFacil;
		case 2: return laberintoMedio;
		case 3: return laberintoDificil;
		default: return laberintoCargado;		
		}
	}

	/**
	 * Guarda los resultados de la partida en un fichero
	 * @param laberinto
	 * @param numPasos
	 * @param ganar
	 * @throws IOException
	 */
	
	public static void guardarResultado(int dificultad, int numPasos, boolean ganar, int puntuacion) throws IOException {

		// Crear fichero para guardar resultados
		FileWriter resultados = new FileWriter("resultados.txt", true);

		// Escribir datos en el fichero
		String nivel;
		switch(dificultad) {
		case 1: nivel = "Fácil";
		break;
		case 2: nivel = "Medio";
		break;
		case 3: nivel = "Difícil";
		break;
		default: nivel = "Personalizado";
		} 
		resultados.write("Dificultad: " + nivel +"\r\n");
		
		// Muestra el resultado de la partida actual
		System.out.println("Dificultad: " + nivel);

		// Número de pasos
		resultados.write("Número de pasos: " + numPasos +"\r\nPuntuación: " + puntuacion +"\r\n");
		System.out.println("Número de pasos: " + numPasos);

		// Escribe si ha acabado la partida o no
		if(ganar) {
			resultados.write("¡Has ganado!\r\n");
			System.out.println("¡Has ganado!\n");
			resultados.write("\r\n");
		} else {
			resultados.write("No has acabado la partida\r\n");
			System.out.println("No has acabado la partida\n");
			resultados.write("\r\n");
		}
		// Cierre de resultados
		resultados.close();
	}

	/**
	 * Muestra los resultados guardados en un fichero
	 * @throws FileNotFoundException
	 */
	public static void muestraResultado() throws FileNotFoundException {
		Scanner resultados = new Scanner(new File("resultados.txt"));
		while(resultados.hasNextLine()) {
			String linea = resultados.nextLine();
			System.out.println(linea);
		}
		resultados.close();
		
	}
	
	/**
	 * Comprueba la casilla siguiente según el movimiento y actúa en consecuencia
	 * 
	 * @param laberinto
	 * @param fila
	 * @param columna
	 * @return puntuacion
	 */
	
	public static int mirarValorCasillaSiguiente(char[][] laberinto, int fila, int columna) {

		int puntuacion = 0;

		// Mirar qué tiene la posición
		switch(laberinto[fila][columna]) {
		
		// Moneda
		case '☼': puntuacion += 100;
		break;
		
		// Trampa
		case '◙': puntuacion -= 200;
		break;
		
		// Llave - abre Puertas
		case '♪': puntuacion += 150;
		break;
		}
		
		//La nueva posición tendrá la cara de pepito
		laberinto[fila][columna] = '☺';	
		return puntuacion;

	}
	
	/**
	 * Busca en la matriz si hay llaves ♪ 
	 * @param laberinto
	 * @return true si encuentra una puerta, false si no
	 */
	
	public static boolean hayLlave(char[][]laberinto) {
		
		// Recorro la matriz, si hay una ♪, hay llave
		for (int fila = 0; fila < laberinto.length; fila++) {
			for (int columna = 0; columna < laberinto[fila].length -1; columna++) {
				if (laberinto[fila][columna] == '♪'){
						return true;
				} 
			}
		}
		// Si despues de recorrer la matriz no hay ♪, devuelve false
		return false;
	}

}
