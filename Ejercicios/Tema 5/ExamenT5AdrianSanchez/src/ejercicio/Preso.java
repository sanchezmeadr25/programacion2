package ejercicio;

public class Preso {

	private String nombre;
	private  int dni;
	private boolean delitoSangre;
	private double diasCondena;
	
	//Constructores
	public Preso(String nombre, int dni, boolean delitoSangre, double diasCondena) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.delitoSangre = delitoSangre;
		this.diasCondena = diasCondena;
	}

	public Preso() {
		super();
	}

	//Getters and Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public boolean isDelitoSangre() {
		return delitoSangre;
	}

	public void setDelitoSangre(boolean delitoSangre) {
		this.delitoSangre = delitoSangre;
	}

	public double getDiasCondena() {
		return diasCondena;
	}

	public void setDiasCondena(double diasCondena) {
		this.diasCondena = diasCondena;
	}

	//To String
	@Override
	public String toString() {
		return "Preso [nombre=" + nombre + ", dni=" + dni + ", delitoSangre=" + delitoSangre + ", diasCondena="
				+ diasCondena + "]";
	}
	
	
	//Métodos
	public double calcularCondenaFinal(int diasplus) {
		double condenaFinal;
		if (delitoSangre = true) {
			condenaFinal=diasCondena + diasplus;
			return condenaFinal;
		}
		return diasCondena;
		
	}
	
	
}
