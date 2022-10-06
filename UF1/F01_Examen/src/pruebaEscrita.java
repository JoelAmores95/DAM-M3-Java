// Joel Amores 1rDAMm

import java.util.Scanner;

public class pruebaEscrita {

	public static void main(String[] args) {

		Scanner teclado= new Scanner(System.in);

		// ====== Parte 1: Crear Cart�n M x N ====================================================

		// Filas

		System.out.println("Introduce el n�mero de filas del cart�n: (1-7)");
		int filasCarton = teclado.nextInt();

		// Si el n�mero puesto esta fuera de los l�mites, repetir� hasta que ponga uno correcto

		while(filasCarton < 1 || filasCarton > 7) {
			System.out.println("Introduce el n�mero de filas del cart�n: (1-7)");
			filasCarton = teclado.nextInt();
		}

		// Columnas

		System.out.println("Introduce el n�mero de columnas del cart�n: (1-7)");
		int columnasCarton = teclado.nextInt();

		// Ahora compruebo el n�mero de las columnas

		while(columnasCarton < 1 || columnasCarton > 7) {
			System.out.println("Introduce el n�mero de columnas del cart�n: (1-7)");
			columnasCarton = teclado.nextInt();
		}

		// Creaci�n Cart�n
		int[][] carton = new int[filasCarton][columnasCarton];

		// Lleno el cart�n de n�meros random
		for (int fil = 0; fil < carton.length; fil++) {
			for (int col = 0; col < carton[0].length; col++) {
				carton[fil][col]= (int)Math.floor(Math.random() * (99 - 1 + 1) + 1);
			}
		}

		//Mostrar Cart�n
		for (int fil = 0; fil < carton.length; fil++) {
			for (int col = 0; col < carton[0].length; col++) {
				System.out.print(carton[fil][col] + " ");
			}
			System.out.println();
		}

		// ========== Parte 2: Inicio del juego ===================================

		System.out.println("Introduce un n�mero (-1 para acabar):");
		int numeroIntroducido = teclado.nextInt();

		// Contador para n�meros tachados
		int contadorTachados = 0;

		// El bucle se repite mientras no se ponga un -1

		while (numeroIntroducido != -1) {

			// Busco el n�mero introducido por todo el cart�n
			for (int fil = 0; fil < carton.length; fil++) {
				for (int col = 0; col < carton[0].length; col++) {

					// Si encuentra el n�mero, lo sustituye por -1
					if (numeroIntroducido == carton[fil][col]) {
						carton[fil][col] = -1;
						contadorTachados++;
					}
				}
			}

			//Mostrar Cart�n
			for (int fil = 0; fil < carton.length; fil++) {
				for (int col = 0; col < carton[0].length; col++) {
					System.out.print(carton[fil][col] + " ");
				}
				System.out.println();
			}
			// Pido otro n�mero
			System.out.println("Introduce un n�mero (-1 para acabar):");
			numeroIntroducido = teclado.nextInt();
		}

		//====== Resultados ===========================================================

		// N�meros tachados

		if(contadorTachados == 0) {
			System.out.println("No has tachado ning�n n�mero.");
		} else if(contadorTachados == 1){
			System.out.println("Has tachado "+ contadorTachados +" n�mero");
		} else {
			System.out.println("Has tachado " + contadorTachados + " n�meros");
		}

		// Porcentaje de n�meros restantes

		int cartonTieneXNumeros = (filasCarton * columnasCarton);

		double porcentaje = 100-(((double)contadorTachados / (double)cartonTieneXNumeros) * 100);


		System.out.println("Falta el " + porcentaje + " % de n�meros por tachar.");

		// Media de n�meros sin tachar

		// Recorro el cart�n buscando los n�meros que no sean -1 (tachados) y guardo el acumulado
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
			System.out.println("No hay n�meros sin tachar.");
		}else {
			double mediaNoTachados = (double)sumaNoTachados / (double)contadorNoTachados;
			
			// Muestro el resultado

			System.out.println("La media de los n�meros no tachados es " + mediaNoTachados);
		}
	}
}
