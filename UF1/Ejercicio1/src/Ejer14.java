import java.util.Scanner;

// 14. Escriu un programa que demani dos nombres enters per pantalla
// i desi el resultat del quocient (/) i el residu (%) de la divisi� d'aquests dos n�meros.

public class Ejer14 {

	public static void main(String[] args) {
		
		//Pido numeros
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime el n�mero dividendo");
		double dividendo = teclado.nextDouble();
		System.out.println("Dime el n�mero divisor");
		double divisor = teclado.nextDouble();
		
		//Calculo n�meros
		double division = dividendo / divisor;
		double modulo = dividendo % divisor;
		
		//Muestro n�meros
		System.out.println("El resultado de la divisi�n es " + division );
		System.out.println("El m�dulo correspondiente es " + modulo);
		
		teclado.close();
	}

}
