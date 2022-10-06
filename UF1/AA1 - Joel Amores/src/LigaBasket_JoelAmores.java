// Joel Amores DAM1m

import java.util.Scanner;

public class LigaBasket_JoelAmores {

	public static void main(String[] args) {

		// Activo teclado
		Scanner teclado = new Scanner(System.in);

		// Variables
		double altura = 0; // Van en metros
		double peso = 0; // Van en Kg

		int jugAltas = 0; //  >= 1.80m
		int jugMedianas = 0 ; // entre 1,60 y 1,80 (no incluidos)
		int jugBajas = 0; //  <= 1,60m

		double alturaMediaJugAltas = 0;
		double alturaMediaJugMedianas = 0;
		double alturaMediaJugBajas = 0;
		double alturaMediaTotal = 0;

		int participantes = 0 ;

		// Inicio 
		System.out.println("Altura jugadora " + (participantes + 1));
		altura = teclado.nextDouble();

		// Compruebo que el primer dato introducido NO es -1
		if (altura != -1) {

			// El bucle acaba cuando se introduce -1 en la altura
			while (altura != -1) {

				// La altura no puede ser inferior a 1.20m, 
				// si es igual o superior continua el registro

				if (altura >= 1.20) {
					// La altura es correcta, pido peso
					System.out.println("Pes jugadora " + (participantes + 1));
					peso = teclado.nextDouble();

					// El peso no puede ser superior a 100Kg si mide menos de 1.60m
					if (peso > 100 && altura < 1.60) {
						// No puede participar
						System.out.println("No es permeten pesos majors de 100kg si es mesura menys d'1.60m!");						 
					} else {
						// Puede participar
						//
						// Clasificar jugadora segun altura
						//
						// Altura igual o superior a 1.80 --> Jugadora Alta

						if (altura >= 1.80) {
							// Jaime, hago el cast en int para que no muestre decimales
							System.out.println((int)(altura * 100) + "cm" + " -> JUGADORA ALTA \n");
							alturaMediaJugAltas += altura;
							alturaMediaTotal += altura;
							jugAltas ++;
							participantes ++;

							//Altura igual o inferior a 1.60 --> Jugadora Baja

						} else if(altura <=1.60) {
							System.out.println((int)(altura * 100) + "cm" + " -> JUGADORA BAIXA \n");
							alturaMediaJugBajas += altura;
							alturaMediaTotal += altura;
							jugBajas ++;
							participantes ++;

							// Si no es alta ni baja, es una jugadora de altura media
						} else {
							System.out.println((int)(altura * 100) + "cm" + " -> JUGADORA MITJANA \n");
							alturaMediaJugMedianas += altura;
							alturaMediaTotal += altura;
							jugMedianas ++;
							participantes ++;
						}
					}

				} else {
					// La altura es menor a 1.20m
					System.out.println("No es permeten alçades menors d'1.20m!");
				}
				// Pedir altura siguiente jugadora
				System.out.println("Altura jugadora " + (participantes + 1));
				altura = teclado.nextDouble();

			}
			// Fin del bucle
			// 
			// Calcular medias de alturas
			//
			// Jugadoras altas
			if (jugAltas == 0) {
				System.out.println("Alçada mitjana de les altes: No hi ha cap jugadora alta.");
			} else {
				alturaMediaJugAltas = (alturaMediaJugAltas / jugAltas);
				System.out.println("Alçada mitjana de les altes: " + alturaMediaJugAltas + "m");
			}

			// Jugadoras medianas
			if (jugMedianas == 0) {
				System.out.println("Alçada mitjana de les mitjanes: No hi ha cap jugadora mitjana.");
			} else {
				alturaMediaJugMedianas = (alturaMediaJugMedianas / jugMedianas);
				System.out.println("Alçada mitjana de les mitjanes: " + alturaMediaJugMedianas+ "m");
			}
			// Jugadoras bajas
			if (jugBajas == 0) {
				System.out.println("Alçada mitjana de les baixes: No hi ha cap jugadora baixa.");
			} else {
				alturaMediaJugBajas = (alturaMediaJugBajas / jugBajas);
				System.out.println("Alçada mitjana de les baixes: " + alturaMediaJugBajas + "m\n");
			}

			// Altura media de TODAS las participantes
			alturaMediaTotal = (alturaMediaTotal / participantes);
			System.out.println("Alçada mitjana de totes les jugadores: " + alturaMediaTotal + "m \n");

			// Calcular porcentajes sobre el total
			//
			// Jugadoras altas ((jugAltas/participantes) * 100)
			System.out.println("El percentatge de jugadores altes sobre el total és: " + (((double)jugAltas / participantes) * 100) + "%");
			
			// Jugadoras medianas ((jugMedianas/participantes) * 100)
			System.out.println("El percentatge de jugadores mitjanes sobre el total és: " + (((double)jugMedianas / participantes) * 100) + "%");
			
			// Jugadoras bajas ((jugBajas/participantes) * 100)
			System.out.println("El percentatge de jugadores baixes sobre el total és: " + (((double)jugBajas / participantes) * 100) + "%");

		} else {
			System.out.println("No hi ha cap jugadora.");
		}
		teclado.close();
	}

}
