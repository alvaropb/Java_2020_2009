package com.ipartek.formacion.prueba;

/**
 * Clase que representa un coche
 * 
 * @author Curso
 *
 */
public class Coche {

	private String matricula;
	private String marca;
	private String modelo;
	private String color;
	private int potencia;
	private int cilindrada;

	public Coche() {
		this.matricula = "";
		this.marca = "";
		this.modelo = "";
		this.color = "";

	}

	public Coche(String matricula, String marca, String modelo, String color, int potencia, int cilindrada) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.potencia = potencia;
		this.cilindrada = cilindrada;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color
				+ ", potencia=" + potencia + ", cilindrada=" + cilindrada + "]";
	}

}// fin clase Coche
