package org.ip.sesion06;

public class Circulo {
	private double xCirculo;
	private double yCirculo;
	private double radio;
	private static int numCirculos = 0;

	public Circulo() {
		super();
		this.xCirculo = 0.0;
		this.yCirculo = 0.0;
		this.radio = 0.0;
		numCirculos++;
	}

	public Circulo(double xCirculo, double yCirculo, double radio) {
		super();
		this.xCirculo = xCirculo;
		this.yCirculo = yCirculo;
		this.radio = radio;
		numCirculos++;
	}

	public Circulo(double xCirculo, double yCirculo) {
		super();
		this.xCirculo = xCirculo;
		this.yCirculo = yCirculo;
		numCirculos++;
	}
	
	public Circulo( double radio) {
		super();
		this.radio = radio;
		numCirculos++;
	}
	
	public Circulo( Circulo C) {
		super();
		this.xCirculo = C.xCirculo;
		this.yCirculo = C.yCirculo;
		this.radio = C.radio;
		numCirculos++;
	}
	
	public double getXCirculo() {
		return xCirculo;
	}
	public void setXCirculo(double xCirculo) {
		this.xCirculo = xCirculo;
	}
	public double getYCirculo() {
		return yCirculo;
	}
	public void setYCirculo(double yCirculo) {
		this.yCirculo = yCirculo;
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio( double radio) {
		this.radio = radio;
	}
	public static int getnumCirculos() {
		return numCirculos;
	}
	public String toString() {
		return  "{"+ "(xCentro= "+ xCirculo + ", yCentro= " + yCirculo +")"+ ", radio="+radio+"}";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Circulo otro = (Circulo) obj;
		return xCirculo == otro.xCirculo && yCirculo == otro.yCirculo ;
	}
	
	public int compareTo(Object obj) {
		Circulo otro = (Circulo) obj;

		if (calcularArea() == otro.calcularArea())
			return 0;
		else if (calcularArea() < otro.calcularArea())
			return -1;
		else
			return 1;
	}
	
	public double calcularArea() {
		double area = Math.PI * Math.pow(radio, 2.0);
		return area;
	}
	public double calcularLongitud() {
		double longitud =2* Math.PI * radio;
		return longitud;
	}
	public double calcularDiametro() {
		double Diametro = 2 * radio;
		return Diametro;
	}
}
