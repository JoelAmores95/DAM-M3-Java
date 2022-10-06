import java.util.Scanner;

// Demana l'edat a l'usuari i crea una expressió (booleana) que emmagatzemi si la persona pot entrar a la discoteca.

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce tu edad:");
		int edad = teclado.nextInt();
		
		boolean puedeEntrarDiscoteca = (edad>=18);
		if (puedeEntrarDiscoteca) {
			System.out.println("Adelante");
		}else {
			System.out.println("A pasar frío.");
		}
	}

}
