package ejercicio.basico.principiantes;

import java.util.Scanner;

public class MediaNumerosBucle {
	/**
	 * ejercicio para pedir 3 numeros por pantalla y sacar la media
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean terminar = true;
		float numero, total = 0;
		float contador = 0;
		do {
			System.out.println("Dime un numero");
			numero = Float.parseFloat(sc.nextLine());
			total = total + numero;
//			preguntar si quiere terminar
			System.out.println("¿Quieres terminar? escribe si");
			String linea = sc.nextLine();
			if (linea.equalsIgnoreCase("si")) {
				terminar = false;
			}
			contador = contador + 1;
		} while (terminar);
		System.out.println("El total es " + total);
		System.out.println("La media es x");
		sc.close();
	}

}
