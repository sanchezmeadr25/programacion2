 package lambda;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Hacemos los lambdas cuando se haga lo mismo con menos cogido usandolos
		/*Creamos una interfaz funcional*/
		@FunctionalInterface
		interface Calculadora{
			int sumar(int a , int b);
		}
		
		//Creamos un lambda, no hace falta que se indique el tipo de los parámetros
		Calculadora sumarV1 = (a,b) -> {
			return (a+b);
		};
		
		//Otra manera de crear lambdas
		//Calculadora sumarV2 = (a,b) -> a+b o (a+b);
		
		System.out.println(sumarV1.sumar(5, 5));
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
