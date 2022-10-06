
public class A2ReversibleNumbers {

	public static void main(String[] args) {

		// Arrays de Origen
		int [] input = {36, 904, 72, 1010, 37, 209, 60};
		int[] arrayRevertida = new int[input.length];
		int[] sumaArrays = new int[input.length];

		// Rellenar array con numeros revertidos
		for (int i = 0; i < input.length; i++) {
			arrayRevertida[i] = revertirNumero(input[i]);
		}

		// Sumo Arrays
		for (int i = 0; i < sumaArrays.length; i++) {
			sumaArrays[i] = input[i] + arrayRevertida[i];
			System.out.println(input[i] + ": " + comprobarLongitud(input[i]));
			System.out.println(arrayRevertida[i]+ ": "+ comprobarLongitud(arrayRevertida[i]));
		}

		// Es reversible si cada numero es impar y tienen la misma longitud antes y después
		for (int i = 0; i < sumaArrays.length; i++) {

			if(sumaArrays[i] % 2 != 0 && comprobarLongitud(input[i]) == comprobarLongitud(arrayRevertida[i])) {
				System.out.println(input[i] + " Es reversible, la suma con su revertido es: "+ sumaArrays[i]);
			} else {
				System.out.println(input[i] + " No es reversible, la suma con su revertido es: " + sumaArrays[i]);
			}

		}
	}

	/**
	 * Revertir número
	 * @param num
	 * @return num revertido
	 */

	public static int revertirNumero(int num) {
		int revertido = 0;

		for(;num != 0; num /= 10) {
			int digit = num % 10;
			revertido = revertido * 10 + digit;
		}
		return revertido;
	}

	/**
	 * Comprueba la longitud de un número
	 * @param num
	 * @return longitud de num
	 */

	public static int comprobarLongitud(int num) {
		String numString = String.valueOf(num);
		return numString.length();
	}
}


