package com.ipartek.formacion.excepciones;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Realice un método que reciba como argumento un String y un número y muestre
		// la letra de la posición indicada. Llámelo pasando como parámetro un String
		// sin inicializar. Dicha llamada se encontrara dentro de un bloque try catch,
		// que en caso de producirse una excepción por un paso de parámetros a null, no
		// acabe con la ejecución del programa.
		// Así mismo, se controlara también que si el
		// ==>numero pasado es mayor que el tamaño del string, capturara el error y nos
		// solicitara meter un numero
		// valido, indicándonos los valores en los que puede estar comprendido (para
		// este apartado se le pasa como string la cadena de texto “La lluvia en Sevilla
		// no es una maravilla”)
		Scanner sc = new Scanner(System.in);
		String cadena = null;
		int posicion = 0;

		// apartado 1
		try {
			System.out.println("La letra de la posicion es : " + metodo(cadena, posicion));

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("la ejecucion del programa continua");
			System.out.println("**********************************");
		}

		System.out.println("intro una cadena");
		cadena = sc.nextLine();

		do {
			System.out.println("Intro una posicion");
			try {
				posicion = Integer.parseInt(sc.nextLine());
				if (posicion > cadena.length()) {
					throw new NumberFormatException(
							"Valor fuera de rango, introduzca una posicion entre 0 y " + cadena.length());
				}

				System.out.println("llamada al metodo");
				System.out.println("La letra de la posicion es : " + metodo(cadena, posicion));

			} catch (NumberFormatException e) {
				e.getMessage();
				e.printStackTrace();
			} catch (Exception e) {
				e.getMessage();
				e.printStackTrace();
			}
		} while (posicion > cadena.length());

	}// fin clase

	public static char metodo(String cadena, int posicion) {
		return cadena.charAt(posicion);
	}
}
