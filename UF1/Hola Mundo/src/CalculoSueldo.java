//Coge de fuera (importa) la herramienta Scanner
import java.util.Scanner; 

public class CalculoSueldo {

	public static void main(String[] args) {
		
		//Introducimos la herramienta Scanner para recoger datos del usuario por teclado
		//Lee estas cosas:
		//nextLine() -> lee lineas
		//nextInt() -> lee enteros
		//nextDouble() -> lee decimales
		
		Scanner teclado= new Scanner(System.in); //La �nica parte que se puede modificar es el nombre "teclado"
		
		//Pedimos el nombre al usuario
		System.out.println("�C�mo te llamas?");
		String nombre = teclado.nextLine();
		
		//Pedimos los datos al usuario
		System.out.println("�Cu�ntas horas has trabajado este mes?");
		int horasTrabajadas=teclado.nextInt();
		System.out.println("�Cu�nto cobras por hora?");
		double sueldoHora=teclado.nextDouble();
		
		//Calculamos el sueldo mensual
		double sueldoMensual = horasTrabajadas*sueldoHora;
		
		//Mostramos el resultado por pantalla
		System.out.println("Hola "+nombre+",");
		
//		//Mostramos elementos uno a uno
//		System.out.print("El sueldo mensual es de: ");
//		System.out.print(sueldoMensual);
//		System.out.println("�"); //A�ade salto de l�nea
//		
		//Opci�n bonita, todo en una l�nea a�adiendo el +
		System.out.println("Tu sueldo mensual es de: "+sueldoMensual+"�");
	}

}

//CTRL+A =>Seleccionar todo
//CTRL+I => auto tabular
//Para autocompletar: CTRL+Espacio
//Para comentar varias l�neas de texto, seleccionar y CTRL+7