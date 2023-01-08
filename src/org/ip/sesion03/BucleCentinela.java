package org.ip.sesion03;

import java.util.Scanner;

public class BucleCentinela {

	public static void main(String[] args) {
		Scanner imput = new Scanner(System.in);				
		int numero = -1;
		int n_positivo = 0;
		int n_negativo = 0;
		int total = 0;
		int suma_positivo = 0;
		int suma_negativo = 0;
		int suma_general = 0;
		double media = 0.0;

		System.out.println("Introduzca un numero: ");
		
		while (numero != 0 ) {
		numero = imput.nextInt();	
			if (numero  > 0) {
				n_positivo++;
				suma_positivo+=numero;
			}
			if (numero  < 0) {
				n_negativo++;
				suma_negativo+=numero;

				}
			if (numero != 0 ) {
		    total++;
	        }
			suma_general+=numero;
			
     }
		media = suma_general/total;
		System.out.println("Hay: "+ n_positivo+ " positivos");
		System.out.println("Hay: "+ n_negativo+ " negativos");
		System.out.println("El numero total de los valores leidos es "+ total);
		System.out.println("La suma de los positivos: "+ suma_positivo);
		System.out.println("La suma de los negativos: "+ suma_negativo);
		System.out.printf("La media es: "+ media);

imput.close();
 }
}
