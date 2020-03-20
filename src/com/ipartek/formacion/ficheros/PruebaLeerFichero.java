package com.ipartek.formacion.ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class PruebaLeerFichero {
    static Scanner sc;
    static BufferedReader reader;
    static int correctas = 0;
    static int incorrectas = 0;
    public static final String CABECERA = "nombre, empresa, fecha nacimiento, telefono, email, numero personal";

    public static void main(String[] args) {

	int opcion = 0;
	sc = new Scanner(System.in);
	ArrayList<Object> listado = new ArrayList<Object>();

	cargarListado(listado);
	// contar numero de lineas correctas e incorrectas ( las que no tengan 6 campos
	// )

	// pintarListadoArrayList(listado);
	System.out.println("Introduzca una opcion");
	System.out.println("1.-Listar personas");
	System.out.println("2.-Buscar personas por numero de linea");
	System.out.println("3.-Buscar personas por nombre");
	System.out.println("4.-Buscar personas por email");
	System.out.println("5.-Buscar duplicados de cualquier tipo");
	opcion = Integer.parseInt(sc.nextLine());

	switch (opcion) {
	case 1:
	    // listarPersonas();
	    pintarListadoArrayList(listado);
	    break;

	case 2:
	    // buscarNumeroLinea();
	    buscarNumeroLineaArrayList(listado);
	    break;

	case 3:
	    // buscarPorNombre();
	    buscarPorNombreArrayList(listado);

	    break;

	case 4:
//	    buscarPorEmail();
	    buscarPorEmailArrayList(listado);
	    break;
	case 5:
	    pintarDuplicados(listado);
	    break;

	default:
	    break;
	}

	sc.close();
    }

    /**
     * Método que pinta por pantalla los duplicados
     * 
     * @param listado
     */
    private static void pintarDuplicados(ArrayList<Object> listado) {
	ArrayList<String> duplicados = new ArrayList<String>();
	duplicados = contarDuplicados(listado);
	for (int i = 0; i < duplicados.size(); i++) {
	    System.out.println(duplicados.get(i).toString());
	}
	System.out.println(duplicados.toString());
    }

    /**
     * Método que guarda en un arrayList las lineas duplicadas, indicando en la
     * consola qué linea y qué campo está duplicado.
     * 
     * @param listado
     * @return ArrayList<String>
     */
    private static ArrayList<String> contarDuplicados(ArrayList<Object> listado) {
	ArrayList<String> duplicados = new ArrayList<String>();
	for (int i = 1; i < listado.size(); i++) {
	    // parseamos el object a string[] lineaI
	    String[] lineaI;
	    if (listado.get(i) instanceof Persona) {
		lineaI = ((Persona) listado.get(i)).toStringLinea().split(";");
	    } else {
		lineaI = listado.get(i).toString().split(";");
	    }
	    for (int j = i + 1; j < listado.size(); j++) {
		String[] lineaJ;// parseamos el object a string[] linea J
		if (listado.get(j) instanceof Persona) {
		    lineaJ = ((Persona) listado.get(j)).toStringLinea().split(";");
		} else {
		    lineaJ = listado.get(j).toString().split(";");
		}
		// buscamos
		for (int k = 0; k < lineaI.length; k++) {
		    for (int k2 = 0; k2 < lineaJ.length; k2++) {
			// comparar linea I con lineaJ y añadir al arrayList duplicados
			if (lineaI[k].equals(lineaJ[k2])) {
			    String cadena = (i + 1) + " Duplicado campo: " + k2 + " :" + lineaJ[k2] + " en linea "
				    + (i + 1) + " : ";
			    for (int l = 0; l < lineaJ.length; l++) {
				cadena += lineaJ[l] + " ";
			    }

			    duplicados.add(cadena);
			}
		    } // fin for k lineaJ[]
		} // fin for k2 lineaI[]

	    } // fin for J
	} // fin for i

	return duplicados;
    }

    /**
     * Método que calcula la letra del dni
     * 
     * @param persona
     * @return
     */
    private static String calcularLetraDni(Persona persona) {
	// declarar variables
	String dniLetra = "";
	String caracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
	int dni = 0;

	try {
	    dni = Integer.valueOf(persona.getNumeroPersonal().substring(0, 8));
	    String dniValidar = String.valueOf(dni);
	    if (dniValidar.length() != 8) {
		throw new Exception("El formato de dni no es valido");
	    }

	    dniLetra = dniValidar + caracteres.charAt(dni % 23);
	} catch (Exception e) {
	    System.out.println(dni + " no es un formato valido");
	    e.printStackTrace();
	} // fin try catch
	  // calcular letra

	return dniLetra;
    }

    /**
     * Método que busca un email en el array volcado del fichero
     * 
     * @param listado
     */
    private static void buscarPorEmailArrayList(ArrayList<Object> listado) {
	String email = "";
	boolean rePreguntar = true;
	boolean existe = false;
	do {
	    System.out.println("Introduzca un email ");
	    email = sc.nextLine();
	    try {
		if ("".equalsIgnoreCase(email) || null == email) {
		    throw new Exception("Nombre introducido no valido, por favor introduzca un nombre valido");
		}
		existe = false;
		for (Object object : listado) {
		    if (object instanceof Persona) {
			if (email.equalsIgnoreCase(((Persona) object).getEmail())) {// buscamos si el objeto en el array
										    // es una persona
			    System.out.println(((Persona) object).toString());
			    existe = true;
			}
		    } // fin instanceof persona
		    else if (object.toString().contains(email)) {// buscamos si el objeto en el array es un string

			System.out.println("El email " + email + " se corresponde con la linea " + object.toString());
			existe = true;// ponemos a true para mostrar mensaje
		    }
		} // fin for buscando en el array
		if (!existe) {
		    System.out.println("El email " + email + " no consta en el fichero");
		}
		System.out.println("¿Desea seguir introduciendo emails para buscar? Si/No");
		String seguir = sc.nextLine();
		if ("No".equalsIgnoreCase(seguir)) {
		    rePreguntar = false;
		}

	    } catch (Exception e) {
		e.getMessage();
	    }
	} while (rePreguntar);

    }

    /**
     * Método que busca por nombre en el arrayList del volcado del fichero
     * 
     * @param listado
     */
    private static void buscarPorNombreArrayList(ArrayList<Object> listado) {
	String nombre = "";
	boolean rePreguntar = true;
	boolean existe = false;
	do {
	    System.out.println("Introduzca un nombre ");
	    nombre = sc.nextLine();
	    try {
		if ("".equalsIgnoreCase(nombre) || null == nombre) {
		    throw new Exception("Nombre introducido no valido, por favor introduzca un nombre valido");
		}
		existe = false;
		for (Object object : listado) {
		    if (object instanceof Persona) {
			if (nombre.equalsIgnoreCase(((Persona) object).getNombre())) {
			    System.out.println(((Persona) object).toString());
			    existe = true;
			}
		    } // fin instanceof persona
		    else if (object.toString().contains(nombre)) {

			System.out.println("El nombre " + nombre + " se corresponde con la linea " + object.toString());
			existe = true;
		    }
		}
		if (!existe) {
		    System.out.println("El nombre " + nombre + " no consta en el fichero");
		}
		System.out.println("¿Desea seguir introduciendo nombres para buscar? Si/No");
		String seguir = sc.nextLine();
		if ("No".equalsIgnoreCase(seguir)) {
		    rePreguntar = false;
		}

	    } catch (Exception e) {
		e.getMessage();
	    }
	} while (rePreguntar);

    }

    /**
     * Método que busca en el arrayList del volcado de memoria por linea
     * 
     * @param listado
     */
    private static void buscarNumeroLineaArrayList(ArrayList<Object> listado) {

	int numeroLinea = 0;
	boolean rePreguntar = true;

	do {
	    System.out.println("Introduzca un numero de linea valido");
	    numeroLinea = Integer.parseInt(sc.nextLine());
	    try {/// validar el rango del numero de linea
		if (numeroLinea < 1 || numeroLinea > listado.size()) {
		    throw new Exception("fuera de rango, por favor, introduzca valores entre 1 y " + listado.size());
		}
		System.out.println(listado.get(numeroLinea - 1));
		rePreguntar = false;
	    } catch (Exception e) {
		e.printStackTrace();
	    }
	} while (rePreguntar);

    }

    /**
     * método que pinta por pantalla el listado leido del fichero
     * 
     * @param listado
     */
    private static void pintarListadoArrayList(ArrayList<Object> listado) {
	System.out.println(CABECERA);
	for (int i = 1; i < listado.size(); i++) {
	    if (listado.get(i) instanceof Persona) {
		System.out
			.println(listado.get(i).toString() + " con dni: " + calcularLetraDni((Persona) listado.get(i)));

	    } else {// System.out.println(((Persona)listado.get(i)).toString());//hago casteo aunque
		    // no es necesario
		System.out.println(listado.get(i).toString());
	    }
	}
	System.out.println("lineas correctas: " + correctas);
	System.out.println("lineas incorrectas: " + incorrectas);
    }

    /**
     * Método que lee el listado y lo vuelca en un arrayList de objetos
     * 
     * @param listado
     */
    private static void cargarListado(ArrayList<Object> listado) {
	try {
	    reader = new BufferedReader(new FileReader("src/com/ipartek/formacion/ficheros/personas.txt"));
	    String linea;
	    int contador = 0;
	    Persona persona;

	    while ((linea = reader.readLine()) != null) {

		String[] campos = linea.split(";");
		if (campos.length == 6) {
		    persona = new Persona(campos);
		    listado.add(persona);
		    correctas++;

		} else {
		    listado.add(linea);
		    incorrectas++;
		}
	    }
	    reader.close();
	} catch (IOException e) {
	    e.printStackTrace();
	}

    }

    /**
     * Método que busca por email directamente en el fichero
     * 
     * @deprecated
     */
    private static void buscarPorEmail() {
	String email = "";
	System.out.println("Introduzca email a buscar");
	email = sc.nextLine();
	boolean encontrado = false;
	try {
	    reader = new BufferedReader(new FileReader("src/com/ipartek/formacion/ficheros/personas.txt"));
	    String linea;
	    int contador = 1;
	    Persona persona;

	    linea = reader.readLine();
	    System.out.println("----------------------------------------------------------------");
	    System.out.println(linea);// primera linea son cabeceras
	    contador++;
	    while ((linea = reader.readLine()) != null) {

		String[] campos = linea.split(";");
		if (campos.length >= 5 && email.equalsIgnoreCase(campos[4])) {
		    if (campos.length == 6) {
			persona = new Persona(campos);
			System.out.println(persona);
		    } else {
			System.out.println("*********Esta linea no respeta el formato de entrada************");
			System.out.println(linea);
			System.out.println("****************************************************************");
		    }
		    encontrado = true;
		}

		contador++;
	    }
	    if (!encontrado) {
		System.out.println("No se encontro nadie con email: " + email);
	    }
	    reader.close();
	} catch (IOException e) {
	    e.printStackTrace();
	}

    }

    /**
     * Método que busca por nombre en el fichero
     * 
     * @deprecated
     */
    private static void buscarPorNombre() {
	String nombre = "";
	System.out.println("Introduzca nombre a buscar");
	nombre = sc.nextLine();
	boolean encontrado = false;
	try {
	    reader = new BufferedReader(new FileReader("src/com/ipartek/formacion/ficheros/personas.txt"));
	    String linea;
	    int contador = 1;
	    Persona persona;

	    linea = reader.readLine();
	    System.out.println("----------------------------------------------------------------");
	    System.out.println(linea);// primera linea son cabeceras
	    contador++;
	    while ((linea = reader.readLine()) != null) {

		String[] campos = linea.split(";");
		if (nombre.equalsIgnoreCase(campos[0])) {
		    if (campos.length == 6) {
			persona = new Persona(campos);
			System.out.println(persona);
		    } else {
			System.out.println("*********Esta linea no respeta el formato de entrada************");
			System.out.println(linea);
			System.out.println("****************************************************************");
		    }
		    encontrado = true;
		}

		contador++;
	    }
	    if (!encontrado) {
		System.out.println("No se encontro nadie con nombre: " + nombre);
	    }
	    reader.close();
	} catch (IOException e) {
	    e.printStackTrace();
	}

    }

    /**
     * Método que busca por numero de linea directamente en el fichero
     * 
     * @deprecated
     */
    private static void buscarNumeroLinea() {
	int numeroLinea = 0;
	System.out.println("Introduzca un numero de linea valido");
	numeroLinea = Integer.parseInt(sc.nextLine());
	try {
	    reader = new BufferedReader(new FileReader("src/com/ipartek/formacion/ficheros/personas.txt"));
	    String linea;
	    int contador = 1;
	    Persona persona;

	    linea = reader.readLine();
	    System.out.println("----------------------------------------------------------------");
	    System.out.println(linea);// primera linea son cabeceras
	    contador++;
	    while ((linea = reader.readLine()) != null) {

		String[] campos = linea.split(";");
		if (numeroLinea == contador) {
		    if (campos.length == 6) {
			persona = new Persona(campos);
			System.out.println(persona);
		    } else {
			System.out.println("*********Esta linea no respeta el formato de entrada************");
			System.out.println(linea);
			System.out.println("****************************************************************");
		    }
		    break;
		}

		contador++;
	    }
	    reader.close();
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }

    /**
     * Método que lista las personas directamente del fichero
     * 
     * @deprecated
     */
    private static void listarPersonas() {
	try {
	    reader = new BufferedReader(new FileReader("src/com/ipartek/formacion/ficheros/personas.txt"));
	    String linea;
	    int contador = 0;
	    Persona persona;
	    // TODO podeis declarar una variable tipo int para contar lineas, int contador =
	    // 0;
	    // TODO la primera linea son cabeceras, no son datos
	    linea = reader.readLine();
	    System.out.println("----------------------------------------------------------------");
	    System.out.println(linea);
	    contador++;
	    while ((linea = reader.readLine()) != null) {

		String[] campos = linea.split(";");
		if (campos.length == 6) {
		    persona = new Persona(campos);
		    System.out.println(persona);
		} else {
		    System.out.println("*********Esta linea no respeta el formato de entrada************");
		    System.out.println(linea);
		    System.out.println("****************************************************************");
		}

		// TODO resto de campos, cuidado porque todas las lineas no tienen 6 campos, hay
		// alguna con menos

		// TODO contador ++; incrementar la linea
		contador++;
	    }
	    reader.close();
	} catch (IOException e) {
	    e.printStackTrace();
	}

    }

}