package ejercicio.herencia.basico.animales;

public class Ave extends Animal {

    private boolean esMigratorio;
    // vuela, camina o vuelo limitado
    private String tipoDesplazamiento;
    // copa,bóveda, plataforma, montículo, madriguera o escarbadura en el suelo
    private String tipoNido;

    public Ave() {
	super();
	this.esMigratorio = false;
	this.tipoDesplazamiento = "";
	this.tipoNido = "";
    }

    public Ave(float peso, String especie, String tipoAlimentacion, String sexo, boolean esMigratorio,
	    String tipoDesplazamiento, String tipoNido) {
	super(peso, especie, tipoAlimentacion, sexo);
	this.esMigratorio = esMigratorio;
	this.tipoDesplazamiento = tipoDesplazamiento;
	this.tipoNido = tipoNido;
    }

    public Ave(Animal animal) {
	super(animal.getPeso(), animal.getEspecie(), animal.getTipoAlimentacion(), animal.getSexo());
	this.esMigratorio = false;
	this.tipoDesplazamiento = "";
	this.tipoNido = "";
    }

    public boolean isEsMigratorio() {
	return esMigratorio;
    }

    public void setEsMigratorio(boolean esMigratorio) {
	this.esMigratorio = esMigratorio;
    }

    public String getTipoDesplazamiento() {
	return tipoDesplazamiento;
    }

    public void setTipoDesplazamiento(String tipoDesplazamiento) {
	this.tipoDesplazamiento = tipoDesplazamiento;
    }

    public String getTipoNido() {
	return tipoNido;
    }

    public void setTipoNido(String tipoNido) {
	this.tipoNido = tipoNido;
    }

    @Override
    public String toString() {
	return super.toString() + " Ave [esMigratorio=" + esMigratorio + ", tipoDesplazamiento=" + tipoDesplazamiento
		+ ", tipoNido=" + tipoNido + "]";
    }

}
