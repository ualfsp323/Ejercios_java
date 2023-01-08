package org.ip.sesion02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EcuacionSegundoGrado {

	public static void main(String[] args) {
		   double a, b,c;
		   DecimalFormat dos_deci = new DecimalFormat("#.00");

			Scanner imput = new Scanner(System.in);				
	    	System.out.println("Introduzca los datos para a: ");
			a = imput.nextDouble();

			System.out.println("Introduzca los datos para b: ");
			b = imput.nextDouble();
		    
			System.out.println("Introduzca los datos para c: ");
			c = imput.nextDouble();
	    	System.out.println("");
   		    
		    if ((a == 0) && (b == 0)) {
		     /*Ecuacion de primer grado*/
		    	
		         System.out.println("Solucion de una ecuacion de segundo grado.");
		         System.out.println("");
		         System.out.println("a = "+a+" b = "+b+" c = "+c);
	             System.out.println("La ecuacion no es de segundo grado ");

		    }else if ((a != 0) && (b != 0) && (c == 0)) {
			  /*Ecuacion de una sola raiz*/
		    	
			      System.out.println("Solucion de una ecuacion de segundo grado.");
			      System.out.println("");
			      System.out.println("a = "+a+" b = "+b+" c = "+c);
			      System.out.println("");
			      System.out.println("La ecuacion solamente tiene un raiz");
			      System.out.println("x1 = " + dos_deci.format(-b / a));
			      
		    }else if ((a == 0) && (b != 0) && (c != 0)) {
				/*Ecuacion de una sola raiz doble*/

			      System.out.println("Solucion de una ecuacion de segundo grado.");
			      System.out.println("");
			      System.out.println("a = "+a+" b = "+b+" c = "+c);
			      System.out.println("");
			      System.out.println("La ecuacion solamente tiene un raiz doble");
		          System.out.println("x1 = x2 = " + dos_deci.format(-c / b));
		          
		    }else if ((a != 0) && (b != 0) && (c != 0)) {
				/*Ecuacion de segundo grado*/

		      double discriminante = b*b - (4 * a * c);
		      
		      if (discriminante < 0) {
		    	 /*Si sale menor que 0 no se podra hacer su raiz, por ende, no tiene solucion real*/
		    	   System.out.println("Solucion de una ecuacion de segundo grado.");
			       System.out.println("");
			       System.out.println("a = "+a+" b = "+b+" c = "+c);
		    	   System.out.println("La ecuacion no tiene soluciones reales");
		          
		      }  else {
		    	  double x1 = (-b + Math.sqrt(discriminante))/(2 * a);
		    	  double x2 = (-b - Math.sqrt(discriminante))/(2 * a);

		    	   System.out.println("Solucion de una ecuacion de segundo grado.");
				   System.out.println("");
				   System.out.println("a = "+a+" b = "+b+" c = "+c);
				   System.out.println("");
				   System.out.println("La ecuacion  tiene dos raizes");
		           System.out.printf("x1 = %.4f ", x1);
		           System.out.print("\n");
		           System.out.printf("x2 = %.4f ", x2);
		      }
		    }
     imput.close();
	}

}
