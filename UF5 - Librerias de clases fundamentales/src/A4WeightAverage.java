
public class A4WeightAverage {

	// Clase Weight
	public class Weight {

		// Opci�n 1 - m�todo est�tico int
		public static int average(int[] array) {
			int avg = array[0];

			// Empiezo desde la segunda posici�n
			for (int i = 1; i < array.length; i++) {
				avg += array[i];
			}
			return avg/array.length;
		}

		// Opci�n 2 - m�todo est�tico double
		public static double average(double[] array) {
			double avg = array[0];

			// Empiezo desde la segunda posici�n
			for (int i = 1; i < array.length; i++) {
				avg += array[i];
			}
			return avg/array.length;
		}
	}

	// M�todo principal
	public static void main(String[] args) {

		// Array de prueba, solo 10 valores
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		double[] arrayDouble = {0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9, 1.0};

		// Prueba del m�todo 1 int
		int avg = Weight.average(array);
		System.out.println("Average = " + avg ); 

		// Prueba del m�todo 2 double
		double avgDouble = Weight.average(arrayDouble);
		System.out.println("Average = " + avgDouble ); 

	}

}
