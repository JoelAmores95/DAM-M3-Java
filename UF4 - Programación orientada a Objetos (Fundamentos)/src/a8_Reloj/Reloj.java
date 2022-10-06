package a8_Reloj;

public class Reloj {

	// Propiedades
	private int horas;
	private int minutos;
	private int segundos;

	// Constructores

	// Constructor vacío
	public Reloj() {

		this.horas = 00;
		this.minutos = 00;
		this.segundos = 00;

	}

	// Constructor con parámetros
	public Reloj(int horas, int minutos, int segundos) {

		if (entreRango(horas, 0, 23)
			&& entreRango(minutos, 0, 59)
			&& entreRango(segundos, 0 ,25)){
				this.horas = horas;
				this.minutos = minutos;
				this.segundos = segundos;
			}
	}


	// Setters y Getters
	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}

	// Método toString()
	@Override
	public String toString() {

		String strSegundos = "" + segundos;
		if(segundos < 10) {
			strSegundos = "0"+segundos;
		}
		
		// Modo Jaime: String strSegundos = (segundos < 10) ? "0" + segundos : "" + segundos;

		String strMinutos= "" + minutos;
		if(minutos < 10) {
			strMinutos = "0"+minutos;
		}
		
		//Otra opción:
		// String strMinutos = formatearDosDigitos(minutos); 

		String strHoras= "" + horas;
		if(horas < 10) {
			strHoras = "0"+horas;
		}

		return strHoras + ":" + strMinutos + ":" + strSegundos;
	}
	
	// Puedo hacer un método
	public String formatearDosDigitos(int valor) {
		if (valor < 10) {
			return "0" + valor;
		} else {
			return "" + valor;
		}
	}

	// Método modificarHora()
	public boolean modificarHora(int horas, int minutos, int segundos) {
		
		// Versión Jaime:
		/*if (entreRango(horas, 0, 23)
			&& entreRango(minutos, 0, 59)
			&& entreRango(segundos, 0 ,25)){
				this.horas = horas;
				this.minutos = minutos;
				this.segundos = segundos;
				
				return true;
			} else {
				return false;
			}
		*/

		// Horas
		if(horas < 0 || horas > 24) {
			return false;
		}
		// Minutos
		if(minutos < 0 || minutos > 60) {
			return false;
		}
		// Segundos
		if(segundos < 0 || segundos > 60) {
			return false;
		}

		// Todo OK
		setHoras(horas);
		setMinutos(minutos);
		setSegundos(segundos);
		return true;

	}

	// Funció per a poder sumar un segon a l’hora actual (a l’estil de l’exercici fet a la UF1).
	public void sumarSegundo() {

		if(getSegundos() == 59) {
			setSegundos(0);
			setMinutos(minutos + 1);
		} else {
			setSegundos(segundos + 1);
		}

		if(getMinutos() == 60) {
			setMinutos(0);
			setHoras(horas + 1);
		} 
	}

	// Función para poder sumar un número determinado de segundos a la hora actual.
	public void sumarSegundos(int segundos) {

		for(int i = 0; i < segundos; i++) {
			sumarSegundo();
		}
	}

//		// Tras sumar, hay mas de 59 segundos, sumo minutos
//		if(getSegundos() + segundos > 59) {
//			setMinutos(getMinutos() + ((getSegundos() + segundos) / 60));
//
//			// Si hay mas de 59 minutos, sumo horas.
//			if(getMinutos() > 59) {
//				setHoras(getHoras() + (getMinutos() / 60));
//				setMinutos(getMinutos() % 60);
//			}
//			setSegundos((getSegundos() + segundos) % 60);
//
//
//
//		} else {
//
//			setSegundos(segundos + getSegundos());
//		}
//	}

	private boolean entreRango(int valor, int min, int max) {
		return (valor >= min && valor <= max);
	}

}
