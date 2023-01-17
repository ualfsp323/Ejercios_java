package Verdadero;

public class AlumnoGrado extends Alumno {

	private boolean tieneB1;
	private double notaAccesoGrado;

	public AlumnoGrado(String nif, String apellidosNombre, String titulacion, AsignaturaNota[] expediente, boolean tieneB1, double notaAccesoGrado) {
		super(nif, apellidosNombre, titulacion, expediente);
		this.tieneB1 = tieneB1;
		this.notaAccesoGrado = notaAccesoGrado;
	}

	public AlumnoGrado(AlumnoGrado alumnoGrado) {
		super(alumnoGrado.getNif(), alumnoGrado.getApellidosNombre(), alumnoGrado.getTitulacion(), alumnoGrado.getExpediente());
		this.tieneB1 = alumnoGrado.getTieneB1();
		this.notaAccesoGrado = alumnoGrado.getNotaAccesoGrado();
	}

	public boolean getTieneB1() {
		return tieneB1;
	}

	public void setTieneB1(boolean tieneB1) {
		this.tieneB1 = tieneB1;
	}

	public double getNotaAccesoGrado() {
		return notaAccesoGrado;
	}

	public void setNotaAccesoGrado(double notaAccesoGrado) {
		this.notaAccesoGrado = notaAccesoGrado;
	}

	@Override
	public String toString() {
		String s = "  Alumno Grado {";
		if (tieneB1)
			s += "Si tiene B1";
		else
			s += "No tiene B1";
		s += ", Nota Acceso Grado: " + notaAccesoGrado + "}";
		return super.toString() + "\n" + s;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;

		AlumnoGrado other = (AlumnoGrado) obj;
		if (notaAccesoGrado != other.notaAccesoGrado)
			return false;
		if (tieneB1 != other.tieneB1)
			return false;
		return true;
	}

}
