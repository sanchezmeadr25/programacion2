/*package ejemplo01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
        int opcion = 0, num;
        double num1, num2, resultado;

        do {
            try {

                System.out.println("-------------------------------------");
                System.out.println("| Bienvenido a la MINI CALCULADORA  |");
                System.out.println("-------------------------------------");
                System.out.println("1. Sumar");
                System.out.println("2. Restar");
                System.out.println("3. Multiplicar");
                System.out.println("4. Dividir");
                System.out.println("5. Par o impar");
                System.out.println("6. Salir");
                System.out.print("Elige una opción: ");
                opcion = Leer.datoInt();

                switch (opcion) {

                case 1:
                    System.out.print("Introduce el primer número: ");
                    num1 = Leer.datoDouble();
                    System.out.print("Introduce el segundo número: ");
                    num2 = Leer.datoDouble();
                    //resultado = Operaciones.sumar(num1, num2);
                    System.out.printf("Resultado: %.2f\n", resultado);
                    break;

                case 2:
                    System.out.print("Introduce el primer número: ");
                    num1 = Leer.datoDouble();
                    System.out.print("Introduce el segundo número: ");
                    num2 = Leer.datoDouble();
                    //resultado = Operaciones.restar(num1, num2);
                    System.out.printf("Resultado: %.2f\n", resultado);
                    break;

                case 3:
                    System.out.print("Introduce el primer número: ");
                    num1 = Leer.datoDouble();
                    System.out.print("Introduce el segundo número: ");
                    num2 = Leer.datoDouble();
                    //resultado = Operaciones.multiplicar(num1, num2);
                    System.out.printf("Resultado: %.2f\n", resultado);
                    break;

                case 4:
                    System.out.print("Introduce el dividendo: ");
                    num1 = Leer.datoDouble();
                    System.out.print("Introduce el divisor: ");
                    num2 = Leer.datoDouble();
                   // resultado = Operaciones.dividir(num1, num2); // puede lanzar excepción
                    System.out.printf("Resultado: %.2f\n", resultado);
                    break;

                case 5:
                    System.out.print("Introduce un número entero: ");
                    num = Leer.datoInt();
                   // if (Operaciones.esPar(num)) {
                        System.out.printf("El número %d es par.\n", num);
                    //} else {
                        System.out.printf("El número %d es impar.\n", num);
                    }
                    break;

               case 6:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida, intenta de nuevo.\n");
                }

            } catch (NumberFormatException n) {
                System.out.println("Error: escribe un número válido.");
            } catch (ArithmeticException ar) {
                System.out.println("Error: " + ar.getMessage());
            } catch (RuntimeException e) {
                System.out.println("Error inesperado.");
            }

        } while (opcion != 6);
    }
}*/
