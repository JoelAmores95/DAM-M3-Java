package teoria;

public class Silla {

	// Propiedades (o Atributos)

	// Tener un parámetro privado me permite tener control siempre de él

	private String color;
	double precio;
	boolean tieneResposabrazos;

	// Constructores (puede haber diferentes sillas y puedo pedirle diferentes cosas

	public Silla(String color, double precio, boolean tieneReposabrazos) {

		// Solo tengo dos opciones, color negro o azul

		if(color =="Negro"|| color == "Marrón") {

			// Mi color será igual al que me pasas
			this.color = color;
		} else {
			
			this.color = "Negro";
		}
		this.precio = precio;
		this.tieneResposabrazos = tieneReposabrazos;
	}

	// Al crear un constructor, el que viene por defecto desaparece.
	// Tengo que crearlo yo, así puedo usarlo

	public Silla() {

	}

	// Métodos

	public void pintar(String nuevoColor) {

		this.color = nuevoColor;
	}
	
	// Sobreescribe un método que ya existia, le digo que lo olvide y que use este.
	@Override
	public String toString() {
		return "La silla es de color" + color + " y un precio de " + precio + "€, tiene reposabrazos: "+ tieneResposabrazos;
	}

	// Setters y getters ( clic derecho Source)
	public String getColor() {

		return this.color;
	}

}
