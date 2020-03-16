package ejercicio.arrays.basico;

public class Baraja implements Comparable<Object> {

    private String palo;
    private int numero;
    public static final String OROS = "oros";
    public static final String COPAS = "copas";
    public static final String BASTOS = "bastos";
    public static final String ESPADAS = "espadas";
    public static final int CARTA_MAXIMA = 12;
    public static final int CARTAS_TOTALES = 48;

    public Baraja(String palo, int numero) {
	super();
	this.palo = palo;
	this.numero = numero;
    }

    public Baraja() {
	super();
    }

    public String getPalo() {
	return palo;
    }

    public void setPalo(String palo) {
	this.palo = palo;
    }

    public int getNumero() {
	return numero;
    }

    public void setNumero(int numero) {
	this.numero = numero;
    }

    @Override
    public String toString() {
	return "Baraja [palo=" + palo + ", numero=" + numero + "]";
    }

    @Override
    public int compareTo(Object o) {
	Baraja otro = (Baraja) o;
	int commparacionPorTipo = palo.compareTo(otro.getPalo());

	if (commparacionPorTipo != 0)
	    return commparacionPorTipo;

	return Integer.compare(numero, otro.getNumero());
    }
}
