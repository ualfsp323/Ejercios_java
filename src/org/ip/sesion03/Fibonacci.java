package org.ip.sesion03;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {		
		try (Scanner imput = new Scanner(System.in)) {
			int i;
			int x = 0;
			int y = 1;
			int suma = 1;
			int secuencia = 0;
			System.out.println("Hata que frecuencia de Fibonacci quiere ver? :");
			secuencia = imput.nextInt();	

			if (secuencia >=2) {
				System.out.print("0 ");

				    for ( i = 1;  i <= secuencia; i++) {    		        
				    	System.out.print(suma+" ");

				    	suma = x + y;
				    	x = y;
				    	y = suma;
				}
			} else if (secuencia == 1){
				System.out.println("0 1");

			} else {
				System.out.println("0");
			}
   
imput.close();
		}
		
	}

}
