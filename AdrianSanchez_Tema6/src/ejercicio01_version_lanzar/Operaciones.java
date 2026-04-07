package ejercicio01_version_lanzar;

public class Operaciones {
			
		public static double sumar(double a, double b) {
	        return a + b;
	    }

	    public static double restar(double a, double b) {
	        return a - b;
	    }

	    public static double multiplicar(double a, double b) {
	        return a * b;
	    }


	    public static boolean esPar(int num) {
	        return num % 2 == 0;
	    }
	
	
	public double dividir (int num,int den) {
		if (den==0) {
			throw new ArithmeticException("Denominador igual a cero");
		}
		return num/den;
	}


	
}
