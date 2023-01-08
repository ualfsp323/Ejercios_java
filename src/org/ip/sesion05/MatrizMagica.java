package org.ip.sesion05;

import java.util.Scanner;

public class MatrizMagica {
	private static Scanner imput;

	public static boolean esMatrizMagica(int[][] matriz) {
		int suma0 = 0;
		int suma1 = 0;
		int suma2 = 0;
		int suma3 = 0;
		boolean MatrezMagic = true;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				switch (i) {
				case 0:
					suma0 += matriz[i][j];
					break;
				case 1:
					suma1 += matriz[i][j];
					break;

				case 2:
					suma2 += matriz[i][j];
					break;

				case 3:
					suma3 += matriz[i][j];
					break;

				default:
					break;
				}
				
			}
		}	
		

		if (suma0 == suma1 && suma0==suma2 && suma0==suma3 && suma1==suma2 && suma1==suma3 && suma2==suma3) {
					MatrezMagic = true;

				}else {
					MatrezMagic = false;

				}
		return MatrezMagic;
	}

	public static void main(String[] args) {
		imput = new Scanner(System.in);
		int[][] matrizR = new int[4][4];
		for (int i = 0; i < matrizR.length; i++) {
			for (int j = 0; j < matrizR[i].length; j++) {
				System.out.print("M" + "[" + i + "]" + "[" + j + "] :");
				matrizR[i][j] = imput.nextInt();

			}
		}

		esMatrizMagica(matrizR);
		boolean MatrizMagica = esMatrizMagica(matrizR);
		if (MatrizMagica) {
			System.out.print("La matriz es Magica");

		}else {
			System.out.print("La matriz no es Magica");

		}
		

	}
}
