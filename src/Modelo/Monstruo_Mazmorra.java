package Modelo;

/**
 * @author user
 *
 */
public class Monstruo_Mazmorra {

	private int idMonstruo;
	private int idMazmorra;
	
	public Monstruo_Mazmorra(int idMonstruo, int idMazmorra) {
		super();
		this.idMonstruo = idMonstruo;
		this.idMazmorra = idMazmorra;
	}

	public Monstruo_Mazmorra() {
		super();
	}

	public int getIdMonstruo() {
		return idMonstruo;
	}

	public void setIdMonstruo(int idMonstruo) {
		this.idMonstruo = idMonstruo;
	}

	public int getIdMazmorra() {
		return idMazmorra;
	}

	public void setIdMazmorra(int idMazmorra) {
		this.idMazmorra = idMazmorra;
	}

	@Override
	public String toString() {
		return "Monstruo_Mazmorra [idMonstruo=" + idMonstruo + ", idMazmorra=" + idMazmorra + "]";
	}
	
	
	
}
