package ejercicio.herencia.basico.animales;

import java.util.Scanner;

public class Pruebas {
    static Scanner sc;

    public static void main(String[] args) {
	Object[] listado = new Object[10];
	sc = new Scanner(System.in);
	int opcion = 0;

	for (int i = 0; i < listado.length; i++) {
	    System.out.println("¿QUé tipo de elemento quiere introducir en el listado?");
	    System.out.println("1.-Animal, 2.-Mamífero, 3.-Gato, 4.-Perro, 5.-Ave, 6.-Canario, 7.-Pez");
	    opcion = Integer.parseInt(sc.nextLine());
	    switch (opcion) {
	    case 1:
		Animal animal = new Animal();
		animal = generarAnimal();
		listado[i] = animal;
		break;
	    case 2:
		Mamifero mamifero = new Mamifero();
		animal = new Animal();
		animal = generarAnimal();
		mamifero = generarMamifero(animal);
		listado[i] = mamifero;
		break;
	    case 3:
		mamifero = new Mamifero();
		animal = new Animal();
		Gato gato = new Gato();
		animal = generarAnimal();
		mamifero = generarMamifero(animal);
		gato = generarGato(mamifero);
		listado[i] = gato;

		break;
	    case 4:
		mamifero = new Mamifero();
		animal = new Animal();
		Perro perro = new Perro();
		animal = generarAnimal();
		mamifero = generarMamifero(animal);
		perro = generarPerro(mamifero);
		listado[i] = perro;

		break;
	    case 5:
		animal = new Animal();
		animal = generarAnimal();
		Ave ave = new Ave();
		ave = generarAve(animal);
		listado[i] = ave;
		break;
	    case 6:
		animal = new Animal();
		animal = generarAnimal();
		ave = new Ave();
		Canario canario = new Canario();
		ave = generarAve(animal);
		canario = generarCanario(ave);
		listado[i] = canario;
		break;

	    case 7:
		Pez pez = new Pez();
		animal = new Animal();
		animal = generarAnimal();
		pez = generarPez(animal);
		listado[i] = pez;

		break;

	    default:
		break;
	    }// fin switch
	} // fin for
	  // pintamos los datos por pantalla
	for (int i = 0; i < listado.length; i++) {

	    System.out.println(listado[i]);
	}

    }

    /**
     * metodo que pide por pantalla datos para generar un pez
     * 
     * @param animal
     * @return
     */
    private static Pez generarPez(Animal animal) {
	Pez pez = new Pez(animal);
	System.out.println("Introduzca el tipo de aguas en las que habita");
	pez.setTipoAguas(sc.nextLine());
	return pez;
    }

    /**
     * Metodo que pide datos por pantala para generar un canario
     * 
     * @param ave
     * @return
     */
    private static Canario generarCanario(Ave ave) {
	Canario canario = new Canario(ave);
	String continuar = "No";
	System.out.println("Listado de trinos:");
	do {
	    System.out.println("introduzca tipo de trino");
	    canario.getTrinos().add(sc.nextLine());
	    System.out.println("Desea seguir? Si/No");
	    continuar = sc.nextLine();
	} while ("Si".equalsIgnoreCase(continuar));
	return canario;
    }

    /**
     * metodo que pide datos por pantalla para generar un pez
     * 
     * @param animal
     * @return
     */
    private static Ave generarAve(Animal animal) {
	Ave ave = new Ave(animal);
	String respuesta = "";

	System.out.println("¿Es un ave migratoria? Si/No");
	respuesta = sc.nextLine();
	ave.setEsMigratorio(("Si".equalsIgnoreCase(respuesta)) ? true : false);
	System.out.println("Tipo de desplazamiento:");
	ave.setTipoDesplazamiento(sc.nextLine());
	System.out.println("tipo de nido:");
	ave.setTipoNido(sc.nextLine());

	return ave;
    }

    /**
     * metodo que pide datos por pantalla para generar un perro
     * 
     * @param mamifero
     * @return
     */
    private static Perro generarPerro(Mamifero mamifero) {
	Perro perro = new Perro(mamifero);
	System.out.println("Introduzca id del chip");
	perro.setIdChip(sc.nextLine());
	System.out.println("Introduzca funcion");
	perro.setFuncion(sc.nextLine());
	return perro;
    }

    /**
     * metodo que pide datos por pantalla para generar un gato
     * 
     * @param mamifero
     * @return
     */
    private static Gato generarGato(Mamifero mamifero) {
	Gato gato = new Gato(mamifero);
	System.out.println("Introduzca raza");
	gato.setRaza(sc.nextLine());
	System.out.println("Introduzca pelaje");
	gato.setPelaje(sc.nextLine());
	return gato;
    }

    /**
     * metodo que pide datos por pantalla para generar un mamifero
     * 
     * @param animal
     * @return
     */
    private static Mamifero generarMamifero(Animal animal) {
	Mamifero mamifero = new Mamifero(animal);

	System.out.println("Introduzca habitat");
	mamifero.setHabitat(sc.nextLine());
	return mamifero;
    }

    /**
     * metodo que pide datos por pantalla para generar un animal
     * 
     * @return
     */
    private static Animal generarAnimal() {
	Animal animal = new Animal();

	System.out.println("Introduzca peso: ");
	animal.setPeso(Float.parseFloat(sc.nextLine()));
	System.out.println("Introduzca especie: ");
	animal.setEspecie(sc.nextLine());
	System.out.println("Introduzca tipoAlimentacion");
	animal.setTipoAlimentacion(sc.nextLine());
	System.out.println("Introduzca sexo");
	animal.setSexo(sc.nextLine());
	return animal;
    }

}
