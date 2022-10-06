import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PokemonTester {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner teclado = new Scanner(System.in);
		
		// Pido nombre fichero
		System.out.println("Introduce el nombre del fichero: ");
		String nombreFichero = teclado.nextLine();
		
		// Preparo el lector
		Scanner lector = new Scanner(new File(nombreFichero + ".txt"));
		
		// Leo el número de casos
		int numPoke = lector.nextInt();
		
		// Viene un String, coloco el cursor
		lector.nextLine();
		
		// Creo el vector con los casos que tiene el fichero
		Pokemon[] listaPokemon = new Pokemon [numPoke];

		// Guardo los poke
		for (int i = 0; i < listaPokemon.length; i++) {
			listaPokemon[i] = new Pokemon(lector.next(), lector.next(), lector.nextDouble(), lector.nextInt(), lector.nextInt(), lector.nextInt());
		}
		
		// Muestro uno
		System.out.println("\nPokemon de ejemplo: \n" + listaPokemon[1].toString() + "\n");
		
		// Creo vector de pokeball
		Pokeball[] listaPokeball = new Pokeball[listaPokemon.length];
		
		// lleno la lista de pokeball
		for (int i = 0; i < listaPokeball.length; i++) {
			listaPokeball[i] = new Pokeball();
		}
		
		// Empiezo a lanzar pokeball
		for (int i = 0; i < listaPokeball.length; i++) {
			
			listaPokeball[i].llensarPokeball(listaPokemon[i]);
			
			// Muestro las pokeball
			System.out.println(listaPokeball[i].toString());
			
			
		}
		System.out.println();
		
		// Lista de pokémon capturados
		int contadorCapturados = 0;
		
		for (int j = 0; j < listaPokeball.length; j++) {
			if(listaPokeball[j].getPokemonCapturat() !="") {
				System.out.println("Pokémon capturado: " + listaPokeball[j].getPokemonCapturat());
				contadorCapturados++;
			}
		}
		System.out.println("\nTotal de pokémon capturados: " + contadorCapturados);
					
		
	}
	

}
