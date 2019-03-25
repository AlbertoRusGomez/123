package Ejercicio2;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

public class ClaseVista2 extends Frame {
	private static final long serialVersionUID = 1L; 
	
	//Construcción de los componentes
	Label lblCelsius = new Label("Celsius: ");
	Label lblFahrenheit = new Label("Fahrenheit: ");
	TextField txtC = new TextField();
	TextField txtF = new TextField();
	Button btnCF = new Button("De C -> F");
	Button btnFC = new Button("De F -> C");
		
	public ClaseVista2() {
		//Parámetros de la ventana
		this.setTitle("Conversor de Temperaturas");
		this.setSize(400, 150);
		this.setLocation(300, 100);
		this.setBounds(300, 100, 400, 150);
		this.setResizable(false);
		this.setLayout(new GridLayout(3,2));
		
		//Añadir los componentes
		this.add(lblCelsius);
		this.add(txtC);
		this.add(lblFahrenheit);
		this.add(txtF);
		this.add(btnCF);
		this.add(btnFC);
			
			
		this.setVisible(true);
	}

}
