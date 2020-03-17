package ejercicio.herencia.basico.animales;

import java.util.ArrayList;

public class Canario extends Ave {

    private ArrayList<String> trinos;

    public Canario() {
	super();
	this.trinos = new ArrayList<String>();
    }

    public Canario(float peso, String especie, String tipoAlimentacion, String sexo, boolean esMigratorio,
	    String tipoDesplazamiento, String tipoNido, ArrayList<String> trinos) {
	super(peso, especie, tipoAlimentacion, sexo, esMigratorio, tipoDesplazamiento, tipoNido);
	this.trinos = trinos;
    }

    public Canario(Ave ave) {
	// float peso, String especie, String tipoAlimentacion, String sexo, boolean
	// esMigratorio,
//	    String tipoDesplazamiento, String tipoNido
	super(ave.getPeso(), ave.getEspecie(), ave.getTipoAlimentacion(), ave.getSexo(), ave.isEsMigratorio(),
		ave.getTipoDesplazamiento(), ave.getTipoNido());
	this.trinos = new ArrayList<String>();
    }

    public ArrayList<String> getTrinos() {
	return trinos;
    }

    public void setTrinos(ArrayList<String> trinos) {
	this.trinos = trinos;
    }

    @Override
    public String toString() {
	return super.toString() + " Canario [trinos=" + trinos + "]";
    }

}
