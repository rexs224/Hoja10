package Modelo;

public class Mazmorra {

	private int id;
	private String nombre;
	
	public Mazmorra(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	public Mazmorra() {
		super();
	}

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

	@Override
	public String toString() {
		return "Mazmorra [id=" + id + ", nombre=" + nombre + "]";
	}
	
	
	
	
}
