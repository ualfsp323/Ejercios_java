package Pruebas_exam;


public class ProfesorTitular extends Profesor {
	private String categoria;

	public ProfesorTitular(String nif, AsignaturaHoras[] docencia, String categoria) {
      super(nif, docencia);
      this.categoria=new String(categoria);
	}
	public ProfesorTitular(String nif,  String categoria) {
	      super(nif);
	      this.categoria=new String(categoria);
		}
	public ProfesorTitular(ProfesorTitular profesorT) {
	      super(profesorT.getNif(),profesorT.getDocencia());
	      this.categoria=new String(profesorT.categoria);
		}
	public String getCategoria() {
		return categoria;
	}

	public void setCaetegoria(String categoria) {
		this.categoria = new String(categoria);
	}
	@Override
	public String toString() {
		String s = "  Profesor Titular {categoria: " + categoria + "}";
		return super.toString() + "\n" + s;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (getClass() != obj.getClass())
			return false;		
		if (!super.equals(obj))
			return false;

		ProfesorTitular otro = (ProfesorTitular) obj;
		return categoria == otro.categoria;
	}
}
