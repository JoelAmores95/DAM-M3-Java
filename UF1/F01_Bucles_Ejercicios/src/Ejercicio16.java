import java.util.Scanner;

// Fer un programa en el qual l'usuari vagi inserint n�meros i cada vegada que insereix un n�mero demani si en vol inserir m�s. 
// Quan l'usuari acabi d'inserir els n�meros, mostrar la suma de tots els n�meros inserits.

public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		int numero = teclado.nextInt();
		
		// Vac�o el buffer
		teclado.nextLine();

		System.out.println("�Quieres introducir m�s? (s/n)");
		String continuar = teclado.nextLine();
		
		// Si se introduce S, se continua
		while (continuar.equalsIgnoreCase("S")) {
			System.out.println("Introduce el siguiente numero: ");
			
			// Sumo el valor introducido al total
			numero += teclado.nextInt();
			teclado.nextLine();
			
			// Pregunto si quiere continuar
			System.out.println("�Quieres introducir m�s? (s/n)");
			continuar = teclado.nextLine();
		}
		System.out.println("No quieres introduir m�s n�meros, la suma total es: " + numero);
	}

}
