import java.util.Scanner;

// Llegeix una seq��ncia de nombres no negatius acabada en 0 (fins que l'usuari introdueixi un 0), i escriu la mitjana aritm�tica dels nombres entrats.

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		// Introducir numeros
		System.out.println("Introduce un n�mero (0 para acabar) y te dir� la media: ");
		double numero = teclado.nextInt();
		double acumulado = 0;
		double contadorNumeros = 0;
		if (numero==0) {
			System.out.println("Hemos acabado.");
		} else {
			while (numero != 0) {
				acumulado += numero;
				contadorNumeros++;
				System.out.println("Introduce el siguiente n�mero: ");
				numero = teclado.nextInt();
			}
			System.out.println("La media aritmetica de los valores introducidos es: " + acumulado/contadorNumeros);

		}

	}

}
