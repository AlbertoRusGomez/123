package Ejercicio4;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ClaseVista4 extends JFrame {

	private static final long serialVersionUID = 1L;
	
	JLabel numero = new JLabel("Número: ");
	JTextField textoNumero = new JTextField(10);
	
	JLabel factorizacion = new JLabel("Factorización: ");
	JTextField textoFactorizacion = new JTextField(20);
	
	JButton factorizar = new JButton("Factorizar");
	
	JPanel panel = new JPanel();
	
	Font fuente = new Font("Bahnschrift", Font.BOLD, 15);
	
	Font fuente2 = new Font("Bahnschrift", Font.BOLD, 13);
	
	public ClaseVista4() {
		setTitle("Factorizar");
		setSize(420, 350);
		setLayout(new FlowLayout());
		
		panel.setPreferredSize(this.getSize());
		panel.setLayout(null);
		
		numero.setBounds(90, 10, 80, 30);
		numero.setFont(fuente);
		panel.add(numero);
		
		textoNumero.setBounds(190, 10, 100, 30);
		textoNumero.setFont(fuente);
		panel.add(textoNumero);
		
		factorizacion.setBounds(60, 60, 120, 30);
		factorizacion.setFont(fuente);
		panel.add(factorizacion);
		
		textoFactorizacion.setBounds(190, 60, 200, 30);
		textoFactorizacion.setFont(fuente);
		panel.add(textoFactorizacion);
		
		factorizar.setBounds(150, 250, 60, 60);
		factorizar.setFont(fuente2);
		panel.add(factorizacion);
		
		add(panel);
		setVisible(true);
		
	}

}
