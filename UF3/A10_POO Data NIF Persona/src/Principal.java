import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		boolean fechaCorrecta = false;

		for (int i = 1; i <= 3; i++) {
			System.out.println("Creando persona "+ i +", introduce el nombre:");
			String nombre = teclado.nextLine();
			int dia = 0;
			int mes = 0;
			int anyo = 0;

			// Pido la fecha hasta que sea correcta
			while(!fechaCorrecta) {
				System.out.println("Dia de nacimiento:");
				dia = teclado.nextInt();
				System.out.println("Mes de nacimiento:");
				mes = teclado.nextInt();
				System.out.println("Año de nacimiento:");
				anyo = teclado.nextInt();

				// Reposiciono el cursor
				teclado.nextLine();

				Data fechaNacimiento = new Data(dia, mes, anyo);

				// Compruebo fecha
				fechaCorrecta = fechaNacimiento.dataCorrecta();
			}

			// Desactivo el flag
			fechaCorrecta = false;

			Data fechaNacimiento = new Data(dia, mes, anyo);
			// Pido el número del NIF
			System.out.println("Número del NIF, sin letra.");
			String numNif = teclado.nextLine();


			NIF nif = new NIF(numNif);

			// Creo la persona
			Persona persona = new Persona(nombre, fechaNacimiento.getDia(), fechaNacimiento.getMes(), fechaNacimiento.getAny(), nif.getNumero());
			// Muestro datos de la persona:
			System.out.println(persona.toString());
		}

	}

}
