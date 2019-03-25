package Ejercicio5;

import java.util.ArrayList;
import java.util.Arrays;

public class ClaseModelo5 {
	private ArrayList<String> palabras;
	 
	public ClaseModelo5() {
		// Constructor con "Add"
		/*
		 * palabras = new ArrayList<string>(); palabras.add("Programaci�n");
		 * palabras.add("Perro"); palabras.add("Insignia"); palabras.add("Numerable");
		 * palabras.add("Autom�vil"); palabras.add("ACL"); palabras.add("Decronomic�n");
		 */
 
		// Utilizando "Collections.addAll"
		/*
		 * palabras = new ArrayList<string>(); Collections.addAll(palabras,
		 * "Programaci�n", "Perro", "Insignia", "Numerable", "Autom�vil", "ACL",
		 * "Decronomic�n");
		 */
 
		//Utilizando "Array.asList"
		 palabras = new ArrayList<String>( Arrays.asList("Programaci�n", "Perro", "Insignia", "Numerable", "Autom�vil", "ACL", "Decronomic�n"));
		 
	}
 
	public int palabraANumero(String palabra) {
		return palabras.indexOf(palabra) + 1;
	}
 
	public String numeroAPalabra(int numero) {
		return palabras.get(numero - 1);
	}
}
