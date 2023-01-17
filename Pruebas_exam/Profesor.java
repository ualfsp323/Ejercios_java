package Pruebas_exam;

import java.util.Arrays;

public class Profesor implements Comparable<Object>{
	private String nif;
	private AsignaturaHoras[] docencia;

	public Profesor(String nif) {
		super();
		this.nif = new String(nif);
		this.docencia = null;
	}

	public Profesor(String nif, AsignaturaHoras[] docencia) {
		super();
		this.nif = new String(nif);
		if (docencia != null) {
			this.docencia = new AsignaturaHoras[docencia.length];
			for (int i = 0; i < this.docencia.length; i++) {
				this.docencia[i] = new AsignaturaHoras(docencia[i]);
			}
		}
	}

	public Profesor(Profesor profesor) {
		super();
		this.nif = new String(profesor.nif);
		if (profesor.docencia != null) {
			this.docencia = new AsignaturaHoras[profesor.docencia.length];
			for (int i = 0; i < this.docencia.length; i++) {
				this.docencia[i] = new AsignaturaHoras(profesor.docencia[i]);
			}
		}
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = new String(nif);
	}

	public AsignaturaHoras[] getDocencia() {
		return docencia;
	}

	public void setDocencia(AsignaturaHoras[] docencia) {
		this.docencia = null;
		this.docencia = new AsignaturaHoras[docencia.length];
		for (int i = 0; i < this.docencia.length; i++) {
			this.docencia[i] = new AsignaturaHoras(docencia[i]);
		}
	}
	@Override
	public String toString() {
		String salida = "Profesor: " + nif + "\n";
		if (this.docencia != null) {
			salida += "  Docencia: [";
			for (int i = 0; i < this.docencia.length; i++) {
				if (i != this.docencia.length - 1)
					salida += this.docencia[i] + "; ";
				else
					salida += this.docencia[i] + "]";
			}
		}
		return salida;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		Profesor other = (Profesor) obj;
		if (nif == null) {
			if (other.nif != null)
				return false;
		} else if (!nif.equals(other.nif))
			return false;
		if (!Arrays.equals(docencia, other.docencia))
			return false;
		return true;
	}

	public int compareTo(Object obj) {
		Profesor otroProfesor = (Profesor) obj;
		return this.nif.compareTo(otroProfesor.getNif());
	}

}
