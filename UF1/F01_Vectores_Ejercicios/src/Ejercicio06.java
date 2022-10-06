import java.util.Scanner;

// Programa que llegeixi el nom i el sou de 20 empleats i mostri el nom i el sou de l'empleat que més guanya.

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Creo Array para nombres
		String[] arrayNombres = new String[20];
		// Creo Array para sueldos
		double[] arraySueldos = new double[20];

		//Empiezo a preguntar nombre y sueldo hasta tener los 20
		for (int i = 0; i < arrayNombres.length; i++) {
			System.out.println("Dime el nombre " + (i+1));
			arrayNombres[i] = teclado.nextLine();
			System.out.println("Dime el sueldo de " + (i+1));
			arraySueldos[i] = teclado.nextDouble();
			teclado.nextLine();
		}

		// Busco el sueldo más alto y guardo su posición
		int posicionSueloMasAlto = 0;
		double sueldoAlto = 0;
		
		for (int i = 0; i < arraySueldos.length; i++) {
			
			if (i <= arraySueldos.length) {
				
				if (arraySueldos[i] > sueldoAlto) {
					sueldoAlto = arraySueldos[i];
					posicionSueloMasAlto=i;
				}
			} 
		}
		// Muestro el nombre y sueldo más alto
		System.out.println(arrayNombres[posicionSueloMasAlto] +": " + arraySueldos[posicionSueloMasAlto] + "€");
	}

}
