package utn;

public class Ejercicio2 {
	public static void main(String[] args) {
		double ingresos = 489.083;
		int vehiculos = 3;
		int NInmuebles = 900;
		int BienDeLujo=3;
		
		if ( (ingresos < 489.083) &&
		( vehiculos <= 30) &&
		( NInmuebles <= 30) &&
		(BienDeLujo <= 3330) ) {
		System.out.println("Categoría i");
		} else if((ingresos < 1112459.83 ) &&
				( vehiculos <= 30) &&		
				(NInmuebles <= 45) &&
				(BienDeLujo <= 5000) ) {
				System.out.println("Categoría ii");		
		} else if((ingresos <= 1112459.83) &&
				(vehiculos <= 45) &&
				( NInmuebles <= 30) &&
				(BienDeLujo <= 5000) ) {
				System.out.println("Categoría iii");
		
		
		}
	}
}
