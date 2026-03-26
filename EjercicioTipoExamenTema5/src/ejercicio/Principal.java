package ejercicio;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion;
		do {
			System.out.println("\n--- MENU DICCIONARIO ---");
			System.out.println("1. Imprimir diccionario completo");
			System.out.println("2. Buscar palabra por nombre");
			System.out.println("3. Añadir nueva palabra");
			System.out.println("4. Modificar significado de una palabra");
			System.out.println("5. Ordenar por nombre (Z -> A)");
			System.out.println("6. Borrar una palabra");
			System.out.println("0. Salir");
			System.out.print("Elige una opción: ");
			opcion = Leer.datoInt();

			Object diccionario;
			switch (opcion) {
			case 1:
				System.out.println("\n--- DICCIONARIO COMPLETO ---");
				diccionario.imprimirTodas();
				break;

			case 2:
				System.out.print("Introduce el nombre de la palabra a buscar: ");
				String nombreBuscar = sc.nextLine();
				Palabra encontrada = diccionario.buscarPalabra(nombreBuscar);
				if (encontrada != null) {
					System.out.println("Palabra encontrada: " + encontrada);
					System.out.println("Significado: " + encontrada.getSignificado());
				} else {
					System.out.println("La palabra no está en el diccionario.");
				}
				break;

			case 3:
				System.out.print("Introduce el id: ");
				int id = Integer.parseInt(sc.nextLine());
				System.out.print("Introduce la palabra en inglés: ");
				String nombre = sc.nextLine();
				System.out.print("Introduce el significado en español: ");
				String significado = sc.nextLine();

				Palabra nueva = new Palabra(id, nombre, significado);
				diccionario.agregarPalabra(nueva);
				System.out.println("Palabra añadida correctamente.");
				break;

			case 4:
				System.out.print("Introduce el nombre de la palabra a modificar: ");
				String nombreMod = sc.nextLine();
				System.out.print("Introduce el nuevo significado: ");
				String nuevoSignificado = sc.nextLine();

				boolean modificado = diccionario.modificarSignificado(nombreMod, nuevoSignificado);
				if (modificado) {
					System.out.println("Significado modificado correctamente.");
				} else {
					System.out.println("No se ha encontrado esa palabra.");
				}
				break;

			case 5:
				diccionario.ordenarPorNombreDesc();
				System.out.println("Diccionario ordenado por nombre (Z -> A).");
				break;

			case 6:
				System.out.print("Introduce el nombre de la palabra a borrar: ");
				String nombreBorrar = sc.nextLine();
				boolean borrada = diccionario.borrarPorNombre(nombreBorrar);
				if (borrada) {
					System.out.println("Palabra borrada correctamente.");
				} else {
					System.out.println("No se ha encontrado esa palabra.");
				}
				break;

			case 0:
				System.out.println("Saliendo del programa...");
				break;

			default:
				System.out.println("Opción no válida.");
			}

		} while (opcion != 0);

	}

}
