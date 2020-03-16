package ejercicio.arrays.basico;

import java.util.ArrayList;

public class Ejercicio4 {

    public static void main(String[] args) {
	ArrayList<Baraja> baraja = new ArrayList<Baraja>();
	ArrayList<Baraja> barajaOrdenadaNumeros = new ArrayList<Baraja>();
	crearPalo(Baraja.OROS, baraja);
	crearPalo(Baraja.COPAS, baraja);
	crearPalo(Baraja.BASTOS, baraja);
	crearPalo(Baraja.ESPADAS, baraja);
//	pintarBaraja(baraja);

	crearBarajaPorNumeros(barajaOrdenadaNumeros);
//	pintarBaraja(barajaOrdenadaNumeros);
	ArrayList<Baraja> barajada = barajar(barajaOrdenadaNumeros);
	pintarBaraja(barajada);
	ordenar(barajada);
	pintarBaraja(barajada);
    }

    private static void ordenar(ArrayList<Baraja> barajada) {
	// TODO ordenar por palos y por numeros oros copas bastos
	// espadas---------------------------------´ñ
	Baraja aux;
	for (int i = 0; i < barajada.size(); i++) {
	    for (int j = i + 1; j < barajada.size(); j++) {
		if (barajada.get(i).getPalo().compareTo(barajada.get(j).getPalo()) > 0) {
		    aux = new Baraja();
		    aux = barajada.get(i);
		    barajada.set(i, barajada.get(j));
		    barajada.set(j, aux);
		}

	    } // fin for j
	} // fin for i

	for (int i = 0; i < barajada.size(); i++) {
	    for (int j = i + 1; j < barajada.size(); j++) {
		if (barajada.get(i).getPalo().equals(barajada.get(j).getPalo())) {
		    if (barajada.get(i).getNumero() > barajada.get(j).getNumero()) {
			aux = new Baraja();
			aux = barajada.get(i);
			barajada.set(i, barajada.get(j));
			barajada.set(j, aux);
		    }
		} // fin if compara del mismo palo

	    } // fin for j
	} // fin for i

    }

    private static void aleatorio(int i) {
	int valorDado = (int) Math.floor(Math.random() * i + 1);

    }

    private static ArrayList<Baraja> barajar(ArrayList<Baraja> barajaOrdenadaNumeros) {
	// TODO Auto-generated method stub
	ArrayList<Baraja> barajada = new ArrayList<Baraja>();
	ArrayList<Baraja> barajaOrdenadaTemp = new ArrayList<Baraja>();
	barajaOrdenadaTemp.addAll(barajaOrdenadaNumeros);

	int aleatorio = (int) Math.floor(Math.random() * Baraja.CARTAS_TOTALES);
	do {
	    barajada.add(barajaOrdenadaTemp.get(aleatorio));
	    barajaOrdenadaTemp.remove(aleatorio);
	    aleatorio = (int) Math.floor(Math.random() * barajaOrdenadaTemp.size());
	} while (barajaOrdenadaTemp.size() > 0);

	return barajada;
    }

    private static void crearBarajaPorNumeros(ArrayList<Baraja> barajaOrdenadaNumeros) {
	for (int i = 1; i <= Baraja.CARTA_MAXIMA; i++) {
	    Baraja carta = new Baraja(Baraja.OROS, i);
	    Baraja carta2 = new Baraja(Baraja.COPAS, i);
	    Baraja carta3 = new Baraja(Baraja.BASTOS, i);
	    Baraja carta4 = new Baraja(Baraja.ESPADAS, i);
	    barajaOrdenadaNumeros.add(carta);
	    barajaOrdenadaNumeros.add(carta2);
	    barajaOrdenadaNumeros.add(carta3);
	    barajaOrdenadaNumeros.add(carta4);
	}

    }

    private static void pintarBaraja(ArrayList<Baraja> baraja) {
	for (int i = 0; i < baraja.size(); i++) {
	    System.out.println(baraja.get(i).toString());

	}

    }

    public static void crearPalo(String palo, ArrayList<Baraja> baraja) {
	for (int i = 1; i <= Baraja.CARTA_MAXIMA; i++) {
	    Baraja carta = new Baraja(palo, i);
	    baraja.add(carta);
	}
    }
}
