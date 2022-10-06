import java.util.Scanner;

// 1. Escriu un programa que demani 2 números i digui si els dos són parells, o un o els dos són senars.

public class Ejercicio01 {

	public static void main(String[] args) {
		
		// Pido dos números
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime el primer numero: ");
		int num1 = teclado.nextInt();
		System.out.println("Dime el segundo número: ");
		int num2 = teclado.nextInt();
		
		// Comprobacion si son pares (% 2 == 0)
		if ((num1 % 2 == 0) && (num2 % 2 == 0)) {
			System.out.println("Los dos son pares");
			
			// Comprobación uno de los dos es par
		} else if ((num1 % 2 == 0) || (num2 % 2 == 0)){
			System.out.println("Uno es par, el otro impar");
		} else {
			
			// Ninguno es par -> Son impares
			System.out.println("Los dos son impares");
		}
	}

}
