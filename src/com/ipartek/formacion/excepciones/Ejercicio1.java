package com.ipartek.formacion.excepciones;

import java.util.Scanner;

public class Ejercicio1 {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Implemente un programa que lea un número ‘a’ y otro número ‘b’ y luego
		// calcule “a/b”. Pruebe a introducir b=0 y ver que hace el programa con la
		// división por cero.
//		Pruebe a introducir b=”Carlos” para ver cómo se comporta el programa.
//		Añada excepciones para recoger estas excepciones y avisar del problema al usuario
		float a;
		float b;
		float resultado = 0f;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("intro num a");
			a = Float.parseFloat(sc.nextLine());
			System.out.println("Intro b");
			b = Float.parseFloat(sc.nextLine());
			resultado = a / b;
			if (resultado == Float.POSITIVE_INFINITY) {
				throw new Exception("Infinito para la division " + a + "/" + b);
			}

		} catch (NumberFormatException e) {
			e.getMessage();
			System.out.println("Capturada NumberFormatException");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Resultado es " + resultado);

	}

}
