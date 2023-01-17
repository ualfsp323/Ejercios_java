package org.ip.examenfebrero2019;

public class AsignaturaNota implements Comparable<Object> {

	private String asignatura;
	private double nota;
	private String calificacion;

	private boolean notaCorrecta (double nota) {
		if ((nota >= 0.0) && (nota <= 10))
			return true;
		else
			return false;
	}

	private String obtenerCalificacion(double nota) {
		if (nota < 5.0)
			return "Sus";
		else if (nota < 7.0)
			return "Apr";
		else if (nota < 9.0)
			return "Not";
		else if (nota < 10.0)
			return "Sob";
		else if (nota == 10.0)
			return "MdH";
		else
			return "NoP";
	}

	public AsignaturaNota(String asignatura) {
		this.asignatura = new String(asignatura);
		this.nota = -1.0;
		this.calificacion = "NoP";
	}

	public AsignaturaNota(String asignatura, double nota) {
		this.asignatura = new String(asignatura);
		if (notaCorrecta(nota)) {
			this.nota = nota;
			this.calificacion = new String (obtenerCalificacion(nota));
		}
		else {
			this.nota = -1.0;
			this.calificacion = "NoP";
		}
	}

	public AsignaturaNota(AsignaturaNota asignaturaCalificacion) {
		this.asignatura = new String(asignaturaCalificacion.asignatura);
		this.nota = asignaturaCalificacion.nota;
		this.calificacion = new String(asignaturaCalificacion.calificacion);
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = new String(asignatura);
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		if (notaCorrecta(nota)) {
			this.nota = nota;
			this.calificacion = new String (obtenerCalificacion(nota));
		}
		else {
			this.nota = -1.0;
			this.calificacion = "NoP";
		}
	}

	public String getCalificacion() {
		return calificacion;
	}

	//public void setCalificacion(String calificacion) {
	//	this.calificacion = new String(calificacion);
	//}

	@Override
	public String toString() {
		return "(" + asignatura + ", " + nota + ", " + calificacion + ")";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		AsignaturaNota other = (AsignaturaNota) obj;
		if (asignatura == null) {
			if (other.asignatura != null)
				return false;
		} else if (!asignatura.equals(other.asignatura))
			return false;
		if (nota != other.nota)
			return false;
		if (calificacion == null) {
			if (other.calificacion != null)
				return false;
		} else if (!calificacion.equals(other.calificacion))
			return false;
		return true;
	}

	@Override
	public int compareTo(Object obj) {
		AsignaturaNota otraAsignaturaNota = (AsignaturaNota) obj;
		if (nota > otraAsignaturaNota.getNota())
			return 1;
		else if (nota < otraAsignaturaNota.getNota())
			return -1;
		else
			return this.asignatura.compareTo(otraAsignaturaNota.getAsignatura());
	}
}
