
public class A4WeightAverage {

	// Clase Weight
	public class Weight {

		// Opción 1 - método estático int
		public static int average(int[] array) {
			int avg = array[0];

			// Empiezo desde la segunda posición
			for (int i = 1; i < array.length; i++) {
				avg += array[i];
			}
			return avg/array.length;
		}

		// Opción 2 - método estático double
		public static double average(double[] array) {
			double avg = array[0];

			// Empiezo desde la segunda posición
			for (int i = 1; i < array.length; i++) {
				avg += array[i];
			}
			return avg/array.length;
		}
	}

	// Método principal
	public static void main(String[] args) {

		// Array de prueba, solo 10 valores
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		double[] arrayDouble = {0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9, 1.0};

		// Prueba del método 1 int
		int avg = Weight.average(array);
		System.out.println("Average = " + avg ); 

		// Prueba del método 2 double
		double avgDouble = Weight.average(arrayDouble);
		System.out.println("Average = " + avgDouble ); 

	}

}
