package org.ip.sesion03;

import java.util.Scanner;

public class TrianguloRectanguloNumeros {

	public static void main(String[] args) {
		    int num = 0 ;
	       Scanner imput=new Scanner(System.in);
	  
			do {
				System.out.println("Introduzca un numero (del 0 al 10) : ");
				 num = imput.nextInt();
			}while (num < 0 || num > 10);	
	    	   for (int z = 0; z <num; z++) {
	                
	                for(int j=0;j <= num-z -1;j++){
		                System.out.print("  ");
		            }
	                for(int j=0;j<= z; j++){ 
			            
							System.out.print(z-j+" ");
			            }
	                
	                System.out.println();
				}
		
	 imput.close();      
	}
 
}
