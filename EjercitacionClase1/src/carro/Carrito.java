package carro;

import java.time.LocalDate;

public class Carrito {
	//Propiedades
	private ItemCarrito compra1;
	private ItemCarrito compra2;
	private ItemCarrito compra3;
	private double precioTotal;
	private LocalDate fechaCompra;
	
	//Constructores
	public Carrito() {		
		this.precioTotal=0;
		this.fechaCompra=LocalDate.now();
	}
	
	//Getters
	public ItemCarrito getCompra1() {
		return compra1;
	}
	public ItemCarrito getCompra2() {
		return compra2;
	}
	public ItemCarrito getCompra3() {
		return compra3;
	}
	public double getPrecioTotal() {
		return precioTotal;
	}
	public LocalDate getFechaCompra() {
		return fechaCompra;
	}

	
	//Setters
	public void setCompra1(ItemCarrito compra1) {
		this.compra1 = compra1;
	}
	public void setCompra2(ItemCarrito compra2) {
		this.compra2 = compra2;
	}
	public void setCompra3(ItemCarrito compra3) {
		this.compra3 = compra3;
	}
	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}
	public void setFechaCompra(LocalDate fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	//Metodos
	//Multiplicar precio unitario*cantidad y a eso sumarlo con lo demás en precioTotal
	public double carritoPrecio() {
		double precioItem1=compra1.getPrecioUnitario()*compra1.getCantidad();
		return 0;
	}
}
