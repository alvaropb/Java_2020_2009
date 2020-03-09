package app.perrera;

import java.util.Scanner;

public class AppPerrera {

	static PerroDAO dao = new PerroDAOImpl();
	static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		pintarMenu();

	}// fin main

	static void pintarMenu() {
		int opcion = 0;
		do {
			System.out.println(Constantes.SALUDO_MENU);
			System.out.println(Constantes.MOSTRAR_TODOS);
			System.out.println(Constantes.MOSTRAR_TODOS_NOMBRE);
			System.out.println(Constantes.MOSTRAR_TODOS_RAZA);
			System.out.println(Constantes.MOSTRAR_UNO_POR_ID);
			System.out.println(Constantes.ELIMINAR_REGISTRO);
			System.out.println(Constantes.CREAR_REGISTRO);
			System.out.println(Constantes.ACTUALIZAR_REGISTRO);
			System.out.println(Constantes.SALIR_MENU);
			opcion = Integer.valueOf(sc.nextLine());
			switch (opcion) {
			case 1:
				System.out.println(dao.getAll());
				break;
			case 2:
				buscarPerrosPorNombre();
				break;
			case 3:
				buscarPerrosPorRaza();
				break;
			case 4:
				buscarPerroPorId();
				break;
			case 5:
				eliminarRegistro();
				break;
			case 6:
				crearRegistro();
				break;
			case 7:
				updateRegistro();
				break;

			default:
				break;
			}
		} while (opcion != 8);
	}// fin menu

	private static void updateRegistro() {
		Perro perro = new Perro();
		System.out.println(Constantes.INTRODUZCA_NOMBRE);
		perro.setNombre(sc.nextLine());
		System.out.println(Constantes.INTRODUZCA_RAZA);
		perro.setRaza(sc.nextLine());
		System.out.println(Constantes.INTRODUZCA_ID);
		perro.setId(Integer.valueOf(sc.nextLine()));
		System.out.println("****************");
		System.out.println(
				(dao.update(perro)) ? Constantes.REGISTRO_ACTUALIZADO_TRUE : Constantes.REGISTRO_ACTUALIZADO_FALSE);
		System.out.println("****************");
	}

	private static void crearRegistro() {
		Perro perro = new Perro();
		System.out.println(Constantes.INTRODUZCA_NOMBRE);
		perro.setNombre(sc.nextLine());
		System.out.println(Constantes.INTRODUZCA_RAZA);
		perro.setRaza(sc.nextLine());
		System.out.println("****************");
		System.out.println(dao.crear(perro));
		System.out.println("****************");
	}

	private static void eliminarRegistro() {
		System.out.println(Constantes.INTRODUZCA_ID_A_ELIMINAR);
		int iD = Integer.valueOf(sc.nextLine());
		System.out.println("****************");
		System.out.println((dao.delete(iD)) ? Constantes.REGISTRO_ELIMINADO_TRUE : Constantes.REGISTRO_ELIMINADO_FALSE);
		System.out.println("****************");

	}

	private static void buscarPerroPorId() {
		System.out.println(Constantes.INTRODUZCA_ID);
		int iD = Integer.valueOf(sc.nextLine());
		System.out.println("****************");
		Perro perro = dao.getById(iD);
		System.out.println((perro).getId() == 0 ? "No se ha encontrado perro con esa id" : perro);
		System.out.println("****************");

	}

	private static void buscarPerrosPorRaza() {
		System.out.println(Constantes.INTRODUZCA_RAZA);
		String raza = sc.nextLine();
		System.out.println("****************");
		System.out.println(dao.buscarPorRaza(raza));
		System.out.println("****************");

	}

	static void buscarPerrosPorNombre() {
		System.out.println(Constantes.INTRODUZCA_NOMBRE);
		String nombre = sc.nextLine();
		System.out.println("****************");
		System.out.println(dao.buscarPorNombre(nombre));
		System.out.println("****************");
	}

}
