import java.util.Scanner;

// Es demana un nombre enter per teclat i s'ha de dir si el n�mero t� 1, 2, 3, 4 o m�s d�gits

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un n�mero ENTERO: ");
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
			System.out.println("Tiene 5 o m�s cifras");
		}
	}

}
