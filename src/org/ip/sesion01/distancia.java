package org.ip.sesion01;
public class distancia  {
	    public static void main(String[] args) {
            /*Voy cambiando el valor de las variables X y Y, para asi no escribir más variables*/
	    	/*Distancia (2,1)*/
	        int x1 = 2; 
	        int y1 = 1;
	        int x;
	        int y;
	        double Distancia;
	        x = 0-x1;
	        y = 0-y1;
	        Distancia = Math.sqrt(Math.pow(x,2.0 ) +Math.pow(y, 2)); 	        
	        System.out.printf("La Distancia entre el punto (2,1) y (0,0) es de : "+ Distancia);
	        System.out.print("\n");
	        
            /*Distancia (3,4)*/
	        int x2 = 3; 
	        int y2 = 4;
	        double Distancia2;
	        x = 0-x2;
	        y = 0-y2;
	        Distancia2 = Math.sqrt(Math.pow(x,2.0 ) +Math.pow(y, 2)); 
	        System.out.printf("La Distancia entre el punto (3,4) y (0,0) es de : "+ Distancia2);
	        System.out.print("\n");
	        
            /*Distancia (5,12)*/
	        int x3 = 5; 
	        int y3 = 12;
	        double Distancia3;
	        x = 0-x3;
	        y = 0-y3;
	        Distancia3 = Math.sqrt(Math.pow(x,2.0 ) +Math.pow(y, 2)); 
	        System.out.printf("La Distancia entre el punto (3,4) y (0,0) es de : "+ Distancia3);
	        System.out.print("\n");
	    }
	}

