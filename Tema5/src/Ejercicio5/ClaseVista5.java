package Ejercicio5;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ClaseVista5 extends JFrame {
	private static final long serialVersionUID = 1L;
 
	JTextField campoNumero = new JTextField(10);
	JTextField campoPalabra = new JTextField(10);
	JTextField campoRespuesta = new JTextField(10);
	JButton botonBuscar = new JButton("Buscar");
	JPanel panelEtiquetas, panelCampos, panelBoton;
	
	public ClaseVista5() {
		add(putOnPanel(new JLabel("Número: ")));
		add(putOnPanel(campoNumero));
		add(putOnPanel(new JLabel()));
		
		add(putOnPanel(new JLabel("Palabra: ")));
		add(putOnPanel(campoPalabra));
		add(putOnPanel(new JLabel()));
		
		add(putOnPanel(new JLabel("Respuesta: ")));
		add(putOnPanel(campoRespuesta));
		add(putOnPanel(botonBuscar));
 
		setTitle("MVC");
		setSize(400, 150);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(new GridLayout(3,3));
		campoRespuesta.setEditable(false);
		setVisible(true);
	}
	
	public static JPanel putOnPanel(Component c) {
		JPanel resultado = new JPanel(new FlowLayout());
		resultado.add(c);
		return resultado;
	}

}
