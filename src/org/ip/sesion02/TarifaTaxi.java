package org.ip.sesion02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TarifaTaxi {

	public static void main(String[] args) {
		/*Ponga los siguientes datos para comprobar la actividad*/
		/*20 --> primer if
		 *35 --> segundo if
		 *101 --> else 
		 * */
		double fijo = 18;
		double tarifa1= 0.85;
		double tarifa2= 0.65;
		double importe;
		int km;
	    DecimalFormat dos_deci = new DecimalFormat("#.00");
		Scanner imput = new Scanner(System.in);				
    	System.out.println("Introduzca los Kilometros que quiera viajar: ");
		km = imput.nextInt();
		if (km <= 30) {
			importe = fijo;
		} else if (km <= 100) {
			importe = fijo + (km - 30) * tarifa1;
		} else {
			importe = fijo + 70 * tarifa2  + (km - 100) * tarifa2;
		}
		System.out.println();
		System.out.println("CALCULO TARIFA TAXI");
		System.out.println();
		System.out.println("Kilometros recorridos => " + km);
		System.out.println("El importe total a pagar es "+ dos_deci.format(importe)+" euros");
		imput.close();
	}

}
