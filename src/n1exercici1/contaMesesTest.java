package n1exercici1;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class contaMesesTest {

	@Test
	public void testMesesTotales() {

		ArrayList<String> meses = new ArrayList<>();
		contaMeses.sumaMeses(meses);
		assertEquals(meses.size(), 12);
	}

	@Test
	public void testNoVacia() {

		ArrayList<String> meses = new ArrayList<>();
		contaMeses.sumaMeses(meses);
		assertNotEquals(meses, null);
	}

	@Test
	public void testAgosto() {

		ArrayList<String> meses = new ArrayList<>();
		contaMeses.sumaMeses(meses);
		assertTrue("Agosto".equalsIgnoreCase(meses.get(7)));
	}
}
