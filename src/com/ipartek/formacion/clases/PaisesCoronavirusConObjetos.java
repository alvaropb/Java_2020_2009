package com.ipartek.formacion.clases;

import java.util.Scanner;

public class PaisesCoronavirusConObjetos {

	public static void main(String[] args) {

		Pais[] PAISES = new Pais[4];
		Pais p = new Pais();
		p.setNombre("España");
		p.setNumCasos(11);
		PAISES[0] = p;
		p = new Pais();
		p.setNombre("Francia");
		p.setNumCasos(8);
		PAISES[1] = p;
		p = new Pais();
		p.setNombre("alemania");
		p.setNumCasos(4);
		PAISES[2] = p;
		p = new Pais();
		p.setNombre("italia");
		p.setNumCasos(0);
		PAISES[3] = p;

		int total = 0;
		Scanner sc = new Scanner(System.in);

		// recorrer paises y preguntar si existe algun caso de corona virus
		for (int i = 0; i < PAISES.length; i++) {

			System.out.println("¿ Tiene algun caso de CV " + PAISES[i].getNombre() + " ?   Si o No");
			String pregunta1 = sc.nextLine();

			if ("si".equalsIgnoreCase(pregunta1)) {

				System.out.println("¿Cuantos casos?");
				int pregunta2 = Integer.parseInt(sc.nextLine());
				total += pregunta2;

				// actualizar arrays
				PAISES[i].setNumCasos(pregunta2);

			}

		} // for de las preguntas

		// finalmente

		// 1: mostrar paises libres de corona virus
		System.out.println("Paises NO Infectados:");
		System.out.println("------------------------------------");
		for (int i = 0; i < PAISES.length; i++) {

			if (!PAISES[i].isInfectado()) {
				System.out.println(PAISES[i]);
			}

		}

		// 2: mostrar paises infectados junto con su numero de casos
		System.out.println("");
		System.out.println("");
		System.out.println("Paises Infectados:");
		System.out.println("------------------------------------");
		for (int i = 0; i < PAISES.length; i++) {

			if (PAISES[i].isInfectado() && PAISES[i].getNumCasos() > 10) {
				System.out.println("*** " + PAISES[i].getNombre() + " " + PAISES[i].getNumCasos());

			} else if (PAISES[i].isInfectado() && PAISES[i].getNumCasos() > 5) {
				System.out.println("** " + PAISES[i].getNombre() + " " + PAISES[i].getNumCasos());

			} else if (PAISES[i].isInfectado()) {
				System.out.println("*" + PAISES[i].getNombre() + " " + PAISES[i].getNumCasos());

			}

		} // for

		// 3: total numero de personas infectadas

		System.out.println("TOTAL Infectados: " + total);

		sc.close();

	}

}
