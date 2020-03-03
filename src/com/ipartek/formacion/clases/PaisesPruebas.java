package com.ipartek.formacion.clases;

public class PaisesPruebas {

	public static void main(String[] args) {
		// crear 2 objetos de tipo pais, uno será españa con 120 casos
		// y Francia con 300, mostrar por consola los datos.
		Pais[] paises = new Pais[2];

		Pais espagna = new Pais();
		espagna.setNombre("España");
		espagna.setNumCasos(120);
		paises[0] = espagna;
		Pais francia = new Pais();
		francia.setNombre("Francia");
		francia.setNumCasos(300);
		paises[1] = francia;

		System.out.println("Objeto España " + espagna);
		System.out.println("Objeto Francia " + francia);
		// ejercicio de coronavirus con objeto pais
		Pais repTxeka = new Pais();
		repTxeka.setNombre("Republica txeka");
		repTxeka.setNumCasos(0);
		Pais alemania = new Pais();
		alemania.setNombre("Alemania");
		alemania.setNumCasos(0);

		for (int i = 0; i < paises.length; i++) {
			System.out.println("El pais " + paises[i].getNombre() + " tiene " + paises[i].getNumCasos());
		}

	}

}
