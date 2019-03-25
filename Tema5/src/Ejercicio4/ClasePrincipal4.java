package Ejercicio4;

public class ClasePrincipal4 {

	public static void main(String[] args) {
		/* Creamos dos objetos Vista y Modelo */
		ClaseVista4 Vista = new ClaseVista4();
		ClaseModelo4 Modelo = new ClaseModelo4();
		
		/* Instanciamos un objeto de la clase Controlador */
		new ClaseControlador4(Vista, Modelo); 

	}
}
