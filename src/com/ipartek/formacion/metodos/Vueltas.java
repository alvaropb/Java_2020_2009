package com.ipartek.formacion.metodos;

public class Vueltas {

	public static final float[] BILLETES_MONEDAS = { 500f, 200f, 100f, 50f, 20f, 10f, 5f, 2f, 1f, 0.50f, 0.20f, 0.10f,
			0.05f, 0.02f, 0.01f };

	public static int[] calcularVueltasOptimas(float importe, float entregado) throws Exception {

		int[] vueltas = new int[BILLETES_MONEDAS.length];

		// TODO vuestro marron
		float resto = entregado;
		try {
			calcularVueltas(importe, entregado);
			for (int i = 0; i < BILLETES_MONEDAS.length; i++) {
				if (BILLETES_MONEDAS[i] <= resto) {
					int monedicas = (int) (resto / BILLETES_MONEDAS[i]);
					vueltas[i] = monedicas;
					resto -= monedicas * BILLETES_MONEDAS[i];
				}
				if (resto == 0) {
					break;
				}
			} // fin for

		} catch (Exception e) {
			e.printStackTrace();
		}

		return vueltas;

	}

	public static float calcularVueltas(float importe, float entregado) throws Exception {
		float diferencia = 0;
		if (entregado < importe) {
			throw new Exception("Entregado menor que importe");
		} else {
			diferencia = entregado - importe;
		}
		return diferencia;
	}

}
