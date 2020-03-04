package com.ipartek.formacion.crud;

import java.util.ArrayList;

public class PaisDAOImpl implements PaisDAO {

	private ArrayList<Pais> paises;

	public PaisDAOImpl() {
		super();
		// TODO crear paises iniciales
		paises = new ArrayList<Pais>();
		Pais aux = new Pais();
		aux.setNombre("Alemania");
		aux.setNumCasos(20);
		paises.add(aux);
		aux = new Pais();
		aux.setNombre("Francia");
		aux.setNumCasos(120);
		paises.add(aux);
		aux = new Pais();
		aux.setNombre("Italia");
		aux.setNumCasos(520);
		paises.add(aux);
		aux = new Pais();
		aux.setNombre("España");
		aux.setNumCasos(130);
		paises.add(aux);
		aux = new Pais();
		aux.setNombre("Portugal");
		aux.setNumCasos(15);
		paises.add(aux);
		aux = new Pais();
		aux.setNombre("Andorra");
		aux.setNumCasos(2);
		paises.add(aux);
		aux = new Pais();
		aux.setNombre("Reino unido");
		aux.setNumCasos(86);
		paises.add(aux);
		aux = new Pais();
		aux.setNombre("Holanda");
		aux.setNumCasos(0);
		paises.add(aux);

	}

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

		if (1 == listadoOpcion) {// infecciosos
			for (int i = 0; i < paises.size(); i++) {
				if (paises.get(i).isInfectado()) {
					System.out.println(paises.get(i).toString());
				}
			}
		} else if (2 == listadoOpcion) {// libres de virus
			for (int i = 0; i < paises.size(); i++) {
				if (!paises.get(i).isInfectado()) {
					System.out.println(paises.get(i).toString());
				}
			}
		} else {// resto
			for (int i = 0; i < paises.size(); i++) {

				System.out.println(paises.get(i).toString());

			}
		}
	}

	@Override
	public Pais Update(Pais pais) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	public ArrayList<Pais> getPaises() {
		return paises;
	}

	public void setPaises(ArrayList<Pais> paises) {
		this.paises = paises;
	}

}
