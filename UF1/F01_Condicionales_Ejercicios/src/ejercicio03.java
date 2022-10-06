import java.util.Scanner;

// Escriu un programa que demani un número enter i determini si és múltiple de 2 i/o de 5.

public class ejercicio03 {

	public static void main(String[] args) {

		//Pido numero
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime un numero");
		int numero = teclado.nextInt();

		// Miro si es multiple de 2
		if (numero % 2 == 0) {
			
			// Miro si es multple de 5
			if (numero % 5 == 0) {
				System.out.println("Es multiple de 5 y de 2");
			} else {
				System.out.println("No es multiple de 5, si de 2");
			}
		} else if (numero % 5 == 0) {	
			System.out.println("No es múltiple de 2, pero si de 5");
		} else {
			System.out.println("No es múltiple de ninguno");
		} 
		teclado.close();
	} 
}
