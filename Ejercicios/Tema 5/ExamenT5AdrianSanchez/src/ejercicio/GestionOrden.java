package ejercicio;

import java.util.Comparator;

public class GestionOrden implements Comparator<Preso> {

	@Override
	public int compare(Preso p1, Preso p2) {
		return - p1.getNombre().compareToIgnoreCase(p2.getNombre());
	}

	

}
