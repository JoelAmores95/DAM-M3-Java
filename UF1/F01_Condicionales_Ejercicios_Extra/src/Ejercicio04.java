import java.util.Scanner;

// Ens entren una edat per teclat, dir si és major que 16 i menor que 21.

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime una edad");
		int edad = teclado.nextInt();
		if (edad > 16 && edad < 21) {
			System.out.println("La edad es correcta");
		} else {
			System.out.println("Esta fuera de rango");
		}

	}

}
