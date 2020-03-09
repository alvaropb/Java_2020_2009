package com.ipartek.formacion.excepciones;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {
//	•	1: ArithmeticException
//	•	2: NullpointerException
//	•	3: NumberFormatException
//	•	4: SecurityException
//	•	5: NegativeArrayException
//	•	6: IOException
	// Haciendo uso del try y del catch, mostrar un mensaje por pantalla y explicar
	// cuál es la excepción ocurrida. Repetir este proceso de manera indefinida,
	// controlando dichas excepciones y sin dar pie a que el programa se cuelgue

	public static void main(String[] args) {
		do {

			Random rd = new Random();
			int numeroAleatorio = 1 + rd.nextInt(6);
			try {
				switch (numeroAleatorio) {
				case 1:
					throw new ArithmeticException("ArithmeticException");
				case 2:

					throw new NullPointerException("NullpointerException");
				case 3:

					throw new NumberFormatException("NumberFormatException");
				case 4:

					throw new SecurityException("SecurityException");
				case 5:

					throw new NegativeArraySizeException("NegativeArraySizeException");
				case 6:

					throw new IOException("IOException");

				default:
					break;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			Scanner sc = new Scanner(System.in);
			System.out.println("presione enter para continuar");
			sc.nextLine();
		} while (true);
	}
}
