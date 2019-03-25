package Ejercicio4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ClaseControlador4 implements ActionListener, WindowListener {
	/* Declaramos dos objetos que vamos a controlar */
	ClaseVista4 objVista = null; 
	ClaseModelo4 objModelo = null;

	/* Constructor */
	public ClaseControlador4(ClaseVista4 objVista, ClaseModelo4 objModelo) {
		this.objVista = objVista;
		this.objModelo = objModelo; 

		/* Añadimos los escuchadores */
		objVista.factorizar.addActionListener(this);
		objVista.addWindowListener(this); 
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
