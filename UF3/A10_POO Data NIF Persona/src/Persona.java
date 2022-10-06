
public class Persona {
	
	// Propiedades 
	private String nom;
	private Data dataNaixement;
	private NIF nif;
	
	// Constructores
	
	public Persona (String nom, int dia, int mes, int any, String pNif) {
		this.nom = nom;
		this.dataNaixement = new Data(dia, mes, any);
		this.nif = new NIF(pNif);
	}
	
	// Metodos

	@Override
	public String toString() {
		return nom + " - " + dataNaixement + " - " + nif +"\n";
	}
	


}
