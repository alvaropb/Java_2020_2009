package uf2404;

import java.util.Scanner;

public class PreguntarNombreCompleto {

	public static void main(String[] args) {
		// preguntar nombre ape ape2 y mostrar
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca nombre");
		String nombre = sc.nextLine();
		System.out.println("Introduzca apellido 1");
		String ape1 = sc.nextLine();
		System.out.println("Introduzca apellido 2");
		String ape2 = sc.nextLine();
		System.out.println("el nombre completo es " + nombre + " " + ape1 + " " + ape2);
		sc.close();
	}

}
