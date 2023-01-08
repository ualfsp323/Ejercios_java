package org.ip.sesion03;

import java.util.Scanner;

public class TablaMultiplicar {

	public static void main(String[] args) {
		int x = 0;
        int num;
		Scanner imput = new Scanner(System.in);		
	
//		Este bucle do-while, es pra que el usuario solamente ponga un valor entre 1 y el 10
		do {
			System.out.println("Introduzca un numero (del 1 al 10) : ");
			num = imput.nextInt();
		}while (num <= 1 || num > 10);		
		System.out.println("La tabla de : "+num);
		for (int i = 1; i <= 10; i++) {
			x = num * i;
			System.out.println(num+" X "+ i+" = "+x);

		}
	}

}
