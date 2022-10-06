
public class Cuenta {

	// Propiedades
	private String titular;
	private int numero;
	private double saldo;

	// Constructores

	public Cuenta (String titular, int numero, double saldo) {

		this.titular = titular;
		this.numero = numero;
		this.saldo = saldo;

	}

	// Métodos

	public void retirarDinero(int cantidad) {

		// No puedo dejar la cuenta a menos de 0
		if( puedoRetirar(cantidad) ) {

			this.saldo = this.saldo - cantidad;
		}
	}
	
	public boolean puedoRetirar(int cantidad) {
		return ( (this.saldo - cantidad) >= 0);
	}

	public void ingresarDinero(int cantidad) {
		this.saldo += cantidad;
	}
	
	public void ingresarOtraCuenta(int cantidad, Cuenta numeroCuenta) {
		numeroCuenta.ingresarDinero(cantidad);
	}

	public void tranferirSaldo(int cantidad, Cuenta numeroCuentaExterno) {

		// Compruebo que puedo retirar dinero
		if( puedoRetirar(cantidad) ) {

			// Aplico comisión si es inferior a 1000
			if (numero < 1000) {
				cantidad ++;
			}
			// Vuelvo a comprobar que tengo saldo positivo después de la comisión
			if (puedoRetirar(cantidad)) {
				
				// Operación principal
				
				// Resto a esta cuenta
				this.saldo -= cantidad;
				
				// Sumo a la otra cuenta
				numeroCuentaExterno.ingresarDinero(cantidad);
			}
		} else {
			System.out.println("No tienes saldo suficiente.");
		}
	}
	
	public void mostrarSaldo() {
		System.out.println("Saldo: " + this.saldo + "€");
	}

	@Override
	public String toString() {
		return "Titular: " + titular + "\nNúmero: " + numero + "\nSaldo: " + saldo + "€";
	}
	
	
}
