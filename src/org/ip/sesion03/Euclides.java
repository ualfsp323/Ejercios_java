package org.ip.sesion03;

import java.util.Scanner;

public class Euclides {

	public static void main(String[] args) {
		int x = 0;
		int y =0;
	    int r;
		Scanner imput = new Scanner(System.in);		
	
		
//		Este bucle do-while, es pra que el usuario solamente ponga un valor positivo y no negativo
		do {
			System.out.println("Introduzca un valor positivo : ");
			x = imput.nextInt();
		}while (x < 0 );
		
		do {
			System.out.println("Introduzca otro valor positivo : ");
			y = imput.nextInt();
		}while (y < 0 );
		        
		 
        while (x%y != 0) { 
      
            r = x;
            x=y;
            y=r%y;
            
        }
        
		System.out.println("el mcd es : " +y);
	imput.close();

	}

}
