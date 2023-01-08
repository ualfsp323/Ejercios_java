package org.ip.sesion02;

import java.util.Scanner;

public class LoteDefectuoso {

	public static void main(String[] args) {
		/*Ponga los siguientes datos para comprobar la actividad*/
		/*5350 --> primer if
		 *33040 --> segundo if
		 *178200 --> tercer if
		 *5400 --> else 
		 * */
      int lote_defect;
      Scanner imput = new Scanner(System.in);				
	  System.out.println("Introduzca un numero de lote: ");
		lote_defect = imput.nextInt();
      if (lote_defect >= 5300 && lote_defect <= 5399){ 
    	 System.out.println("El codigo "+lote_defect+" corresponde a un lote DEFECTUOSOa1");
      }else if (lote_defect >= 33001 && lote_defect <= 39999){
 		 System.out.println("El codigo "+lote_defect+" corresponde a un lote DEFECTUOSOa2");

      }else if (lote_defect >= 178000 && lote_defect <= 191499){
  		 System.out.println("El codigo "+lote_defect+" corresponde a un lote DEFECTUOSOa3");

      }else {
   		 System.out.println("El codigo "+lote_defect+" corresponde a un lote No DEFECTUOSOa4");

      }
      imput.close();
	}

}
