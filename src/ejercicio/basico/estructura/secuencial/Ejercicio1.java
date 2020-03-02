package ejercicio.basico.estructura.secuencial;

import java.util.Scanner;

public class Ejercicio1 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ejercicio1();
//
//		ejercicio2();
//		ejercicio3();

//		ejercicio4();
//		ejercicio5();
//		ejercicio6();
//		ejercicio7();
	}

	private static void ejercicio7() {
		System.out.println("7. Programa lea la longitud de los catetos de un triángulo rectángulo"
				+ " y calcule la longitud de la hipotenusa según el teorema de Pitágoras. ");
		System.out.println("Introduzca cateto 1");
		float cateto1 = sc.nextFloat();
		System.out.println("Introduzca cateto 2");
		float cateto2 = sc.nextFloat();
		System.out.println("la hipotenusa es " + Math.sqrt((double) (Math.pow(cateto2, 2)) * (Math.pow(cateto1, 2))));
	}

	private static void ejercicio6() {
		System.out.println("6. Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.");
		System.out.println("Introduzca km/h");
		float kmHora = sc.nextFloat();
		float mtsSeg = (kmHora * 10) / 36;

		System.out.println(kmHora + " km/h en mts/seg son " + mtsSeg);
	}

	private static void ejercicio5() {
		System.out.println("5. Programa que lee por teclado el valor del radio de una circunferencia"
				+ " y calcula y muestra por pantalla la longitud " + "y el área de la circunferencia."
				+ " Longitud de la circunferencia = 2*PI*Radio, " + "Area de la circunferencia = PI*Radio^2  ");
		System.out.println("introduzca el radio de una circunferencia");
		float radio = sc.nextFloat();
		System.out.println("Longitud de la circunferencia " + 2 * Math.PI * radio);

		System.out.println("Area de la circunferencia " + Math.PI * Math.pow(radio, 2));
	}

	private static void ejercicio4() {
		System.out.println("4. Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit. "
				+ "La fórmula correspondiente es: F = 32 + ( 9 * C / 5)");
		System.out.println("introduzca un numero de grados centigrados");
		float celsius = sc.nextFloat();
		float fahrenheit = 32 + ((9 * celsius) / 5);
		System.out.println("los grados " + celsius + "º son " + fahrenheit + " fahrenheit");
	}

	private static void ejercicio3() {
		System.out.println("3. Programa Java que "
				+ "lee un número entero por teclado y obtiene y muestra por pantalla el doble y el triple de ese número.");
		System.out.println("introduzca un numero");
		float num = (float) sc.nextFloat();
		float doble = (float) num * 2;
		float triple = (float) num * 3;
		System.out.println("el doble de " + num + " es " + doble);
		System.out.println("el triple de " + num + " es " + triple);
	}

	private static void ejercicio2() {
		System.out.println(
				"2. Programa Java que lea un nombre y muestre por pantalla:" + " “Buenos dias nombre_introducido”.");
		System.out.println("Introduzca nombre");

		String nombre = sc.next();
		System.out.println("Buenos dias " + nombre);
	}

	private static void ejercicio1() {
		System.out.println("1. Programa Java que lea dos números enteros por teclado y los muestre por pantalla.");

		System.out.println("introduzca un entero");
		int entero1 = sc.nextInt();

		System.out.println("introduzca otro entero");
		int entero2 = sc.nextInt();

		System.out.println("primer entero " + entero1);
		System.out.println("segundo entero " + entero2);
	}

}
