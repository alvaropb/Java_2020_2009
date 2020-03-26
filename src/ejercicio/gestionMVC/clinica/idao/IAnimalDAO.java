package ejercicio.gestionMVC.clinica.idao;

import java.util.ArrayList;

import ejercicio.gestionMVC.clinica.model.Animal;

public interface IAnimalDAO {
    /*
     * CRUD
     */
    /**
     * M�todo que inserta un animal pasandole un animal
     * 
     * @param animal
     * @return Animal
     */
    public int create(Animal animal);

    /**
     * M�todo que retorna un animal pasandole un id
     * 
     * @param id
     * @return Animal
     */
    public Animal getById(int id);

    /**
     * M�todo que retorna un listado de animales
     * 
     * @return ArrayList<Animal>
     */
    public ArrayList<Animal> getAll();

    /**
     * M�todo que actualiza un animal
     * 
     * @param animal
     * @return Animal
     */
    public Animal update(Animal animal);

    /**
     * M�todo que elimina un animal del listado pasandole un animal
     * 
     * @param animal
     */
    public int delete(Animal animal);

}
