package ejercicio.gestionMVC.clinica.idao;

import java.util.ArrayList;

import ejercicio.gestionMVC.clinica.model.Revision;

public interface IRevisionDAO {

    /*
     * CRUD
     */
    /**
     * Método que inserta una revision en el listado de revisiones
     * 
     * @param revision
     * @return id
     */
    public int create(Revision revision);

    /**
     * Método que devuelve una revision pasandole un idRevision
     * 
     * @param id
     * @return
     */
    public Revision getById(int id);

    /**
     * Método que devuelve un listado de Revisiones que ha tenido un animal
     * 
     * @param idAnimal
     * @return ArrayList<Revision>
     */
    public ArrayList<Revision> getAllById(int idAnimal);

    /**
     * Método que devuelve todas las revisiones realizadas
     * 
     * @return ArrayList<Revision>
     */
    public ArrayList<Revision> getAll();

    /**
     * Método que actualiza una revision
     * 
     * @param revision
     * @return Revision
     */
    public Revision update(Revision revision);

    /**
     * Método que elimina una revision
     * 
     * @param revision
     * @return Revision
     */
    public Revision delete(int idRevision);

}
