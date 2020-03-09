package com.ipartek.formacion.crud;

public class PaisBBDDImpl2 implements PaisDAO {

	@Override
	public Pais create(Pais pais) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int readOne(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void readMany(int listadoOpcion) {
		// TODO Auto-generated method stub

	}

	@Override
	public Pais update(Pais pais) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(String id) {
		// TODO Auto-generated method stub
		return false;
	}
//
//	private ArrayList<Pais> paises;
//
//	@Override
//	public boolean create(ArrayList<Pais> paises, Pais pais) {
//
//		return paises.add(pais);
//	}
//
//	@Override
//	public int readOne(ArrayList<Pais> paises, String id) {
//		int posicion = -1;
//		for (int i = 0; i < paises.size(); i++) {
//			if (id.equalsIgnoreCase(paises.get(i).getNombre())) {
//				posicion = i;
//				i = paises.size();
//			}
//		}
//
//		return posicion;
//	}
//
//	@Override
//	public ArrayList<Pais> readMany(ArrayList<Pais> paises) {
//
//		return paises;
//	}
//
//	@Override
//	public int Update(Pais pais, ArrayList<Pais> paises) {
//		int posicion = readOne(paises, pais.getNombre());
//		paises.get(posicion).setNumCasos(pais.getNumCasos());
//		paises.get(posicion).setNombre(pais.getNombre());
//
//		return posicion;
//	}
//
//	@Override
//	public boolean delete(Pais pais, ArrayList<Pais> paises) {
//		int posicion = readOne(paises, pais.getNombre());
//		paises.remove(posicion);
//		return false;
//	}

}
