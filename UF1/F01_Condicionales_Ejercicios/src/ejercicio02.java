import java.util.Scanner;

// Escriu un programa que demani un número i digui si és parell o senar.

public class ejercicio02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Pido numero
		System.out.println("Dime un numero y te digo si es par o impar");
		int numero = teclado.nextInt();

		// Miro si es par o impar
		if (numero != 0) {
			if (numero % 2 == 0) {
				System.out.println("Es par");
			} else if (numero % 2 != 0){
				System.out.println("Es impar");
			}
		} else {
			System.out.println("No me sirve el 0");
		}
		teclado.close();
	}

}
