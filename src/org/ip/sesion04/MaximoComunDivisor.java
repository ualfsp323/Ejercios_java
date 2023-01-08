package org.ip.sesion04;

import java.util.Scanner;
public class MaximoComunDivisor {
  public static int mcdRecursivo(int m, int n) {
	   if (n == 0) { 
		  return m;
	  }else {
	      return mcdRecursivo(n, m % n);
	  }
	
}
	public static void main(String[] args) {
		int n1;
		int n2;
	  
		Scanner imput = new Scanner(System.in);	
		do {
			System.out.println("Introduzca un valor positivo : ");
			n1 = imput.nextInt();	
			System.out.println("Introduzca otro valor positivo : ");
			n2 = imput.nextInt();
		}while ((n1 < 0) && (n2<0) );
		mcdRecursivo(n1,n2);
		int mdc= mcdRecursivo(n1,n2);

		System.out.println("El M.C.D de "+n1+" y "+n2+ " es "+mdc);
		
	}

}
	
