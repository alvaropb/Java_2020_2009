package com.ipartek.formacion;

public class VariablesPrimitivas {

	public static void main(String[] args) {
//		boleanos
		boolean tienesCoronaVirus = true;// valor por defecto false
//		enteros
		byte bite = 0;// 1 byte
		short corto = 0;// 2 bytes
		int entero = 0;// 4 bytes
		long largo = 0;// 8 bytes
//		reales
		float numeroReal = 0f;
		double todaviaMasGrande = 0;// no hace falta castear o poner el tipo
//		caracteres
		char letra = 'a';// se usan comillas simples
		char letraA = 65;// codigo ascii
		/*
		 * las variables primitivas siempre empiezan en minusculas y tienen un valor
		 * inicial
		 */
		char cSinValor = 0;
		System.out.println("valor inicial del char es " + cSinValor);
		/**
		 * Wrappers clases que nos ayudan a trabajar con las variables primitivas. Estas
		 * empiezan siempre por mayusculas y por ejemplo un int tiene una clase que se
		 * llama Integer, un booleano tiene una clase que se llama Boolean, char tiene
		 * uno que se llama Character y asi sucesivamente
		 */
		System.out.println("un int ocupa " + Integer.SIZE);
		System.out.println("valor minimo " + Integer.MIN_VALUE + " valor maximo " + Integer.MAX_VALUE);
		String numeroEnFormatoTexto = "23";
		String numero2 = "2";
		int total = Integer.parseInt(numero2) + Integer.parseInt(numeroEnFormatoTexto);
		System.out.println(total);
	}// main
}// clase
