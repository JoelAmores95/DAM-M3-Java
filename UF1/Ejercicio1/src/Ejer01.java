import java.util.Scanner;

//1. Escriu un programa que llegeixi dos nombres decimals i escrigui la seva suma.
public class Ejer01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		//Pido los números
		System.out.println("Saludos, introduce un número decimal (usa la coma):");
		double num1 = teclado.nextDouble();
		System.out.println("Genial, ahora un segundo decimal:");
		double num2 = teclado.nextDouble();
		
		//Calculo la suma sin guardar en variable y la muestro en pantalla
		System.out.println("La suma de los dos números es: "+ (num1 + num2));	
	}

}
