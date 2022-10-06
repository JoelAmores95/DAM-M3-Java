import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		boolean ocupado = true;
		Scanner teclado = new Scanner(System.in);

		// Creo el parking

		//		// Filas
		//		System.out.println("Num filas del parking:");
		//		int numFilasParking = teclado.nextInt();
		//		
		//		// Columnas
		//		System.out.println("Num filas del parking:");
		//		int numColumnasParking = teclado.nextInt();
		//		
		//		// Inicio Matriz
		//		int[][] parking = new int[numFilasParking][numColumnasParking];
		//		
		//		// Relleno matriz
		//		for (int fil = 0; fil < parking.length; fil++) {
		//			for (int col = 0; col < parking.length; col++) {
		//				
		//			}
		//		}

		// Pongo yo los valores directamente. (true = ocupado, false = libre)
		boolean[][] parking ={ 	{true,true,true,false},
								{false,false,false,false},
								{true,true,true,true} };
		// Menú
		String opcion ="";
		while(!opcion.equalsIgnoreCase("iv")) {
			System.out.println("Elige una opcion: \ni: Porcentaje plazas libres por fila\nii: Porcentaje plazas libre parking\n"
					+ "iii: Número de fila más libre\niv: salir");
			opcion = teclado.nextLine();

			// Opciones

			// 1. i: Porcentaje plazas libres
			if(opcion.equalsIgnoreCase("i")) {
				System.out.println("Dime el número de fila entre 0 y " + (parking.length-1));
				int numFila = teclado.nextInt();
				percentatgePlacesLliuresFila(parking, numFila);
			}

			// 2. ii: Porcentaje plazas libres parking
			if(opcion.equalsIgnoreCase("ii")) {
				percentatgePlacesLliuresParking(parking);
			}

			// 3. iii Número de fila más libre
			if(opcion.equalsIgnoreCase("iii")) {
				System.out.println(numFilaMesLliure(parking)); 
			}
		}
	}

	/**Crea una funció anomenada percentatgePlacesLliuresFila 
	 * que donada la matriu i el número de fila de la matriu, 
	 * retorni el percentatge de places lliures d'aquella fila.
	 * @param matriz
	 * @param numFila
	 * @return
	 */
	public static double percentatgePlacesLliuresFila(boolean matriz[][], int numFila){
		
		// Contador
		int plazasLibres = 0;
		
		// Recorro la fila
		for (int col = 0; col < matriz[numFila].length; col++) {
			if(!matriz[numFila][col]) {
				plazasLibres++;
			}
		}
		// Calculo el porcentaje
		double porcentaje = (plazasLibres/(double)matriz[numFila].length) * 100;
		System.out.println(porcentaje + " % Plazas Libres");
		return porcentaje;
	}

	/** Crea una funció anomenada percentatgePlacesLliuresParking 
	 * que donada la matriu del pàrquing 
	 * retorni el percentatge de places lliures del parking. 
	 */

	public static double percentatgePlacesLliuresParking(boolean matriz[][]) {
		double sumaPorcentajes = 1;
		// Llamo a la funcion que me calcula el porcentaje en la fila
		for (int fil = 0; fil < matriz.length; fil++) {
			sumaPorcentajes += percentatgePlacesLliuresFila(matriz, fil);
		}
		System.out.println(sumaPorcentajes/matriz.length + "%");
		return sumaPorcentajes;
	}

	/** 
	 * Crea una funció anomenada numFilaMesLliure que retorni el número de fila més lliure. 
	 */
	public static int numFilaMesLliure(boolean matriz[][]){
		double numPosicionesLibre=0;
		int numFilaMasLibre=0;
		for (int i = 0; i < matriz.length; i++) {
			if(percentatgePlacesLliuresFila(matriz, i)>numPosicionesLibre) {
				numPosicionesLibre = percentatgePlacesLliuresFila(matriz, i);
				numFilaMasLibre=i;
			}	
		}
		return numFilaMasLibre;
	}
}
