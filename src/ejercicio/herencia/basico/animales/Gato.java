package ejercicio.herencia.basico.animales;

public class Gato extends Mamifero {

    private String raza;
    private String pelaje;

    public Gato() {
	super();
	this.raza = "";
	this.pelaje = "";
    }

    public Gato(float peso, String especie, String tipoAlimentacion, String habitat, String sexo, String raza,
	    String pelaje) {
	super(peso, especie, tipoAlimentacion, habitat, sexo);
	this.raza = raza;
	this.pelaje = pelaje;
    }

    public Gato(Mamifero mamifero) {
	super(mamifero.getPeso(), mamifero.getEspecie(), mamifero.getTipoAlimentacion(), mamifero.getHabitat(),
		mamifero.getSexo());
	this.raza = "";
	this.pelaje = "";
    }

    public String getRaza() {
	return raza;
    }

    public void setRaza(String raza) {
	this.raza = raza;
    }

    public String getPelaje() {
	return pelaje;
    }

    public void setPelaje(String pelaje) {
	this.pelaje = pelaje;
    }

    @Override
    public String toString() {
	return super.toString() + " Gato [raza=" + raza + ", pelaje=" + pelaje + "]";
    }

}
