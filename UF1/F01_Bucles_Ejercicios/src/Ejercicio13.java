// Donat un nombre enter positiu, calcula el seu divisor positiu més gran diferent d'ell mateix.

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Pedir numero
		System.out.println("Numero: ");
		int numero = teclado.nextInt(); // Numero introducido

		double cNumero = numero; // Copia del numero 
		int divisor = numero-1; 
		
		// Es divisor si el residuo es 0
		boolean esDivisor = (cNumero % divisor == 0);

		// Calcular divisores
		while (!esDivisor) {
			divisor--;	
			esDivisor = (cNumero % divisor == 0);
		}
			System.out.println(divisor);	
	}
}
