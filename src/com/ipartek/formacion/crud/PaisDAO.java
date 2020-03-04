package com.ipartek.formacion.crud;

public interface PaisDAO {

	/**
	 * Inserta pais
	 * 
	 * @param pais
	 * @return
	 */
	public Pais create(Pais pais);

	/**
	 * Lee un pais
	 * 
	 * @param id
	 * @return
	 */
	public int readOne(String id);

	/**
	 * Lee todos los paises
	 * 
	 * @param listadoOpcion
	 */
	public void readMany(int listadoOpcion);

	/**
	 * Actualiza un pais
	 * 
	 * @param pais
	 * @return
	 */
	public Pais Update(Pais pais);

	/**
	 * Elimina un pais
	 * 
	 * @param id
	 * @return
	 */
	public boolean delete(String id);
}
