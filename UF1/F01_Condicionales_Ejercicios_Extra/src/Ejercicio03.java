import java.util.Scanner;

// Ens entren un número per teclat, dir si és múltiple de 10.

public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce un numero: ");
		int num = teclado.nextInt();
		if (num % 10 == 0) {
			System.out.println("Es multiple de 10.");
		} else {
			System.out.println("No es multiple de 10");
		}
	}
}
