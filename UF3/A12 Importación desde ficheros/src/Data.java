public class Data {

	// Propiedades
	private int dia;
	private int mes;
	private int any;

	// Constructores
	public Data(int dia, int mes, int any) {

		this.dia = dia;
		this.mes = mes;
		this.any = any;

		// Si la fecha es errónea, creará 1/1/2021

		if(!dataCorrecta()) {

			this.dia = 1;
			this.mes = 1;
			this.any = 2021;
		}
	}

	// Métodos

	// Método toString() autocompletar
	@Override
	public String toString() {

		String strDia = "" + this.dia;
		if(this.dia < 10) {
			strDia = "0"+ this.dia;
		}

		String strMes= "" + this.mes;
		if(this.mes < 10) {
			strMes = "0"+ this.mes;
		}


		return strDia + "/" + strMes + "/" + this.any;
	}

	// Método fecha Correcta
	public Boolean dataCorrecta() {

		// Consideraciones
		// Hay meses que tienen 28, 30 o 31 días

		// Meses con 31 días: Enero, marzo, mayo, julio, agosto, octubre y diciembre
		// Meses con 30 días: Abril, junio, septiembre y noviembre
		// Mes con 28 días: Febrero

		// Ojo que puede ser bisiesto...

		// Empiezo por febrero:
		if (mes == 2) {
			if (dia == 29) {
				// Miro si el a�o es divisible por 4
				if (any % 4 == 0) {
					// Es divisible por 4
					if (any % 100 == 0) {
						// Es divisible por 4 y por 100
						if (any % 400 == 0){
							// Es divisible por 4, por 100 y por 400
							return true;
						} else {
							// Es divisible por 4, por 100 pero no por 400
							return false;
						}
						// Es divisible por 4 pero no por 100
					} else {
						return true;
					}
					// No es divisible por 4
				} else {
					return false;
				}	

				// Febrero tiene m�s de 29 dias
			} else if (dia > 29 || dia < 1) {
				return false;
			} else {

				// Febrero esta dentro de los m�rgenes
				return true;
			}
			// No es febrero, caso 1: meses con 31 dias
		} else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {

			// Est� fuera de l�mites
			if (dia > 31 || dia < 1) {
				return false;
			} else {
				// Est� dentro de los l�mites
				return true;
			}
			// Ultimo caso: Meses con 30 d�as
		} else {
			if (dia > 30 || dia < 1) {
				return false;
			} else {
				return true;
			}
		}

	}

	// Método cambiar fecha a día de mañana
	public void dataDema() {

		// Hoy es 31 de diciembre
		if(dia == 31 && mes == 12) {
			dia = 1;
			mes = 1;
			any ++;

			// Es dia 31
		} else if(dia == 31){
			dia = 1;
			mes ++;
			
			// Es dia 30 de los meses con 30 dias
		} else if( dia == 30 && mes == 4 ||
				dia == 30 && mes == 6 ||
				dia == 30 && mes == 9 ||
				dia == 30 && mes == 11) {
			dia = 1;
			mes ++;
			
			// Es 28 de febrero
		} else if (mes == 2 && dia == 28) {
			dia ++;
			
			// Si no es año bisiesto, corrijo la fecha
			if(!dataCorrecta()) {
				dia = 1;
				mes ++;
			}
			
			// Es un dia normal
		} else {
			dia ++;
		}
	}
	
	public String formatearCuatroDigitos(int valor) {
		if(valor < 1000) {
			return "0";
		} else if (valor < 100) {
			return "00";
		} else if (valor < 10) {
			return "000";
		} else return "";
	}
	
	public String formatearDosDigitos(int valor) {
		if (valor < 10) {
			return "0";
		} else return "";
	}

	// Getters y Setters

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAny() {
		return any;
	}

	public void setAny(int any) {
		this.any = any;
	}
	
}
