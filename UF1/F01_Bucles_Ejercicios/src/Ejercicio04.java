import java.util.Scanner;

// Donat un nombre enter positiu, escriu els seus divisors positius.

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Dime un n�mero entero positivo: ");
		int numEntero = teclado.nextInt();
		int dividoPor = 1;

		// Me aseguro que sea positivo o no sea 0
		if (numEntero <= 0) {
			System.out.println("Ese n�mero no me sirve.");
		} else {
			// Es divisor mientras est� entre 1 y su propio valor
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
