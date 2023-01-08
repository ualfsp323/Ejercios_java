package org.ip.sesion02;

import java.util.Scanner;

public class DiaSemana {
/*		Para comprobar que funciana
 *      pon la fecha de hoy
 *      Ej: 19 10 2022
*/
	public static void main(String[] args) {
		int m,d,y;
		  Scanner imput = new Scanner(System.in);				
		  System.out.println("Introduzca un numero de dia ");
		  d = imput.nextInt();
		  
		  System.out.println("Introduzca un numero de mes ");
		  m = imput.nextInt();
		  
		  System.out.println("Introduzca un numero de anio ");
		  y = imput.nextInt();
		  String fecha = d+"/"+m+"/"+y;
		  System.out.println("");
      	  System.out.println( "El dia de la semana de la fecha "+fecha+" es: " );

		  int y0 = y - (14-m)/12;
		  int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		  int m0 = m + 12 * ((14 - m) / 12) - 2;
		  int d0 = (d + x + (31 * m0) / 12) % 7;
		 
		  if (m >= 1 && m <= 12) {
			  switch ( m ){
			   case 1: System.out.println("ENERO");
               break;
			   case 2: System.out.println("FEBRERO");
	           break;
			   case 3: System.out.println("MARZO");
	           break;
		       case 4: System.out.println("MAYO");
		       break;
			   case 5: System.out.println("ABRIL");
               break;
			   case 6: System.out.println("JUNIO");
	           break;
			   case 7: System.out.println("JULIO");
	           break;
			   case 8: System.out.println("AGOSTO");
		       break;
			   case 9: System.out.println("SEPTIEMBRE");
			   break;
			   case 10: System.out.println("OCTUBRE");
		       break;
			   case 11: System.out.println("NOBIEMBRE");
		       break;
			   case 12: System.out.println("DICIEMBRE");
			   break;
			   default: System.out.println("No existe ese mes");

		      }	  
		  }else {
			  System.out.println("No existe ese mes");
		  }
		if (d0 >=0 && d0 <=7 ) {
			switch (d0) {
			case 0:
				System.out.println("DOMINGO");
				break;
			case 1:
				System.out.println("LUNES");
				break;
			case 2:
				System.out.println("MARTES");
				break;
			case 3:
				System.out.println("MIERCOLES");
				break;
			case 4:
				System.out.println("JUEVES");
				break;
			case 5:
				System.out.println("VIERNES");
				break;
			case 6:
				System.out.println("SABADO");
				break;


			default: System.out.println("No exixte.");

				break;
			}
		}else {
			System.out.println("No existe ese dia");
		}
	imput.close();
	}
	

}
