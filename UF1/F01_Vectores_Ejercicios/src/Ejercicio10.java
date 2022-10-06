import java.util.Scanner;

// Càlcul de la lletra d'un DNI. Demanarem el DNI per teclat (sense lletra) i ens mostrarà el DNI complet. 
//
// Per calcular la lletra, agafarem el residu de dividir el nostre DNI entre 23 (EL MODULO %), 
// el resultat ha d'estar entre 0 i 22. A partir d'aquest residu el programa ha de buscar a la taula següent la lletra corresponent.
//
//
public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
//		int[] arrayResiduo = new int[23];
//		for (int i = 0; i < arrayResiduo.length; i++) {
//			arrayResiduo[i]=i;
//		}
		int[] arrayResiduo = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,18,20,21,22};
		
		
		String[] arrayLetra = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"}; 
		
		// Pedir DNI
		System.out.println("Introduce tu DNI sin letra: ");
		int dni = teclado.nextInt();
		
		// Calculo el modulo
		int modulo = dni % 23;
		
		// Recorro el vector de residuos y busco la posicion que tenga el mismo valor que el modulo
		int posicionLetra = 0;
		
		for (int i = 0; i < arrayResiduo.length; i++) {
			if (modulo == arrayResiduo[i]) {
				posicionLetra = i;
			}
		}
		//Ya tengo el dni, muestro el valor
		System.out.println(dni + " - " + arrayLetra[posicionLetra]);

	}

}
