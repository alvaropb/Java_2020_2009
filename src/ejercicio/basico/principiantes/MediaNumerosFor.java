package ejercicio.basico.principiantes;

import java.util.Scanner;

public class MediaNumerosFor {
	/**
	 * ejercicio para pedir temperatura media de la semana y la temperatura mas baja
	 * y mas alta
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String[] diasSemana = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" };
		Scanner sc = new Scanner(System.in);
		float temperatura, media = 0, max = -100, min = 100;
		for (int i = 0; i < diasSemana.length; i++) {
			System.out.println("Introduzca la temperatura del " + diasSemana[i]);
			temperatura = Float.parseFloat(sc.nextLine());
			media += temperatura;

			if (temperatura < min) {
				min = temperatura;
			}
			if (temperatura > max) {
				max = temperatura;
			}

		} // fin for
		sc.close();
		System.out.println("temperatura media= " + media / 7.f);
		System.out.println("temperatura min=" + min);
		System.out.println("temperatura max=" + max);
	}// fin main

}
