package com.ipartek.formacion.excepciones;

import java.util.Scanner;

public class Ejercicio2 {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Realice un programa que nos solicite por teclado dos n�meros, y leerlos
		// usando la clase Scanner mediante la funci�n nextLine().
//		Transformar ambos strings a n�meros enteros usando la siguiente sentencia Integer.parseInt(numeroLeido). 
//		Agrupar el c�digo entre un bloque try catch y procesar para que no se produzca una interrupci�n y finalizaci�n
//		del programa si alguno de los n�meros le�dos no puede convertirse,
//		retomando el control en el punto del fallo, hasta que se solucione

		int a;
		int b;
		String numeroLeido = "";
		boolean seguir = false;

		Scanner sc = new Scanner(System.in);
		do {
			try {
				System.out.println("Introduzca un numero a: ");
				numeroLeido = sc.nextLine();
				a = Integer.parseInt(numeroLeido);

				System.out.println("Introduzca un numero b: ");
				numeroLeido = sc.nextLine();
				b = Integer.parseInt(numeroLeido);
				seguir = false;
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Ocurrio un error, por favor introduzca de nuevo los 2 numeros");
				seguir = true;
			}
		} while (seguir);
		sc.close();

	}// fin main

}
