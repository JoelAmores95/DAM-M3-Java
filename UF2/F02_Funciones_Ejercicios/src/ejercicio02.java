import java.util.Scanner;

// A partir d'uns números introduïts per l'usuari en un vector, fer 4 funcions:

public class ejercicio02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("¿De cuánto es el vector?");
		int tamañoVector = teclado.nextInt();
		
		int[] vector = new int[tamañoVector];
		
		// Llenar vector
		for (int i = 0; i < vector.length; i++) {
			System.out.println("Posición del vector: " + (i+1));
			vector[i]= teclado.nextInt();
		}
		// Valor maximo
		System.out.println("Máximo: " + calcularValorMaximo(vector));
		
		// Valor mínimo
		System.out.println("Mínimo: " + calcularValorMinimo(vector));
		
		// Valor media
		System.out.println("Media: " + teBuscoLaMedia(vector));
		// Numeros por encima de la media
		System.out.println("Números por encima de la media: "+ CalculoNumPorEncimaMedia(vector));
		
		// TODO Auto-generated method stub

	}
	
	// 1.Función buscar valor máximo
	
	/**
	 * Devuelve el valor máximo del vector (Escrito por mi con / * * enter jeje)
	 * @param vector
	 * @return
	 */
	
	public static int calcularValorMaximo(int[] vector) {
		int numMax = Integer.MIN_VALUE;
		for (int i = 0; i <vector.length; i++) {
			if (vector[i] > numMax) {
				numMax = vector[i];
			}
		}
		
		return numMax;
	}
	
	// 2.Funcion buscar mínimo
	public static int calcularValorMinimo(int[] vector) {
		int numMin = Integer.MAX_VALUE;
		for (int i = 0; i <vector.length; i++) {
			if (vector[i] > numMin) {
				numMin = vector[i];
			}
		}
		
		return numMin;
	}
	
	// 3.Funcion buscar media
	public static double teBuscoLaMedia(int[] vector) {
		int sumaNumeros = 0;
		for (int i = 0; i < vector.length; i++) {
			sumaNumeros += vector[i];
		}
		double media = (double)sumaNumeros/vector.length;
		return media;
	} 
	
	// 4.Función que me dice cuántos números están por encima de la media
	public static int CalculoNumPorEncimaMedia(int[] vector) {
		int numPorEncimaMedia =0;
		// Aprovecho la función de antes
		for (int i = 0; i < vector.length; i++) {
			if(vector[i]>teBuscoLaMedia(vector)) {
				numPorEncimaMedia++;
			}
		}
		return numPorEncimaMedia;
	}
	
}
