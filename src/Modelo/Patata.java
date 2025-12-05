package Modelo;

public class Patata {
	
	private int idPatata;
	private String nombre;
	private double precio;
	
	public Patata(int idPatata, String nombre, double precio) {
		super();
		this.idPatata = idPatata;
		this.nombre = nombre;
		this.precio = precio;
	}
	public int getIdPatata() {
		return idPatata;
	}
	public void setIdPatata(int idPatata) {
		this.idPatata = idPatata;
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
