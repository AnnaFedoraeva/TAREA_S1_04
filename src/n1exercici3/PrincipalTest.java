package n1exercici3;

import static org.junit.Assert.assertThrows;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class PrincipalTest {

	@Test
	void IndexOutOfBoundsException() {

		ArrayList<Integer> numeros = Principal.add(1);

		assertThrows(IndexOutOfBoundsException.class, () -> numeros.get(1));
	}

}
