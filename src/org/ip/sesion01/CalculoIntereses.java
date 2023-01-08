package org.ip.sesion01;

/* Importo esta libreria para poder usar el comando Decimal Format*/
import java.text.DecimalFormat;

public class CalculoIntereses {

	public static void main(String[] args) {
		double Ingreso = 2500.00;
		double Interes_anual = 1.75*Math.pow(10, -2);
		double Interes_6meses = ((Ingreso * Interes_anual)/12*6);
		double rentencion = Interes_6meses * (21*Math.pow(10, -2)) ;
		double Intereses_cobrado = Interes_6meses - rentencion;
	    /*Uso este comando para poder expresar los numeros hasta tres decimales*/
		DecimalFormat deci = new DecimalFormat("#.00");
		System.out.println("*** Calculo de interseses ***");
		System.out.println("Dinero ingresado: "+ deci.format(Ingreso)+"$");
		System.out.println("Interes anual: 1,75%");
		System.out.println("Intereses a los 6 meses: "+deci.format(Interes_6meses)+"$");
		System.out.println("Retencion realizada: "+deci.format(rentencion)+"$");
		System.out.println("Intereses cobrados: "+deci.format(Intereses_cobrado)+"$");		 
		
		
	}

}

