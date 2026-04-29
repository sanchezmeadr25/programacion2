package depurar;

public class EsPrimo {

	public static void main(String[] args) {

		System.out.println("Test de primalidad");
		System.out.println("Nº 3: %s".formatted(esPrimo(3)));
		System.out.println("Nº 4: %s".formatted(esPrimo(4)));
		System.out.println("Nº 6: %s".formatted(esPrimo(6)));
		System.out.println("Nº 9: %s".formatted(esPrimo(9)));
		System.out.println("Nº 90: %s".formatted(esPrimo(90)));

	}

	static // TODO Auto-generated method stub
	boolean esPrimo(int n) {
		boolean result = true;
		for (int i = 2; i < Math.sqrt(n); i++) {
			if ((n % i) == 0)
				result = false;
		}
		return result;
	}
}
