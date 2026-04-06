package list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Academia {

	private List<Estudiante> lista;

	public Academia(List<Estudiante> lista) {
		this.lista=new ArrayList<>();
	}

	public List<Estudiante> getLista() {
		return lista;
	}

	// Imprimir Estudiantes
	public void imprimirTodos() {
		Iterator<Estudiante> it = lista.iterator();
		while (it.hasNext()) {
			Estudiante e = it.next();
			System.out.println(e);
		}
	}

	// Buscar Estudiante
	public Estudiante buscarEstudiante(int id) {
		for (Estudiante e : lista) {
			if (e.getId() == id) {
				return e;
			}
		}
		return null;
	}

	// Agregar Estudiante
	public void agregarEstudiante(Estudiante d) {
		lista.add(d);
	}

	// Modificar Estudiante
	public boolean modificarNota(int id, double notaNueva) {
		Estudiante e = buscarEstudiante(id);
		if (e != null) {
			e.setNotaMedia(notaNueva);
			return true;
		}
		return false;

	}

	// Borrar estudiante
	public boolean borrarEstudiante(int id) {
		Iterator<Estudiante> it = lista.iterator();
		while(it.hasNext()) {
			Estudiante e = it.next();
			if (e.getId()==id) {
				it.remove();
				return true;
			}
		}
		return false;
	}
	
	
	//Ordenar A-Z
	public void ordenarLista() {
		Collections.sort(lista, new ComparatorList() );
	}
	
	
	
	
	
}
