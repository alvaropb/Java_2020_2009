package com.ipartek.formacion.prueba;

import java.util.Scanner;

/**
 * A) Realizar un programa en java que realice la siguiente función: Crear un
 * array de 5 notas que almacenara en formato double. Una vez creado dicho array
 * se rellenaran dichos elementos leyéndolo desde el teclado. Una vez creado el
 * contenido, se calculara la media de las notas así como se mostraran las notas
 * más altas y más bajas de dicho array.
 * 
 * @author Curso
 *
 */
public class UF2404EjercicioA {
	static Scanner sc;

	public static void main(String[] args) {
		// declarar variables
		double arrayNumeros[] = { 0, 0, 0, 0, 0 };
		double media = 0;
		double max = Double.MIN_VALUE;
		double min = Double.MAX_VALUE;

		// Abrir scanner
		sc = new Scanner(System.in);

		// Hacer un for de la longitud del array
		for (int i = 0; i < arrayNumeros.length; i++) {
			// rpeguntar por pantalla la nota
			System.out.println("Introduzca una nota");
			// guardar en el array la nota
			pedirNota(arrayNumeros, i);
			// sumar la nota en la media
			media += arrayNumeros[i];
			// comprobar si es la nota maxima para guardarla en la variable maxima
			if (arrayNumeros[i] > max) {
				max = arrayNumeros[i];
			}
			// lo mismo con la minima
			if (arrayNumeros[i] < min) {
				min = arrayNumeros[i];
			}

		} // end for

		// usar la variable media para conseguir la media de las notas
		System.out.println("la media de las notas es:" + media / 5);
		System.out.println("la nota maxima es :" + max);
		System.out.println("la nota minima es :" + min);
		sc.close();
		// cerrar scanner

	}// main

	private static void pedirNota(double[] arrayNumeros, int i) {
		boolean continuar = false;
		do {
			try {
				arrayNumeros[i] = Double.parseDouble(sc.nextLine());
				if (arrayNumeros[i] < 0 || arrayNumeros[i] > 10) {
					throw new Exception("Nota fuera de rango ");
				}
				continuar = false;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println("introduzca una nota valida:\n");
				continuar = true;
			} // fin try catch

		} while (continuar);// do while
	}// pedirNota
}
