package Modelo;

public class Monstruo {

	private int id;
	private String nombre;
	private String tipo;
	private int hp;
	private int atq;
	private int def;
	
	
	public Monstruo(int id, String nombre, String tipo, int hp, int atq, int def) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.hp = hp;
		this.atq = atq;
		this.def = def;
	}

	public Monstruo() {
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtq() {
		return atq;
	}

	public void setAtq(int atq) {
		this.atq = atq;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	@Override
	public String toString() {
		return "Monstruo [id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + ", hp=" + hp + ", atq=" + atq + ", def="
				+ def + "]";
	}
	
	
	
}
