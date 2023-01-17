package Pruebas_exam;


public class AsignaturaHoras implements Comparable<Object> {
	private String asignatura;
	private double hora;

	public  AsignaturaHoras(String asignatura, double hora) {
		super();
		this.asignatura = new String(asignatura);
		this.hora = hora;
	}
	public  AsignaturaHoras(String asignatura) {
		super();
		this.asignatura = new String(asignatura);
	}
	public AsignaturaHoras(AsignaturaHoras asignaturaHoras) {
		super();
		this.asignatura = new String(asignaturaHoras.asignatura);
		this.hora = asignaturaHoras.hora;
	}
	public String getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(String asignatura) {
		this.asignatura= new String(asignatura);
	}
	public double getHora() {
		return hora;
	}
	public void setHora(double hora) {
		this.hora= hora;
	}
	public String toString() {
		return  "( "+ asignatura +", "+ hora+ " )";
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
		
		AsignaturaHoras otro = (AsignaturaHoras) obj;
		if(asignatura==null) {
			if(otro.asignatura!=null) {
				return false;
			}
		}else if(!asignatura.equals(otro.asignatura)) {
			return false;
		}
	
		if (hora !=otro.hora) {
			return false;
		}
		return true;
	}
	@Override
	public int compareTo(Object obj) {
		AsignaturaHoras copy= (AsignaturaHoras)obj;
		
		return this.asignatura.compareTo(copy.getAsignatura());
		
	}

}
