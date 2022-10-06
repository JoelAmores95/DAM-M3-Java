// A.A.2 M3 - Joel Amores

import java.util.Scanner;

public class AA2_Matrices {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Crear tablero 8x8
		char[][] tablero = new char[8][8];

		// Lleno el tablero con guiones (-)
		for (int fila = 0; fila < tablero.length; fila++) {
			for (int columna = 0; columna < tablero.length; columna++) {
				tablero[fila][columna] = '-';
			}
		}

		// Posici�n caballo

		System.out.println("Introduce las coordenadas del caballo:");
		int filaCaballo = teclado.nextInt() -1;
		int columnaCaballo = teclado.nextInt() -1;

		// Compruebo que la posici�n es correcta
		if ((filaCaballo < tablero.length) && (columnaCaballo < tablero[0].length)) {
			tablero[(filaCaballo)][(columnaCaballo)] = 'C';

			// Posici�n Torre (Resto 1 para evitar error de index) - Se da por hecho que las coordenadas son correctas
			System.out.println("Introduce las coordenadas de la torre");
			int filaTorre = (teclado.nextInt() - 1);
			int columnaTorre = (teclado.nextInt() - 1);
			tablero[(filaTorre)][(columnaTorre)] = 't';

			// Movimientos del caballo -  8 Posibilidades

			// Opci�n 1: fila +1 columna +2

			// Compruebo si est� dentro de los l�mites
			boolean dentroLimites = (((filaCaballo + 1) <= tablero.length -1) 
					&& ((columnaCaballo + 2) <= tablero[0].length -1));

			if(dentroLimites) {

				// Si la nueva posici�n COINCIDE con la posici�n de la torre, sustituyo por X, si no, *
				if(tablero[filaCaballo + 1][columnaCaballo + 2] == tablero[filaTorre][columnaTorre]) {
					tablero[filaCaballo + 1][columnaCaballo + 2] = 'x';
				} else {
					tablero[filaCaballo + 1][columnaCaballo + 2]= '*';
				}

			}// Si est� fuera de l�mites no hago nada

			// Opci�n 2: fila +1 columna -2

			dentroLimites = (((columnaCaballo - 2) >= 0)) 
					&& (((filaCaballo +1) <= tablero.length -1) && ((columnaCaballo-2) <= tablero[0].length));

			if(dentroLimites) {
				if(tablero[filaCaballo + 1][columnaCaballo - 2] == tablero[filaTorre][columnaTorre]) {
					tablero[filaTorre][columnaTorre] = 'x';
				} else {
					tablero[filaCaballo + 1][columnaCaballo - 2]= '*';
				}
			}

			// Opci�n 3: fila -1 columna +2
			dentroLimites = ((filaCaballo - 1) >= 0) 
					&& ((columnaCaballo+2) <= tablero[0].length -1);

			if(dentroLimites) {

				if(tablero[filaCaballo - 1][columnaCaballo + 2] == tablero[filaTorre][columnaTorre]) {
					tablero[filaTorre][columnaTorre] = 'x';
				} else {
					tablero[filaCaballo - 1][columnaCaballo + 2]= '*';
				}
			}

			// Opci�n 4: fila -1 columna -2
			dentroLimites = ((filaCaballo-1) >= 0) && ((columnaCaballo-2) >= 0);

			if(dentroLimites) {

				// Si la nueva posici�n COINCIDE con la posici�n de la torre, sustituyo por X, si no, *
				if(tablero[filaCaballo - 1][columnaCaballo - 2] == tablero[filaTorre][columnaTorre]) {
					tablero[filaTorre][columnaTorre] = 'x';
				} else {
					tablero[filaCaballo - 1][columnaCaballo - 2]= '*';
				}
			}

			// Opci�n 5: fila +2 columna +1
			dentroLimites = ((filaCaballo + 2) <= tablero.length -1) && ((columnaCaballo + 1) <= tablero[0].length - 1);

			if(dentroLimites) {
				if(tablero[filaCaballo + 2][columnaCaballo + 1] == tablero[filaTorre][columnaTorre]) {
					tablero[filaTorre][columnaTorre] = 'x';
				} else {
					tablero[filaCaballo + 2][columnaCaballo + 1]= '*';
				}
			} 

			// Opci�n 6: fila +2 columna -1
			dentroLimites = ((columnaCaballo-1) >= 0) 
					&& ((filaCaballo + 2) <= tablero.length -1);

			if(dentroLimites) {
				if(tablero[filaCaballo + 2][columnaCaballo - 1] == tablero[filaTorre][columnaTorre]) {
					tablero[filaTorre][columnaTorre] = 'x';
				} else {
					tablero[filaCaballo + 2][columnaCaballo - 1]= '*';
				}
			} 

			// Opci�n 7: fila -2 columna +1
			dentroLimites = ((filaCaballo - 2) >= 0) 
					&& ((columnaCaballo + 1) <= tablero[0].length -1) ;

			if(dentroLimites) {
				if(tablero[filaCaballo - 2][columnaCaballo + 1] == tablero[filaTorre][columnaTorre]) {
					tablero[filaTorre][columnaTorre] = 'x';
				} else {
					tablero[filaCaballo - 2][columnaCaballo + 1]= '*';
				}
			} 

			// Opci�n 8: fila -2 columna -1
			dentroLimites = ((filaCaballo - 2) >= 0) 
					&& ((columnaCaballo - 1) >= 0);

			if(dentroLimites) {
				if(tablero[filaCaballo - 2][columnaCaballo - 1] == tablero[filaTorre][columnaTorre]) {
					tablero[filaTorre][columnaTorre] = 'x';
				} else {
					tablero[filaCaballo - 2][columnaCaballo - 1]= '*';
				}
			}

			// Compruebo tablero
			for (int i = 0; i < tablero.length; i++) {
				for (int j = 0; j < tablero.length; j++) {
					System.out.print(tablero[i][j]); ;
				}
				System.out.println();
			}
		} else {
			System.out.println("Posici�n inv�lida");
		}
		teclado.close();
	}
}
