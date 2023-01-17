package org.ip.sesion07;

import java.util.Scanner;

public class TestFraccion {

	public static void main(String[] args) {
		int num;
		int dem;
		int n=0;
		int numero=0;

		Scanner imput = new Scanner(System.in);

		System.out.println("Cuantas comparaciones desea hacer? ");
        n=imput.nextInt();
		while (numero < n ) {
			numero++;
		
		System.out.println("Comparacion "+numero);
		System.out.println("Introduce el numerador y denominador de la primera fraccion: ");
		num = imput.nextInt();
		dem = imput.nextInt();
		Fraccion frac1 = new Fraccion();
		frac1.setNumerador(num);
		frac1.setDenumerador(dem);

		System.out.println("Introduce el numerador y denominador de la segunda fraccion: ");
		num = imput.nextInt();
		dem = imput.nextInt();
		Fraccion frac2 = new Fraccion();
		frac2.setNumerador(num);
		frac2.setDenumerador(dem);
		if (frac1.compareTo(frac2) == 0)
			System.out.println(frac1.toString()+" es igual que "+ frac2.toString());
		else if (frac1.compareTo(frac2) == -1)
			System.out.println(frac1.toString()+" es menor que "+ frac2.toString());
		else
			System.out.println(frac1.toString()+" es mayor que "+ frac2.toString());
		System.out.println(" ");
		}
	}

}
