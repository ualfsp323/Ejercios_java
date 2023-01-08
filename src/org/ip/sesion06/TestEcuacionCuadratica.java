package org.ip.sesion06;

import java.util.Locale;
import java.util.Scanner;

public class TestEcuacionCuadratica {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		Scanner imput = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("Introduce los valores de los coeficiente de la ecuacion cuadratica; ax*x+b*x+c=0");
		a = imput.nextDouble();
		b = imput.nextDouble();
		c = imput.nextDouble();
		EcuacionCuadratica Eu1 = new EcuacionCuadratica();
		Eu1.setA(a);
		Eu1.setB(b);
		Eu1.setC(c);
		System.out.println("Ecuacion Cuadratica : " + Eu1.toString());
		if ((a == 0)) {

			System.out.println("No es una ecuacion cuadratica");
		}else {
			if (Eu1.getDiscriminante() >= 0) {
				if (Eu1.getDiscriminante() == 0) {
					
					System.out.println("Ecuacion Cuadratica con una unica raiz double");
					System.out.println("x= " + Eu1.getRaiz2());

				} else {

					System.out.println("Ecuacion Cuadratica con dos raizes de valores");
					System.out.println("x1= " + Eu1.getRaiz1());
					System.out.println("x2= " + Eu1.getRaiz2());
				}
			} else {

				System.out.println("Ecuacion Cuadratica sin raices reales ");

			}
		}

	}

}
