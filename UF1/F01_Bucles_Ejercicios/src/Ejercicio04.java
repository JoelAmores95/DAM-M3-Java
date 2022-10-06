import java.util.Scanner;

// Donat un nombre enter positiu, escriu els seus divisors positius.

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Dime un número entero positivo: ");
		int numEntero = teclado.nextInt();
		int dividoPor = 1;

		// Me aseguro que sea positivo o no sea 0
		if (numEntero <= 0) {
			System.out.println("Ese número no me sirve.");
		} else {
			// Es divisor mientras esté entre 1 y su propio valor
			while (dividoPor < numEntero) {
				// Si es divisor, muestro su valor
				if (numEntero % dividoPor == 0) {
					System.out.println(dividoPor+ " es divisor.");
				}
				// Sumo 1 al posible divisor
				dividoPor++;
			}
		}
	}
}
