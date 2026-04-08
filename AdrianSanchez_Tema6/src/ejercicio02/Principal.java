package ejercicio02;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  double celsius = 0;
	        boolean valido = false;

	        do {
	            try {
	                System.out.print("Introduce la temperatura en grados Celsius: ");
	                celsius = Leer.datoDouble();

	                if (celsius < -273) {
	                    throw new IllegalArgumentException("No puede haber temperaturas menores a -273 ºC");
	                }

	                valido = true; 
	            } catch (IllegalArgumentException e) {
	                System.out.println(e.getMessage());
	            }

	        } while (!valido);

	        double fahrenheit = celsius * 9.0 / 5.0 + 32;

	        System.out.println("La temperatura en Fahrenheit es: " + fahrenheit);
	    }
	}

