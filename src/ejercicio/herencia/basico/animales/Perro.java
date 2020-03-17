package ejercicio.herencia.basico.animales;

public class Perro extends Mamifero {
    // caza, pastor, guardian, ratonero...
    private String funcion;
    private String idChip;

    public Perro() {
	super();
	this.funcion = "";
	this.idChip = "";
    }

    public Perro(float peso, String especie, String tipoAlimentacion, String habitat, String sexo, String funcion,
	    String idChip) {
	super(peso, especie, tipoAlimentacion, habitat, sexo);
	this.funcion = funcion;
	this.idChip = idChip;
    }

    public Perro(Mamifero mamifero) {
	super(mamifero.getPeso(), mamifero.getEspecie(), mamifero.getTipoAlimentacion(), mamifero.getHabitat(),
		mamifero.getSexo());
	this.funcion = "";
	this.idChip = "";
    }

    public String getFuncion() {
	return funcion;
    }

    public void setFuncion(String funcion) {
	this.funcion = funcion;
    }

    public String getIdChip() {
	return idChip;
    }

    public void setIdChip(String idChip) {
	this.idChip = idChip;
    }

    @Override
    public String toString() {
	return super.toString() + " Perro [funcion=" + funcion + ", idChip=" + idChip + "]";
    }

}
