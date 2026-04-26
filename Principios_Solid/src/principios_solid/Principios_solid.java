package principios_solid;

public class Principios_solid {
	//  1. S - Single Responsibility Principle (SRP) 
	// Una clase debe tener una sola razón para cambiar.
	class Factura {
	    public void calcularTotal() { }
	}

	class FacturaRepositorio {
	    public void guardar(Factura factura) {  }
	}

	class ServicioEmailFactura {
	    public void enviar(Factura factura) {  }
	}


	//  2. O - Open/Closed Principle (OCP) 
	// Abierto a extensión, cerrado a modificación.
	interface Descuento {
	    double aplicar(double precio); 
	}

	class DescuentoNavidad implements Descuento {
	    public double aplicar(double precio) { return precio * 0.9; }
	}

	class DescuentoBlackFriday implements Descuento {
	    public double aplicar(double precio) { return precio * 0.8; } 
	}

	class ServicioDescuento {
	    public double aplicar(Descuento descuento, double precio) {
	        return descuento.aplicar(precio); 
	    }
	}


	//  3. L - Liskov Substitution Principle (LSP) 
	// Las subclases deben poder reemplazar a las clases padre sin romper el programa.
	interface Vehiculo {
	    void acelerar();
	}

	class Coche implements Vehiculo {
	    public void acelerar() { System.out.println("Coche acelerando"); }
	}

	class Moto implements Vehiculo {
	    public void acelerar() { System.out.println("Moto acelerando"); } 
	}


	// 4. I - Interface Segregation Principle (ISP) 
	// Interfaces pequeñas y específicas, no gigantes.
	interface Trabajable {
	    void trabajar();
	}

	interface Comible {
	    void comer();
	}

	class Humano implements Trabajable, Comible {
	    public void trabajar() { System.out.println("Humano trabajando"); }
	    public void comer() { System.out.println("Humano comiendo"); } 
	}

	class Robot implements Trabajable {
	    public void trabajar() { System.out.println("Robot trabajando"); } 
	}


	// 5. D - Dependency Inversion Principle (DIP) 
	// Depende de abstracciones, no de implementaciones concretas.
	interface EnviadorMensaje {
	    void enviar(String mensaje);
	}

	class EmailSender implements EnviadorMensaje {
	    public void enviar(String mensaje) { System.out.println("Email: " + mensaje); } 
	}

	class SmsSender implements EnviadorMensaje {
	    public void enviar(String mensaje) { System.out.println("SMS: " + mensaje); } 
	}

	class ServicioNotificacion {
	    private final EnviadorMensaje enviador; 

	    public ServicioNotificacion(EnviadorMensaje enviador) {
	        this.enviador = enviador;
	    }

	    public void enviar(String mensaje) {
	        enviador.enviar(mensaje); 
	    }
	}

}

