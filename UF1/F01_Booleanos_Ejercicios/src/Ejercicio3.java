import java.util.Scanner;

//1. En un museu hi ha un programa que demana unes dades al visitant per comprovar si pot entrar gratuïtament o no. 
//    
//    El visitant podrà entrar sense pagar en el cas que sigui estudiant i tingui menys de 25 anys, o sigui professor i vagi amb el grup classe.
//    
//    1. Demana a l'usuari si és estudiant o no
//    2. Demana a l'usuari si és professor o no i en cas de ser professor demana si va amb el grup classe o no. 
//		A més a més en qualsevol dels casos ha de demanar l'edat que té l'usuari.
//    3. Crea una expressió a partir de les condicions d'entrada gratuïta al museu i desa-la en una variable booleana anomenada potEntrarSensePagar.
//    4. Crea una estructura de control condicional utilitzant la variable booleana potEntrarSensePagar i fes que en la part de l'**if** 
//		digui a l'usuari que no pot entrar i en la part de l'**else** digui a l'usuari que sí que pot entrar.
//    5. Copia l'estructura de l'apartat anterior i enganxa-la a sota, 
//		substitueix en l'estructura de control condicional nova la variable booleana potEntrarSensePagar per l'expressió que li has assignat, 
//		i fes l'expressió el més simple possible.

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Pedir edad
		System.out.println("Dime la edad: ");
		int edad = teclado.nextInt();
		teclado.nextLine();
		
		// Pedir si es estudiante
		System.out.println("Eres estudiante? s/n");
		String serEstudiante = teclado.nextLine();
		//Es estudiante y tiene menos de 25
		boolean esEstudianteMenor = (edad < 25 && serEstudiante.equalsIgnoreCase("S"));
		boolean esProfe = false;
		boolean vaConAlumnos = false;

		// No es estudiante menor o lo es pero con 25 o más
		if (!esEstudianteMenor && serEstudiante.equalsIgnoreCase("N")) {
			// Pedir si es profesor
			System.out.println("¿Eres profesor? (s/n)");
			String serProfe = teclado.nextLine();
			esProfe = (serProfe.equalsIgnoreCase("s"));
			// Va con alumnos?
			System.out.println("¿Vas con los alumnos?");
			String irConAlumnos = teclado.nextLine();
			// Va con alumnos es true si ha puesto S
			vaConAlumnos = (irConAlumnos.equalsIgnoreCase("s"));
		} 
		
		boolean potEntrarSensePagar = (esEstudianteMenor || esProfe && vaConAlumnos);
		if(!potEntrarSensePagar) {
			System.out.println("No puedes pasar gratis, PAGA");
		} else {
			System.out.println("Puedes pasar GRATIS");
		}
	}

}
