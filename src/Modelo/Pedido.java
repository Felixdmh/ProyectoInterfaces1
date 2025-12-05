package Modelo;

public class Pedido {

	private int idPedido;
	private String fechaPedido;
	private String horaPedido;
	private double totalPedido;
	private int idUsuario;
	
	public Pedido(int idPedido, String fechaPedido, String horaPedido, double totalPedido, int idUsuario) {
		this.idPedido = idPedido;
		this.fechaPedido = fechaPedido;
		this.horaPedido = horaPedido;
		this.totalPedido = totalPedido;
		this.idUsuario = idUsuario;
		
		
	}
	public int getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	public String getFechaPedido() {
		return fechaPedido;
	}
	public void setFechaPedido(String fechaPedido) {
		this.fechaPedido = fechaPedido;
	}
	public String getHoraPedido() {
		return horaPedido;
	}
	public void setHoraPedido(String horaPedido) {
		this.horaPedido = horaPedido;
	}
	public double getTotalPedido() {
		return totalPedido;
	}
	public void setTotalPedido(double totalPedido) {
		this.totalPedido = totalPedido;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	
}
