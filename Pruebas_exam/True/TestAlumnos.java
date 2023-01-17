package Verdadero;

public class TestAlumnos {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void ordenacionBurbujaMejorada(Comparable[] a) {

		boolean cambiado = true;
		int i = 1;
		while (cambiado && (i < a.length)) {
			cambiado = false;
			for (int j = 0; j < a.length - i; j++) {
				if (a[j].compareTo(a[j + 1]) > 0) {
					Comparable aux = a[j];
					a[j] = a[j + 1];
					a[j + 1] = aux;
					cambiado = true;
				}
			}
			i++;
		}
	}

	public static void main(String[] args) {

		Alumno [] grupo = {
			new AlumnoGrado("12345678A", "Lopez Lopez Juan", "GrIngInf", null, false, 9.75),
			new AlumnoGrado("87654321Z", "Garcia Sanchez Maria", "GrIngInf", null, true, 12.25),
			new AlumnoGrado("27281097X", "Perez Hernandez Luis", "GrIngInf", null, true, 8.55),
			new AlumnoMaster("66650021P", "Jimenez Ortega Ines", "MasIngInf", null, "GrIngInf", 8.22),
			new AlumnoMaster("25270133H", "Fernandez Martinez Manuel", "MasIngInf", null, "IngInf", 7.31)
		};

		AsignaturaNota [] expediente1 = {
			new AsignaturaNota("IP", 7.5),
			new AsignaturaNota("MP", 4.5),
			new AsignaturaNota("ALMD", 5.5),
			new AsignaturaNota("CNAM", 6.0),
			new AsignaturaNota("FE", 6.5)
		};
		AsignaturaNota [] expediente2 = {
			new AsignaturaNota("IP", 9.5),
			new AsignaturaNota("MP", 8.5),
			new AsignaturaNota("ALMD", 7.0),
			new AsignaturaNota("CNAM", 6.0),
			new AsignaturaNota("FE", 9.0),
			new AsignaturaNota("EDA1", 7.5),
			new AsignaturaNota("EDA2", 9.7)
		};
		AsignaturaNota [] expediente3 = {
			new AsignaturaNota("IP", 5.5),
			new AsignaturaNota("OGE", 8.0),
			new AsignaturaNota("Cal", 4.5),
			new AsignaturaNota("ALMD", 3.0),
			new AsignaturaNota("FI", 5.5)
		};
		AsignaturaNota [] expediente4 = {
			new AsignaturaNota("DWM", 8.5),
			new AsignaturaNota("SP", 8.0),
			new AsignaturaNota("CC", 7.5),
			new AsignaturaNota("PTIC", 7.0),
			new AsignaturaNota("SR", 8.0),
			new AsignaturaNota("SR", 9.5)
		};
		AsignaturaNota [] expediente5 = {
			new AsignaturaNota("DWM", 7.5),
			new AsignaturaNota("SP", 7.0),
			new AsignaturaNota("CC", 6.5),
			new AsignaturaNota("PTIC", 6.0),
			new AsignaturaNota("SR", 7.0),
			new AsignaturaNota("SR", 9.0),
			new AsignaturaNota("SI", 3.0),
			new AsignaturaNota("SM", -1.0)
		};

		grupo[0].setExpediente(expediente1);
		grupo[1].setExpediente(expediente2);
		grupo[2].setExpediente(expediente3);
		grupo[3].setExpediente(expediente4);
		grupo[4].setExpediente(expediente5);

		System.out.println("*** Grupo de alumnos sin ordenar ***\n");

		for (int i = 0; i < grupo.length; i++) {
			System.out.println(grupo[i].toString());
		}

		System.out.println("\n*** Grupo de alumnos ordenado ***\n");

		ordenacionBurbujaMejorada(grupo);

		for (int i = 0; i < grupo.length; i++) {
			System.out.println(grupo[i].toString());
		}

		System.out.println("\n*** Alumno con mejor expediente:");
		System.out.println(grupo[grupo.length - 1].toString());
	}
}


