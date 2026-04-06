package ejercicio;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre;
		int dni;
		int option;
		boolean delitosangre;
		double diasCondena;
		int diasPlus = 0;
		int cantidadDias;
		Preso preso1 = new Preso("Julio", 1234, false, 100);
		Preso preso2 = new Preso("Sebas", 6783, true, 10);
		Preso preso3 = new Preso("Willian", 5634, false, 700);
		Preso preso4 = new Preso("Adri", 4321, true, 60);

		List<Preso> listaPresos = new ArrayList<Preso>();
		listaPresos.add(preso1);
		listaPresos.add(preso2);
		listaPresos.add(preso3);
		listaPresos.add(preso4);

		Prision prision = new Prision(1, "Alcatraaz", 1000, listaPresos);
		
		System.out.println("1.Agregar un preso a la prisión");
		System.out.println("");
		System.out.println("3.Indultar preso");
		System.out.println("4.Buscar un preso por DNI");
		System.out.println("5.Buscar presos que tengan menos días de condena");
		System.out.println("6.Calcular media de días totales de los presos con delitos de sangre");
		System.out.println("");
		System.out.println("Pulse 8 para ordenar la lista por nombres");
		System.out.println("Pulse 9 para calcular la condena final del preso");
		System.out.println("Pulse 0 para salir");
		option = Leer.datoInt();
		do {
			switch (option) {
			case 1: {
				System.out.println("Introduzca el nombre del preso");
				nombre=Leer.dato();
				System.out.println("Introduzca el DNI del preso");
				dni=Leer.datoInt();
				System.out.println("Indique si preso el preso ha cometido delito de sangre");
				
				System.out.println("Introduzca los días de condena del preso");
				diasCondena=Leer.datoDouble();
				
				listaPresos.add(new Preso(nombre,dni,false,diasCondena));
				
				break;
			}
			case 2: {
				break;
			}
			case 3: {
				System.out.println("Indique el DNI del preso que se le aplique el indulto");
				dni=Leer.datoInt();
				break;
			}
			case 4: {
				System.out.println("Indique el DNI del preso que busca");
				dni=Leer.datoInt();
				System.out.println(prision.buscarPresoDni(dni));				
				
				break;
			}
			case 5: {
				System.out.println("Indique los días máximos para hacer la busqueda");
				cantidadDias=Leer.datoInt();
				System.out.println(prision.buscarPresosCantidad(cantidadDias, diasPlus));
				break;
			}
			case 6: {
				System.out.println(prision.calcularMediaDias());
				break;
			}
			case 7: {
				break;
			}
			case 8: {
				prision.ordenarPresosNombre();
				System.out.println(listaPresos);
				break;
			}
			
			case 9:{
				System.out.println("Indique cuantos días se le añade a la condena si tiene delito de sangre");
				diasPlus=Leer.datoInt();
				break;
			}
			
			
			default:System.out.println("Cerrando Programa...");
				break;
			
			}
			
		} while (option != 0);

	}

}
