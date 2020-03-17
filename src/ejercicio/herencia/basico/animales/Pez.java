package ejercicio.herencia.basico.animales;

public class Pez extends Animal {
    private String tipoAguas;

    public Pez() {
	super();
	this.tipoAguas = "";
    }

    public String getTipoAguas() {
	return tipoAguas;
    }

    public void setTipoAguas(String tipoAguas) {
	this.tipoAguas = tipoAguas;
    }

    public Pez(Animal animal) {
	super(animal.getPeso(), animal.getEspecie(), animal.getTipoAlimentacion(), animal.getSexo());
	this.tipoAguas = "";
    }

    @Override
    public String toString() {
	return super.toString() + " Pez [tipoAguas=" + tipoAguas + "]";
    }

}
