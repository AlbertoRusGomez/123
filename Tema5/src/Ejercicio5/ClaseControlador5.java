package Ejercicio5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ClaseControlador5 implements ActionListener, WindowListener {
	private ClaseVista5 v;
	private ClaseModelo5 m;
 
	public ClaseControlador5(ClaseModelo5 m, ClaseVista5 v) {
		this.v = v;
		this.m = m;
 
		v.botonBuscar.addActionListener(this);
		v.addWindowListener(this);
	}
 
	@Override
	public void windowActivated(WindowEvent arg0) {
 
	}
 
	@Override
	public void windowClosed(WindowEvent arg0) {
 
	}
 
	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.exit(0);
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
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
 
	}
 
	@Override
	public void actionPerformed(ActionEvent evento) {
 
		if (evento.getSource().equals(v.botonBuscar)) {
			String resultado;
 
			if (v.campoNumero.getText().equals("")) {
				int numero = m.palabraANumero(v.campoPalabra.getText());
				resultado = String.valueOf(numero);
			} else {
				resultado = m.numeroAPalabra(Integer.parseInt(v.campoNumero.getText()));
			}
 
			v.campoRespuesta.setText(resultado);
		}
	}

}
