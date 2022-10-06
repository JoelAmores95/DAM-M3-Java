import java.util.Scanner;

// Escriu un programa que demani dos n�meros i una lletra. 
// Si la lletra �s "s" : els suma, si es "r": els resta, 
// si la lletra �s "m": multiplica i si la lletra �s "d": els divideix.

public class ejercicio02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		// Pido dos n�meros
		System.out.println("Dime el primer n�mero: ");
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
			
			// Caso 3: M - multiplicaci�n
		} else if(letra == 'm') {
			resultado = num1 * num2;
			System.out.println(resultado);
			
			// Caso 4: D - division
		} else if(letra == 'd') {
			resultado = num1 / num2;
			System.out.println(resultado);
			
			// Caso 5: Excepcion de error
		} else {
			System.out.println("Esa letra no es v�lida");
		}
	}
}
