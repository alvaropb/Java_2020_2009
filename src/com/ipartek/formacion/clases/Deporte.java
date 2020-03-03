package com.ipartek.formacion.clases;

public class Deporte {
	private String nombre;
	private String descripcion;
	private boolean extremo;
	private float calorias;

	public Deporte() {
		super();
		this.nombre = "";
		this.descripcion = "";
		this.extremo = false;
		this.calorias = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isExtremo() {
		return extremo;
	}

	public void setExtremo(boolean extremo) {
		this.extremo = extremo;
	}

	public float getCalorias() {
		return calorias;
	}

	public void setCalorias(float calorias) {
		this.calorias = calorias;
	}

	@Override
	public String toString() {
		return "Deporte [nombre=" + nombre + ", descripcion=" + descripcion + ", extremo=" + extremo + ", calorias="
				+ calorias + "]";
	}

}
