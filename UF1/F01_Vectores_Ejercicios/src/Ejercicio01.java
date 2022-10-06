// Guardar en un array els 20 primers nombres parells.

public class Ejercicio01 {

	public static void main(String[] args) {
		int[] arrayNumerosPares = new int[20];
		
		for (int i = 0; i < arrayNumerosPares.length; i++) {
			arrayNumerosPares[i] = i * 2; 
			// Si quiero empezar por 2
//			arrayNumerosPares[i] = (i + 1) * 2; 
//			arrayNumerosPares[i] = (i * 2) + 2; 
		}
		// Mostrar array
		for (int i = 0; i < arrayNumerosPares.length; i++) {
			System.out.println(arrayNumerosPares[i]);
		}
	}
}