package uf2404;

public class PruebaTecnica {

	public static void main(String[] args) {
		System.out.println("** empezamos el bucle");
		for (int i = 0; i < 5; i++) {

			if (i % 2 == 0) {
				if (i == 0) {
					System.out.println(i + " es cero");
				} else {
					System.out.println(i + " es par");
				}
			} else {
				System.out.println(i + " es impar");
			}

		} // for

		System.out.println("** terminamos el bucle");
	}// main

}// clase
