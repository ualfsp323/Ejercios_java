package org.ip.sesion06;

public class TestFraccion {

	public static void main(String[] args) {
		Fraccion frac1 = new Fraccion(1,5);
		Fraccion frac2 = new Fraccion(4, 5);
		Fraccion frac3 = new Fraccion(-11, 22);
		Fraccion frac4 = new Fraccion(frac2);
		System.out.println("PRIMERA FRACCION ==> " + frac1.toString());
		System.out.println("SEGUNDA FRACCION ==> " + frac2.toString());
		System.out.println("TERCERA FRACCION ==> " + frac3.toString());
		System.out.println("CUARTA  FRACCION ==> " + frac4.toString());
		System.out.println("");
		System.out.println("El numero de fracciones creados es "+ Fraccion.getnumFracciones());
		if (frac1.equals(frac2)) {
			System.out.println("La primera Fraccion es IGUAL a la segunda Fraccion");
		} else {
			System.out.println("La primera Fraccion es NO ES IGUAL a la segunda Fraccion");
		}
		if (frac2.equals(frac4)) {
			System.out.println("La segunda Fraccion es IGUAL a la cuarta Fraccion");
		} else {
			System.out.println("La segunda Fraccion es NO ES IGUAL a la cuarta Fraccion");
		}
		Fraccion resta_simpificada = frac1.restar(frac2);
		Fraccion suma_simpificada=Fraccion.sumar(frac2,frac1);
		System.out.println("El numerador de la tercera fraccion es --> "+ frac3.getNumerador());
		System.out.println("El demoniador de la primera fraccion es --> "+ frac1.getDenumerador());
		System.out.println("La suma de la primera y segunda fraccion, utilizando el metodo clase ==> " + frac1.toString()+" + "+ frac2.toString()+" = " +frac1.sumar(frac2));
		System.out.println("La suma de la primera y segunda fraccion, utilizando el metodo objeto ==> " + frac1.toString()+" + "+ frac2.toString()+" = " +Fraccion.sumar(frac2,frac1)+" simplificada "+suma_simpificada.simplificar());
		System.out.println("La resta de la primera y segunda fraccion ==> " + frac1.toString()+" + "+ frac2.toString()+" = " +frac1.restar(frac2)+" simplificada "+resta_simpificada.simplificar());
		System.out.println("El producto de la primera con la segunda fraccion ==> " + frac1.toString()+" * "+ frac2.toString()+" = " +frac1.multiplicar(frac2));
		System.out.println("La division de la primera con la tercera fraccion ==> " + frac1.toString()+" * "+ frac3.toString()+" = " +frac1.dividir(frac3));
		System.out.println("La tercera fraccion simplificada es --> "+ frac3.toString()+" simplificada "+frac3.simplificar());
		System.out.println("El numero de fracciones creados es "+ Fraccion.getnumFracciones());

	}

}
