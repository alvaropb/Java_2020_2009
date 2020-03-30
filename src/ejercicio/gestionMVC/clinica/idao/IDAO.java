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
    public int create(T tipo) throws Exception;

    /**
     * Método que retorna un Tipo pasandole un id
     * 
     * @param id
     * @return Tipo
     */
    public T getById(int id) throws Exception;

    /**
     * Método que retorna un listado de tipos
     * 
     * @return ArrayList<T>
     */
    public ArrayList<T> getAll() throws Exception;

    /**
     * Método que actualiza un animal
     * 
     * @param Tipo
     * @return Tipo
     */
    public T update(T tipo) throws Exception;

    /**
     * Método que elimina un animal del listado pasandole un animal
     * 
     * @param animal
     */
    public int delete(T tipo) throws Exception;

}
