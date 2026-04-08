package ejercicio03;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,c ;
		
		 System.out.print("Introduce a: ");
	         a = Leer.datoDouble();

	        System.out.print("Introduce b: ");
	         b = Leer.datoDouble();

	        System.out.print("Introduce c: ");
	        c = Leer.datoDouble();

	        CEcuacion2Grado ecuacion = new CEcuacion2Grado(a, b, c);

	        try {
	            ecuacion.resolver();
	        } catch (EcuacionDegeneradaException e) {
	            System.out.println(e.getMessage());
	        } catch (RaicesComplejasException e) {
	            System.out.println(e.getMessage());
	        }
	   
	}

}
