import java.util.Scanner;

// Escriu un programa que demani 3 números i els mostri ordenats de major a menor.

public class ejercicio05 {

	public static void main(String[] args) {

		//Pido 3 numeros

		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime el primer numero: ");
		int num1 = teclado.nextInt();
		System.out.println("Dime el segundo numero: ");
		int num2 = teclado.nextInt();
		System.out.println("Dime el tercer numero: ");
		int num3 = teclado.nextInt();

		//Busco el mas grande
		int grande;
		if (num1 > 2) { // El grande es el num1
			grande = num1;
		} else {
			grande = num2; // El grande es el num2
		} if (num3 > num2) {
			grande = num3; // El grande es el num3
		}

		//Busco el mas peque

		int peque = 0;

		// El grande es el num1

		if (grande == num1) {
			if (num2 < num3) {
				peque = num2;
			} else {
				peque = num3;
			}
		}
		// El grande es el num2

		if (grande == num2) {
			if (num1 < num3) {
				peque = num1;
			} else {
				peque = num3;
			}
		}
		//El grande es el num3

		if (grande == num3) {
			if (num2 < num1) {
				peque = num2;
			} else {
				peque = num1;
			}
		}
		//Muestro el resultado
		System.out.println("El número más grande es el "+ grande + " y el peque es "+ peque);
	}

}
