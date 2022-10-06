import java.util.Scanner;

// Escriu un programa que demani tres números per pantalla 
// i desi el número més gran en una variable anomenada gran i el més petit en una variable anomenada petit.

public class ejercicio01 {

	public static void main(String[] args) {
		
		// Pido los 3 numeros
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Escribe el primer número:");
		int num1 = teclado.nextInt();
		System.out.println("Escribe el segundo número:");
		int num2 = teclado.nextInt();
		System.out.println("Escribe el tercer número:");
		int num3 = teclado.nextInt();
		
		// Busco el numero mas grande
		int gran;
		
		if (num2 > num1) {
			gran = num2;
			if (num3 > num2) {
				gran = num3;
			}
		} else if (num3 > num1){
			gran = num3;
		} else {
			gran = num1;
		}
		
		// Busco el numero mas peque
		int peque;
		
		if (num2 < num1) {
			peque = num2;
			if (num3 < num2) {
				peque = num3;
			}
		} else if (num3 < num1){
			peque = num3;
		} else {
			peque = num1;
		}
		// Muestra el mas grande y el mas peque
		System.out.println("El número más grande es: "+ gran);
		System.out.println("El número más peque es: "+ peque);
		teclado.close();
	}
}
