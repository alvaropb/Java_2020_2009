package com.ipartek.formacion.crud;

import java.util.ArrayList;

public interface PaisBBDD {

	// create
	public boolean create(ArrayList<Pais> paises, Pais pais);

	// read one
	public int readOne(ArrayList<Pais> paises, String id);

	// read list
	public ArrayList<Pais> readMany(ArrayList<Pais> paises);

	// Update
	public int Update(Pais pais, ArrayList<Pais> paises);

	// delete
	public boolean delete(Pais pais, ArrayList<Pais> paises);
}
