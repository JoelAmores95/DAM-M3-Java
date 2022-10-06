import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

// 1. Programa per inserir N números en un vector A, copiar en un vector B totes les dades del vector A ordenades ascendentment, 
// i posteriorment visualitzar les dades del vector B. 
//
//    Els números del vector A han de ser enters positius, majors que 0 i no poden estar repetits.
//   

public class Ejercicio07 {

	public static void main(String[] args) {

		// Pedir longitud array
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Cuántos números va a tener el vector?");
		int longitudArray = teclado.nextInt();

		// Declaro array
		int[] arrayNumerosA = new int[longitudArray];

		// La array B tiene la misma cantidad de datos que la A
		int [] arrayNumerosB = new int[arrayNumerosA.length];

		// Pedir numeros para llenar la array A
		for (int i = 0; i < arrayNumerosA.length; i++) {
			System.out.println("Introduce un numero entero positivo mayor que 0 "
					+ "y que no esté repetido para la posición " + i);
			arrayNumerosA[i] = teclado.nextInt();
		}

		// Copio la array
		for (int i = 0; i < arrayNumerosA.length; i++) {
			arrayNumerosB[i] = arrayNumerosA[i];
		}
//		// Ordeno la array modo cheto
//		Arrays.sort(arrayNumerosB);
		
		// El numero mas alto 
		// int numMenor = Integer.MAX_VALUE; 
		
		// Ordenar array sin trampa
        for(int i=0;i<(arrayNumerosB.length-1);i++){
            for(int j=i+1;j<arrayNumerosB.length;j++){
                if(arrayNumerosB[i] > arrayNumerosB[j]){
                	
                    //Intercambiamos valores
                    int variableauxiliar=arrayNumerosB[i];
                    arrayNumerosB[i] = arrayNumerosB[j];
                    arrayNumerosB[j] = variableauxiliar;
 
                }
            }
        }
		
//		Muestro la array ordenada
		
		for (int i = 0; i < arrayNumerosB.length; i++) {
			System.out.print(arrayNumerosB[i]);
		}
		
//		Otra forma de mostrar una array completa
//		System.out.println(Arrays.toString(arrayNumerosB));
	}

}
