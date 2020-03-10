package com.ipartek.formacion.metodos;

public class EjemploDeUso {

	public static void main(String[] args) throws Exception {

		String manolo = "Manolo";

		Utilidades.saludar(manolo);
		System.out.println(Utilidades.saludar(manolo, Utilidades.IDIOMA_CASTELLANO));
		System.out.println(Utilidades.saludar(manolo, Utilidades.IDIOMA_EUSKERA));
		System.out.println(Utilidades.saludar(manolo, Utilidades.IDIOMA_INGLES));
		Utilidades.saludar(manolo, "aleman");

		System.out.println(" 3 + 3 = " + Utilidades.suma(3, 3));

		System.out.println("La letra del dni 11111111 es " + Utilidades.calcularLetraDni("11111111"));
		System.out.println("La letra del dni 11111111 es " + Utilidades.calcularLetraDni(11111111));
		System.out.println("la letra del dni 12345678 es" + Utilidades.calcularLetraDni("12345678"));

	}

}
