package ejercicio.gestion.clinica.veterinaria;

import java.util.ArrayList;
import java.util.Scanner;

public class Pruebas {
    static Scanner sc;
    static ArrayList<Animal> animales;

    public static void main(String[] args) {

	sc = new Scanner(System.in);
	animales = new ArrayList<Animal>();
	int opcion = 0;
	do {
	    System.out.println("Bienvenido a la aplicacion gestion de mascotas");
	    System.out.println("Introduzca una opcion");
	    System.out.println("1.-Registrar nueva mascota");
	    System.out.println("2.-Buscar mascotas por id");
	    System.out.println("3.-Ver historial de la mascota");
	    System.out.println("4.-Ingresar mascota");
	    System.out.println("5.-Salir");
	    opcion = Integer.parseInt(sc.nextLine());
	    switch (opcion) {
	    case 1:
		registrarMascota();

		break;

	    case 2:
		buscarPorId();
		break;

	    case 3:
		verHistorialMascota();
		break;

	    case 4:
		ingresarMascota();
		break;

	    default:
		break;
	    }
	} while (opcion != 5);
	System.out.println("Salio del programa");

    }

    /**
     * Método que muestra una mascota buscando por su id
     */
    private static void buscarPorId() {
	int id = 0;
	System.out.println("Introduzca id a buscar");
	id = Integer.parseInt(sc.nextLine());
	for (int i = 0; i < animales.size(); i++) {
	    if (animales.get(i).getId() == id) {
		System.out.println(animales.get(i));
		break;
	    }
	}
    }

    /**
     * Método que añade un registro nuevo de un ingreso de una mascota
     */
    private static void ingresarMascota() {
	int nombre = 0;
	System.out.println("Intoduzca id de la mascota a ingresar");
	nombre = Integer.parseInt(sc.nextLine());
	for (int i = 0; i < animales.size(); i++) {
	    if (nombre == animales.get(i).getId()) {
		Revision revision = new Revision();
		System.out.println("Introduzca diagnostico");
		revision.setDiagnostico(sc.nextLine());
		System.out.println("Introduzca id Veterinario");
		revision.setIdDoctor(sc.nextLine());
		System.out.println("Introduzca motivo");
		revision.setMotivo(sc.nextLine());
		System.out.println("Introduzca tratamiento");
		revision.setTratamiento(sc.nextLine());
		animales.get(i).getRevisiones().add(revision);
	    }
	}

    }

    /**
     * Método que muestra el historial de ingresos de una mascota
     */
    private static void verHistorialMascota() {
	String nombre = "";
	System.out.println("Intoduzca nombre de la mascota para ver su id");
	nombre = sc.nextLine();
	for (int i = 0; i < animales.size(); i++) {
	    if (nombre.equalsIgnoreCase(animales.get(i).getNombre())) {
		System.out.println(animales.get(i).getRevisiones());
	    }
	}

    }

    /**
     * Método que da de alta una mascota
     */
    private static void registrarMascota() {
	Animal animal = new Animal();
	boolean continuar = true;
	System.out.println("Introduzca nombre");
	animal.setNombre(sc.nextLine());
	System.out.println("Introduzca especie");
	animal.setEspecie(sc.nextLine());
	System.out.println("Introduzca raza");
	animal.setRaza(sc.nextLine());

	do {
	    System.out.println("Introduzca edad");
	    try {
		animal.setEdad(Integer.parseInt(sc.nextLine()));
		continuar = false;
	    } catch (NumberFormatException e) {
		System.out.println("Debe introducir un numero entero");
		e.printStackTrace();
	    }
	} while (continuar);
	animal.setId(animales);
	animales.add(animal);

    }

}
