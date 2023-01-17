package org.ip.sesion07;


public class Fraccion {
	private int numerador;
	private int denumerador;
	private static int numFracciones = 0;
	public Fraccion() {
		super();
		this.numerador = 0;
		this.denumerador = 1;
		numFracciones++;
	}

	public Fraccion(int numerador, int denumerador) {
		super();
		this.numerador = numerador;
		this.denumerador = denumerador;
		numFracciones++;
	}

	public Fraccion(Fraccion frac) {
		super();
		this.numerador = frac.numerador;
		this.denumerador = frac.denumerador;

		numFracciones++;
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
		Fraccion otro = (Fraccion) obj;
		return numerador == otro.numerador && denumerador == otro.denumerador ;
	}
	public int getNumerador() {
		return numerador;
	}
	public int getDenumerador() {
		return denumerador;
	}
	public void setNumerador(int numerador) {
		this.numerador = numerador;
		
	}
	public void setDenumerador(int denumerador) {
		this.denumerador = denumerador;
	}
	
	public static int getnumFracciones() {
		return numFracciones;
	}
    
    public Fraccion sumar(Fraccion frac) {
        Fraccion copi = new Fraccion();
        copi.numerador = this.numerador * frac.denumerador + this.denumerador * frac.numerador;
        copi.denumerador = this.denumerador * frac.denumerador;
        return copi;
    }
    public static Fraccion sumar(Fraccion frac,Fraccion frac2) {
        Fraccion copi = new Fraccion();
        copi.numerador = frac2.numerador * frac.denumerador + frac2.denumerador * frac.numerador;
        copi.denumerador = frac2.denumerador * frac2.denumerador;
        return copi;
    }
    public Fraccion restar(Fraccion frac) {
        Fraccion copi = new Fraccion();
        copi.numerador = this.numerador * frac.denumerador - this.denumerador * frac.numerador;
        copi.denumerador = this.denumerador * frac.denumerador;
        copi.toString();
         
        return copi;
    }
   
    public Fraccion multiplicar(Fraccion frac) {
        Fraccion copi = new Fraccion();
        copi.numerador = this.numerador * frac.numerador;
        copi.denumerador = this.denumerador * frac.denumerador; 
        return copi;
    }

    public Fraccion dividir(Fraccion frac) {
        Fraccion copi = new Fraccion();
        copi.numerador = this.numerador * frac.denumerador;
        copi.denumerador = this.denumerador * frac.numerador; 
        return copi;
    }
   
    private int mcd() {
        int u = Math.abs(numerador); 
        int v = Math.abs(denumerador); 
        if (v == 0) {
            return u;
        }
        int r;
        while (v != 0) {
            r = u % v;
            u = v;
            v = r;
        }
        return u;
    }

    public Fraccion simplificar() {
        int n = mcd(); 
        Fraccion copi = new Fraccion();
        numerador = numerador / n;
        denumerador = denumerador / n;
        copi.numerador = this.numerador ;
        copi.denumerador = this.denumerador; 
        return  copi;
    }
	@Override
	public String toString() {
		return  numerador + "/" + denumerador ;
	}

	public int compareTo(Object obj) {
		Fraccion copy = (Fraccion) obj;

		if (numerador == copy.numerador && denumerador == copy.denumerador)
			return 0;
		else if (numerador < copy.numerador || denumerador > copy.denumerador)
			return -1;
		else
			return 1;
	}
	
}

