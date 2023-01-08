package org.ip.sesion04;

import java.util.Scanner;

public class ValidarFecha {
	public static boolean esFechaCorrecta(int dia, int mes, int anio) {
		boolean fecha = true;
  if (anio >= 1500 && anio <= 3000) {
			  
			  if (mes >= 1 && mes <= 12) {
				  switch ( mes ){
				   case 1:
			            	if ( dia >= 1 && dia <= 30 ) {
			            		return fecha;
			            	}else {
			            		return fecha = false;
			            	}
	               case 3:
			            	if ( dia >= 1 && dia <= 30 ) {
			            		return fecha;
			            	}else {
			            		return fecha = false;
			            	}
	                      
			       case 5:
			            	if ( dia >= 1 && dia <= 30 ) {
			            		return fecha;
			            	}else {
			            		return fecha = false;			            	}
	                      
			       case 7: 
			            	if ( dia >= 1 && dia <= 30 ) {
			            		return fecha;
			            	}else {
			            		return fecha = false;
			            	}
	                      
			       case 8:
			            	if ( dia >= 1 && dia <= 31 ) {
			            		return fecha;
			            	}else {
			            		return fecha = false;
			            	}
	                      
			       case 10:
			            	if ( dia >= 1 && dia <= 31 ) {
			            		return fecha;
			            	}else {
			            		return fecha = false;
			            	}
	             
	                      
			       case 12: 
			            	if ( dia >= 1 && dia <= 31 ) {
			            		return fecha;
			                }else {
			                	return fecha = false;
			                }
	     
	                    
			       case 4:
			            	if ( dia >= 1 && dia <= 31 ) {
			            		return fecha;
			            	}else {
			            		return fecha = false;
			            	}
	    
	                      
			       case 6: 
			            	if ( dia >= 1 && dia <= 31 ) {
			            		return fecha;
			            	}else {
			            		return fecha = false;
			            	}
	         
	                      
			       case 9:
			            	if ( dia >= 1 && dia <= 30 ) {
			            		return fecha;
			            	}else {
			            		return fecha = false;

			            	}
			       case 11: 
			            	if( dia >= 1 && dia <= 30 ) {
			            		return fecha;
			                }else {
			            		return fecha = false;
			                }
			     
			       case 2: 
					
					if( esBisiesto(anio)) {
		                          if ( dia >= 1 && dia <= 29 ) {
		                        	  return fecha;
		                          } else {
		  				              return fecha = false;
		                          }
		                 } else {
		                          if ( dia >= 1 && dia <= 28 ) {
		                        	  return fecha;
		                          }else {
		  				              return fecha=false;
		                          }
			      
		                 }
   
			      }
			  }else {
          		return fecha = false;

			  }
			
		  }else {
      		return fecha = false;
 
		  }
return fecha;

	}

	public static boolean esBisiesto(int anio) {

		 return( anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0 ) ;
   }
	
	
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
		  
		  
			 esBisiesto(anio);
			 esFechaCorrecta(dia,mes,anio);
			 
	     
	      
		 if (esFechaCorrecta(dia,mes,anio)) {
	      System.out.println("Fecha correcta");
		  }else {
			 System.out.println("Fecha incorrecta");
			 System.out.println("");
		      do {
				  System.out.println("Introduzca un numero de dia ");
				  dia = imput.nextInt();
				  
				  System.out.println("Introduzca un numero de mes ");
				  mes = imput.nextInt();
				  
				  System.out.println("Introduzca un numero de anio ");
				  anio = imput.nextInt(); 
				  
				  
					 esBisiesto(anio);
					 esFechaCorrecta(dia,mes,anio);
					 
			      }while (!esFechaCorrecta(dia,mes,anio));
		      System.out.println("");
		      System.out.println("Fecha correcta");
		  }
		 imput.close();
		 }

}
