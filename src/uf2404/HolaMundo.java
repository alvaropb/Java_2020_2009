package uf2404;

public class HolaMundo {
	/**
	 * 
	 * @param args
	 */
	// las clases empiezan con mayusulas camel case, las variables con minusculas
	// pascal case
	public static void main(String[] args) {
		/*
		 * comentario de bloque, podemos escribir varias lineas de codigo
		 */
		/*
		 * String es el tipo de la variable. Persona es el nombre de la variable. ander
		 * es el valor de la variable. Usamos el operador + para concatenar strings o
		 * cadenas de texto
		 */
		String persona = "ander";
		// las variables booleanas suelen empezar con is
		boolean isGoodDay = true;
		int edad = 41;
		float altura = 1.70f;

		System.out.println("hola clase");
		System.out.println("hello " + persona);
		System.out.println("mi edad es " + edad);
		//
		System.out.println("mi altura es " + altura + "cm");
		if (isGoodDay)
			System.out.println("hoy tengo un dia bueno");
		else
			System.out.println("hoy es un dia de mierda");

	}// final metodo main

}// final de la clase
