import java.util.Scanner;

//3. Demana a l'usuari l'al�ada i l'amplada d'un rectangle (height, width), 
//calcula el per�metre del rectangle:


public class ejer3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Pedir anchura del rectangulo
		System.out.println("Dime la anchura del rect�ngulo");
		double anchura = teclado.nextDouble();
		
		//Pedir altura del rectangulo
		System.out.println("Ahora la altura del mismo: ");
		double altura = teclado.nextDouble();
		//Operar y mostrar en pantalla
		System.out.println("El per�metro del rect�ngulo es de: " + (altura + anchura) * 2);

	}

}
