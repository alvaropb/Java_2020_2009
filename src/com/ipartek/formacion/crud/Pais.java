package com.ipartek.formacion.crud;

public class Pais {

	private String nombre;
	private int numCasos;

	public Pais() {
		super();
		this.nombre = "";
		this.numCasos = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumCasos() {
		return numCasos;
	}

	public void setNumCasos(int numCasos) {
		this.numCasos = numCasos;
	}

	public boolean isInfectado() {

		return this.numCasos > 0;

	}

	@Override
	public String toString() {
		return "Pais [nombre=" + nombre + ", numCasos=" + numCasos + "]";
	}

}
