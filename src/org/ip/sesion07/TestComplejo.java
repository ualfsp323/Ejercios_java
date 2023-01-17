package org.ip.sesion07;

import java.util.Locale;
import java.util.Scanner;


public class TestComplejo {

	public static void main(String[] args) {
		double real;
		double imaginario;
		Scanner imput = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("PRIMER COMPLEJO");
		System.out.println("Introduce la parte real: ");
		real = imput.nextDouble();
		System.out.println("Introduce la parte imaginaria: ");
		imaginario = imput.nextDouble();
		Complejo complejo1 = new Complejo(1,1);
		complejo1.setReal(real);
		complejo1.setImaginario(imaginario);
		
		System.out.println("SEGUNDO COMPLEJO");
		System.out.println("Introduce la parte real: ");
		real = imput.nextDouble();
		System.out.println("Introduce la parte imaginaria: ");
		imaginario = imput.nextDouble();
		Complejo complejo2 = new Complejo(1,1);
		complejo2.setReal(real);
		complejo2.setImaginario(imaginario);
		Complejo complejo3 = new Complejo(complejo2);
		
		System.out.println("");
		System.out.println("LOS NUEMROS COMPLEJOS SON:");
		System.out.println("El primer numero complejo es : " + complejo1.toString());
		System.out.println("El segundo numero complejo es : " + complejo2.toString());
		System.out.println("El tercero numero complejo es : " + complejo3.toString());
		
        Complejo suma = complejo1.sumar(complejo2);
        Complejo resta = complejo1.restar(complejo2);
        Complejo multi = complejo1.multiplicar(complejo2);
        Complejo dividir = complejo1.dividir(complejo2);
        Complejo product = complejo1.Producto(2.5);
        Complejo modulo = complejo1.modulo();

		System.out.println("");
		System.out.println("LOS RESULTADOS DE LAS OPERACIONES");
		System.out.println("(" + complejo1.toString()+") + ("+ complejo2.toString()+") = "+suma.toString());
		System.out.println("(" + complejo1.toString()+") - ("+ complejo2.toString()+") = "+resta.toString());
		System.out.println("(" + complejo1.toString()+") * ("+ complejo2.toString()+") = "+multi.toString());
		System.out.println("(" + complejo1.toString()+") / ("+ complejo2.toString()+") = "+dividir.toString());
		System.out.println("2.5 * (" + complejo1.toString()+")  = "+product.toString());
		System.out.println("|" + complejo1.toString()+"| "+modulo.toString());
		System.out.println("Argumento (" + complejo1.toString()+") "+complejo1.argumento()+" radianes");
		
		if (complejo1.equals(complejo2)) {
			System.out.println("El primer complejo ES igual al segundo complejo");
		} else {
			System.out.println("El primer complejo NO ES igual al segundo complejo");
		}
		
		if (complejo2.equals(complejo3)) {
			System.out.println("El segundo complejo ES igual al tercer complejo");
		} else {
			System.out.println("El segundo complejo NO ES igual al tercero complejo");
		}
		
		complejo3.setReal(1);
		complejo3.setImaginario(-2);
		System.out.println("");
		System.out.println("El tercero numero complejo con nuevos valores es : " + complejo3.toString());
		System.out.println("Conjugado (" + complejo3.toString()+") = "+complejo3.conjugado());

	}

}
