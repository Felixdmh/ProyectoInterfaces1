package Modelo;

public class Complemento {

	private int idComplemento;
	private String nombre;
	private double precio;
	
	public Complemento(int idComplemento, String nombre, double precio) {
		super();
		this.idComplemento = idComplemento;
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public int getIdComplemento() {
		return idComplemento;
	}
	public void setIdComplemento(int idComplemento) {
		this.idComplemento = idComplemento;
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
	
	@Override
	public String toString() {
		return nombre;
	}
	
}
