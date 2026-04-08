package ejercicio04;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int a = 7;
	       int b = 6;   

	        try {
	            int suma = a + b;

	            if (suma > 10) {
	                throw new SumaMayorQueDiezException("La suma no puede ser mayor que 10");
	            }

	            System.out.println("La suma es: " + suma);

	        } catch (SumaMayorQueDiezException e) {
	            System.out.println(e.getMessage());
	        }
	}

}
