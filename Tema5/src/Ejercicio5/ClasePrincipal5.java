package Ejercicio5;

public class ClasePrincipal5 {

	public static void main(String[] args) {
		/* Creamos dos objetos Vista y Modelo */
		ClaseVista5 Vista = new ClaseVista5();
		ClaseModelo5 Modelo = new ClaseModelo5();
		
		/* Instanciamos un objeto de la clase Controlador */
		new ClaseControlador5(Modelo, Vista); 

	}

}
