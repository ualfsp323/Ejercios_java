package org.ip.sesion06;

import java.util.Locale;
import java.util.Scanner;

public class TestCirculo {

	public static void main(String[] args) {
		double xcirculo;
		double ycirculo;
		double radio;
		Circulo circ1 = new Circulo(1.0, 1.0, 1.0);
		Circulo circ2 = new Circulo();
		Circulo circ3 = new Circulo(0.0, 0.0);
		Circulo circ4 = new Circulo(circ2);
		Scanner imput = new Scanner(System.in).useLocale(Locale.US);					
		System.out.println("Circulo 1 ==> " + circ1.toString());
		System.out.println("Circulo 2 ==> " + circ2.toString());
		System.out.println("Circulo 3 ==> " + circ3.toString());
		System.out.println("Circulo 4 ==> " + circ4.toString());
	    if (circ1.equals(circ2))
		System.out.println("Mismos circulos 1 y 2");
	    else
		System.out.println("Distintos circulos 1 y 2");
		if (circ2.equals(circ3) && (circ3.equals(circ4)) && (circ4.equals(circ2)) )
			System.out.println("Circulos 2 , 3 y 4 son igules");
		else
			System.out.println("Circulos 2 , 3 y 4 no son igules");
		System.out.println("El numero de Circulo creados es "+ Circulo.getnumCirculos());
		
		if (circ1.compareTo(circ2) == 0)
			System.out.println("Circulo 1 y 2 tiene igual area");
		else if (circ1.compareTo(circ2) == -1)
			System.out.println("Circulo 1 tiene menor area que el Circulo 2");
		else
			System.out.println("Circulo 1 tiene mayor area que el Circulo 2");
		System.out.println("Indica las coordenadas del punto P (x,y) centro de un nuevo circulo ");
		xcirculo = imput.nextDouble();
		ycirculo = imput.nextDouble();
		System.out.println("Intoduzca el radio para el nuevo circulo ");
		radio = imput.nextDouble();
		Circulo circ5 = new Circulo();
		circ5.setXCirculo(xcirculo);
		circ5.setYCirculo(ycirculo);
		circ5.setRadio(radio);
		System.out.println("Circulo 5 ==> " + circ5.toString());
		System.out.println("Circulo 5 ==> [<area>=" + circ5.calcularArea()+", <diametro>="+circ5.calcularDiametro()+", <longitud>="+circ5.calcularLongitud()+"]");
		System.out.println("El numero de Circulo creados es "+ Circulo.getnumCirculos());

	}

}
