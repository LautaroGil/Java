package carro;

public class Calculadora {
	public static void main(String args[]) { 
		// Prueba unitaria 
		System.out.println(multiplicar(80,3)); 
		// Prueba integracion 
		System.out.println(dividir(sumar(150,180),3)); 
		System.out.println(multiplicar(restar(90,50),15));
		System.out.println(multiplicar(sumar(70,40),25)); 
	} 
	public static double sumar(double unNumero, double otroNumero) {
		 return unNumero + otroNumero; 
	} 
	public static double restar(double unNumero, double otroNumero) {
		 return unNumero - otroNumero; 
	} 
	public static double multiplicar(double unNumero, double otroNumero) {
		 return unNumero * otroNumero; 
	}
	public static double dividir(double unNumero, double otroNumero){
		 return unNumero / otroNumero; 
	} 
}// fin clase

