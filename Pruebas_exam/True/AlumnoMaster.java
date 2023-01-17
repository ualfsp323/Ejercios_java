package Verdadero;

public class AlumnoMaster extends Alumno {

	private String titulacionAccesoMaster;
	private double notaAccesoMaster;

	public AlumnoMaster(String nif, String apellidosNombre, String titulacion, AsignaturaNota[] expediente, String titulacionAccesoMaster, double notaAccesoMaster) {
		super(nif, apellidosNombre, titulacion, expediente);
		this.titulacionAccesoMaster = new String(titulacionAccesoMaster);
		this.notaAccesoMaster = notaAccesoMaster;
	}

	public AlumnoMaster(AlumnoMaster alumnoMaster) {
		super(alumnoMaster.getNif(), alumnoMaster.getApellidosNombre(), alumnoMaster.getTitulacion(), alumnoMaster.getExpediente());
		this.titulacionAccesoMaster = new String(alumnoMaster.getTitulacionAccesoMaster());
		this.notaAccesoMaster = alumnoMaster.getNotaAccesoMaster();
	}

	public String getTitulacionAccesoMaster() {
		return titulacionAccesoMaster;
	}

	public void setTitulacionAccesoMaster(String titulacionAccesoMaster) {
		this.titulacionAccesoMaster = new String(titulacionAccesoMaster);
	}

	public double getNotaAccesoMaster() {
		return notaAccesoMaster;
	}

	public void setNotaAcceso(double notaAccesoMaster) {
		this.notaAccesoMaster = notaAccesoMaster;
	}

	@Override
	public String toString() {
		String s = "  Alumno Master {Titulacion Acceso Master: " + titulacionAccesoMaster + ", Nota Acceso Master: " + notaAccesoMaster + "}";
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

		AlumnoMaster other = (AlumnoMaster) obj;
		if (titulacionAccesoMaster == null) {
			if (other.titulacionAccesoMaster != null)
				return false;
		} else if (!titulacionAccesoMaster.equals(other.titulacionAccesoMaster))
			return false;
		if (notaAccesoMaster != other.notaAccesoMaster)
			return false;
		return true;
	}

}