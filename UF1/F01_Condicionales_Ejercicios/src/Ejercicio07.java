import java.util.Scanner;

// Escriu un programa que demani 3 números i digui si la multiplicació dels dos primers és igual al tercer.

public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// Pido 3 numeros
				System.out.println("Dime el primer numero: ");
				int num1 = teclado.nextInt();
				System.out.println("Dime el segundo numero: ");
				int num2 = teclado.nextInt();
				System.out.println("Dime el tercer numero: ");
				int num3 = teclado.nextInt();
				
				//Calculo el producto
				int producto = num1 * num2;
				
				// Miro si es el producto
				if (num3 == producto) {
					System.out.println("Es el producto");
				} else {
					System.out.println("No es el producto");
				}

	}

}
