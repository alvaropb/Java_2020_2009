package com.ipartek.formacion.excepciones;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EjercicioExtra {

	public static void main(String[] args) {
		FileWriter fichero = null;
		Scanner sc = new Scanner(System.in);

		try {
			fichero = new FileWriter(
					"C:\\2009\\workspace\\uf2404\\src\\com\\ipartek\\formacion\\excepciones\\fichero_escritura.txt");
			System.out.println("Introduzca texto a guardar");

			fichero.append('X');
			// fichero.append(sc.nextLine());
			fichero.close();
			File ficheroEscrito = new File(
					"C:\\2009\\workspace\\uf2404\\src\\com\\ipartek\\formacion\\excepciones\\fichero_escritura.txt");
			sc.close();
			sc = new Scanner(ficheroEscrito);
			while (sc.hasNext()) {
				System.out.println("El contenido del fichero es : " + sc.nextLine());
			}
			sc.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
