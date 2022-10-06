// Dissenya un programa que donat un nombre enter, de l'1 al 10, et mostri la seva taula de multiplicar.

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		// Introducir numero
		System.out.println("Introduce un numero del 1 al 10");
		int numero = teclado.nextInt();
		System.out.println("La tabla de multiplicar de " + numero);
		
		//Sumar 1 al numero que multiplica
		for (int i = 1; i <= 10; i++) {
			System.out.println(numero + " x "+ i +" = " + numero*i);
		}
	}

}
