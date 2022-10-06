import java.util.Scanner;

// Llegeix una seqüència de nombres no negatius acabada en 0 (fins que l'usuari introdueixi un 0), i escriu la mitjana aritmètica dels nombres entrats.

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		// Introducir numeros
		System.out.println("Introduce un número (0 para acabar) y te diré la media: ");
		double numero = teclado.nextInt();
		double acumulado = 0;
		double contadorNumeros = 0;
		if (numero==0) {
			System.out.println("Hemos acabado.");
		} else {
			while (numero != 0) {
				acumulado += numero;
				contadorNumeros++;
				System.out.println("Introduce el siguiente número: ");
				numero = teclado.nextInt();
			}
			System.out.println("La media aritmetica de los valores introducidos es: " + acumulado/contadorNumeros);

		}

	}

}
