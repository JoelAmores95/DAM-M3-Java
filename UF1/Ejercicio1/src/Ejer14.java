import java.util.Scanner;

// 14. Escriu un programa que demani dos nombres enters per pantalla
// i desi el resultat del quocient (/) i el residu (%) de la divisió d'aquests dos números.

public class Ejer14 {

	public static void main(String[] args) {
		
		//Pido numeros
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime el número dividendo");
		double dividendo = teclado.nextDouble();
		System.out.println("Dime el número divisor");
		double divisor = teclado.nextDouble();
		
		//Calculo números
		double division = dividendo / divisor;
		double modulo = dividendo % divisor;
		
		//Muestro números
		System.out.println("El resultado de la división es " + division );
		System.out.println("El módulo correspondiente es " + modulo);
		
		teclado.close();
	}

}
