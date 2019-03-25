package Ejemplo;

public class ClaseModelo {

	String[] numeros = {"1","2","3","4","5","6","7"};
	String[] palabras = {"Programación", "Perro", "Insignia", "Numerable", "Automóvil", "ACL", "Decronomicon"};

	public String numeroPalabra(String numero) {
		String resultado = "";
		
		for(int i=0; i<numeros.length; i++) {
			if(numero.equals(numeros[i])) {
				resultado = palabras[i];
			}
		}
		
		return resultado;
	}
	
	public String palabraNumero(String palabra) {
		String resultado = "";
		
		for(int i=0; i<palabras.length; i++) {
			if(palabra.equals(palabras[i])) {
				resultado = numeros[i];
			}
		}
		return resultado;
	}



}
