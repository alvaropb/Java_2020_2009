package ejercicio.basico.principiantes;

import java.util.Scanner;

public class MediaNumeros {
	/**
	 * ejercicio para pedir 3 numeros por pantalla y sacar la media
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int num1, num2, num3;
		float media;
		Scanner sc = new Scanner(System.in);

		System.out.println("dime el primer numero: ");
		num1 = Integer.parseInt(sc.nextLine());

		System.out.println("dime el segundo numero: ");
		num2 = Integer.parseInt(sc.nextLine());

		System.out.println("dime el tercer numero: ");
		num3 = Integer.parseInt(sc.nextLine());

		media = (num1 + num2 + num3) / 3.0f;
		System.out.println("la media es " + media);
		sc.close();
	}

}
