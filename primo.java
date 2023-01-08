package org.ip.sesion04;


public class GenerarPrimos {
	// Creo una function llamada esPrimo para sacar los numeros que sean primo, los que no son no saldran ya que serian primo = false.
  public static boolean esPrimo(int numero) {
            boolean primo = true;
			int divisor ;
			if ((numero % 2 == 0 ) && (numero !=2 )) {
				primo = false;
			
			}else {
				divisor=3;
				while (primo && (divisor <= (int)Math.sqrt(numero))){
					if (numero % divisor == 0)
						primo = false;
					divisor+=2;
				}
			}

				
			
			return primo;
	
	
	}
	      public static void main(String[] args) {
	    	  int esprimo=0;
	    	  int linea = 0;
	    	  int n = 2;
	    	  System.out.println("Los 50 numeros primos son : ");
		
	    	  while(esprimo!=50) {


	                if(esPrimo(n)) {
	                    esprimo++;
	                    linea++;
	                    System.out.printf("%7d",n);

	                    if(linea==10) {
	                        linea=0;
	                        System.out.println();
	                    }


	                }
	            n++;

	    }
				

  }
}
