package Ejercicio1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio1Controlador implements WindowListener, ActionListener{
	
	Ejercicio1Vista objVista;
	Ejercicio1Modelo objModelo;
	
	public Ejercicio1Controlador(Ejercicio1Vista vista, Ejercicio1Modelo modelo) {
		this.objVista = vista;
		this.objModelo = modelo;
		
		objVista.btnComprobar.addActionListener(this);
		objVista.addWindowListener(this);
	}

	public void actionPerformed(ActionEvent arg0) {
		if(objVista.btnComprobar.equals(arg0.getSource())) {
			String resultado = "";
			
			if(objVista.chkCorrer.getState() == true) {
				resultado = objModelo.correr(resultado);
			}
		}
	}

	public void windowActivated(WindowEvent arg0) {

	}

	public void windowClosed(WindowEvent arg0) {
	
	}

	public void windowClosing(WindowEvent arg0) {
		System.exit(0);
	}

	public void windowDeactivated(WindowEvent arg0) {

	}

	public void windowDeiconified(WindowEvent arg0) {
	
	}

	public void windowIconified(WindowEvent arg0) {
	
	}

	public void windowOpened(WindowEvent arg0) {

	}

}
