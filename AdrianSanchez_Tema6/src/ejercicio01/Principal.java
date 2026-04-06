package ejercicio01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		int opcion, num;
		double num1, num2, operacion;

		do {
			System.out.println("-------------------------------------");
			System.out.println("| Bienvenido a la MINI CALCULADORA  |");
			System.out.println("-------------------------------------");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("5. Par o impar");
			System.out.println("6. Salir");
			System.out.println("Elige una opción: ");
			opcion = Leer.datoInt();
			
			switch (opcion) {
			case 1:
				System.out.println("Introduce el primer número: ");
				num1 = Leer.datoDouble();
				System.out.println("Introduce el segundo número: ");
				num2 = Leer.datoDouble();
				operacion = num1 + num2;
				System.out.printf("Resultado: %.2f ", operacion);
				break;

			case 2:
				System.out.println("Introduce el primer número: ");
				num1 = Leer.datoDouble();
				System.out.println("Introduce el segundo número: ");
				num2 = Leer.datoDouble();
				operacion = num1 - num2;
				System.out.printf("Resultado: %.2f ", operacion);
				break;

			case 3:
				System.out.println("Introduce el primer número: ");
				num1 = Leer.datoDouble();
				System.out.println("Introduce el segundo número: ");
				num2 = Leer.datoDouble();
				operacion = num1 * num2;
				System.out.printf("Resultado: %.2f ", operacion);
				break;

			case 4:
				System.out.println("Introduce el dividendo: ");
				num1 = Leer.datoDouble();
				System.out.println("Introduce el divisor: ");
				num2 = Leer.datoDouble();
					operacion = num1 / num2;
					System.out.printf("Resultado: %.2f ", operacion);
				break;

			case 5:
				System.out.println("Introduce un número entero: ");
				num = Leer.datoInt();
				if (num % 2 == 0) {
					System.out.printf("El número: %.d es par.", num);
				} else {
					System.out.printf("El número: %d es impar.", num);
				}
				break;

			case 6:
				System.out.println(" Saliendo del programa...");
				break;

			default:
				System.out.println(" Opción no válida, intenta de nuevo.\n");
			}

		} while (opcion != 6);
	}
}
