import java.util.Scanner;

//5. Escriu un programa que demani una quantitat en euros i faci la conversi� a d�lars americans. 
//Primer ha de demanar quants d�lars val un euro (dolarval1euro).
public class ejer5 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		//Pido el valor del dolar
		System.out.println("Introduce cu�ntos dolares vale un euro: ");
		int dolarval1euro = teclado.nextInt();
		
		//Pido la cantidad de euros a convertir
		System.out.println("�Cu�ntos euros quieres convertir? ");
		double euros = teclado.nextDouble();
		
		//Muestro el valor en pantalla
		System.out.println("Esto en euros son: "+ euros/dolarval1euro+ "�");	
	}

}
