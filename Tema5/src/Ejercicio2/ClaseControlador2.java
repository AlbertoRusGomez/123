package Ejercicio2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ClaseControlador2 implements ActionListener, WindowListener {
	/* Declaramos dos objetos que vamos a controlar */
	ClaseVista2 objVista = null; 
	ClaseModelo2 objModelo = null;

	/* Constructor */
	public ClaseControlador2(ClaseVista2 objVista, ClaseModelo2 objModelo) {
		this.objVista = objVista;
		this.objModelo = objModelo; 

		/* A�adimos los escuchadores */
		objVista.btnCF.addActionListener(this);
		objVista.btnFC.addActionListener(this);
		objVista.addWindowListener(this); 
	}

	public void windowActivated(WindowEvent we) {}
	public void windowClosed(WindowEvent we) {}
	public void windowClosing(WindowEvent we)
	{
		//Llamamos al m�todo exit de la clase System,
		//devolviendo como c�digo de salida un 0
		System.exit(0);
	}
	public void windowDeactivated(WindowEvent we) {}
	public void windowDeiconified(WindowEvent we) {}
	public void windowIconified(WindowEvent we) {}
	public void windowOpened(WindowEvent we) {}
	public void actionPerformed(ActionEvent we)
	{
		//Primero averiguar qu� bot�n gener� este evento
		Object boton = we.getSource();
		float resultado;
		if(boton == objVista.btnCF) {
			resultado = objModelo.CelsiusFahrenheit(objVista.txtC.getText());
			objVista.txtF.setText(Float.toString(resultado));
		}
		else {
			resultado = objModelo.FahrenheitCelsius(objVista.txtF.getText());
			objVista.txtC.setText(Float.toString(resultado));
		}
	}
}

