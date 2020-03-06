package app.perrera;

import java.util.ArrayList;

public interface PerroDAO {
	/**
	 * Metodo que retorna el listado completo de perros
	 * 
	 * @return
	 */
	ArrayList<Perro> getAll();

	/**
	 * Metodo que devuelve un listado de los perros cuyo @param nombre coincida
	 * 
	 * @param nombre
	 * @return
	 */
	ArrayList<Perro> buscarPorNombre(String nombre);

	/**
	 * Metodo que devuelve un listado de perros cuyo @param nombre coincida con la
	 * raza
	 * 
	 * @param nombre
	 * @return
	 */
	ArrayList<Perro> buscarPorRaza(String nombre);

	/**
	 * Metodo que retorna un perro por su id
	 * 
	 * @param id
	 * @return
	 */
	Perro getById(int id);

	/**
	 * Metodo que elimina el registro seleccionado que coincida con el @param id
	 * 
	 * @param id
	 * @return
	 */
	boolean delete(int id);

	/**
	 * Creamos un nuevo Perro y genera el nuevo IDentificador
	 * 
	 * @param p
	 * @return
	 */
	Perro crear(Perro p);

	boolean update(Perro p);

}
