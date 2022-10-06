import java.util.Scanner;

// Concatenar vectors: Construeix un programa que concateni dos vectors d'enters de qualsevol dimensió, en un tercer vector. 
//
// Es considera que els dos vectors estan ordenats, i el tercer vector ha de quedar ordenat.
//
// Ha de considerar com a mínim les següents funcions:
//
// // Omple per consola un vector donat
// public static void omplirVector (int[] vector) { ... }
//
// // Mostra per consola un vector donat
// public static void mostrarVector (int[] vector) { ... }
//
// // Demana un nombre enter, que després servirà de dimensió d'un vector
// public static int demanarDimensio () { ... }
//
// // Concatena dos vectors donats, creant un de nou amb els números ordenats
// public static int[] concatenar (int[] vector1, int[] vector2) { ... }
// 

public class ejercicio09 {

	public static void main(String[] args) {

		// Vector 1
		System.out.println("Creando Vector 1...");
		int[] vector1 = new int[dimensionVector()];
		System.out.println("Llenando Vector 1...");
		llenarVector(vector1);

		// Vector 2
		System.out.println("Creando Vector 2...");
		int[] vector2 = new int[dimensionVector()];
		System.out.println("Llenando Vector 2...");
		llenarVector(vector2);

		// Mostrar vectores
		mostrarVector(vector1);
		mostrarVector(vector2);

		// Fusión de Vectores

		mostrarVector(fusionarVectores(vector1,vector2));
	}

	// Función Dimension Vector
	public static int dimensionVector() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime la longitud del vector:");
		return teclado.nextInt();

	}

	// Funcion Llenar Vector
	public static void llenarVector(int[] vector) {
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < vector.length; i++) {
			System.out.println("Posición " + i + " del vector: ");
			vector[i] = teclado.nextInt();
		}
		System.out.println("¡Vector completamente llenado!");
	}

	// Función Mostrar Vector
	public static void mostrarVector(int[] vector) {
		System.out.print("[ ");
		for (int i = 0; i < vector.length; i++) {
			System.out.print(+ vector[i] + " ");
		}
		System.out.print("]");
		System.out.println();
	}

	// Función Fusionar Vectores
	public static int[] fusionarVectores(int[] vector1, int[] vector2) {

		// Crear vector con la suma de las dimensiones de los vectores importados
		int[] vectorFusionado = new int[(vector1.length + vector2.length)];

		// LA CLAVE SON LOS CONTADORES!!!! 
		int iVector1 = 0; // Contador vector 1
		int iVector2 = 0; // Contador vector 2

		for (int i = 0; i < vectorFusionado.length; i++) {

			if(iVector1 < vector1.length) {
				if(vector1[iVector1] < vector2[iVector2]) {
					vectorFusionado[i] = vector1[iVector1];
					iVector1++;
				} else if(iVector2 < vector2.length){
					vectorFusionado[i] = vector2[iVector2];
					iVector2++;
				}
			} else {
				// Se acaba el ciclo del primero
				if(iVector2 < vector2.length){
					vectorFusionado[i] = vector2[iVector2];
					iVector2++;
				}
			}
		}
		return vectorFusionado;
	}
}
