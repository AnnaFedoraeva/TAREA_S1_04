package n1exercici3;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Crea una classe amb un mètode que llanci una ArrayIndexOutOfBoundsException.
//		Verifica el seu correcte funcionament amb un test jUnit.

		ArrayList<Integer> array = new ArrayList<>();

		array.add(1);
		array.add(2);
		array.add(3);

		Exception(array);
	}

	public static ArrayList<Integer> add(int numero) {
		ArrayList<Integer> array = new ArrayList<>();
		array.add(numero);
		return array;
	}

	public static void Exception(ArrayList<Integer> array) {
		try {
			for (int i = 0; i <= 3; i++) {
				int total = array.get(i);
			}
		} catch (IndexOutOfBoundsException ex) {
			System.out.println("Excepcion: no es posible acceder a un índice del array que no existe");

		}
	}

}
