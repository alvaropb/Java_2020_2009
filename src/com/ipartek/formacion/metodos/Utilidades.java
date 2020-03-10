package com.ipartek.formacion.metodos;

public class Utilidades {

	public static final String IDIOMA_CASTELLANO = "es";
	public static final String IDIOMA_EUSKERA = "eu";
	public static final String IDIOMA_INGLES = "en";
	public static final String CARACTERES = "TRWAGMYFPDXBNJZSQVHLCKE";

	static void saludar(String nombre) {
		System.out.println("Hola  " + nombre);
	}

	/**
	 * Saluda al nombre pasado por parametro en el idioma seleccionado
	 * 
	 * @see idiomas definidos en esta clase, por ejemplo: public static final String
	 *      IDIOMA_CASTELLANO
	 * @param nombre
	 * @param idioma
	 * @throws Exception
	 */
	static String saludar(String nombre, String idioma) throws Exception {
		String cadenaReturn = "";

		switch (idioma) {
		case IDIOMA_CASTELLANO:
			cadenaReturn = "Hola " + nombre;
			break;
		case IDIOMA_EUSKERA:
			cadenaReturn = "kaixo " + nombre;
			break;
		case IDIOMA_INGLES:
			cadenaReturn = "Hello " + nombre;
			break;
		default:
			throw new Exception("Idioma incorrecto ->" + idioma);

		}

		return cadenaReturn;
	}

	static int suma(int a, int b) {
		return a + b;
	}

	static char calcularLetraDni(int dni) {
		String caracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
		return caracteres.charAt(dni % 23);
	}

	static char calcularLetraDni(String dni) throws Exception {

		if (dni != null && dni.length() == 8) {

		} else {
			throw new Exception("Formato dni no valido ->" + dni);
		}

		return CARACTERES.charAt(Integer.parseInt(dni) % 23);
	}

	/**
	 * Ordena de menor a mayor un array de enteros
	 * 
	 * @see https://www.youtube.com/watch?v=lyZQPjUT5B4&t=65s
	 * @param aDesordenado int[] array desordenado
	 * @return int[] array ordenado de menor a mayor
	 */
	static int[] bubbleShort(int[] aDesordenado) {

		int[] aOrdenado = new int[aDesordenado.length];
		aOrdenado = aDesordenado;
		int aux = 0;
		// TODO ordenar el array de enteros con bubble short
		for (int i = 0; i < aOrdenado.length; i++) {
			for (int j = i + 1; j < aOrdenado.length; j++) {
				if (aOrdenado[j] < aOrdenado[i]) {
					aux = aOrdenado[i];
					aOrdenado[i] = aOrdenado[j];
					aOrdenado[j] = aux;
				} // fin if
			} // fin for j
		} // fin for i

		return aOrdenado;
	}// fin bubbleShort

}
