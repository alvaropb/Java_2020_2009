package com.ipartek.formacion.metodos;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UtilidadesTest {
	/*
	 * @Test public void testSaludarString() { fail("Not yet implemented"); }
	 */
	@Test
	public void testSaludarStringString() throws Exception {
		assertEquals("Hola Manolo", Utilidades.saludar("Manolo", Utilidades.IDIOMA_CASTELLANO));
		;
	}
//
//	@Test
//	public void testSuma() {
//		assertEquals(6, Utilidades.suma(3, 3));
////mas aserciones que podemos usar
//		assertTrue(true);
//		assertFalse(2 > 300);
//		assertNull(null);
//		// assertNotNull(object);
//	}
	/*
	 * @Test public void testCalcularLetraDniInt() { fail("Not yet implemented"); }
	 * 
	 * @Test public void testCalcularLetraDniString() { fail("Not yet implemented");
	 * }
	 */

	@Test
	public void bubbleShort() {

		int[] aDesordenado = { 0, 3, 1, 8 };

		int[] aOrdenado = Utilidades.bubbleShort(aDesordenado);

		assertEquals(0, aOrdenado[0]);
		assertEquals(1, aOrdenado[1]);
		assertEquals(3, aOrdenado[2]);
		assertEquals(8, aOrdenado[3]);

	}
}
