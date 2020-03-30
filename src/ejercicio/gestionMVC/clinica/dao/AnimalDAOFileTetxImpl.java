package ejercicio.gestionMVC.clinica.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;

import ejercicio.gestionMVC.clinica.idao.IDAO;
import ejercicio.gestionMVC.clinica.model.Animal;

/**
 * Clase que extiende de AnimalDAOImpl. Así se aprovechan los metodos CRUD y el
 * atributo ArrayList de animales, que se rellena con lo leido del fichero.
 * 
 * @author Alvaro
 *
 */
public class AnimalDAOFileTetxImpl extends AnimalDAOImpl implements IDAO<Animal>, AutoCloseable {

    File fichero;

    public AnimalDAOFileTetxImpl() {
	super();

	URL url = getClass().getResource("fichero.txt");
	this.fichero = new File(url.getPath());
    }

    /**
     * pasamos el contenido del fichero a un array
     * 
     * @throws IOException
     */
    public void ficheroToArray() {
	// FileInputStream fis;
	// ObjectInputStream ois = null;

	try (FileInputStream fis = new FileInputStream(fichero); ObjectInputStream ois = new ObjectInputStream(fis);) {
	    ;

	    Animal aux = (Animal) ois.readObject();
	    while (aux != null) {// TODO hacer que deje de leer cuando llegue al final del fichero para que no
				 // casque

		getAnimales().add(aux);
		aux = (Animal) ois.readObject();
	    }
	    ois.close();
	} catch (Exception e) {

	    e.printStackTrace();
	}

    }

    /**
     * Pasar el array al fichero
     */
    public void arrayToFichero() {
	FileOutputStream fos;
	ObjectOutputStream oos = null;
	try {
	    fos = new FileOutputStream(fichero);
	    oos = new ObjectOutputStream(fos);
	    for (int i = 0; i < getAnimales().size(); i++) {
		oos.writeObject(getAnimales().get(i));

	    }

	    oos.close();

	} catch (FileNotFoundException e) {
	    e.printStackTrace();
	} catch (IOException e) {
	    e.printStackTrace();
	}

    }

    @Override
    public void close() throws Exception {
	// TODO Auto-generated method stub

    }

}
