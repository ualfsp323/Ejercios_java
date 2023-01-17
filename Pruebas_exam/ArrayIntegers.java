package Pruebas_exam;


public class ArrayIntegers implements Comparable<Object> {
	private ArrayIntegers[] array;

	public ArrayIntegers(int numeroElementos) {
		array = new ArrayIntegers[numeroElementos];
		for (int i = 0; i < array.length; i++)
			array[i] = new ArrayIntegers(i);
	}

	public ArrayIntegers(int[] array) {
		this.array = new ArrayIntegers[array.length];
		for (int i = 0; i < array.length; i++)
			this.array[i] = new ArrayIntegers(array[i]);
	}

	public ArrayIntegers(ArrayIntegers[] array) {
		this.array = new ArrayIntegers[array.length];
		for (int i = 0; i < array.length; i++)
			this.array[i] = new ArrayIntegers(array[i].intValue());
	}

	public ArrayIntegers(ArrayIntegers arrayIntegers) {
		array = new ArrayIntegers[arrayIntegers.getNumeroElementos()];
		for (int i = 0; i < arrayIntegers.getNumeroElementos(); i++)
			array[i] = new ArrayIntegers(arrayIntegers.getValorElemento(i).intValue());
	}

	public ArrayIntegers[] getArrayIntegers() {
		return array;
	}

	public void setArrayIntegers(ArrayIntegers[] array) {
		if (this.array != null)
			this.array = null;
		this.array = new ArrayIntegers[array.length];
		for (int i = 0; i < array.length; i++)
			this.array[i] = new ArrayIntegers(array[i].intValue());
	}

	public void setArrayValor(ArrayIntegers valor) {
		if (array != null) {
			for (int i = 0; i < array.length; i++)
				array[i] = new ArrayIntegers(valor.intValue());
		}
	}6

	public int getNumeroElementos() {
		return array.length;
	}

	public ArrayIntegers getValorElemento(int posicion) {
		if ((posicion < 0) || (posicion > array.length - 1))
			throw new RuntimeException("Valor de posicion fuera de rango");
		return array[posicion];
	}

	public boolean setValorElemento(int posicion, ArrayIntegers valor) {
		if ((posicion < 0) || (posicion > array.length - 1))
			return false;
		array[posicion] = new ArrayIntegers(valor.intValue());
		return true;
	}

	public double getMedia() {
		int sum = 0;
		for (int i = 0; i < array.length; i++)
			sum += array[i].intValue();
		return (double) sum / (double) array.length;
	}

	public int buscar(ArrayIntegers clave) {
		for (int i = 0; i < array.length; i++) {
			if (clave.equals(array[i]))
				return i;
		}
		return -1;
	}

	public void ordenar() {
		for (int i = 1; i < array.length; i++) {
			ArrayIntegers aux = array[i];
			int j;
			for (j = i - 1; (j >= 0) && (aux.compareTo(array[j]) < 0); j--)
				array[j + 1] = array[j];
			array[j + 1] = aux;
		}
	}

	public void eliminarDuplicados() {
		ArrayIntegers[] arrayAuxiliar = new ArrayIntegers [array.length];
		arrayAuxiliar[0] = new ArrayIntegers(array[0].intValue());
		int indiceResultado = 1;
		for (int i = 1; i < array.length; i++) {
			boolean flag = false;
			for (int j = i - 1; j >= 0; j--) {
				if (array[i].equals(array[j])) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				arrayAuxiliar[indiceResultado] = new ArrayIntegers (array[i].intValue());
				indiceResultado++;
			}
		}
		if (indiceResultado != array.length) {
			ArrayIntegers [] resultado = new ArrayIntegers[indiceResultado];
			for (int i = 0; i < resultado.length; i++)
				resultado[i] = new ArrayIntegers (arrayAuxiliar[i].intValue());
			array = resultado;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		if (!(obj instanceof ArrayIntegers))
			return false;
		ArrayIntegers other = (ArrayIntegers) obj;
		if (array.length != other.getNumeroElementos())
			return false;
		else {
			boolean equal = true;
			for (int i = 0; (i < array.length) && (equal); i++) {
				if (!array[i].equals(other.getValorElemento(i)))
					equal = false;
			}
			return equal;
		}
//return Arrays.equals(array, other.getArrayIntegers());
	}

	@Override
	public String toString() {
		String salida = "ArrayIntegers: [";
		for (int i = 0; i < array.length; i++) {
			if (i != array.length - 1)
				salida += array[i].intValue() + " ";
			else
				salida += array[i].intValue();
		}
		salida += "]";
		return salida;
	}

	public int compareTo(Object o) {
		ArrayIntegers otroArray = (ArrayIntegers) o;
		if (this.getMedia() > otroArray.getMedia())
			return 1;
		else if (this.getMedia() < otroArray.getMedia())
			return -1;
		else
			return 0;
	}
}