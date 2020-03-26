package ejercicio.gestionMVC.clinica.idao;

import java.util.ArrayList;

import ejercicio.gestionMVC.clinica.model.Animal;

public interface IAnimalDAO {
    /*
     * CRUD
     */
    /**
     * Método que inserta un animal pasandole un animal
     * 
     * @param animal
     * @return Animal
     */
    public int create(Animal animal);

    /**
     * Método que retorna un animal pasandole un id
     * 
     * @param id
     * @return Animal
     */
    public Animal getById(int id);

    /**
     * Método que retorna un listado de animales
     * 
     * @return ArrayList<Animal>
     */
    public ArrayList<Animal> getAll();

    /**
     * Método que actualiza un animal
     * 
     * @param animal
     * @return Animal
     */
    public Animal update(Animal animal);

    /**
     * Método que elimina un animal del listado pasandole un animal
     * 
     * @param animal
     */
    public int delete(Animal animal);

}
