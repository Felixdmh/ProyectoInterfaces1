package Modelo;

public class Usuarios {

	private String nombre;
	private String contraseña;
	private int idUsuario;
	
	public Usuarios(String nombre, String contraseña, int idUsuario) {
		super();
		this.nombre = nombre;
		this.contraseña = contraseña;
		this.idUsuario = idUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	
	
	
}
