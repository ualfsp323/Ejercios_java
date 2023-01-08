package org.ip.sesion05;

import java.util.Iterator;

public class PracticarConArrays {
	public static int [] invertir(int [] array) {
		int [] invertir = new int [array.length];
		for (int i = 0; i < array.length; i++) {
			
			invertir [i]=  array[array.length-1 -i ] ;
			}
		
		mostrarArray(invertir);
		indiceMaximoValor(invertir);
		indiceMinimoValor(invertir);
	  return invertir;
	}
	public static void desplazar(int [] array) {
	    int deaplaze = array[0];
        for (int i = 0; i < array.length-1; i++) {
        	array[i] = array[i+1];
        }
        array[array.length-1] = deaplaze;
        
    	
	}
	public static int indiceMaximoValor(int [] array) {
		double maxArray = array[0];
		int indiceMax=0;
    	for (int i = 1; i < array.length; i++) {
			if(array[i]>maxArray) {
				maxArray=array[i];
				indiceMax=i;
			}
			
		}
        System.out.println("El indice del mayor valor del array entero es = "+indiceMax);
		return indiceMax;
	}
	
	public static int indiceMinimoValor(int [] array) {
		double minArray = array[0];
		int indiceMin=0;
    	for (int i = 1; i < array.length; i++) {
			if(array[i]<minArray) {
				minArray=array[i];
				indiceMin=i;
			}
			
		}
    	System.out.println("El indice del menor valor del array entero es = "+indiceMin);
		return indiceMin;
	}
	public static int [] eliminarDuplicados(int [] array){
		int[] arrayBlanco = new int[array.length];
		arrayBlanco[0] = array[0];
		int numElemtos = 1;
		for (int i = 1; i < array.length; i++) {
			boolean repetido = false;
			for (int j = i - 1; (!repetido) && j >= 0; j--) {
				if (array[i] == array[j]) {
					repetido = true;
				}
			}
		if (!repetido) {
				arrayBlanco[numElemtos] = array[i];
				numElemtos++;
			}
		}
		int[] arrayBlanco2 = new int[numElemtos];
		for (int i = 0; i < arrayBlanco2.length; i++) {
			arrayBlanco2[i] = arrayBlanco[i];

		}
		return arrayBlanco2;

	}
		
	public static void mostrarArray(int [] array) {
		int a = array.length;

		System.out.print("El array Entero = ");
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
	public static void main(String[] args) throws InterruptedException {
		int[] arrayEntero = {5, 10, 15,2,4,23,7,13,8,17,27};
		mostrarArray(arrayEntero);
		indiceMaximoValor(arrayEntero);
		indiceMinimoValor(arrayEntero);
		System.out.println("Invirtiendo el array.... ");
		Thread.sleep(1000);   
        invertir(arrayEntero); 
		Thread.sleep(1000);   
    	System.out.println("Desplazando una posicion el array original .... ");
        desplazar(arrayEntero);
        mostrarArray(arrayEntero);
        System.out.println("Desplazando 5 posiciones el array  .... ");
        for (int i = 1; i <= 5; i++) {
        	desplazar(arrayEntero);
        }
        mostrarArray(arrayEntero);
        System.out.println("Nuevo array con duplicados ");
        int[] arrayDupli = {1, 1, 2,3,4,4,2,1,5,5,5,6,3,5,6,7,8,8,6,4,8};
        mostrarArray(arrayDupli);
        Thread.sleep(1000);   
    	System.out.println("Eliminando los duplicados ");
    	eliminarDuplicados(arrayDupli);
    	int [] arrayDupli2 = eliminarDuplicados(arrayDupli);
    	mostrarArray(arrayDupli2);
    	System.out.println("Desplazando una posicion el array ");
        desplazar(arrayDupli2);
        mostrarArray(arrayDupli2);
    	 
	}

}
