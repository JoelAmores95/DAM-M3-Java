
public class Pokemon {
	
	// Propiedades
	private String nombre;
	private String tipo;
	private double peso;
	private int ataque;
	private int defensa;
	private int vida;

	// Constructores
	public Pokemon(String nombre, String tipo, double peso, int ataque, int defensa, int vida) {

		this.nombre = nombre;
		this.tipo = tipo;
		
		// El peso no puede ser negativo ni superior a 100
		if (peso < 0 || peso > 100) {
			
			if(peso < 0) {
				this.peso = 0;
			} else {
				this.peso = 100;
			}
			
		} else {
			// El peso no es negativo ni superior a 0, le pongo el que tiene
			this.peso = peso;
		}
		this.ataque = ataque;
		this.defensa = defensa;
		this.vida = vida;
	}

	// Métodos
	
	@Override
	public String toString() {
		
		return nombre + " -  Tipus " + tipo +
				"\nPes: " + peso + " quilograms" +
				"\nAtac: " + ataque +
				"\nDefensa: " + defensa +
				"\nVida: " + vida;
	}
	
	// Setters y Getters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPeso() {
		return peso;
	}

	// Comprueba peso
	public void setPeso(double peso) {
		
		if (peso < 0 || peso > 100) {

			if(peso < 0) {
				this.peso = 0;
			} else {
				this.peso = 100;
			}

		}
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}
	
}
