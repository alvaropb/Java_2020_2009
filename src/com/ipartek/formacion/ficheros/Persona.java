package com.ipartek.formacion.ficheros;

public class Persona {
//nombre;empresa;fecha nacimiento;telefono;email;numero personal 

    private String nombre;
    private String empresa;
    private String fechaNacimiento;
    private String telefono;
    private String email;
    private String numeroPersonal;

    public Persona(String[] linea) {
	super();
	this.nombre = linea[0];
	this.empresa = linea[1];
	this.fechaNacimiento = linea[2];
	this.telefono = linea[3];
	this.email = linea[4];
	this.numeroPersonal = linea[5];
    }

    public Persona() {
	super();
    }

    public String getNombre() {
	return nombre;
    }

    public void setNombre(String nombre) {
	this.nombre = nombre;
    }

    public String getEmpresa() {
	return empresa;
    }

    public void setEmpresa(String empresa) {
	this.empresa = empresa;
    }

    public String getFechaNacimiento() {
	return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
	this.fechaNacimiento = fechaNacimiento;
    }

    public String getTelefono() {
	return telefono;
    }

    public void setTelefono(String telefono) {
	this.telefono = telefono;
    }

    public String getEmail() {
	return email;
    }

    public void setEmail(String email) {
	this.email = email;
    }

    public String getNumeroPersonal() {
	return numeroPersonal;
    }

    public void setNumeroPersonal(String numeroPersonal) {
	this.numeroPersonal = numeroPersonal;
    }

    @Override
    public String toString() {
	return "Persona [nombre=" + nombre + ", empresa=" + empresa + ", fechaNacimiento=" + fechaNacimiento
		+ ", telefono=" + telefono + ", email=" + email + ", numeroPersonal=" + numeroPersonal + "]";
    }

}
