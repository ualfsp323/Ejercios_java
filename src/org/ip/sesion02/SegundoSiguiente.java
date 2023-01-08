package org.ip.sesion02;

import java.util.Scanner;

public class SegundoSiguiente {

	public static void main(String[] args) {
		   int s, m,h;
			Scanner imput = new Scanner(System.in);				
			  System.out.println("Introduzca una hora ");
			  h = imput.nextInt();
			  
			  System.out.println("Introduzca un minuto ");
			  m = imput.nextInt();
			  
			  System.out.println("Introduzca un segundo ");
			  s = imput.nextInt();
				
		      String hora = h+":"+m+":"+s;
		      System.out.println("La hora que pusiste es: "+hora);
s++;
hora = h+":"+m+":"+s;

			  if ( s > 59) {
				 s = 00;
					m++;
			          hora = h+":"+m+":"+s;

                        if (m > 59)  {
                        	 
					      m = 00;
				          h++;
				          hora = h+":"+m+":"+s;
				            if (h == 24)  {
					        	h = 00;
					        hora = h+":"+m+":"+s;

					   }
				    } 
				} 
	System.out.println("La hora que pusiste un segundo despues: "+hora);  
	}

}
