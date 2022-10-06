import java.util.Scanner;

public class sendaPirenaica {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numEtapas = teclado.nextInt();
		
		// Se acaba cuando el numero de etapas es 0
		while (numEtapas != 0 ) {
			
			int distancia = 0;
			int[] arrayDistanciaEtapa = new int[numEtapas];
			
			//Lleno la array 
			
			for (int i = 0; i < arrayDistanciaEtapa.length; i++) {
				arrayDistanciaEtapa[i] = teclado.nextInt();
				
				// Voy guardando las distancias
				
				distancia += arrayDistanciaEtapa[i];
			}
			
			// Muestro las distancias
			for (int i = 0; i < arrayDistanciaEtapa.length; i++) {
				System.out.print(distancia+" ");
				distancia -= arrayDistanciaEtapa[i];
			}
			System.out.println();
			// Vuelvo a pedir la etapa
			numEtapas = teclado.nextInt();
		}
	}
}
