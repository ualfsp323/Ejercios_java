package Verdadero;

import java.util.Arrays;

public class Alumno implements Comparable<Object> {

	private String nif;
	private String apellidosNombre;
	private String titulacion;
	private AsignaturaNota [] expediente;

	public Alumno(String nif, String apellidosNombre, String titulacion, AsignaturaNota[] expediente) {
		this.nif = new String(nif);
		this.apellidosNombre = new String(apellidosNombre);
		this.titulacion = new String(titulacion);
		if (expediente != null) {
			this.expediente = new AsignaturaNota[expediente.length];
			for (int i = 0; i < this.expediente.length; i++) {
				this.expediente[i] = new AsignaturaNota(expediente[i]);
			}
		}
		else
			this.expediente = null;
	}

	public Alumno(String nif, String apellidosNombre, String titulacion) {
		this.nif = new String(nif);
		this.apellidosNombre = new String(apellidosNombre);
		this.titulacion = new String(titulacion);
		this.expediente = null;
	}

	public Alumno(Alumno alumno) {
		this.nif = new String(alumno.nif);
		this.apellidosNombre = new String(alumno.apellidosNombre);
		this.titulacion = new String(alumno.titulacion);
		if (alumno.expediente != null) {
			this.expediente = new AsignaturaNota[alumno.expediente.length];
			for (int i = 0; i < this.expediente.length; i++) {
				this.expediente[i] = new AsignaturaNota(alumno.expediente[i]);
			}
		}
		else
			this.expediente = null;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = new String(nif);
	}

	public String getApellidosNombre() {
		return apellidosNombre;
	}

	public void setApellidosNombre(String apellidosNombre) {
		this.apellidosNombre = new String(apellidosNombre);
	}

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = new String(titulacion);
	}

	public AsignaturaNota[] getExpediente() {
		return expediente;
	}

	public void setExpediente(AsignaturaNota[] expediente) {
		this.expediente = null;
		this.expediente = new AsignaturaNota[expediente.length];
		for (int i = 0; i < expediente.length; i++) {
			this.expediente[i] = new AsignaturaNota(expediente[i]);
		}
	}

	public double calcularNotaMedia() {
		double suma = 0.0;
		int numAsignaturas = 0;
		for (int i = 0; i < this.expediente.length; i++) {
			if (expediente[i].getNota() != -1.0) {
				suma += expediente[i].getNota();
				numAsignaturas++;
			}
		}
		if (numAsignaturas != 0)
			return suma / (double)numAsignaturas;
		else
			return 0.0;
	}

	@Override
	public String toString() {
		String salida = "Alumno:" + "\n"
				+ "  Nif: " + nif + "\n"
				+ "  Apellidos y Nombre: " + apellidosNombre + "\n"
				+ "  Titulacion: " + titulacion + "\n"
				+ "  [";
		for (int i = 0; i < this.expediente.length; i++) {
			if (i != this.expediente.length - 1)
				salida += this.expediente[i].toString() + "; ";
			else
				salida += this.expediente[i].toString() + "]";
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

		Alumno other = (Alumno) obj;
		if (nif == null) {
			if (other.nif != null)
				return false;
		} else if (!nif.equals(other.nif))
			return false;
		if (apellidosNombre == null) {
			if (other.apellidosNombre != null)
				return false;
		} else if (!apellidosNombre.equals(other.apellidosNombre))
			return false;
		if (titulacion == null) {
			if (other.titulacion != null)
				return false;
		} else if (!titulacion.equals(other.titulacion))
			return false;
		if (!Arrays.equals(expediente, other.expediente))
			return false;
		return true;
	}

	public int compareTo(Object obj) {
		Alumno otroAlummno = (Alumno) obj;

		double notaMediaFinal = calcularNotaMedia();
		if (notaMediaFinal > otroAlummno.calcularNotaMedia())
			return 1;
		else if (notaMediaFinal < otroAlummno.calcularNotaMedia())
			return -1;
		else
			return this.apellidosNombre.compareTo(otroAlummno.getApellidosNombre());
	}
}