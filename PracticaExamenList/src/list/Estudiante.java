package list;

public class Estudiante {
	private int id;
	private String nombre;
	private String curso;
	private double notaMedia;
	
	//Constructores
	public Estudiante(int id, String nombre, String curso, double notaMedia) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.curso = curso;
		this.notaMedia = notaMedia;
	}


	public Estudiante() {
		super();
	}


	//Getters and Setters
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCurso() {
		return curso;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}


	public double getNotaMedia() {
		return notaMedia;
	}


	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}


	//To String 
	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", nombre=" + nombre + ", curso=" + curso + ", notaMedia=" + notaMedia + "]";
	}
	
	
	

}
