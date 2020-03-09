package com.ipartek.formacion.prueba;

import java.util.Scanner;

/**
 * B) Crear un proyecto en modo consola que nos muestre un menú de 3 opciones
 * <ol>
 * <li>Calcular la letra del dni</li>
 * <li>Calcular medida de cm a pulgadas</li>
 * <li>Salir Hacer</li>
 * </ol>
 * que dicho menú se ejecute en bucle hasta que se pulse salir, y si el usuario
 * escoge cada una de las funciones, que permita introducir los datos
 * correspondientes por teclado para poder dar el resultado
 * 
 * @author Curso
 *
 */
public class UF2404EjercicioB {
	static Scanner sc;

	public static void main(String[] args) {
		// declarar variables
		boolean continuar = true;
		int opcion = 0;

		// abrir scanner
		sc = new Scanner(System.in);
		// do
		do {
			System.out.println("\nmenú de 3 opciones: Introduzca una opcion");
			System.out.println("1.- Calcular la letra del dni");
			System.out.println("2.- Calcular medida de cm a pulgadas");
			System.out.println("3.- Salir");
			opcion = Integer.valueOf(sc.nextLine());
			switch (opcion) {
			case 1:
				calcularLetraDni();
				break;
			case 2:
				calcularCmAPulgadas();
				break;
			case 3:
				continuar = false;
				break;

			default:
				break;
			}
		} while (continuar);// fin do while

		sc.close();
	}// fin main

	private static void calcularCmAPulgadas() {
		// declarar variables
		double cm = 0;
		boolean continuar = true;

		do {

			try {
				System.out.println("Introduzca numero de cm a convertir en pulgadas :");
				cm = Integer.valueOf(sc.nextLine());
				continuar = false;
			} catch (NumberFormatException e) {
				System.out.println("formato no valido");
			}
		} while (continuar);
		System.out.println(cm + " cm es igual a :" + (cm / 2.54) + " pulgadas");

	}// fin calcularCmAPulgadas

	private static void calcularLetraDni() {

		// declarar variables
		String caracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
		int dni = 0;
		// pedir por pantalla dni
		System.out.println("Introduzca un dni valido");
		try {
			dni = Integer.valueOf(sc.nextLine());
			String dniValidar = String.valueOf(dni);
			if (dniValidar.length() != 8) {
				throw new Exception("El formato de dni no es valido");
			}
			System.out.println("la letra para el dni " + dni + " es " + caracteres.charAt(dni % 23));

		} catch (Exception e) {
			System.out.println(dni + " no es un formato valido");
			e.printStackTrace();
		} // fin try catch
			// calcular letra

		// puntar resultado

	}// fin calcular letra dni

}
