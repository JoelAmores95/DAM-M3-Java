package actividadesRepaso;

import java.util.Scanner;

public class A5_NameEcho {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Enter your name:");		
		String nombreCompleto = teclado.nextLine();

		//		Super guay en una línea
		//		String nombre = teclado.nextLine().trim();

		// Extraigo la palabra que va después del último espacio
		String ultimoApellido = nombreCompleto.substring(nombreCompleto.lastIndexOf(' '));

		// Quito espacios
		ultimoApellido = ultimoApellido.trim();

		// Paso a mayúsculas		
		ultimoApellido = ultimoApellido.toUpperCase();

		//		Super guay en una línea
		//		String ultimoApellido = nombreCompleto.substring(nombre.lastIndexOf(' ')).trim().toUpperCase();

		// String con el nombre (del inicio hasta el último espacio)
		String nombreSinApellidoFinal = nombreCompleto.substring(0, nombreCompleto.lastIndexOf(' '));

		System.out.println(nombreSinApellidoFinal + " " + ultimoApellido);

		teclado.close();

	}

}
