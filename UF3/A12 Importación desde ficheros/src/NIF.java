public class NIF {
	
	// Propiedades / Atributos
	
//	private int numero;
	private String numero;
	private char lletra;
	
	// Constructores
	
	public NIF(String numero) {
		
		this.numero = numero;
		this.lletra = calculaLetra(numero);
	}
	
	// Métodos

	private char calculaLetra(String numero) {
		
		int numDNI = Integer.valueOf(numero);
		int resto = numDNI % 23;
		char[] letra = {'T','R','W','A','G','M','Y','F','P','D','X','B',
						'N','J','Z','J','S','Q','V','H','L','C','K','E'};
		
		return letra[resto];		
	}

	// Método toString()
	@Override
	public String toString() {
		return numero + "-" + lletra;
	}

	// Setters y Getters
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public char getLletra() {
		return lletra;
	}

	public void setLletra(char lletra) {
		this.lletra = lletra;
	}
	
	
}
