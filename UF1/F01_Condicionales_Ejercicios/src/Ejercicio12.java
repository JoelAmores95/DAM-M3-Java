// Escriu un programa que demani hora, minuts i segons. 
// I digui quina hora, minuts i segons serà quan hagi passat un segon més.


import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Pido hora, minutos y segundos
		System.out.println("Dime las horas: ");
		int horas = teclado.nextInt();
		System.out.println("Dime los minutos: (0-59)");
		int minutos = teclado.nextInt();
		System.out.println("Dime los segundos: (0-59)");
		int segundos = teclado.nextInt();

		// Muestro los datos originales
		System.out.println(horas + " horas, " + minutos + " minutos " + segundos +" segundo(s).");
		System.out.println("Le sumo un segundo y queda: ");
		segundos++;

		// Compruebo si pasan los límites
		if (segundos >= 59) {
			minutos ++;
			segundos = segundos - 60;
			if (minutos >= 59) {
				horas ++;
				minutos = minutos - 60;
			} else {
				segundos ++; 
			}
		}
		System.out.println(horas + " horas, " + minutos + " minutos " + segundos +" segundo(s).");

	}

}
