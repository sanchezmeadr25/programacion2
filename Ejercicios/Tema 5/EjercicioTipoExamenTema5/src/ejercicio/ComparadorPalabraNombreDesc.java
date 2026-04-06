package ejercicio;

import java.util.Comparator;

public class ComparadorPalabraNombreDesc implements Comparator<Palabra>{

	@Override
	public int compare(Palabra p1, Palabra p2) {
		// TODO Auto-generated method stub
		return p2.getName().compareToIgnoreCase(p1.getName());
	}
	

	
}
