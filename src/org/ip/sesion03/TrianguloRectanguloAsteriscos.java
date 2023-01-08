package org.ip.sesion03;

import java.util.Scanner;

public class TrianguloRectanguloAsteriscos {

	public static void main(String[] args) {
	    int l = 0 ;
	       Scanner imput=new Scanner(System.in);
	  
			do {
				System.out.println("Introduzca un numero (del 3 al 15) : ");
				 l = imput.nextInt();
			}while (l < 3 || l > 15);	
	    	  
			System.out.println("Triangulos de asteristicos de "+l+" lados");
            System.out.println("");
	        
	        for(int i=0;i < l;i++){
	            for(int j=1;j <=l- i;j++){
	                System.out.print(" * ");
	               
	            }
	            

	            System.out.println();
	        }
	       imput.close();
	}

}
