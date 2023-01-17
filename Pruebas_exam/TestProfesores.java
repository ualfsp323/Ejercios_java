package Pruebas_exam;

public class TestProfesores {
	@SuppressWarnings({"rawtypes","unchecked"})
	public static void ordenacionSeleccionn(Comparable[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			Comparable valorMin = array[i];
			int pos = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j].compareTo(valorMin) < 0) {
					valorMin = array[j];
					pos = j;
				}
			}
			if (pos != i) {
				array[pos] = array[i];
				array[i] = valorMin;
			}
		}

	}

	public static void main(String[] args) {
		ProfesorTitular[] arrayProf = { new ProfesorTitular("03W", "CU"), new ProfesorTitular("01R", "PTU"),
				new ProfesorTitular("04T", "PTEU"), new ProfesorTitular("02G", "CEU") };
		AsignaturaHoras[] docencia1 = { new AsignaturaHoras("TDI", 10.5), new AsignaturaHoras("MP", 4.5),
				new AsignaturaHoras("LYA", 5.0) };
		AsignaturaHoras[] docencia2 = { new AsignaturaHoras("EDA", 15.5), new AsignaturaHoras("IP", 4.5) };
		AsignaturaHoras[] docencia3 = { new AsignaturaHoras("MP", 9.5), new AsignaturaHoras("CAL", 10.5) };
		AsignaturaHoras[] docencia4 = { new AsignaturaHoras("FI", 7.5), new AsignaturaHoras("ELE", 12.5) };

		arrayProf[0].setDocencia(docencia1);
		arrayProf[1].setDocencia(docencia2);
		arrayProf[2].setDocencia(docencia3);
		arrayProf[3].setDocencia(docencia4);

		System.out.println("*** Array de profesores titulares sin ordenar ***");
		for (int i = 0; i < arrayProf.length; i++) {
			System.out.println(arrayProf[i].toString());
		}
		ordenacionSeleccionn(arrayProf);
		System.out.println("");
		System.out.println("*** Array de profesores titulares  ordenado ***");
		for (int i = 0; i < arrayProf.length; i++) {
			System.out.println(arrayProf[i].toString());
		}
	}

}
