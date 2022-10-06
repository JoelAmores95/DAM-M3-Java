import java.util.Scanner;

// Museu: Demanar a l'usuari si és estudiant o professor, la seva edat i si va amb grup classe. 
// Indicar si pot entrar sense pagar o no.

// Podrà entrar sense pagar en el cas que l'usuari sigui estudiant i tingui menys de 25 anys o sigui professor i vagi amb el grup classe.

public class ejercicio14 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("¿Eres Profe? (S/N)");
		boolean esProfe = teclado.nextLine().equalsIgnoreCase("S");
		
		System.out.println("Dime tu edad: ");
		int edad = teclado.nextInt();
		
		// He cambiado de letra a número, salto de línea
		teclado.nextLine();
		
		System.out.println("¿Vas con grupo clase?");
		boolean vaConGrupo = teclado.nextLine().equalsIgnoreCase("S");
		
		puedeEntrarGratis(esProfe, edad, vaConGrupo);
		
	}

	// 1. Función puedeEntrarGratis
	public static void puedeEntrarGratis(boolean esProfe, int edad, boolean vaConGrupo) {
		if((!esProfe && edad < 25) || (esProfe && vaConGrupo)) {
			System.out.println("¡¡Puede entrar GRATIS!!");
		} else {
			System.out.println("A pagar.");
		}
	}
}
