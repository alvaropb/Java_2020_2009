package ejercicio.gestionMVC.clinica.idao;

import java.util.ArrayList;

public interface IDAO<T> {
    /*
     * CRUD
     */
    /**
     * Método que inserta un Tipo pasandole un tipo
     * 
     * @param tipo
     * @return id
     */
    public int create(T tipo);

    /**
     * Método que retorna un Tipo pasandole un id
     * 
     * @param id
     * @return Tipo
     */
    public T getById(int id);

    /**
     * Método que retorna un listado de tipos
     * 
     * @return ArrayList<T>
     */
    public ArrayList<T> getAll();

    /**
     * Método que actualiza un animal
     * 
     * @param Tipo
     * @return Tipo
     */
    public T update(T tipo);

    /**
     * Método que elimina un animal del listado pasandole un animal
     * 
     * @param animal
     */
    public int delete(T tipo);

}
