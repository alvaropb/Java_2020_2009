package ejercicio.gestionMVC.clinica.pruebas;

import java.util.ArrayList;
import java.util.Scanner;

import ejercicio.gestionMVC.clinica.dao.AnimalDAOImpl;
import ejercicio.gestionMVC.clinica.dao.RevisionDAOImpl;
import ejercicio.gestionMVC.clinica.idao.IAnimalDAO;
import ejercicio.gestionMVC.clinica.idao.IRevisionDAO;
import ejercicio.gestionMVC.clinica.model.Animal;
import ejercicio.gestionMVC.clinica.model.Revision;

public class PruebasDAO {

    static Scanner sc;
    static IRevisionDAO revisiones;
    static IAnimalDAO animales;

    public static void main(String[] args) {
	sc = new Scanner(System.in);
	revisiones = new RevisionDAOImpl();
	animales = new AnimalDAOImpl();
	int opcion = 0;
	// creamos una revision a proposito de las pruebas de la opcion 3
	Revision revision = new Revision();
	revision.setDiagnostico("diagnostico");
	revision.setIdAnimal(1);
	revision.setIdDoctor(1);
	revision.setMotivoRevision("Presenta fiebre");
	revision.setTratamiento("Paracetamol");
	revisiones.create(revision);

	do {
	    System.out.println("Introduzca una opcion:");
	    System.out.println("1.-Registrar nueva mascota");
	    System.out.println("2.-Buscar mascota por Id");
	    System.out.println("3.-Ver historial de la mascota");
	    System.out.println("4.-Revisar mascota");
	    opcion = Integer.parseInt(sc.nextLine());

	    switch (opcion) {
	    case 1:
		registrarMascota();
		System.out.println(((AnimalDAOImpl) animales).getAnimales().get(0));

		break;
	    case 2:
		buscarMascota();

		break;
	    case 3:
		buscarHistorialMascota();

		break;

	    default:
		break;
	    }

	} while (opcion != 5);

	sc.close();
    }

    private static void buscarHistorialMascota() {
	ArrayList<Revision> revisionesReturn = new ArrayList<Revision>();
	int id = 0;
	Animal animal = new Animal();
	System.out.println("Introduzca id a buscar");
	id = Integer.parseInt(sc.nextLine());
	animal = animales.getById(id);
	revisionesReturn = revisiones.getAllById(animal.getId());
	System.out.println(revisionesReturn);

    }

    private static void buscarMascota() {
	int id = 0;
	Animal animal = new Animal();
	System.out.println("Introduzca id a buscar");
	id = Integer.parseInt(sc.nextLine());
	animal = animales.getById(id);
	System.out.println("El animal buscado es:");
	System.out.println(animal);
    }

    private static void registrarMascota() {
	Animal animal = new Animal();
	System.out.println("Introduzca edad");
	animal.setEdad(Integer.parseInt(sc.nextLine()));
	System.out.println("Introduzca especie");
	animal.setEspecie(sc.nextLine());
	System.out.println("Introduzca nombre");
	animal.setNombre(sc.nextLine());
	System.out.println("Introduzca raza");
	animal.setRaza(sc.nextLine());
	animales.create(animal);

    }
}
