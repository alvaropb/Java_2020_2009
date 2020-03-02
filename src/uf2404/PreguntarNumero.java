package uf2404;

import java.util.Scanner;

public class PreguntarNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("dime un numero");
		Scanner teclado = new Scanner(System.in);
		int numero = teclado.nextInt();// lee un numero introducido por el usuario
		if (numero == 0) {
			System.out.println(numero + " es cero");
		} else if (numero % 2 == 0) {
			System.out.println(numero + " es par");
		} else {
			System.out.println(numero + " es impar");
		}

		// analizar si es par o impar
		teclado.close();// cerramos el teclado
	}

}
