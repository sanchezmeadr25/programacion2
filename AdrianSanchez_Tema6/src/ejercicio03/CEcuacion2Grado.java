package ejercicio03;

public class CEcuacion2Grado {
	 private double a, b, c;

	    public CEcuacion2Grado(double a, double b, double c) {
	        this.a = a;
	        this.b = b;
	        this.c = c;
	    }

	    public void resolver() throws EcuacionDegeneradaException, RaicesComplejasException {

	     
	        if (a == 0 && b == 0) {
	            throw new EcuacionDegeneradaException("La ecuación es degenerada (a = 0 y b = 0).");
	        }

	       
	        if (a == 0 && b != 0) {
	            double x = -c / b;
	            System.out.println("La ecuación tiene una única raíz: x = " + x);
	            return;
	        }

	     
	        double discriminante = Math.pow(b, 2) - 4 * a * c;

	        if (discriminante < 0) {
	            throw new RaicesComplejasException("Las raíces son complejas (discriminante < 0).");
	        }

	        double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
	        double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);

	        System.out.println("Raíz 1: " + x1);
	        System.out.println("Raíz 2: " + x2);
	    }
}
