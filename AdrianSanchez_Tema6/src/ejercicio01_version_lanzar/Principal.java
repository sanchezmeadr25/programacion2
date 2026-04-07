package ejercicio01_version_lanzar;

public class Principal {

	public static void main(String[] args) {
		Operaciones op = new Operaciones ();
		try {
			op.dividir(12, 0);
		} catch (ArithmeticException ar) {
			System.out.println(ar.getMessage());
		}catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}

	}

}
