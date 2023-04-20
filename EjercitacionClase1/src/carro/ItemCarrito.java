package carro;

import utn.Producto;

public class ItemCarrito {
	//Propiedades
	private Producto productoComprado;
	private double cantidad;
	private double precioUnitario;
	
	//Constructores
	public ItemCarrito(Producto prod,double cantidad) {
		this.productoComprado = prod;
		this.cantidad=cantidad;
		this.precioUnitario=this.productoComprado.getPrecio();
	}
	public ItemCarrito() {
		this.productoComprado=null;
		this.cantidad=0;
	}
	
	//Getters
	public Producto getProductoComprado() {
		return productoComprado;
	}
	public double getCantidad() {
		return cantidad;
	}
	public double getPrecioUnitario() {
		return precioUnitario;
	}
	
	//Setters
	public void setProductoComprado(Producto productoComprado) {
		this.productoComprado = productoComprado;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	
	//Metodos
	public void aplicarDescuento(int porcentaje) {
		this.precioUnitario= this.precioUnitario*(100-porcentaje);
	}
}
