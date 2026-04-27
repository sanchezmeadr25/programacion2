package ejercicio01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Secretaria {

	List<Alumno> lista = new ArrayList<Alumno> ();

	
	//Métodos
	
	public void listaAlumnos() {
		lista.stream()
			.filter(a -> a.getNombre() != null )
			.collect(Collectors.toList());
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
