package org.ip.sesion05;

public class EstadisticasArrays {
	public static double max(double[] array) {
    	double maxArray = array[0];
    	for (int i = 1; i < array.length; i++) {
			if(array[i]>maxArray) {
				maxArray=array[i];
			}
			
		}
		return maxArray;
	}
	
	public static int max(int [] array) {
    	int maxArray = array[0];
    	for (int i = 1; i < array.length; i++) {
			if(array[i]>maxArray) {
				maxArray=array[i];
			}
			
		}
		return maxArray;
	}
	
	public static double min(double[] array) {
    	double minArray = array[0];
    	for (int i = 1; i < array.length; i++) {
			if(array[i]<minArray) {
				minArray=array[i];
			}
			
		}
		return minArray;
	}
	
	public static int min(int [] array) {
    	int minArray = array[0];
    	for (int i = 1; i < array.length; i++) {
			if(array[i]<minArray) {
				minArray=array[i];
			}
			
		}
		return minArray;
	}
	
	public static double media(double[] array) {
	 	double mediaReal ;
	 	double suma = 0;
	 	int b=0;
    	for (int i = 0; i < array.length; i++) {
    		b++;
    		suma+=array[i];
			
			
		}
    	mediaReal = suma /b;
		return mediaReal;
	}
	public static double media(int [] array) {
	 	double mediaReal ;
	 	double suma = 0;
	 	int b=0;
    	for (int i = 0; i < array.length; i++) {
    		b++;
    		suma+=array[i];
			
			
		}
    	mediaReal = suma /b;
		return mediaReal;
	}
	
	public static double varianza(double[] array) {
		double varianzaReal =0;
	 	int b=array.length;
		double mediaD = media(array);

     	for (int i = 0; i < array.length; i++) {
    		
     		varianzaReal+=Math.pow(array[i]-mediaD,2)/(b-1);
			
			
		}
		return varianzaReal;
	}
	
	public static double varianza(int [] array) {
		double varianzaReal =0;
	 	int b=array.length;
		double mediaD = media(array);

     	for (int i = 0; i < array.length; i++) {
    		
     		varianzaReal+=Math.pow(array[i]-mediaD,2)/(b-1);
			
			
		}
		return varianzaReal;
	}
	public static double desviacionTipica(double [] array) {
		double varianzaD = varianza(array);
		double desviacionReal = Math.sqrt(varianzaD);
		
		return desviacionReal;
	}
	
	public static double desviacionTipica(int [] array) {
		double varianzaD = varianza(array);
		double desviacionReal = Math.sqrt(varianzaD);
		
		return desviacionReal;
	}
	
	public static void mostrarArray(double [] array) {
		int b=0;
		int a = array.length;

		System.out.print("El array Real = ");
		System.out.print(" [ ");
		for (int i = 0; i < array.length; i++) {
			
			b++;
			if (i+1 == a ) {
			System.out.print(array[i]+"");
			}else {
		    System.out.print(array[i]+", ");

			}
			
		}
		System.out.println(" ]");
		System.out.println("Numero de elementos de los arrays Reales es : "+b);

	}
	public static void mostrarArray(int [] array) {
		int b=0;
		int a = array.length;

		System.out.print("El array Entero = ");
		System.out.print(" [ ");
		for (int i = 0; i < array.length; i++) {
			
			b++;
			if (i+1 == a ) {
			System.out.print(array[i]+"");
			}else {
		    System.out.print(array[i]+", ");

			}
			
		}
		System.out.println(" ]");
		System.out.println("Numero de elementos de los arrays Enteros es : "+b);

	}
	

	public static void main(String[] args) {
		int[] arrayEntero = {5, 10, 15,20};
		mostrarArray(arrayEntero);
		max(arrayEntero);
		min(arrayEntero);
		media(arrayEntero);
		varianza(arrayEntero);
		desviacionTipica(arrayEntero);
		int maxI = 	max(arrayEntero);
		int minI =   min(arrayEntero);
		double mediaI = media(arrayEntero);
		double varianzaI = varianza(arrayEntero);
		double desviacionTipicaI = desviacionTipica(arrayEntero);
        System.out.println("El numero minimo del array Real es = "+minI);
		System.out.println("El numero maximo del array Real es = "+maxI);
		System.out.println("La media del array Real es = "+mediaI);
		System.out.println("La Varianza del array Real es = "+varianzaI);
		System.out.println("La Varianza del array Real es = "+desviacionTipicaI);
		System.out.println("");
		double[] arrayReal = {5.0, 25.5, 15.75,10.25,12.5};
		mostrarArray(arrayReal);
		max(arrayReal);
		min(arrayReal);
		media(arrayReal);
		varianza(arrayReal);
		desviacionTipica(arrayReal);
		double maxD = 	max(arrayReal);
		double minD =   min(arrayReal);
		double mediaD = media(arrayReal);
		double varianzaD = varianza(arrayReal);
		double desviacionTipicaD = desviacionTipica(arrayReal);
        System.out.println("El numero minimo del array Real es = "+minD);
		System.out.println("El numero maximo del array Real es = "+maxD);
		System.out.println("La media del array Real es = "+mediaD);
		System.out.println("La Varianza del array Real es = "+varianzaD);
		System.out.println("La Varianza del array Real es = "+desviacionTipicaD);
	}

}
