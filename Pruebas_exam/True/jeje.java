@SuppressWarnings({"rawtypes", "unchecked"})
	public static int busquedaBinaria(Comparable[] array, Comparable clave) {
		int primero = 0;
		int ultimo = array.length - 1;
		int central;
		if ((clave.compareTo(array[0]) < 0) || (clave.compareTo(array[array.length - 1]) > 0))
			return -1;
		else {
			while (ultimo >= primero) {
				central = (primero + ultimo) / 2;
				if (clave.compareTo(array[central]) < 0)		// subarray izquierdo
					ultimo = central - 1;
				else if (clave.compareTo(array[central]) > 0)	// subarray derecho
					primero = central + 1;
				else
					return central;
			}
			return -1;
		}
	}

	@SuppressWarnings({"rawtypes", "unchecked"})
	public static void ordenacionBurbujaMejorada(Comparable[] array) {
		Comparable aux;
		boolean cambiado = true;
		for (int i = 1; cambiado && (i < array.length); i++) {
			cambiado = false;
			for (int j = 0; j < array.length - i; j++) {
				if (array[j].compareTo(array[j + 1]) > 0) {
					// Intercambiar
					aux = array[j];
					array[j] = array[j + 1];
					array[j + 1] = aux;
					cambiado = true;
				}
			}
		}
	}
@SuppressWarnings({"rawtypes", "unchecked"})
		public static void ordenacionSeleccion(Comparable[] array) {
			for (int i = 0; i < array.length - 1; i++) {
				Comparable valorMinimo = array[i];
				int posicionMinimo = i;
				for (int j = i + 1; j  < array.length; j++) {
					if (array[j].compareTo(valorMinimo) < 0) {
						valorMinimo = array[j];
						posicionMinimo = j;
					}
				}
				if (posicionMinimo != i) {
					array[posicionMinimo] = array[i];
					array[i] = valorMinimo;
				}
			}
		}

public static int indiceJugadorMenorExperiencia(Futbolero [] equipo) {
		if (equipo == null)
			return -1;
		else {
			int indice = -1;
			int min = Integer.MAX_VALUE;
			for (int i = 0; i < equipo.length; i++) {
				if (equipo[i] instanceof Jugador) {
					if (equipo[i].mesesExperiencia() < min) {
						min = equipo[i].mesesExperiencia();
						indice = i;
					}
				}
			}
			return indice;
		}
	}
	
