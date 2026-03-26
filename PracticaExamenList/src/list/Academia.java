package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Academia {

	private List<Estudiante> lista;

	public Academia(List<Estudiante> lista) {
		super();
		this.setLista(new ArrayList<Estudiante>());
	}

	public List<Estudiante> getLista() {
		return lista;
	}

	public void setLista(List<Estudiante> lista) {
		this.lista = lista;
	}

	// Imprimir Estudiantes
	public void imprimirTodos() {
	Iterator<Estudiante> it = lista.iterator();
	while (it.hasNext()) {
		Estudiante e =it.next();
		System.out.println();
	}
	}
	
	
	//
}
