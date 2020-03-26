package ejercicio.gestionMVC.clinica.dao;

import java.util.ArrayList;

import ejercicio.gestionMVC.clinica.idao.IDAO;
import ejercicio.gestionMVC.clinica.model.Revision;

public class RevisionDAOImpl implements IDAO<Revision> {

    ArrayList<Revision> revisiones;

    public RevisionDAOImpl() {
	super();
	this.revisiones = new ArrayList<Revision>();
    }

    @Override
    public int create(Revision revision) {
	int idRevisionMax = 1;
	for (int i = 0; i < revisiones.size(); i++) {
	    if (idRevisionMax < revisiones.get(i).getIdRevision()) {
		idRevisionMax = revisiones.get(i).getIdRevision();
	    }
	}
	revisiones.add(revision);
	return idRevisionMax;
    }

    @Override
    public Revision getById(int id) {
	Revision revision = new Revision();
	for (int i = 0; i < revisiones.size(); i++) {
	    if (id == revisiones.get(i).getIdRevision()) {
		revision = revisiones.get(i);
		i = revisiones.size();
	    }
	}
	return revision;
    }

    public ArrayList<Revision> getAllById(int idAnimal) {
	ArrayList<Revision> revisionesReturn = new ArrayList<Revision>();
	for (int i = 0; i < revisiones.size(); i++) {
	    if (idAnimal == revisiones.get(i).getIdAnimal()) {
		revisionesReturn.add(revisiones.get(i));
	    }
	}

	return revisionesReturn;
    }

    @Override
    public ArrayList<Revision> getAll() {
	return revisiones;
    }

    @Override
    public Revision update(Revision revision) {
	for (int i = 0; i < revisiones.size(); i++) {
	    if (revision.getIdRevision() == revisiones.get(i).getIdRevision()) {
		revisiones.set(i, revision);
	    }
	}

	return revision;
    }

    @Override
    public int delete(Revision revision) {
	int idRevision = 0;
	for (int i = 0; i < revisiones.size(); i++) {
	    if (revision.getIdRevision() == revisiones.get(i).getIdRevision()) {
		idRevision = revisiones.get(i).getIdRevision();
		revisiones.remove(i);
	    }
	}
	return idRevision;
    }

}
