// Escriu un programa que demani una nota i digui el resultat: 
// Insuficient (< 5), Suficient(< 6), Be (< 7), Notable (< 9), Excel·lent (< 10), MH (10).

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		// Pedir nota
		System.out.println("Introduce la nota: ");
		double nota = teclado.nextDouble();
		
		//Comprobar valor nota y mostrar texto
		if (nota <0) {
			System.out.println("¡¡ERROR!!");
		} else if (nota < 5) {
			System.out.println("No llegas al 5...");
		} else if(nota < 6) {
			System.out.println("Has aprobado con un suficiente");
		} else if (nota < 7) {
			System.out.println("Has aprobado con un bien");
		} else if (nota < 9) {
			System.out.println("¡Notable!");
		} else if (nota < 10) {
			System.out.println("¡¡EXCELENTE!!");
		} else if (nota == 10){
			System.out.println("¡¡¡MATRICULA DE HONOR!!!");
		} else {
			System.out.println("¡¡ERROR!!");
		}
	}

}
