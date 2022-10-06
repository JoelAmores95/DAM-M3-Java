import java.util.Scanner;

// Escriu un programa que demani els anys treballats d’un treballador que cobra 40.000 euros anuals 
// i digui el sou que li correspon segons els següents criteris:
// Si porta treballant 10 anys o més -> augment del 10%
// Si porta treballant menys de 10 anys, però 5 o més -> augment del 7%
// Si porta treballant menys de 5 anys, però 3 o més -> augment del 5%
// Si porta menys de 3 anys -> augment del 3%

public class Ejercicio09 {

	public static void main(String[] args) {
		// Pido los años
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime cuantos años llevas trabajando: ");
		int añosTrabajados = teclado.nextInt(); // Evitar usar caracteres especiales como ñ o ç
		
		// Aumento el salario en funcion de los años
		
		double salario = 40_000; // Se añade _ solo para nivel visual
		
		if (añosTrabajados >= 10) {
			System.out.println("Llevas 10 o más años. Tu nuevo sueldo anual es: " + (salario + salario * 0.10));
		} else if (añosTrabajados >=5) {
			System.out.println("Llevas 5 o más años. Tu nuevo sueldo es: "+ (salario + salario * 0.07));
		} else if (añosTrabajados >= 3) {
			System.out.println("Llevas 3 o más años. Tu nuevo sueldo es: " + (salario + salario * 0.05));
		} else {
			System.out.println("Llevas menos de 3 años. Tu sueldo es de "+ (salario + salario * 0.03));
		}
	}

}
