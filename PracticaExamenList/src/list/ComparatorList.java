package list;

import java.util.Comparator;

public class ComparatorList implements Comparator<Estudiante> {

	@Override
	public int compare(Estudiante e1, Estudiante e2) {
		// TODO Auto-generated method stub
		return e1.getNombre().compareToIgnoreCase(e2.getNombre());
	}
}
