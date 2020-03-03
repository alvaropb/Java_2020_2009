package com.ipartek.formacion.clases;

import java.util.Scanner;

public class DeportePrueba {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Deporte deporte = new Deporte();
		System.out.println("Datos del deporte");
		System.out.println("introduzca el nombre");
		deporte.setNombre(sc.nextLine());
		System.out.println("introduzca descripcion");
		deporte.setDescripcion(sc.nextLine());
		System.out.println("es extremo? si / no");
		deporte.setExtremo("si".equalsIgnoreCase(sc.nextLine()) ? true : false);
		System.out.println("¿cuantas calorias gasta?");
		deporte.setCalorias(Float.parseFloat(sc.nextLine()));

		System.out.println("Deporte :" + deporte);

	}

}
