package app.perrera;

import java.util.ArrayList;

public class PerroDAOImpl implements PerroDAO {

	private ArrayList<Perro> perros;

	public PerroDAOImpl() {
		super();
		this.perros = new ArrayList<Perro>();

		this.perros.add(new Perro("Bubba"));
		this.perros.get(0).setId(Constantes.UNO);
		this.perros.add(new Perro("Ratplam"));
		this.perros.get(1).setId(Constantes.DOS);
	}

	@Override
	public ArrayList<Perro> getAll() {
		return perros;
	}

	@Override
	public ArrayList<Perro> buscarPorNombre(String nombre) {
		ArrayList<Perro> perrosNombre = new ArrayList<Perro>();
		for (int i = 0; i < perros.size(); i++) {
			if (nombre.equalsIgnoreCase(perros.get(i).getNombre())) {
				perrosNombre.add(perros.get(i));
			}
		}

		return perrosNombre;
	}

	@Override
	public ArrayList<Perro> buscarPorRaza(String raza) {
		ArrayList<Perro> perrosRaza = new ArrayList<Perro>();
		for (int i = 0; i < perros.size(); i++) {
			if (raza.equalsIgnoreCase(perros.get(i).getRaza())) {
				perrosRaza.add(perros.get(i));
			}
		}

		return perrosRaza;
	}

	@Override
	public Perro getById(int id) {
		Perro perroReturn = new Perro();
		for (int i = 0; i < perros.size(); i++) {
			if (id == perros.get(i).getId()) {
				perroReturn = perros.get(i);
				return perroReturn;
			}
		}
		return perroReturn;
	}

	@Override
	public boolean delete(int id) {
		boolean eliminado = false;
		for (int i = 0; i < perros.size(); i++) {
			if (id == perros.get(i).getId()) {
				perros.remove(i);
				return eliminado = true;
			}
		}

		return eliminado;
	}

	@Override
	public Perro crear(Perro p) {

		// TODO añadir que si la id es menor y no esta asignada, la asigne.
		int id = 0;
		for (int i = 0; i < perros.size(); i++) {
			if (id < perros.get(i).getId()) {
				id = perros.get(i).getId();
			}
		}
		id++;
		p.setId(id);
		perros.add(p);
		return p;
	}

	@Override
	public boolean update(Perro p) {
		for (int i = 0; i < perros.size(); i++) {
			if (p.getId() == perros.get(i).getId()) {
				perros.get(i).setNombre(p.getNombre());
				perros.get(i).setRaza(p.getRaza());
				return true;
			}
		}
		return false;
	}

}
