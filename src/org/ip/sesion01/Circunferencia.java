package org.ip.sesion01;

public class Circunferencia {

	public static void main(String[] args) {		
		 
		  double radio = 40.50;
		  double diametro = 2 * radio;;
	      double longitud= 2 * Math.PI * radio;;
		  double area = Math.PI * Math.pow(radio, 2.0);;
		 		  		 
		  System.out.println("El radio es = "+ radio );
		  System.out.println();
		  System.out.printf("El diametro de la circunferencia es = %.2f ", diametro);
		  System.out.println();
		  System.out.printf("Longitud de la circunferencia = %.4f ", longitud);
		  System.out.println();
		  System.out.printf("Area de la circunferencia = %.4f ", area);

	}

}
