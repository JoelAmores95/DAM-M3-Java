import java.util.Scanner;

// Fer un programa en el qual l'usuari vagi inserint números i cada vegada que insereix un número demani si en vol inserir més. 
// Quan l'usuari acabi d'inserir els números, mostrar la suma de tots els números inserits.

public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		int numero = teclado.nextInt();
		
		// Vacío el buffer
		teclado.nextLine();

		System.out.println("¿Quieres introducir más? (s/n)");
		String continuar = teclado.nextLine();
		
		// Si se introduce S, se continua
		while (continuar.equalsIgnoreCase("S")) {
			System.out.println("Introduce el siguiente numero: ");
			
			// Sumo el valor introducido al total
			numero += teclado.nextInt();
			teclado.nextLine();
			
			// Pregunto si quiere continuar
			System.out.println("¿Quieres introducir más? (s/n)");
			continuar = teclado.nextLine();
		}
		System.out.println("No quieres introduir más números, la suma total es: " + numero);
	}

}
