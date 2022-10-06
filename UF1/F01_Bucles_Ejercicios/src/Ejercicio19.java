import java.util.Scanner;

//	  Fer un programa d'una gasolinera. En una gasolinera es registra per cada cotxe que entra, el tipus de combustible (gasoil o gasolina), 
//	  i litres que carrega al cotxe.
//    
//    Al final del dia, es vol recollir la informació de tipus de combustible i la quantitat de litres totals del combustible.
//    
//    - Controlarem que és final del dia i no entren més cotxes, per l'hora (horari de 9h a 21h).
//    - Controlar cadascú que entra si vol carregar combustible
//    - Preguntar si entra un cotxe, en el cas que entri cotxe preguntar l'hora, i preguntar tipus de combustible (gasolina o gasoil) i quantitat de litres.

public class Ejercicio19 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double litrosTotalesGasolina = 0;
		double litrosTotalesDiesel = 0;
		int litrosEchados = 0;
		int clientesGasolina = 0;
		int clientesDiesel = 0;

		// Preguntar Hora
		System.out.println("Hola empleado, dime qué hora es: ");
		int hora = teclado.nextInt();
		// Solo funciona en horario de trabajo
		while (hora >=9 && hora < 21) {			

			// Preguntar si quiere echar gasolina o no
			System.out.println("Bienvenido a mi gasolinera, mejor que GALP. ¿Quiere cargar combustible? (1 = si, 0 = no):");
			int echarCombustible = teclado.nextInt();

			// Quiere echar gasolina 

			if (echarCombustible == 1) {
				
				System.out.println("¿Qué hora es?");
				hora = teclado.nextInt();
				
				if(hora >=9 && hora < 21) {
					
					System.out.println("¿Qué tipo de combustible quiere echar? (1 = gasolina, 2 = diésel)");
					int tipoCombustible = teclado.nextInt();
					
					System.out.println("¿Cuántos litros va a echar?");
					litrosEchados = teclado.nextInt();

					// Guardar litros de combustible
					if (tipoCombustible == 1) {
						litrosTotalesGasolina += litrosEchados;
						clientesGasolina++;
					} else {
						litrosTotalesDiesel += litrosEchados;
						clientesDiesel++;
					}
					System.out.println("Gracias por su visita.");
					System.out.println("Introduce la hora: ");
					hora = teclado.nextInt();

				}
			} else {
				System.out.println("¡Gracias por su visita! Aunque no quiera echar gasolina...");
				System.out.println("Introduce la hora: ");
				hora = teclado.nextInt();
			}

		}
		// Fuera de horario
		if (!hora >=9 && hora < 21) {
			System.out.println("Estamos fuera de horario (9h a 21h)");
		}
		// Final del dia
		if (hora >= 21) {
			System.out.println("Se ha terminado la jornada.\nLos resultados de hoy son:");
			if (clientesGasolina == 0) {
				System.out.println("Hoy no se ha vendido gasolina.");
			} else {
				System.out.println(clientesGasolina + " clientes gasolina. " + litrosTotalesGasolina + " L");
			}
			if (clientesDiesel == 0) {
				System.out.println("Hoy no se ha vendido diésel");
			} else {
				System.out.println(clientesDiesel + " clientes diesel." + litrosTotalesDiesel + " L");
			}
		}

	}

}
