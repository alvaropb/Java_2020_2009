package app.perrera;

public class Perro {

	int id;
	String nombre;
	String raza;

	// Constructor
	public Perro() {
		super();

		// un peroo inicialmente
		// id 0
		// nombre ""
		// raza "cruce"
		this.id = 0;
		this.nombre = "";
		this.raza = "cruce";
	}

	public Perro(String nombre) {
		super();
		this.nombre = nombre;
		this.id = 0;
		this.raza = "cruce";
	}

	// GETERS seTTERS

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	// TOSTRING
	@Override
	public String toString() {
		return "Perro [id=" + id + ", nombre=" + nombre + ", raza=" + raza + "]";
	}

}
