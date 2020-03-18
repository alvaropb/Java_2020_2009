package com.ipartek.formacion.ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PruebaLeerFichero {
    static Scanner sc;
    static BufferedReader reader;

    public static void main(String[] args) {

	int opcion = 0;
	sc = new Scanner(System.in);
	System.out.println("Introduzca una opcion");
	System.out.println("1.-Listar personas");
	System.out.println("2.-Buscar personas por numero de linea");
	System.out.println("3.-Buscar personas por nombre");
	System.out.println("4.-Buscar personas por email");
	opcion = Integer.parseInt(sc.nextLine());

	switch (opcion) {
	case 1:
	    listarPersonas();
	    break;

	case 2:
	    buscarNumeroLinea();
	    break;

	case 3:
	    buscarPorNombre();
	    break;

	case 4:
	    buscarPorEmail();
	    break;

	default:
	    break;
	}

	sc.close();
    }

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