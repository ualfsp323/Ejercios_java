package org.ip.sesion04;

import java.util.Scanner;

public class Cilindro {
	public static double areaCilindro(double radio, double altura) {
		double area1;
		area1 =  2*Math.PI * radio * (altura + radio);
        return area1;
	}
	public static double volumenCilindro(double radio, double altura) {
		double volumen1;
		volumen1 =  Math.PI * Math.pow(radio, 2) * altura;
        return volumen1;
	}

	public static void main(String[] args) {
		double radio;		  
		double altura;
		int chose;
       
	      Scanner imput = new Scanner(System.in);			
	   
		  System.out.print("Introduzca el radio ");
		  radio = imput.nextDouble();
		  
		  System.out.print("Introduzca la altura ");
		  altura = imput.nextDouble();
		  
		  System.out.print("Que desea calcular?: 1 (area) , 2 (volumen) ");
		  chose = imput.nextInt();
		  System.out.println("");
		  switch (chose) {
		  	case 1:
		  		areaCilindro(radio,altura);
		  		double area2 = areaCilindro(radio,altura);		  
		  		System.out.printf("El area del cilindro es: %.2f ", area2);
		  		break;
		  	case 2:
		  		volumenCilindro(radio,altura);
		  		double volumen2 = volumenCilindro(radio,altura);
		  		System.out.printf("El volumen del cilindro es: %.2f ",volumen2);
		  		break;
		  	default:
		  		System.out.println("Por favor, eliga las opiciones existentes");
		  		break;
		  }
		  imput.close();
	}

}
