package com.ipartek.formacion.excepciones;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PruebasExcepcionesFISFOS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Se crea el flujo de entrada OUT Sacamos informacion de nuestro sistema");
			FileOutputStream fos = new FileOutputStream(
					"C:\\2009\\workspace\\uf2404\\src\\com\\ipartek\\formacion\\excepciones\\fichero_PruebaFISFOS.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			System.out.println("Escribimos un perro en el archivo");
			oos.writeObject(new Perro());
			System.out.println("cerramos los flujos");
			oos.close();
			fos.close();
			System.out.println("Abrimos el fichero IN leemos informacion de fuera a nuestro sistema");
			FileInputStream fis = new FileInputStream(
					"C:\\2009\\workspace\\uf2404\\src\\com\\ipartek\\formacion\\excepciones\\fichero_PruebaFISFOS.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			System.out.println("Leemos perro y se guarda en objeto");
			Perro perroPrueba = (Perro) ois.readObject();
			System.out.println("Syso de perro leido :" + perroPrueba);
			System.out.println("cerramos flujo IN");
			ois.close();
			fis.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
