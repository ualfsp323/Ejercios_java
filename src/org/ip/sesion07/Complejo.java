package org.ip.sesion07;

public class Complejo {
	private double real;
	private double imaginario;

	public Complejo(double real, double imaginario) {
		super();
		this.real = real;
		this.imaginario = imaginario;
	}

	public Complejo(Complejo c) {
		super();
		this.real = c.real;
		this.imaginario = c.imaginario;
	}
	public double getReal() {
		return real;
	}
	public void setReal(double real) {
		this.real = real;
	}
	public double getImaginario() {
		return imaginario;
	}
	public void setImaginario(double imaginario) {
		this.imaginario = imaginario;
	}
	public String toString() {
		if(real==0) {
		return   +imaginario +"i";

		}
		if(imaginario==0) {
			return  "= " +real ;

			}
		if(imaginario<0) {
			return   +real+ " - " +imaginario*-1+"i" ;

			}	
		return   +real+ " + " +imaginario +"i";
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
		Complejo otro = (Complejo) obj;
		return real == otro.real && imaginario == otro.imaginario ;
	}

	public Complejo sumar(Complejo c) {
        Complejo copi = new Complejo( real, imaginario);
        copi.real = this.real + c.real ;
        copi.imaginario = this.imaginario + c.imaginario ;
        return copi;
    }
	public Complejo restar(Complejo c) {
        Complejo copi = new Complejo( real, imaginario);
        copi.real = this.real - c.real ;
        copi.imaginario = this.imaginario - c.imaginario ;
        return copi;
    }
	public Complejo multiplicar(Complejo c) {
        Complejo copi = new Complejo( real, imaginario);
        copi.real = this.real * c.real - this.imaginario * c.imaginario;
        copi.imaginario =  this.imaginario * c.real + this.real * c.imaginario;
        return copi;
    }
	public  Complejo Producto(double valorEscalar) {
        Complejo copi = new Complejo( real, imaginario);
        copi.real = valorEscalar * real;
        copi.imaginario =   valorEscalar * imaginario;
        return copi;
    }
	public Complejo dividir(Complejo c) {
        Complejo copi = new Complejo( real, imaginario);
        copi.real =( this.real * c.real + this.imaginario * c.imaginario)/(Math.pow(c.real, 2)+Math.pow(c.imaginario, 2));
        copi.imaginario = ( this.imaginario * c.real - this.real * c.imaginario)/(Math.pow(c.real, 2)+Math.pow(c.imaginario, 2));
        return copi;
    }
	public  Complejo modulo() {
        Complejo copi = new Complejo( real, imaginario);

		double modulo = Math.sqrt(Math.pow(real,2.0 ) +Math.pow(imaginario, 2));
        copi.real = modulo;
        copi.imaginario =  0;
        return copi;
    }
	public  double argumento() {
        double arg= Math.atan(imaginario/real);
        return arg;
    }
	public  Complejo conjugado() {
        Complejo copi = new Complejo( real, imaginario);

        copi.real = real;
        copi.imaginario =  -imaginario;
        return copi;
    }
}



