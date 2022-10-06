import java.util.Scanner;

// En una cadena de supermercats, s'aplica un descompte sobre el preu final depenent de certes condicions, que s�n acumulables.
//    - Si el preu final �s�superior a 500� s'aplica un 10% de descompte
//    - Si el mitj� de pagament �s efectiu s'aplica un 10% de descompte
//    - Si �l client �s soci�i som dilluns, s'aplica un 10% de descompte
//    
//    Necessitar�s variables per guardar l'import total, si el pagament �s en efectiu o no etc...

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Precio Inicial: ");
		double preuFinal = teclado.nextDouble();
		teclado.nextLine();
		int descuento = 0;
		
		//Mirar si es superior a 500�
		if (preuFinal > 500) {
			descuento ++;
		}
		
		// Mirar si paga en efectivo o no
		System.out.println("�Paga en efectivo? (s/n)");
		String efectivo = teclado.nextLine();
		char SiNo = efectivo.charAt(0);
		if (SiNo == 's') {
			// Aplica un 10% de descuento
			descuento ++;
			
		}
		// Preguntar si es socio
		System.out.println("�Eres socio y hoy es lunes?");
		String socio = teclado.nextLine();
		SiNo = socio.charAt(0);
		if (SiNo == 's') {
			descuento ++;
		}
		//Calculo precioFinal
		preuFinal = preuFinal - (preuFinal*0.1*descuento);
		System.out.println(preuFinal + " �");
	}

}
