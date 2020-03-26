package ejercicio.gestion.clinica.veterinaria;

import java.util.ArrayList;

public class Animal {

    private String nombre;
    private String especie;
    private String raza;
    private int edad;
    private ArrayList<Revision> revisiones;
    private int id;

    public Animal() {
	super();
	this.nombre = "";
	this.especie = "";
	this.raza = "";
	this.edad = 0;
	this.setRevisiones(new ArrayList<Revision>());
	this.id = 0;
    }

    public String getNombre() {
	return nombre;
    }

    public void setNombre(String nombre) {
	this.nombre = nombre;
    }

    public String getEspecie() {
	return especie;
    }

    public void setEspecie(String especie) {
	this.especie = especie;
    }

    public String getRaza() {
	return raza;
    }

    public void setRaza(String raza) {
	this.raza = raza;
    }

    public int getEdad() {
	return edad;
    }

    public void setEdad(int edad) {
	this.edad = edad;
    }

    public ArrayList<Revision> getRevisiones() {
	return revisiones;
    }

    public void setRevisiones(ArrayList<Revision> revisiones) {
	this.revisiones = revisiones;
    }

    public int getId() {
	return id;
    }

    public void setId(ArrayList<Animal> animales) {
	int max = 0;
	for (int i = 0; i < animales.size(); i++) {
	    if (animales.get(i).getId() > max) {
		max = animales.get(i).getId();
	    }
	}

	this.id = max;
    }

    @Override
    public String toString() {
	return "Animal [nombre=" + nombre + ", especie=" + especie + ", raza=" + raza + ", edad=" + edad
		+ ", revisiones=" + revisiones + "]";
    }
}
