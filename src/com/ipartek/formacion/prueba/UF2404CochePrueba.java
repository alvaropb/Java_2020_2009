package com.ipartek.formacion.prueba;

import java.util.ArrayList;
import java.util.Scanner;

public class UF2404CochePrueba {
	static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		ArrayList<Coche> coches = new ArrayList<Coche>();

		menu(coches);

		pintarLista(coches);
		sc.close();

	}// main

	/**
	 * Metodo que muestra el contenido del listado de coches
	 * 
	 * @param coches
	 */
	private static void pintarLista(ArrayList<Coche> coches) {
		System.out.println("Mostrar el contenido del listado");
		System.out.println("************************");
		for (Coche uf2404Coche : coches) {
			System.out.println(uf2404Coche.toString());
		}
		System.out.println("************************");
		System.out.println("Fin del listado de coches");
		System.out.println("Saliendo del programa...");
	}// pintarLista

	/**
	 * Metodo que pide datos de coches y los guarda en el array
	 * 
	 * @param coches
	 */
	private static void menu(ArrayList<Coche> coches) {
		String seguir;
		Coche coche;
		System.out.println("Bienvenido al menu del programa");
		do {
			coche = new Coche();
			System.out.println("Introduzca la matricula : ");
			coche.setMatricula(sc.nextLine());
			System.out.println("Introduzca la marca : ");
			coche.setMarca(sc.nextLine());
			System.out.println("Introduzca el modelo : ");
			coche.setModelo(sc.nextLine());
			System.out.println("Introduzca el color : ");
			coche.setColor(sc.nextLine());
			System.out.println("Introduzca la potencia : ");
			coche.setPotencia(Integer.parseInt(sc.nextLine()));
			System.out.println("Introduzca la cilindrada : ");
			coche.setCilindrada(Integer.parseInt(sc.nextLine()));
			System.out.println("Introduciendo coche en el listado...");
			coches.add(coche);
			System.out.println("¿Desea seguir introduciendo coches? s/S sí n/N no");
			seguir = sc.nextLine();

		} while ("s".equalsIgnoreCase(seguir));
	}// fin menu
}
