package n1exercici1;

import java.util.ArrayList;

//Crea una classe Java que insereixi en una llista ordenada els noms dels mesos de l'any.
//Verifica amb jUnit que la llista t� 12 posicions, que no �s nul�la i que en la seva posici� 8 cont� el nom 'agost'.

public class contaMeses {

	public static void main(String[] args) {

		ArrayList<String> meses = new ArrayList<>();

		sumaMeses(meses);
	}

	public static void sumaMeses(ArrayList<String> meses) {

		meses.add("Enero");
		meses.add("Febrero");
		meses.add("Marzo");
		meses.add("Abril");
		meses.add("Mayo");
		meses.add("Junio");
		meses.add("Julio");
		meses.add("Agosto");
		meses.add("Septiembre");
		meses.add("Octubre");
		meses.add("Noviembre");
		meses.add("Diciembre");
	}
}
