import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		
		// Los Strings es un tipo de variable que no permite trabajar con textos
		// Para leerlos por consola usamos .nextLine().
		
		// Comparación de Strings
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Nombre: ");
		String nombre = teclado.nextLine();
		
//		// Para comparar Strings no usamos esto:
//		if (nombre == "Joel") {
//			System.out.println("Te llamas como yo");
//		} else {
//			System.out.println("No te llamas como yo.");
//		}
		
		// Se usa .equals() o equalsIgnoreCase()
		// .equals() mira si es EXACTAMENTE
		// .equalsIgnoreCase() ignora mayusculas y minusculas
		
		if (nombre.equalsIgnoreCase("Joel")) {
			System.out.println("¡¡Te llamas como yo!!");
		} else {
			System.out.println("No te llamas como yo.");
		}
		
		// Aparece un nuevo tipo de datos que almacena caracteres
		// char
		
		char letra = 'c'; // Usa comillas SIMPLES, sino da error.
		
		// Si queremos leer un único caracter por consola
		// se debe leer toda la línea con nextLine() o next()
		// y quedarnos con el primer caracter con .charAt(0). * coge el primer caracter, sino se cambia el 0 por el equivalente (0 = 1º, 1 = 2º, 2 = 3º... n-1 = n)
		
		System.out.println("Inicial: ");
		char inicial = teclado.nextLine().charAt(0);
		if (inicial == 'J') {
			System.out.println("Mi nombre empieza por la misma letra.");
		}
		
		// Si en lugar de leer toda una linea por consola quiero leer
		// de palabra en palabra se usa el .next()
		
		System.out.println("Nombre y apellidos: ");
		System.out.println(teclado.nextLine());
		
		System.out.println("Nombre y apellidos: ");
		System.out.println(teclado.next());
		System.out.println(teclado.next());
	}

}
