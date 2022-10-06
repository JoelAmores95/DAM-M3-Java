import java.util.Scanner;

// Es demana un nombre enter per teclat i s'ha de dir si el número té 1, 2, 3, 4 o més dígits

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número ENTERO: ");
		double num = teclado.nextInt();
		
		if (Math.abs(num) / 10 < 1) {
			System.out.println("Tiene 1 cifra");
		} else if (Math.abs(num) / 100 < 1) {
			System.out.println("Tiene 2 cifras");
		} else if (Math.abs(num) / 1000 < 1) {
			System.out.println("Tiene 3 cifras");
		} else if (Math.abs(num) / 10000 < 1) {
			System.out.println("Tiene 4 cifras");
		} else {
			System.out.println("Tiene 5 o más cifras");
		}
	}

}
