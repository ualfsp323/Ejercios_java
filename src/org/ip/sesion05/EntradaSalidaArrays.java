package org.ip.sesion05;

import java.util.Scanner;

public class EntradaSalidaArrays {
	private static Scanner imput;

	public static double[] leerRealesArray1D() {
		imput = new Scanner(System.in);
		System.out.println("Introduce el numero de componentes del array de reales");
		int numElementos = imput.nextInt();
		double[] arrayReal = new double[numElementos];
		System.out.println("Introduce valores reales en el array ");
		for (int i = 0; i < arrayReal.length; i++) {
			System.out.print("Introduce valor " + (i + 1) + "=> ");
			arrayReal[i] = imput.nextDouble();
		}
		System.out.print("El array entero = ");
		System.out.print(" { ");
		for (int i = 0; i < arrayReal.length; i++) {
			if (i+1 == numElementos ) {
			System.out.print(arrayReal[i]+"");
			}else {
		    System.out.print(arrayReal[i]+", ");

			}
			

		}
		System.out.print(" } ");
		return arrayReal;
	}

	public static int[] leerEnterosArray1D() {
		imput = new Scanner(System.in);
		System.out.println("Introduce el numero de componentes del array de enteros");
		int numElementos = imput.nextInt();
		int[] arrayEnt = new int[numElementos];
		System.out.println("Introduce valores reales en el array ");
		for (int i = 0; i < arrayEnt.length; i++) {
			System.out.print("Introduce valor " + (i + 1) + "=> ");
			arrayEnt[i] = imput.nextInt();
		}
		System.out.print("El array entero = ");
		System.out.print(" { ");
		for (int i = 0; i < arrayEnt.length; i++) {
			if (i+1 == numElementos ) {
				System.out.print(arrayEnt[i]+"");
			}else {
			    System.out.print(arrayEnt[i]+", ");

			}
		}
		System.out.print(" } ");
		return arrayEnt;
	}

	public static int[] inicializarEnterosArray1D() {
		int a = 5;
		int M = -15;
		int N = 15;
		int[] arrayEnt = new int[a];
		for (int i = 0; i < arrayEnt.length; i++) {
			int R_numero =  (int) (Math.random()*(N-M+1)-N); 

			arrayEnt[i] = R_numero;
		}
		return arrayEnt;
	}

	public static double[] inicializarRealesArray1D() {
		double a = 5.0;
		int M = -15;
		int N = 15;
		double[] arrayReal = new double[(int) a];
		for (int i = 0; i < arrayReal.length; i++) {
			int R_numero =  (int) (Math.random()*(N-M+1)-N); 
			arrayReal[i] =  R_numero;
		}
		return arrayReal;
	}

	public static void mostrarArray1D(double[] array) {
		int a = 5;
		System.out.print("El array Real = ");
		System.out.print(" { ");
		for (int i = 0; i < array.length; i++) {
			if (i+1 == a ) {
				System.out.print(array[i]+"");
			}else {
			    System.out.print(array[i]+", ");

			}
		}
		System.out.print(" } ");
		System.out.println("");
		System.out.println("");
	}

	public static void mostrarArray1D(int[] array) {
		int a = 5;
		System.out.print("El array entero = ");
		System.out.print(" { ");
		for (int i = 0; i < array.length; i++) {
			if (i+1 == a ) {
				System.out.print(array[i]+"");
			}else {
			    System.out.print(array[i]+", ");

			}
		}
		System.out.print(" } ");
	}
	

public static int [][] leerEnterosMatriz2D() {
	imput = new Scanner(System.in);
	System.out.println(" ");
	System.out.println("Introduce el numero de fila para la matriz ");
	int fila = imput.nextInt();
	System.out.println("Introduce el numero de columna para la matriz ");
	int columna = imput.nextInt();
	int[][] matriz = new int[fila][columna];
	System.out.println("Matriz:");
	for (int i = 0; i < matriz.length; i++) {
		for (int j = 0; j < matriz[i].length; j++) {
			System.out.print("Introduce valor para la matriz "+fila+" * "+columna + " => ");
			matriz[i][j] = imput.nextInt();
		}
	}
	for (int i=0; i < matriz.length; i++) {
		  System.out.print("|");
		  for (int j=0; j < matriz[i].length; j++) {
		    System.out.print (matriz[i][j]);
		    if (j!=matriz[i].length-1) System.out.print("\t");
		  }
		  System.out.println("|");
		}
return matriz;
}
public static int [][] inicializarEnterosMatriz2D(){
	int a = 5;
	int M = -15;
	int N = 15;
	int[][] matriz = new int[a][a];
	for (int i = 0; i < matriz.length; i++) {
		for (int j = 0; j < matriz[i].length; j++) {
			int R_numero =  (int) (Math.random()*(N-M+1)-N); 
			matriz[i][j] = R_numero;
		}
	}
	return matriz;
}

public static double [][] inicializarRealesMatriz2D(){
	double a = 5;
	int M = -15;
	int N = 15;
	double[][] matriz = new double[(int) a][(int) a];
	for (int i = 0; i < matriz.length; i++) {
		for (int j = 0; j < matriz[i].length; j++) {
			int R_numero =  (int) (Math.random()*(N-M+1)-N); 
			matriz[i][j] = R_numero;
		}
	}
	return matriz;
}

    public static void mostrarMatriz2D(int [][] matriz) {
		System.out.println(" ");
    	for (int i=0; i < matriz.length; i++) {
  		  System.out.print("|");
  		  for (int j=0; j < matriz[i].length; j++) {
  		    System.out.print (matriz[i][j]);
  		    if (j!=matriz[i].length-1) System.out.print("\t");
  		  }
  		  System.out.println("|");
  		}
    }
	public static void mostrarMatriz2D(double [][] matriz) {
		System.out.println(" ");
    	for (int i=0; i < matriz.length; i++) {
  		  System.out.print("|");
  		  for (int j=0; j < matriz[i].length; j++) {
  		    System.out.print (matriz[i][j]);
  		    if (j!=matriz[i].length-1) System.out.print("\t");
  		  }
  		  System.out.println("|");
  		}
	}
	public static void main(String[] args) throws InterruptedException {
		leerEnterosArray1D();
		System.out.println(" ");
		System.out.println(" ");
		leerRealesArray1D();
		System.out.println("");
		System.out.println(" ");
		double[] arrayRealt = inicializarRealesArray1D();
		int[] arrayEnt = inicializarEnterosArray1D();
		System.out.println("Array Real random");
	    System.out.println(" ");
		Thread.sleep(1000);   
		mostrarArray1D(arrayRealt);
		System.out.println("Array Entero radndom");
		System.out.println(" ");
		Thread.sleep(1000);  
		mostrarArray1D(arrayEnt);
		System.out.println(" ");
		leerEnterosMatriz2D();
		System.out.println(" ");
		double[][] MatrizRealt = inicializarRealesMatriz2D();
		int[][] MatrizEntero = inicializarEnterosMatriz2D();
		System.out.println("El Matriz random Entero = ");
	    System.out.println(" ");
		Thread.sleep(1000);   
		mostrarMatriz2D(MatrizEntero);
		System.out.println(" ");
		System.out.println("El Matriz random doble = ");
		System.out.println(" ");
		Thread.sleep(1000);  
		mostrarMatriz2D(MatrizRealt);
		System.out.println(" ");
	}

}
