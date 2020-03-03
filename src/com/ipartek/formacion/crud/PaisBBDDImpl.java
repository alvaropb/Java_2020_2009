package com.ipartek.formacion.crud;

import java.util.ArrayList;

public class PaisBBDDImpl implements PaisBBDD {

	@Override
	public boolean create(ArrayList<Pais> paises, Pais pais) {

		return paises.add(pais);
	}

	@Override
	public int readOne(ArrayList<Pais> paises, String id) {
		int posicion = 0;
		for (int i = 0; i < paises.size(); i++) {
			if (id.equalsIgnoreCase(paises.get(i).getNombre())) {
				posicion = i;
				i = paises.size();
			}
		}

		return posicion;
	}

	@Override
	public ArrayList<Pais> readMany(ArrayList<Pais> paises) {

		return paises;
	}

	@Override
	public int Update(Pais pais, ArrayList<Pais> paises) {
		int posicion = readOne(paises, pais.getNombre());
		paises.get(posicion).setNumCasos(pais.getNumCasos());

		return posicion;
	}

	@Override
	public boolean delete(Pais pais, ArrayList<Pais> paises) {
		int posicion = readOne(paises, pais.getNombre());
		paises.remove(posicion);
		return false;
	}

}
