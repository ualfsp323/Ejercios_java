package org.ip.sesion06;

public class EcuacionCuadratica {
	private double a;
	private double b;
	private double c;
	private static int numEcuacionCuadratica = 0;
	public EcuacionCuadratica() {
		super();
		this.a = 0.0;
		this.b = 0.0;
		this.c = 0.0;
		numEcuacionCuadratica++;
	}
	public EcuacionCuadratica(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		numEcuacionCuadratica++;
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC( double c) {
		this.c = c;
	}
	public static int getnumEcuacionCuadratica() {
		return numEcuacionCuadratica;
	}
	public String toString() {
		return  "Ecuacion Cuadratica:"+ "(a= "+ a + ", b= " + b +", c="+c+")";
	}

	public double getDiscriminante() {
		double Discriminante = Math.pow(b, 2.0)-4*a*c;
		return Discriminante;
	}	
	
	public double getRaiz1() {
		if (getDiscriminante() >= 0) {
			if (getDiscriminante() == 0) {
				double Raiz1 = -b / (2 * a);
				return Raiz1;

			}else {
			double Raiz1 = -b + Math.sqrt(getDiscriminante()) / 2 * a;
			return Raiz1;
			}
		} else {
			return 0.0;
		}
	}

	public double getRaiz2() {
		if (getDiscriminante() >= 0) {
			if (getDiscriminante() == 0) {
				double Raiz2 = -b / (2 * a);
				return Raiz2;

			}else {
			double Raiz2 = -b - Math.sqrt(getDiscriminante()) / 2 * a;
			return Raiz2;
			}
		} else {
			return 0.0;
		}
		
	}
}
