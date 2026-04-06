package ejercicio;

public class Palabra {

	private int id;
	private String name;
	private String significado;
	
	//Constructores
	
	public Palabra(int id, String name, String significado) {
		super();
		this.id = id;
		this.name = name;
		this.significado = significado;
	}
	
	public Palabra() {
		super();
	}

	//Getters and Setters
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSignificado() {
		return significado;
	}
	public void setSignificado(String significado) {
		this.significado = significado;
	}

	
	//To String
	@Override
	public String toString() {
		return "Palabra [id=" + id + ", name=" + name + ", significado=" + significado + "]";
	}
	
	
	
}
