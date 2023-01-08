package org.ip.sesion05;



public class MatricesBinarias {
	public static boolean esBinaria(int [][] matriz) {
		boolean bi = true;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == 0 || matriz[i][j] == 1) {
					bi = true;

				} else {
					bi = false;
				}

			}
		}
		if (bi) {
			System.out.println("La matriz es Binaria");
			System.out.println("");

		} else {
			System.out.println("La matriz no es Binaria");
			System.out.println("");
		}
		return bi;
	}
	public static int [][] transformaBinaria(int [][] matriz){
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) { 
				matriz[i][j] =matriz[i][j] % 2  ;
			}
		}
		mostrarMatriz(matriz);
		return matriz;
	}
	public static int numeroDeUnos(int [][] matriz) {
		int numUnos=0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == 1)numUnos++;
			}
		}
		System.out.println("El numero de 1s es : "+numUnos);
		return numUnos;
	}
	public static boolean tieneNumeroParCeros(int [][] matriz) {
		boolean Par0=true;
		int numCeros=0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == 0)numCeros++;
			}
		}
		if (numCeros% 2 == 0) {
					Par0 = true;

				} else {
					Par0 = false;
				}
		if (Par0) {
			System.out.println("La matriz Binaria tiene un numero Par de ceros");
			System.out.println("");

		} else {
			System.out.println("La matriz Binaria no tiene un numero Par de ceros");
			System.out.println("");
		}
		return Par0;
	}
	public static int [] sumaFilas(int [][] matriz) {
			int suma0 = 0;
			int suma1 = 0;
			int suma2 = 0;
			int suma3 = 0;
			int suma4 = 0;
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
					case 4:
						suma4 += matriz[i][j];
						break;
					default:
						break;
					}
					
				}
			}	
			int[] arrayFilaSuma = {suma0,suma1,suma2,suma3,suma4};
			System.out.print("Sumas de las Filas --> ");
			mostrarArray(arrayFilaSuma);
			return arrayFilaSuma;
		}
    public static int [] sumaColumnas(int [][] matriz) {
    	int suma0 = 0;
		int suma1 = 0;
		int suma2 = 0;
		int suma3 = 0;
		int suma4 = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				switch (j) {
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
				case 4:
					suma4 += matriz[i][j];
					break;
				default:
					break;
				}
			}
		}	
		int[] arrayFilaSuma = {suma0,suma1,suma2,suma3,suma4};
		System.out.print("Sumas de las Columnas --> ");
		mostrarArray(arrayFilaSuma);
		return arrayFilaSuma;
    }
	public static int [] extraerFila(int [][] matriz, int numFila) {
				int[] arrayFila = new int[matriz.length];
				for (int i = 0; i < matriz.length; i++) {
					for (int j = 0; j < matriz[i].length; j++) {
						if (i == numFila) {
							arrayFila [j]= matriz[i][j] ;
						}
					}
				}
			System.out.print("Fila "+numFila+ " --> ");
			mostrarArray(arrayFila);
			return arrayFila;

			}
	public static int [] extraerColumna(int [][] matriz, int numColumna) {
			int[] arrayColumna = new int[matriz.length];
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					if (j == numColumna) {
						arrayColumna [i]= matriz[i][j] ;
					}
				}
			}
		System.out.print("Columna "+numColumna+ " --> ");
		mostrarArray(arrayColumna);
		return arrayColumna;

		}
	public static int [][] obtenerLaterales(int [][] matriz){
		int[] arrayFila0 = new int[matriz.length];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i==0) {
					arrayFila0[j]= matriz[i][j] ;
				}
			}
		}
		int[] arrayColumna4 = new int[matriz.length];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (j == 4) {
					arrayColumna4[i]= matriz[i][j] ;
				}
			}
		}
		int[] arrayFila4 = new int[matriz.length];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i == 4) {
					arrayFila4 [j]= matriz[i][j] ;
				}
			}
		}
		int[] arrayColumna0 = new int[matriz.length];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (j == 0) {
					arrayColumna0 [i]= matriz[i][j] ;
				}
			}
		}
	int[][] matrizLateral ={arrayFila0,arrayColumna4,arrayFila4,arrayColumna0};
	System.out.print("Laterales  --> ");
	mostrarMatriz(matrizLateral);
	return matrizLateral;
	};
	public static void mostrarMatriz(int [][] matriz) {
			 System.out.println("Matriz :");
			for (int i=0; i < matriz.length; i++) {
				  System.out.print("|");
				  for (int j=0; j < matriz[i].length; j++) {
				  System.out.printf("%5d",matriz[i][j]);
				    if (j!=matriz[i].length-1) System.out.printf("") ;
				  }
				  System.out.println("    |");
				}
			 System.out.println("");
			
		}
	public static void mostrarArray(int [] array) {
		
			int a = array.length;

			System.out.print("");
			System.out.print(" [ ");
			for (int i = 0; i < array.length; i++) {
				
				if (i+1 == a ) {
				System.out.print(array[i]+"");
				}else {
			    System.out.print(array[i]+", ");

				}
				
			}
			System.out.println(" ]");
			

		}

	public static void main(String[] args) {
		int fila = 2;
		int columna = 3;
		int[][] matrizInicial = new int[5][5];
		int M = -30;
		int N = 0;
		for (int i = 0; i < matrizInicial.length; i++) {
			for (int j = 0; j < matrizInicial[i].length; j++) {
				int R_numero =  (int) (Math.random()*(N-M+1)-N); 
				matrizInicial[i][j] = R_numero;
			}
		}
		mostrarMatriz(matrizInicial);
		esBinaria(matrizInicial);
	    extraerFila(matrizInicial, fila);
	    extraerColumna(matrizInicial, columna);
	    System.out.println("");
	    sumaFilas(matrizInicial);
	    sumaColumnas(matrizInicial);
	    System.out.println("");
	    System.out.println("Transformando la matriz a binario . . . ");
	    transformaBinaria(matrizInicial);
	    esBinaria(matrizInicial);
	    numeroDeUnos(matrizInicial);
	    tieneNumeroParCeros(matrizInicial);
	     fila = 3;
		 columna = 2;
	    extraerFila(matrizInicial, fila);
	    extraerColumna(matrizInicial, columna);
	    System.out.println("");
	    sumaFilas(matrizInicial);
	    sumaColumnas(matrizInicial);
	    System.out.println("");
	    obtenerLaterales(matrizInicial);
	}

}
