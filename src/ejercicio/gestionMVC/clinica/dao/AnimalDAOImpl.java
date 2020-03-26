package ejercicio.gestionMVC.clinica.dao;

import java.util.ArrayList;

import ejercicio.gestionMVC.clinica.idao.IAnimalDAO;
import ejercicio.gestionMVC.clinica.model.Animal;

public class AnimalDAOImpl implements IAnimalDAO {

    private ArrayList<Animal> animales;

    public AnimalDAOImpl() {
	super();
	this.animales = new ArrayList<Animal>();
    }

    public ArrayList<Animal> getAnimales() {
	return animales;
    }

    public void setAnimales(ArrayList<Animal> animales) {
	this.animales = animales;
    }

    @Override
    public int create(Animal animal) {
	int idMax = 1;
	for (int i = 0; i < animales.size(); i++) {
	    if (idMax < animales.get(i).getId()) {
		idMax = animales.get(i).getId();
	    }
	}
	animal.setId(idMax);
	animales.add(animal);

	return idMax;
    }

    @Override
    public Animal getById(int id) {
	Animal animal = new Animal();
	for (int i = 0; i < animales.size(); i++) {
	    if (id == animales.get(i).getId()) {
		animal = animales.get(i);
		i = animales.size();
	    }
	}
	return animal;
    }

    @Override
    public ArrayList<Animal> getAll() {

	return animales;
    }

    @Override
    public Animal update(Animal animal) {
	for (int i = 0; i < animales.size(); i++) {
	    if (animal.getId() == animales.get(i).getId()) {
		animales.set(i, animal);
		i = animales.size();
	    }
	}

	return animal;
    }

    @Override
    public int delete(Animal animal) {
	int indice = 0;
	for (int i = 0; i < animales.size(); i++) {
	    if (animal.getId() == animales.get(i).getId()) {
		animales.remove(i);
		indice = i;
	    }
	}
	return indice;
    }

}
