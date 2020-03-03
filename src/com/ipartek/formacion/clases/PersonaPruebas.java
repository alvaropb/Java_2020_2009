package com.ipartek.formacion.clases;

public class PersonaPruebas {

	public static void main(String[] args) {
		Persona adam = new Persona();// usamos la palabra new para crear un objeto o instanciar
		Persona eva = new Persona();
		adam.setNombre("adam");
		adam.setEdad(45);
		System.out.println("mi nombre es " + adam.getNombre() + " y tengo " + adam.getEdad() + " años");
		System.out.println("ADAM: " + adam);// el syso hace un .toString automatico
		System.out.println("EVA: " + eva);

	}

}
