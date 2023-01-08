package org.ip.sesion03;

import java.util.Scanner;

public class Primo {

	public static void main(String[] args) {
			int dato = 0;
			int divisor = 0;
			boolean primo = true;
		    Scanner imput=new Scanner(System.in);
		    
		    do {
			System.out.println("Introduzca un numero (>1) para saber que es primo: ");
			dato = imput.nextInt();		
		
		 
				for (divisor = 2; divisor < dato; divisor++) {
					
						if (dato % divisor == 0) {
							primo = false;
							break;
						}
						if (dato % divisor > 0) {
							
							primo = true;
							divisor = dato;
						}
				
				} 
				
		    }while (primo != true );
		    
		    
			if (primo) {
				System.out.println("Es numero es primo");
			}
		 
	}

}
