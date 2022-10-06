// Donats dos nombres enters n1 i n2 amb n1 < n2 , 
// escriu tots els nombres enters dins l’interval [n1, n2] en ordre decreixent.

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce valor n1: ");
		int n1 = teclado.nextInt();
		System.out.println("Introduce valor n2: ");
		int n2 = teclado.nextInt();
		
		// Para no modificar el valor original de la variable n2, creo una variable contador
		int i = n2;
		
		while (n1 <= i) {
			System.out.println(i);
			i--;
		}
	}
}
