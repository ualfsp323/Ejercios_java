package org.ip.sesion04;

import java.util.Scanner;

public class Sumatoria {
	public static int sumaIterativa(int x) {
		int sumaInteractiva = 0;
		for (int i = 1; i <=x; i++) {
			sumaInteractiva +=i;
		}
		return sumaInteractiva;
	}
	public static int sumaDirecta(int x) {
		 int sumaDirect = x * (x +1) / 2;
		 return sumaDirect;
		 
	}
	public static int sumaRecursiva(int x) {
	      if(x == 1) 
              return 1;
           else
              return x + sumaRecursiva(x-1);
	}
	
	public static void main(String[] args) {
		 int numero;		  
       
	      Scanner imput = new Scanner(System.in);			
	   
		  System.out.print("Introduzca el numero de terminos que desea sumar ");
		  numero = imput.nextInt();
		  sumaIterativa(numero);
		  sumaDirecta(numero);
		  sumaRecursiva(numero);
		  int Int = sumaIterativa(numero);
		  int Dir = sumaDirecta(numero);
		  int Rec = sumaRecursiva(numero);
		  System.out.println("");
		  System.out.println("La suma usando el metodo interactivo de los "+numero+" primeros numeros es "+Int);
		  System.out.println("La suma usando el metodo Directo de los "+numero+" primeros numeros es "+Dir);
		  System.out.println("La suma usando el metodo Recursivo de los "+numero+" primeros numeros es "+Rec);

		  imput.close();
	}

}
