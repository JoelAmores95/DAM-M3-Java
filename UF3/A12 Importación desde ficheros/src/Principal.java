import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner lector = new Scanner(new File("a.txt"));
		PrintWriter printwriter = new PrintWriter("b.txt");
		
		// Leo primer número
		int numPersonas = lector.nextInt();
		
		// Creo array de personas de dicho tamaño
		Persona[] array= new Persona[numPersonas];
		
		for (int i = 0; i < numPersonas; i++) {
			
			// Split para partir el String cada vez que encuentre un substring determinado
			
			String data = lector.next();
			String[] partes = data.split("-");
			
			int dia = Integer.valueOf(partes[0]);
			int mes = Integer.valueOf(partes[1]);
			int anyo = Integer.valueOf(partes[2]);
			
			String numNIF = lector.next();
			System.out.println(numNIF);
			
			String nombre = lector.next() + " " + lector.next();

			System.out.println(nombre);
			NIF nif = new NIF(numNIF);
			
			String fechaFormatada = dia + "/" + mes + "/" + anyo;
			printwriter.println(nombre + " - " + fechaFormatada + " - " + nif);
			
			// Guardo la persona en el array
			array[i] = new Persona(nombre, dia, mes, anyo, numNIF);
			
		}

		// Buscar persona más joven
		printwriter.close();
		
	}

}
