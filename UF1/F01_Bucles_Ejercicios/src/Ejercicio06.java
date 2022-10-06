import java.util.Scanner;

// Donats dos nombres enters positius a i b, calcula el resultat de realitzar la seva multiplicació a partir de sumes.

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime el primer entero: ");
		int a = teclado.nextInt();
		System.out.println("Dime el segundo entero: ");
		int b = teclado.nextInt();
		
		// Transformar de multiplicacion a suma
		int multiplicacion = a * b;
		int suma = 0;
		int contador = b;
		
		// Sumo a la variable "a" su valor tantas veces como diga "b"
		while (contador > 0) {
			suma += a;
			contador--;
		}
		System.out.println("La multiplicación es: " + multiplicacion);
		System.out.println("En forma de suma es " + a + " sumado " + b + " veces que da " + suma);
	}

}
