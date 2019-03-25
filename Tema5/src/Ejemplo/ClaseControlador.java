package Ejemplo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import Ejemplo.ClaseModelo;
import Ejemplo.ClaseVista;

public class ClaseControlador implements ActionListener, WindowListener {
	/* Declaramos dos objetos que vamos a controlar */
	ClaseVista objVista = null; 
	ClaseModelo objModelo = null;

	/* Constructor */
	public ClaseControlador(ClaseVista objVista, ClaseModelo objModelo) {
		this.objVista = objVista;
		this.objModelo = objModelo; 

		/* Añadimos los escuchadores */
		objVista.buscar.addActionListener(this);
		objVista.limpiar.addActionListener(this);
		objVista.addWindowListener(this); 
	}


	public void windowActivated(WindowEvent arg0) {}

	public void windowClosed(WindowEvent arg0) {}

	public void windowClosing(WindowEvent arg0) {
		System.exit(0);
	}

	public void windowDeactivated(WindowEvent arg0) {}

	public void windowDeiconified(WindowEvent arg0) {}

	public void windowIconified(WindowEvent arg0) {}

	public void windowOpened(WindowEvent arg0) {}

	public void actionPerformed(ActionEvent arg0) {
		Object a = arg0.getSource();
		String resultado;
		String resultado2;

		if(a.equals(objVista.buscar)) {

			if(objVista.textoPalabra.getText().isEmpty()) {
				resultado = objModelo.numeroPalabra(objVista.textoNumero.getText());
				objVista.textoPalabra.selectAll();
				objVista.textoPalabra.setText(resultado);
			}
			
			if(objVista.textoNumero.getText().isEmpty()) {
				resultado2 = objModelo.palabraNumero(objVista.textoPalabra.getText());
				objVista.textoNumero.selectAll();
				objVista.textoNumero.setText(resultado2);
			}
		}
		
		if(a.equals(objVista.limpiar)) {
			objVista.textoNumero.selectAll();
			objVista.textoPalabra.selectAll();
			
			objVista.textoNumero.setText("");
			objVista.textoPalabra.setText("");
		}

	}

}
