import java.util.Scanner;

// Escriu un programa que demani els anys treballats d�un treballador que cobra 40.000 euros anuals 
// i digui el sou que li correspon segons els seg�ents criteris:
// Si porta treballant 10 anys o m�s -> augment del 10%
// Si porta treballant menys de 10 anys, per� 5 o m�s -> augment del 7%
// Si porta treballant menys de 5 anys, per� 3 o m�s -> augment del 5%
// Si porta menys de 3 anys -> augment del 3%

public class Ejercicio09 {

	public static void main(String[] args) {
		// Pido los a�os
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime cuantos a�os llevas trabajando: ");
		int a�osTrabajados = teclado.nextInt(); // Evitar usar caracteres especiales como � o �
		
		// Aumento el salario en funcion de los a�os
		
		double salario = 40_000; // Se a�ade _ solo para nivel visual
		
		if (a�osTrabajados >= 10) {
			System.out.println("Llevas 10 o m�s a�os. Tu nuevo sueldo anual es: " + (salario + salario * 0.10));
		} else if (a�osTrabajados >=5) {
			System.out.println("Llevas 5 o m�s a�os. Tu nuevo sueldo es: "+ (salario + salario * 0.07));
		} else if (a�osTrabajados >= 3) {
			System.out.println("Llevas 3 o m�s a�os. Tu nuevo sueldo es: " + (salario + salario * 0.05));
		} else {
			System.out.println("Llevas menos de 3 a�os. Tu sueldo es de "+ (salario + salario * 0.03));
		}
	}

}
