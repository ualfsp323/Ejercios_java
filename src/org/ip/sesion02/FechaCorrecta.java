package org.ip.sesion02;

import java.util.Scanner;

public class FechaCorrecta {

	public static void main(String[] args) {
		int anio;		  
		int mes;
		int dia ;

	      Scanner imput = new Scanner(System.in);				
		  System.out.println("Introduzca un numero de dia ");
		  dia = imput.nextInt();
		  
		  System.out.println("Introduzca un numero de mes ");
		  mes = imput.nextInt();
		  
		  System.out.println("Introduzca un numero de anio ");
		  anio = imput.nextInt();
			
		  String fecha = dia+"/"+mes+"/"+anio;
		  
		  if (anio >= 1500 && anio <= 3000) {
			  
			  if (mes >= 1 && mes <= 12) {
				  switch ( mes ){
				   case 1:
			            	if ( dia >= 1 && dia <= 30 ) {
			            	System.out.print( "\n   fecha correcta: "+fecha );
			            	}else {
				            System.out.print( "\n   fecha incorrecta: "+fecha );
			            	}
	               break;
	                      
			       case 3:
			            	if ( dia >= 1 && dia <= 30 ) {
			            	System.out.print( "\n   fecha correcta: "+fecha );
			            	}else {
				            System.out.print( "\n   fecha incorrecta: "+fecha );
			            	}
	               break;
	                      
			       case 5:
			            	if ( dia >= 1 && dia <= 30 ) {
			            	System.out.print( "\n   fecha correcta: "+fecha );
			            	}else {
				            System.out.print( "\n   fecha incorrecta: "+fecha );
			            	}
	               break;
	                      
			       case 7: 
			            	if ( dia >= 1 && dia <= 30 ) {
			            	System.out.print( "\n   fecha correcta: "+fecha );
			            	}else {
				            System.out.print( "\n   fecha incorrecta: "+fecha );
			            	}
	               break;
	                      
			       case 8:
			            	if ( dia >= 1 && dia <= 31 ) {
			            	System.out.print( "\n   fecha correcta: "+fecha );
			            	}else {
				            System.out.print( "\n   fecha incorrecta: "+fecha );
			            	}
	               break;
	                      
			       case 10:
			            	if ( dia >= 1 && dia <= 31 ) {
			            	System.out.print( "\n   fecha correcta: "+fecha );
			            	}else {
				            System.out.print( "\n   fecha incorrecta: "+fecha );
			            	}
	               break;
	                      
			       case 12: 
			            	System.out.print( "\n   fecha correcta: "+fecha );
			            	if ( dia >= 1 && dia <= 31 ) {
			            	System.out.print( "\n   fecha correcta: "+fecha );
			                }else {
				            System.out.print( "\n   fecha incorrecta: "+fecha );
			                }
	               break;
	                    
			       case 4:
			            	if ( dia >= 1 && dia <= 31 ) {
			            	System.out.print( "\n   fecha correcta: "+fecha );
			            	}else {
				            System.out.print( "\n   fecha incorrecta: "+fecha );
			            	}
	               break;
	                      
			       case 6: 
			            	if ( dia >= 1 && dia <= 31 ) {
			            	System.out.print( "\n   fecha correcta: "+fecha );
			            	}else {
				            System.out.print( "\n   fecha incorrecta: "+fecha );
			            	}
	               break;
	                      
			       case 9:
			            	if ( dia >= 1 && dia <= 30 ) {
			            	System.out.print( "\n   fecha correcta: "+fecha );
			            	}else {
				            System.out.print( "\n   fecha incorrecta: "+fecha );
			                }
	               break;
	                      
			       case 11: 
			            	if( dia >= 1 && dia <= 30 ) {
			            	System.out.print( "\n   fecha correcta: "+fecha );
			                }else {
				            System.out.print( "\n   fecha incorrecta: "+fecha );
			                }
			        break;

			        case 2: 
			            	if( anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0 ) {
			                          if ( dia >= 1 && dia <= 29 ) {
			                        	  System.out.print( "\n   fecha correcta: "+fecha );
			                          } else {
			  				              System.out.print( "\n   fecha incorrecta: "+fecha );
			                          }
			                 } else {
			                          if ( dia >= 1 && dia <= 28 ) {
			                        	  System.out.print( "\n   fecha correcta: "+fecha );
			                          }else {
			  				              System.out.print( "\n   fecha incorrecta: "+fecha );
			                          }
			                 }
			        break;
   
			      }
			  }else {
	              System.out.print( "\n   fecha incorrecta3: "+fecha );

			  }
			
		  }else {
	              System.out.print( "\n   fecha incorrecta2: "+fecha );
 
		  }
		  	imput.close();
	}

}
