package org.ip.sesion01;

public class EnteroAleatorio {

	public static void main(String[] args) {        
		int M = -15;
		int N = 15;
		System.out.println("Generamos un numero entero ramdon entre -15 y 15");
		System.out.print("\n");
		int R_numero =  (int) (Math.random()*(N-M+1)-N); 
        System.out.println("El numero entero generado es = "+R_numero);
    

	}

}
