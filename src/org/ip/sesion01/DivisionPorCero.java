package org.ip.sesion01;

public class DivisionPorCero {

	public static void main(String[] args) {		
		System.out.println();
		System.out.println("Ejemplo de Divisiones por cero con enteros y reales");
		System.out.print("\n");
		System.out.println("17.0 / 0.0 = " + (17.0 / 0.0)); /* infinity */
		System.out.println("17.0 % 0.0 = " + (17.0 % 0.0)); /* no es un numero */
		System.out.println("17.0 / 0 = "); /* Error */
		System.out.println( 17 / 0); /* Error */
		
	}

}
