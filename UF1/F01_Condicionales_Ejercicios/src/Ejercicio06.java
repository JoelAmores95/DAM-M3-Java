import java.util.Scanner;

// Escriu un programa que demani 3 números i digui si el tercer correspon a la suma del primer i el segon.
public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// Pido 3 numeros
		System.out.println("Dime el primer numero: ");
		int num1 = teclado.nextInt();
		System.out.println("Dime el segundo numero: ");
		int num2 = teclado.nextInt();
		System.out.println("Dime el tercer numero: ");
		int num3 = teclado.nextInt();
		
		//Calculo la suma
		int suma = num1 + num2;
		
		// Miro si es la suma
		if (num3 == suma) {
			System.out.println("Es la suma");
		} else {
			System.out.println("No es la suma");
		}

	}

}
