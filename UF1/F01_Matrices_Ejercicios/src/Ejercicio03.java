// Donada una matriu calcula la suma dels nombres del seu perímetre.

public class Ejercicio03 {

	public static void main(String[] args) {

		// Genero Matriz
		int[][] matriz = {	{3,5,6,7,8},
							{2,4,5,7,9},
							{1,4,0,7,3},
							{2,5,6,8,4}	};

		int perimetro = 0;

		// Recorro las columnas (sumo primera y última fila)
		for (int col = 0; col < matriz[0].length; col++) { // el length coge la longitud de la primera posicion de la matriz grande
			perimetro += matriz[0][col];
			perimetro += matriz[matriz.length -1][col];
		}
		// Recorro las filas (sumo columnas)
		for (int fil = 1; fil < matriz.length - 1; fil++) { // de la segunda hasta la penúltima
			perimetro += matriz[fil][0];
			perimetro += matriz[fil][matriz[0].length - 1]; // OJO! que no llego hasta el final eh
		}
		System.out.println("La suma es " + perimetro);
	}

}
