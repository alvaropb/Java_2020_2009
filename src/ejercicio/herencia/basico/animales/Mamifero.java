package ejercicio.herencia.basico.animales;

public class Mamifero extends Animal {

    private String habitat;

    public Mamifero() {
	super();
	this.habitat = "";
    }

    public Mamifero(float peso, String especie, String tipoAlimentacion, String habitat, String sexo) {
	super(peso, especie, tipoAlimentacion, sexo);
	this.habitat = habitat;
    }

    public Mamifero(Animal animal) {
	super(animal.getPeso(), animal.getEspecie(), animal.getTipoAlimentacion(), animal.getSexo());
	this.habitat = "";

    }

    public String getHabitat() {
	return habitat;
    }

    public void setHabitat(String habitat) {
	this.habitat = habitat;
    }

    @Override
    public String toString() {
	return super.toString() + " Mamifero [habitat=" + habitat + "]";
    }

}
