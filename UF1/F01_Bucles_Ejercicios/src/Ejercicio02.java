// Donats dos nombres enters n1 i n2 amb n1 < n2, escriu les arrels quadrades dels nombres enters dins l'interval [n1, n2] en ordre creixent.

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce valor n1:  ");
		int n1 = teclado.nextInt();
		System.out.println("Introduce valor n2: (mayor al de antes)");
		int n2 = teclado.nextInt();
		int i = n1;
		
		// Para hacer raiz cuadrada se usa Math.sqrt(numero)
		while (i <= n2) {
			System.out.println(Math.sqrt(i));
			i++;
		}
	}
}
