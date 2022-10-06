
public class Pokeball {

	// Propiedades
	private String pokemonCapturat;
	private double potencia;
	private double pes;
	private String tipusPokemonCapturat;
	
	// Constructor
	
	public Pokeball() {
		this.pokemonCapturat = "";
		
		// Entre 0 y 100
		this.potencia = (Math.random() * 100);
		
		// Entre 1 y 5
		this.pes = ( (Math.random() + 1) * 10 - 5);;
	}
	
	// Métodos
	
	public void llensarPokeball(Pokemon pokemon) {
		
		if(this.potencia > pokemon.getDefensa()) {
			this.pokemonCapturat = pokemon.getNombre();
			this.pes = (this.pes + pokemon.getPeso()) / 20;
			this.tipusPokemonCapturat = pokemon.getTipo();
		} 
	}
	
	@Override
	public String toString() {
		
		if(this.pokemonCapturat == "") {
			return "Aquesta Pokeball està buida i pesa "+ this.pes + " kg en total.";
		} else {
			return "Aquesta PokeBall conté a " + this.pokemonCapturat + " de tipus "+ this.tipusPokemonCapturat +" i pesa "+ this.pes +"kg en total.";
		}
		
	}
	
	// Getters y setters

	public String getPokemonCapturat() {
		return pokemonCapturat;
	}

	public void setPokemonCapturat(String pokemonCapturat) {
		this.pokemonCapturat = pokemonCapturat;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	public double getPes() {
		return pes;
	}

	public void setPes(double pes) {
		this.pes = pes;
	}
	
}
