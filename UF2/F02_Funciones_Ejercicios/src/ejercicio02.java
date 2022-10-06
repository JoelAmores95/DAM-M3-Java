import java.util.Scanner;

// A partir d'uns n�meros introdu�ts per l'usuari en un vector, fer 4�funcions:

public class ejercicio02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("�De cu�nto es el vector?");
		int tama�oVector = teclado.nextInt();
		
		int[] vector = new int[tama�oVector];
		
		// Llenar vector
		for (int i = 0; i < vector.length; i++) {
			System.out.println("Posici�n del vector: " + (i+1));
			vector[i]= teclado.nextInt();
		}
		// Valor maximo
		System.out.println("M�ximo: " + calcularValorMaximo(vector));
		
		// Valor m�nimo
		System.out.println("M�nimo: " + calcularValorMinimo(vector));
		
		// Valor media
		System.out.println("Media: " + teBuscoLaMedia(vector));
		// Numeros por encima de la media
		System.out.println("N�meros por encima de la media: "+ CalculoNumPorEncimaMedia(vector));
		
		// TODO Auto-generated method stub

	}
	
	// 1.Funci�n buscar valor m�ximo
	
	/**
	 * Devuelve el valor m�ximo del vector (Escrito por mi con / * * enter jeje)
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
	
	// 2.Funcion buscar m�nimo
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
	
	// 4.Funci�n que me dice cu�ntos n�meros est�n por encima de la media
	public static int CalculoNumPorEncimaMedia(int[] vector) {
		int numPorEncimaMedia =0;
		// Aprovecho la funci�n de antes
		for (int i = 0; i < vector.length; i++) {
			if(vector[i]>teBuscoLaMedia(vector)) {
				numPorEncimaMedia++;
			}
		}
		return numPorEncimaMedia;
	}
	
}
