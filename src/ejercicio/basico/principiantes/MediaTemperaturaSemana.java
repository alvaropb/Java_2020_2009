package ejercicio.basico.principiantes;

import java.util.Scanner;

public class MediaTemperaturaSemana {
	/**
	 * ejercicio para pedir temperatura media de la semana y la temperatura mas baja
	 * y mas alta
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean seguir = true;
		float temperatura, total = 0, alta, baja;
		float contador = 0;

		for (int i = 0; i < 7; i++) {
			System.out.println("Dime la temperatura del dia");
			temperatura = Float.parseFloat(sc.nextLine());
			total = total + temperatura;

		}
//			preguntar si quiere terminar

		String linea = sc.nextLine();
		if (contador == 6) {
			seguir = false;
		}
		contador = contador + 1;

		System.out.println("El total es " + total);
		System.out.println("La media es x");
		sc.close();
	}

}
