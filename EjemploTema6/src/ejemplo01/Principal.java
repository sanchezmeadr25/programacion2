package ejemplo01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, den, solucion = 0, tam = 3, indice;
		int op = 0;
		int[] lista = new int[tam];
		do {

			try {

				System.out.println("Diga cuanto vale el numerador");
				num = Leer.datoInt();

				System.out.println("Diga cuanto vale el denominador");
				den = Leer.datoInt();

				solucion = num / den;
				System.out.println("El resultado de la división es:" + solucion);

				System.out.println("Ahora con arrays");
				System.out.println("Qué posición del array quieres ver");
				indice = Leer.datoInt();
				System.out.println(lista[indice - 1]);
				op = 1;
			} catch (NumberFormatException n) {
				System.out.println("Escriba el número sin letras ");
			} catch (ArithmeticException ar) {
				System.out.println("No se puede dividir entre 0");
			} catch (IndexOutOfBoundsException in) {
				System.out.println("Te has pasado del límite del arry");
			} catch (RuntimeException e) {
				System.out.println("Error inesperado");
			}

		} while (op != 0);
	}
}
