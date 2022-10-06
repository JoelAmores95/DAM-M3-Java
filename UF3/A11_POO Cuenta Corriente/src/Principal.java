
public class Principal {

	public static void main(String[] args) {

		// Cuenta 1
		Cuenta cuenta1 = new Cuenta("Joel Amores", 12345678, 1000000);
		System.out.println("Datos cuenta 1\n\n" + cuenta1.toString());
		System.out.println("---------------------------------");

		// Cuenta 2
		Cuenta cuenta2 = new Cuenta("Jaime Bocio", 87654321, 1000000);
		System.out.println("Datos cuenta 2\n\n" + cuenta2.toString());
		System.out.println("---------------------------------");
		
		// Ingreso 2000€ a cuenta1
		cuenta1.ingresarDinero(2000);
		System.out.println("Ingreso 2000€\n"+ cuenta1.toString());
		System.out.println("---------------------------------");

		// Retiro 1500€ de cuenta1
		cuenta1.retirarDinero(1500);
		System.out.println("Retiro 1500€\n"+ cuenta1.toString());
		System.out.println("---------------------------------");
		
		// Transferir 100€ de cuenta1 a cuenta2
		
		cuenta1.tranferirSaldo(100, cuenta2);
		System.out.println("Transfiero 100€ a otra cuenta\n"+ cuenta1.toString());
		System.out.println("---------------------------------");
		System.out.println(cuenta2.toString());
	}

}
