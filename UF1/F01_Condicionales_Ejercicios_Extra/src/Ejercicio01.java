import java.util.Scanner;

// Siguin dues dates donades per dia1, mes1, any1 i dia2, mes2, any2, respectivament. 
// Escriviu una expressi� l�gica el valor de la qual sigui cert si la primera data �s igual o anterior a la segona, i fals si �s posterior. 

public class Ejercicio01 {

	public static void main(String[] args) {
		
		// Pedir Primera fecha
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime el dia 1");
		int dia1 = teclado.nextInt();
		System.out.println("Dime el mes 1");
		int mes1 = teclado.nextInt();
		System.out.println("Dime el a�o 1");
		int a�o1 = teclado.nextInt();

		// Pedir Segunda fecha
		System.out.println("Dime el dia 2");
		int dia2 = teclado.nextInt();
		System.out.println("Dime el mes 2");
		int mes2 = teclado.nextInt();
		System.out.println("Dime el a�o 2");
		int a�o2 = teclado.nextInt();
		
		//Miro si es la misma fecha
		if (dia1==dia2 && mes1==mes2 && a�o1==a�o2) {
			System.out.println("Es la misma fecha. OK");
			
			//Miro si es una fecha anterior
		} else if (a�o2 > a�o1 || a�o2 == a�o1 && mes2 > mes1 || mes2 == mes1 && dia2 > dia1) {
			System.out.println("Es una anterior. OK");
			
			// Opcion posterior
		} else {
			System.out.println("Es posterior. KO");
		}
	}

}
