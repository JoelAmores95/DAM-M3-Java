import java.util.Scanner;

//5. Escriu un programa que demani una quantitat en euros i faci la conversió a dólars americans. 
//Primer ha de demanar quants dólars val un euro (dolarval1euro).
public class ejer5 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		//Pido el valor del dolar
		System.out.println("Introduce cuántos dolares vale un euro: ");
		int dolarval1euro = teclado.nextInt();
		
		//Pido la cantidad de euros a convertir
		System.out.println("¿Cuántos euros quieres convertir? ");
		double euros = teclado.nextDouble();
		
		//Muestro el valor en pantalla
		System.out.println("Esto en euros son: "+ euros/dolarval1euro+ "€");	
	}

}
