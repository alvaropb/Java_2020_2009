package ejercicio.herencia.basico.animales;

public class Animal {
    private float peso;
    private String especie;
    private String tipoAlimentacion;
    private String sexo;

    public Animal() {
	super();
	this.sexo = "";
	this.especie = "";
	this.tipoAlimentacion = "";
    }

    public Animal(float peso, String especie, String tipoAlimentacion, String sexo) {
	super();
	this.sexo = sexo;
	this.peso = peso;
	this.especie = especie;
	this.tipoAlimentacion = tipoAlimentacion;
    }

    public float getPeso() {
	return peso;
    }

    public void setPeso(float peso) {
	this.peso = peso;
    }

    public String getEspecie() {
	return especie;
    }

    public void setEspecie(String especie) {
	this.especie = especie;
    }

    public String getTipoAlimentacion() {
	return tipoAlimentacion;
    }

    public void setTipoAlimentacion(String tipoAlimentacion) {
	this.tipoAlimentacion = tipoAlimentacion;
    }

    public String getSexo() {
	return sexo;
    }

    public void setSexo(String sexo) {
	this.sexo = sexo;
    }

    @Override
    public String toString() {
	return "Animal [peso=" + peso + ", especie=" + especie + ", tipoAlimentacion=" + tipoAlimentacion + ", sexo="
		+ sexo + "]";
    }

}
