// Donats dos nombres enters n1 i n2 amb n1 < n2, calcula quants parells hi ha dins de l’interval [n1 , n2]. 

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce valor n1: ");
		int n1 = teclado.nextInt();
		System.out.println("Introduce valor n2: (mayor al de antes)");
		int n2 = teclado.nextInt();
		
		// Contador pares
		int totalPares = 0;
		
		// Calcular si es par
		while (n1 <= n2) {
			if (n1 % 2 == 0) {
				totalPares ++;
			}
			n1++;
		}
		System.out.println("En total hay " + totalPares + " número(s) pares");
	}

}
