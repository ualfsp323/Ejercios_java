package org.ip.sesion03;

import java.util.Scanner;

public class CuadradoAsteriscos {

	public static void main(String[] args) {
		   int l = 0 ;
	       Scanner imput=new Scanner(System.in);
	  
			do {
				System.out.println("Introduzca un numero de lado (del 0 al 30) : ");
				 l = imput.nextInt();
			}while (l < 0 || l > 30);	
			
			
			System.out.println("Cuadrado de asteristicos de "+l+" lados");
            System.out.println("");
		 for(int i=0;i < l;i++){
	            for(int j=1;j <=l- i;j++){
	                System.out.print(" * ");
	               
	            }
	            
	            for(int k=1;k<=i; k++){ 
	            
					System.out.print(" * ");
	            }

	            System.out.println();
	        }
		 imput.close();
	}

}
