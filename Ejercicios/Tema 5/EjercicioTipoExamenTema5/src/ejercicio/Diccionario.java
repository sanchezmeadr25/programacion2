package ejercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Diccionario {

	List<Palabra> lista = new ArrayList<Palabra>();

	// Constructor
	public Diccionario(List<Palabra> lista) {
		super();
		this.lista = lista;
	}

	public Diccionario() {
		super();
	}

	public List<Palabra> getLista() {
		return lista;
	}

	public void setLista(List<Palabra> lista) {
		this.lista = lista;
	}

	// Metodos

	// Agregar
	public void agregarPalabra(Palabra p) {
		lista.add(p);
	}

	// IMprimir todas
	public void imprimirTodas() {
		Iterator<Palabra> it = lista.iterator();
		while (it.hasNext()) {
			Palabra p = it.next();
			System.out.println(p);
		}
	}

	// Buscar palabra
	public Palabra buscarPalabra(String nombre) {

		for (Palabra p : lista) {
			if (p.getName().equalsIgnoreCase(nombre)) {
				return p;
			}
		}
		return null;
	}
	
	//Modificar
	public boolean modificarSignificado(String name, String nuevoSignificado) {
		Palabra p = buscarPalabra(name);
		if (p != null) {
			p.setSignificado(nuevoSignificado);
			return true;
		}
		return false;
	}
	

	// Borrar por nombre
	public boolean borrarPorNombre(String nombre) {
		Iterator<Palabra> it = lista.iterator();
		while (it.hasNext()) {
			Palabra p = it.next();
			if (p.getName().equalsIgnoreCase(nombre)) {
				it.remove();
				return true;
			}
		}
		return false;
	}
	
	//Ordenar de  la z-a
	
	public void ordenarPorNombreDesc() {
		Collections.sort(lista, new ComparadorPalabraNombreDesc());
	}
	
	
	

}
