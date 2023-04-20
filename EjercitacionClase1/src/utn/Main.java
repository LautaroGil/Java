package utn;

import carro.ItemCarrito;

class Main {
	public static void main(String[] args) {
		
		Producto prod1=new Producto();
		prod1.setPrecio(100.54);
		prod1.setNombre("Alfajor Jorgito");
		ItemCarrito item1ro= new ItemCarrito(prod1,1);
		System.out.println(item1ro.getPrecioUnitario());
	}


}		


