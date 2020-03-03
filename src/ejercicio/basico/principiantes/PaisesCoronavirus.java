package ejercicio.basico.principiantes;

import java.util.Scanner;

public class PaisesCoronavirus {
	/**
	 * 1º recorrer paises, preguntar si existe algun caso de coronavirus en caso
	 * afirmativo, preguntar numero de infectados Finalmente, Mostrar paises libres
	 * de coronavirus. Mostrar paises infectados junto con su numero de casos. Total
	 * de personas infectadas .
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		final String[] PAISES = { "Noruega", "Alemania", "Rep Checa", "Italia" };
		boolean[] paisesInfectados = { false, false, false, false };
		int[] numeroInfectados = { 0, 0, 0, 0 };
		int total = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < PAISES.length; i++) {
			System.out.println("Existe algun caso de coronavirus en " + PAISES[i] + "? S- si N-no ");
			String respuesta = sc.nextLine();
			if ("S".equalsIgnoreCase(respuesta)) {
				paisesInfectados[i] = true;
				System.out.println("¿cuantos casos de coronavirus se han detectado?");
				int numCasos = Integer.parseInt(sc.nextLine());
				numeroInfectados[i] = numCasos;
			} // fin if
			total += numeroInfectados[i];
		} // fin for

		System.out.println("Mostrando resultados");
		for (int i = 0; i < numeroInfectados.length; i++) {
			System.out.println("el pais es " + PAISES[i]);

			System.out.println(
					numeroInfectados[i] > 0 ? "hay ." + numeroInfectados[i] + " infectados" : "No hay infectados");
		} // fin for
		sc.close();
		System.out.println("total de infectados en la lista de paises= " + total);
	}// fin main

}
