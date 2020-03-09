package com.ipartek.formacion.metodos;

public class Utilidades {

	public static final String IDIOMA_CASTELLANO = "es";
	public static final String IDIOMA_EUSKERA = "eu";
	public static final String IDIOMA_INGLES = "en";

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
	 */
	static void saludar(String nombre, String idioma) {
		if (idioma.equalsIgnoreCase(IDIOMA_CASTELLANO)) {
			System.out.println("Hola  " + nombre);
		} else if (idioma.equalsIgnoreCase(IDIOMA_EUSKERA)) {
			System.out.println("kaixo  " + nombre);
		} else if (idioma.equalsIgnoreCase(IDIOMA_INGLES)) {
			System.out.println("Hello  " + nombre);
		}
		System.out.println("No se selecciono idioma");
	}

	static int suma(int a, int b) {
		return a + b;
	}

	static char calcularLetraDni(int dni) {
		String caracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
		return caracteres.charAt(dni % 23);
	}

	static char calcularLetraDni(String dni) {
		String caracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
		return caracteres.charAt(Integer.parseInt(dni) % 23);
	}

}
