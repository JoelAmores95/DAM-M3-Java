import java.util.Scanner;

// Escriu un programa que demani el dia de la setmana: 
// dilluns, dimarts, dimecres... i que et tradueixi aquesta cadena a un enter, dilluns = 1, dimarts =2, etc.

public class ejercicio01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Pido el dia
		System.out.println("Escribe un dia de la semana: ");
		String dia = teclado.nextLine();

		// Leo el dia y asigno valor

		// Lunes
		if (dia.equalsIgnoreCase("lunes")) {
			System.out.println("1");

			// Martes
		} else if (dia.equalsIgnoreCase("martes")) {
			System.out.println("2");
			
			// Miercoles
		} else if (dia.equalsIgnoreCase("miercoles")) {
			System.out.println("3");
			
			// Jueves
		} else if (dia.equalsIgnoreCase("jueves")) {
			System.out.println("4");
			
			// Viernes
		} else if (dia.equalsIgnoreCase("viernes")) {
			System.out.println("5");
			
			// Sabado
		} else if (dia.equalsIgnoreCase("sabado")) {
			System.out.println("6");
			
			// Domingo
		} else if (dia.equalsIgnoreCase("domingo")) {
			System.out.println("7");
			
			// Mensaje de error
		} else {
			System.out.println("Ese dia no existe, ( prueba a introducir sin tildes)");
		}
	}
}
