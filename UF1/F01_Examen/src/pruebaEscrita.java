// Joel Amores 1rDAMm

import java.util.Scanner;

public class pruebaEscrita {

	public static void main(String[] args) {

		Scanner teclado= new Scanner(System.in);

		// ====== Parte 1: Crear Cartón M x N ====================================================

		// Filas

		System.out.println("Introduce el número de filas del cartón: (1-7)");
		int filasCarton = teclado.nextInt();

		// Si el número puesto esta fuera de los límites, repetirá hasta que ponga uno correcto

		while(filasCarton < 1 || filasCarton > 7) {
			System.out.println("Introduce el número de filas del cartón: (1-7)");
			filasCarton = teclado.nextInt();
		}

		// Columnas

		System.out.println("Introduce el número de columnas del cartón: (1-7)");
		int columnasCarton = teclado.nextInt();

		// Ahora compruebo el número de las columnas

		while(columnasCarton < 1 || columnasCarton > 7) {
			System.out.println("Introduce el número de columnas del cartón: (1-7)");
			columnasCarton = teclado.nextInt();
		}

		// Creación Cartón
		int[][] carton = new int[filasCarton][columnasCarton];

		// Lleno el cartón de números random
		for (int fil = 0; fil < carton.length; fil++) {
			for (int col = 0; col < carton[0].length; col++) {
				carton[fil][col]= (int)Math.floor(Math.random() * (99 - 1 + 1) + 1);
			}
		}

		//Mostrar Cartón
		for (int fil = 0; fil < carton.length; fil++) {
			for (int col = 0; col < carton[0].length; col++) {
				System.out.print(carton[fil][col] + " ");
			}
			System.out.println();
		}

		// ========== Parte 2: Inicio del juego ===================================

		System.out.println("Introduce un número (-1 para acabar):");
		int numeroIntroducido = teclado.nextInt();

		// Contador para números tachados
		int contadorTachados = 0;

		// El bucle se repite mientras no se ponga un -1

		while (numeroIntroducido != -1) {

			// Busco el número introducido por todo el cartón
			for (int fil = 0; fil < carton.length; fil++) {
				for (int col = 0; col < carton[0].length; col++) {

					// Si encuentra el número, lo sustituye por -1
					if (numeroIntroducido == carton[fil][col]) {
						carton[fil][col] = -1;
						contadorTachados++;
					}
				}
			}

			//Mostrar Cartón
			for (int fil = 0; fil < carton.length; fil++) {
				for (int col = 0; col < carton[0].length; col++) {
					System.out.print(carton[fil][col] + " ");
				}
				System.out.println();
			}
			// Pido otro número
			System.out.println("Introduce un número (-1 para acabar):");
			numeroIntroducido = teclado.nextInt();
		}

		//====== Resultados ===========================================================

		// Números tachados

		if(contadorTachados == 0) {
			System.out.println("No has tachado ningún número.");
		} else if(contadorTachados == 1){
			System.out.println("Has tachado "+ contadorTachados +" número");
		} else {
			System.out.println("Has tachado " + contadorTachados + " números");
		}

		// Porcentaje de números restantes

		int cartonTieneXNumeros = (filasCarton * columnasCarton);

		double porcentaje = 100-(((double)contadorTachados / (double)cartonTieneXNumeros) * 100);


		System.out.println("Falta el " + porcentaje + " % de números por tachar.");

		// Media de números sin tachar

		// Recorro el cartón buscando los números que no sean -1 (tachados) y guardo el acumulado
		int sumaNoTachados = 0;
		int contadorNoTachados = 0;

		for (int fil = 0; fil < carton.length; fil++) {
			for (int col = 0; col < carton[0].length; col++) {
				if(carton[fil][col] != -1) {
					sumaNoTachados += carton[fil][col];
					contadorNoTachados ++;
				}
			}
		}
		// Calculo la media de los No tachados
		if(contadorNoTachados == 0) {
			System.out.println("No hay números sin tachar.");
		}else {
			double mediaNoTachados = (double)sumaNoTachados / (double)contadorNoTachados;
			
			// Muestro el resultado

			System.out.println("La media de los números no tachados es " + mediaNoTachados);
		}
	}
}
