package list;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

        Academia academia = new Academia(null);
        int opcion;
        
    
        academia.agregarEstudiante(new Estudiante(1, "Carlos", "1º ESO", 7.5));
        academia.agregarEstudiante(new Estudiante(2, "Lucía", "2º ESO", 8.2));
        academia.agregarEstudiante(new Estudiante(3, "Marcos", "3º ESO", 6.9));
        academia.agregarEstudiante(new Estudiante(4, "Ana", "1º Bachillerato", 9.1));
        academia.agregarEstudiante(new Estudiante(5, "Javier", "2º Bachillerato", 5.8));
        

        do {
            System.out.println("===== MENÚ ACADEMIA =====");
            System.out.println("1. Mostrar todos los estudiantes");
            System.out.println("2. Buscar estudiante por ID");
            System.out.println("3. Añadir estudiante");
            System.out.println("4. Modificar nota de un estudiante");
            System.out.println("5. Ordenar estudiantes por nombre (A-Z)");
            System.out.println("6. Borrar estudiante");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcion = Leer.datoInt();

            switch (opcion) {

            case 1:
                System.out.println("\n--- LISTA DE ESTUDIANTES ---");
                academia.imprimirTodos();
                break;

            case 2:
                System.out.print("Introduce el ID del estudiante: ");
                int idBuscar = Leer.datoInt();

                Estudiante encontrado = academia.buscarEstudiante(idBuscar);

                if (encontrado != null) {
                    System.out.println("Estudiante encontrado:");
                    System.out.println(encontrado);
                    System.out.println("Curso: " + encontrado.getCurso());
                    System.out.println("Nota media: " + encontrado.getNotaMedia());
                } else {
                    System.out.println("No existe un estudiante con ese ID.");
                }
                break;

            case 3:
                System.out.println("\n--- AÑADIR ESTUDIANTE ---");

                System.out.print("ID: ");
                int id = Leer.datoInt();

                System.out.print("Nombre: ");
                String nombre = Leer.dato();

                System.out.print("Curso: ");
                String curso = Leer.dato();

                System.out.print("Nota media: ");
                double nota = Leer.datoDouble();

                Estudiante nuevo = new Estudiante(id, nombre, curso, nota);
                academia.agregarEstudiante(nuevo);

                System.out.println("Estudiante añadido correctamente.");
                break;

            case 4:
                System.out.println("\n--- MODIFICAR NOTA ---");
                System.out.print("Introduce el ID del estudiante: ");
                int idMod = Leer.datoInt();

                System.out.print("Introduce la nueva nota: ");
                double nuevaNota = Leer.datoDouble();

                if (academia.modificarNota(idMod, nuevaNota)) {
                    System.out.println("Nota modificada correctamente.");
                } else {
                    System.out.println("No existe un estudiante con ese ID.");
                }
                break;

            case 5:
                System.out.println("\n--- ORDENANDO LISTA A-Z ---");
                academia.ordenarLista();
                System.out.println("Lista ordenada.");
                academia.imprimirTodos();
                break;

            case 6:
                System.out.println("\n--- BORRAR ESTUDIANTE ---");
                System.out.print("Introduce el ID del estudiante: ");
                int idBorrar = Leer.datoInt();

                if (academia.borrarEstudiante(idBorrar)) {
                    System.out.println("Estudiante borrado correctamente.");
                } else {
                    System.out.println("No existe un estudiante con ese ID.");
                }
                break;

            case 0:
                System.out.println("Saliendo del programa...");
                break;

            default:
                System.out.println("Opción no válida.");
            }

            System.out.println();

        } while (opcion != 0);
    }
}
