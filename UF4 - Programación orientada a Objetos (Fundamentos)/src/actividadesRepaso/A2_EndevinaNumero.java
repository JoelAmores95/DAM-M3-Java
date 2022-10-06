package actividadesRepaso;
// Quitar package para corrección
import java.util.Random;
import java.util.Scanner;

public class A2_EndevinaNumero {

	public static void main(String[] args) {

		// Este es el número a adivinar 
		// (Math.random devuelve un número entre 0 y 0.9 , de ahí que sea *10 + 1
		int numGenerado = (int) (Math.random()*10) + 1;
		int intentos = 3;
		boolean ganar = false;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Has d’endevinar un nombre de l'1 al 10 en tres intents.\nIntrodueix un nombre:");		

		// El bucle se repite mientras tenga intentos
		while (intentos > 0 && !ganar) {
			int num = teclado.nextInt();			
			ganar = compruebaNumero(num, numGenerado);		
			intentos --;
			
		}

		// Mostrar resultado
		if(ganar) {
			System.out.println("Correcte!\nHas guanyat la partida.");
		} else {
			System.out.println("El numero correcte era el " + numGenerado + ".\nHas perdut la partida.");
		}
	}

	/**
	 * Comprueba si el número introducido es igual que el generado.
	 * @param num número entrado por el usuario
	 * @param numGenerado número aleatorio 0-10
	 * @return true si son iguales, false si no.
	 */

	public static boolean compruebaNumero(int num, int numGenerado) {
		
		if(num == numGenerado) {
			return true;
		} else {
			
			// El número metido es más grande
			if (num > numGenerado) {
				System.out.println("Menor!");
			} else {
				System.out.println("Major!");
			}

		} return false;
	}
}
