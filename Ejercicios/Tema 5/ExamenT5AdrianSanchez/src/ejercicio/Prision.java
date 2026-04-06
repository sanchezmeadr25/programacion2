package ejercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Prision{

	private int id;
	private String nombrePrision;
	private int capacidad;
	List<Preso> listaPresos;

	// Constructores
	public Prision(int id, String nombrePrision, int capacidad, List<Preso> listaPresos) {
		this.id = id;
		this.nombrePrision = nombrePrision;
		this.capacidad = capacidad;
		this.listaPresos = new ArrayList<Preso>();
	}

	public Prision() {
		super();
	}

	// Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombrePrision() {
		return nombrePrision;
	}

	public void setNombrePrision(String nombrePrision) {
		this.nombrePrision = nombrePrision;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public List<Preso> getListaPresos() {
		return listaPresos;
	}

	public void setListaPresos(List<Preso> listaPresos) {
		this.listaPresos = listaPresos;
	}

	// To String
	@Override
	public String toString() {
		return "Prision [id=" + id + ", nombrePrision=" + nombrePrision + ", capacidad=" + capacidad + ", listaPresos="
				+ listaPresos + "]";
	}

	//Agregar
	public void agregarPreso(Preso p) {
		listaPresos.add(p);
	}
	
	
	
	
	// Buscar
	public Preso buscarPresoDni(int dni) {
		for (Preso preso : listaPresos) {
			if (preso.getDni() == dni) {
				return preso;
			}
		}
		return null;
		
	}
	
	//BuscarCantidad
	public List<Preso> buscarPresosCantidad(int cantidadDias,int diasPlus) {
		for ( Preso preso : listaPresos) {
			if (preso.calcularCondenaFinal(diasPlus)<cantidadDias) {
				listaPresos = (List<Preso>) preso;
			}return listaPresos;
		}
		return null;
	}
	
	//Indultar
	public void indultarPreso(int dni) {
		Preso preso;
		double indulto = 0.0;
		 preso=buscarPresoDni(dni);
		 if (preso!=null) {
			preso.setDiasCondena(indulto);
		}
		 
	}
	

	
	//Calcularmedia
	public  double calcularMediaDias() {
		double diasTotal = 0;
		int contador = 0;
		for (Preso preso : listaPresos) {
			if(preso.isDelitoSangre()==true) {
				diasTotal +=preso.getDiasCondena();
				contador ++;
			}
			return diasTotal/contador;
		}
		return 0;
	}
	
	//Ordenar
	public void ordenarPresosNombre() {
		Collections.sort(listaPresos,new GestionOrden());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
