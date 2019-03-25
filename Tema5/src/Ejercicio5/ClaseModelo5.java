package Ejercicio5;

import java.util.ArrayList;
import java.util.Arrays;

public class ClaseModelo5 {
	private ArrayList<String> palabras;
	 
	public ClaseModelo5() {
		// Constructor con "Add"
		/*
		 * palabras = new ArrayList<string>(); palabras.add("Programación");
		 * palabras.add("Perro"); palabras.add("Insignia"); palabras.add("Numerable");
		 * palabras.add("Automóvil"); palabras.add("ACL"); palabras.add("Decronomicón");
		 */
 
		// Utilizando "Collections.addAll"
		/*
		 * palabras = new ArrayList<string>(); Collections.addAll(palabras,
		 * "Programación", "Perro", "Insignia", "Numerable", "Automóvil", "ACL",
		 * "Decronomicón");
		 */
 
		//Utilizando "Array.asList"
		 palabras = new ArrayList<String>( Arrays.asList("Programación", "Perro", "Insignia", "Numerable", "Automóvil", "ACL", "Decronomicón"));
		 
	}
 
	public int palabraANumero(String palabra) {
		return palabras.indexOf(palabra) + 1;
	}
 
	public String numeroAPalabra(int numero) {
		return palabras.get(numero - 1);
	}
}
