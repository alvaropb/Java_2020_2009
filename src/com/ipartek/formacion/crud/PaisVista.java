package com.ipartek.formacion.crud;

import java.util.ArrayList;
import java.util.Scanner;

public class PaisVista {

	private Scanner sc;
	private PaisNegocio pNegocio;
	PaisDAOImpl paisDAOImpl;

	public PaisVista() {
		super();
		sc = new Scanner(System.in);
		paisDAOImpl = new PaisDAOImpl();
	}

	public static void main(String[] args) {
		PaisVista vista = new PaisVista();
		vista.menu();
	}

	public void menu() {
		int opcion = 0;
		pintarMenu();
		opcion = Integer.parseInt(sc.nextLine());

		while (opcion != 6) {
			switch (opcion) {
			case Constantes.UNO:// 1.- Introducir un país
				introducirPais();

				break;
			case Constantes.DOS:// 2.- Buscar un país
				// buscarPais(paises);
				break;
			case Constantes.TRES:// 3.- Listar paises
				buscarPaises();

				break;
			case Constantes.CUATRO:// 4.-Actualizar pais
				// actualizarPais(paises);
				break;
			case Constantes.CINCO:// 5.- Eliminar país
//				int posicion=buscarPais(paises);
//				pNegocio.eliminarPais(Pais pais, ArrayList<Pais>paises);
				break;
			case Constantes.SEIS:// 6.- Salir

				break;

			default:
				break;
			}
			pintarMenu();
			opcion = Integer.parseInt(sc.nextLine());
		}

	}

	private void pintarMenu() {
		System.out.println(Constantes.BIENVENIDO);
		System.out.println(Constantes.INTRODUCIR_OPCION);
		System.out.println(Constantes.BUSCAR_PAIS);
		System.out.println(Constantes.INTRO_PAIS);
		System.out.println(Constantes.BUSCAR_PAIS);
		System.out.println(Constantes.LISTAR_PAISES);
		System.out.println(Constantes.ACTUALIZAR_PAIS);
		System.out.println(Constantes.ELIMINAR_PAIS);
		System.out.println(Constantes.SALIR);
	}

	private void introducirPais() {
		Pais paisAux = new Pais();
		System.out.println(Constantes.INTRO_NOMBRE);
		paisAux.setNombre(sc.nextLine());
		System.out.println(Constantes.INTRO_NUMERO_CASOS);
		paisAux.setNumCasos(Integer.parseInt(sc.nextLine()));
		Pais pais = paisDAOImpl.create(paisAux);
		System.out.println(Constantes.INSERT_EXITOSO);
		pais.toString();

	}

	private int buscarPais(ArrayList<Pais> paises) {
		Pais paisAux = new Pais();
		System.out.println(Constantes.INTRO_NOMBRE);
		paisAux.setNombre(sc.nextLine());
		int posicion = pNegocio.buscarPais(paises, paisAux.getNombre());
		if (posicion == -1) {
			System.out.println(Constantes.NO_HAY_REGISTROS);
		} else {
			System.out.println(Constantes.SI_HAY_REGISTROS + posicion);
		}
		return posicion;
	}// fin buscar pais

	private void buscarPaises() {
		int listadoOpcion = 0;
		System.out.println(Constantes.INTRODUCIR_OPCION);
		System.out.println(Constantes.LISTAR_INFECCIOSOS);
		System.out.println(Constantes.LISTAR_PAISES_LIBRES_INFECCION);
		System.out.println(Constantes.LISTADO_TOTAL_PAISES);
		listadoOpcion = Integer.parseInt(sc.nextLine());
		paisDAOImpl.readMany(listadoOpcion);
	}

	private void actualizarPais(ArrayList<Pais> paises) {
		int posicion = buscarPais(paises);
		Pais paisAux = new Pais();
		System.out.println("Introduzca el nuevo nombre");
		paisAux.setNombre(sc.nextLine());
		System.out.println("Introduzca el numero de casos");
		paisAux.setNumCasos(Integer.parseInt(sc.nextLine()));
		System.out.println(Constantes.ACTUALIZADO_PAIS_POSICION + pNegocio.actualizarPais(paises, paisAux));

	}
}
