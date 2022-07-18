package n1exercici2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;


import org.junit.Before;
import org.junit.jupiter.api.Test;

class CalculoDNITest2 {
	int[] validaDnis = {};
	

	@Test
	public void testIguales() {
		validaDnis = CalculoDNI.introduceDni();

		//Miramos que las letras sean las que corresponden
		assertEquals(CalculoDNI.calculaLetraDni(validaDnis[0]), 'S');
		assertEquals(CalculoDNI.calculaLetraDni(validaDnis[1]), 'M');
		assertEquals(CalculoDNI.calculaLetraDni(validaDnis[2]), 'U');
		assertEquals(CalculoDNI.calculaLetraDni(validaDnis[3]), 'O');
		assertEquals(CalculoDNI.calculaLetraDni(validaDnis[4]), 'H');
		assertEquals(CalculoDNI.calculaLetraDni(validaDnis[5]), 'P');
		assertEquals(CalculoDNI.calculaLetraDni(validaDnis[6]), 'V');
		assertEquals(CalculoDNI.calculaLetraDni(validaDnis[7]), 'C');
		assertEquals(CalculoDNI.calculaLetraDni(validaDnis[8]), 'N');
		assertEquals(CalculoDNI.calculaLetraDni(validaDnis[9]), 'A');

	}

	@Test
	public void testDiferente() {

		//En caso de introducir la letra diferente
		validaDnis = CalculoDNI.introduceDni();
		assertNotSame(CalculoDNI.calculaLetraDni(validaDnis[9]), 'B');
	}

}