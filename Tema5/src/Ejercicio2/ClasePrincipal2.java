package Ejercicio2;

public class ClasePrincipal2 {

	public static void main(String[] args) {
		/* Creamos dos objetos Vista y Modelo */
		ClaseVista2 Vista = new ClaseVista2();
		ClaseModelo2 Modelo = new ClaseModelo2();
		
		/* Instanciamos un objeto de la clase Controlador */
		new ClaseControlador2(Vista, Modelo); 

	}

}
