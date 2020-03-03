package com.ipartek.formacion.clases;

public class Persona {
	// atributos siempre son private para que no se pueda manipular desde fuera de
	// esta clase, hay que crear atributos publicos parapoder manipular los
	// atributos, denominados getters y setters. A esto se le llama encapsulacion
	// ATRIBUTOS
	private String nombre;
	private int edad;

	// constructor porque se llama igual que la clase
	// CONSTRUCTOR
	public Persona() {
		super();
		this.nombre = "anonimo";
		this.edad = 18;
	}

	// GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
}
