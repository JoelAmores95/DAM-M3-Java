import java.util.Scanner;

// Un treballador necessita calcular el seu salari, demanar les hores treballades. 
// Si ha treballat més de 40h se li paga 16€ per les primeres 40h i 20€ per la resta.

public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		// Pedir horas
		System.out.println("Introduce las horas trabajadas: ");
		int horasTrabajadas = teclado.nextInt();
		
		//Calcular Excedente de 40h si supera las 40h
		int excedente = 0;
		if (horasTrabajadas > 40) {
			excedente = horasTrabajadas - 40;			
		}
		// Calcular Salario
		int salario = (horasTrabajadas * 16) + (excedente * 20) - (excedente*16);
		System.out.println(salario + "€");
	}

}
