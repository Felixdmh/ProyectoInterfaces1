package Modelo;

public class Comida {
	
	private int idComida;
	private String nombre;
	private double precio;
	private String pan;
	private String carne;
	private String queso;
	private String extra;
	private int color;
	
	public Comida(int idComida, String nombre, int color, double precio, String pan, String carne, String queso,
			String extra) {
		super();
		this.idComida = idComida;
		this.nombre = nombre;
		this.precio = precio;
		this.pan = pan;
		this.carne = carne;
		this.queso = queso;
		this.extra = extra;
		this.color = color;
	}
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		this.color = color;
	}
	
	public int getIdComida() {
		return idComida;
	}
	public void setIdComida(int idComida) {
		this.idComida = idComida;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getCarne() {
		return carne;
	}
	public void setCarne(String carne) {
		this.carne = carne;
	}
	public String getQueso() {
		return queso;
	}
	public void setQueso(String queso) {
		this.queso = queso;
	}
	public String getExtra() {
		return extra;
	}
	public void setExtra(String extra) {
		this.extra = extra;
	}

	@Override
	public String toString() {
		return nombre;
	}
		
	
	
	

}
