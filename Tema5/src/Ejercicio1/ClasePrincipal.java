package Ejercicio1;

public class ClasePrincipal {

	public static void main(String[] args) {
		Ejercicio1Vista claseVista = new Ejercicio1Vista();
		Ejercicio1Modelo claseModelo = new Ejercicio1Modelo();
		
		new Ejercicio1Controlador(claseVista, claseModelo);

	}

}
