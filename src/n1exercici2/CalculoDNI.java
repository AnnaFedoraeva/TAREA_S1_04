package n1exercici2;

import java.util.ArrayList;

public class CalculoDNI {

//	Crea una classe anomenada CalculoDni que calculi la lletra del DNI en rebre el número com a paràmetre.
//	Crea una classe jUnit que verifiqui el seu correcte funcionament, 
//	parametritzant-la perquè el test rebi un espectre de dades ampli i validi si el càlcul és correcte per a 10 números de DNI predefinits.
	

	public static void main(String[] args) {
		int[] numDni = introduceDni();
		char letraDni = calculaLetraDni(numDni[0]);
		
	}
	
	public static int[] introduceDni() {
		
		int[] arrayDnis = {45871236, 43021569, 48510002, 49625555, 41010010, 43659852, 44469858, 46978895, 40000000, 44469864};
        return arrayDnis;
	}

	public static char calculaLetraDni(int numDni) {
		
		//Como tenemos 26 letras, el resto de la división de 27 nos dirá una letra de entre las 26, nunca más grande.
		int resultado = numDni%27;
		char letras[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		return letras[resultado];
	}
	
	public static void suDniEs(ArrayList<Integer> dnis) {
		
		for (int i=0;i<=9;i++) {
			System.out.println("La letra de su DNI es: " + calculaLetraDni(dnis.get(i)));
		}
	}
}

