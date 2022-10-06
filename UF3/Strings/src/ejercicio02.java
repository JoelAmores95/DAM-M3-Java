import java.util.Scanner;

// Escriu un programa que demani dos números i una lletra. 
// Si la lletra és "s" : els suma, si es "r": els resta, 
// si la lletra és "m": multiplica i si la lletra és "d": els divideix.

public class ejercicio02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		// Pido dos números
		System.out.println("Dime el primer número: ");
		double num1 = teclado.nextInt();
		System.out.println("Dime el segundo numero");
		double num2 = teclado.nextInt();
		
		// Pido una letra
		System.out.println("Dime una letra: S, R, M, D: ");
		teclado.nextLine();
		char letra = teclado.nextLine().charAt(0);
		
		// Leo la letra y ejecuto en consecuencia
		double resultado = 0;
		
		// Caso 1: S - suma
		if (letra == 's') {
			resultado = num1 + num2;
			System.out.println(resultado);
			
			// Caso 2: R - resta
		} else if(letra == 'r') {
			resultado = num1 - num2;
			System.out.println(resultado);
			
			// Caso 3: M - multiplicación
		} else if(letra == 'm') {
			resultado = num1 * num2;
			System.out.println(resultado);
			
			// Caso 4: D - division
		} else if(letra == 'd') {
			resultado = num1 / num2;
			System.out.println(resultado);
			
			// Caso 5: Excepcion de error
		} else {
			System.out.println("Esa letra no es válida");
		}
	}
}
