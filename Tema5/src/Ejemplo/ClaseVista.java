package Ejemplo;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ClaseVista extends JFrame{

	private static final long serialVersionUID = 1L;

	
	JLabel numero = new JLabel("Número: ");
	JTextField textoNumero = new JTextField(10);
	
	JLabel palabra = new JLabel("Palabra: ");
	JTextField textoPalabra = new JTextField(15);
	
	JButton buscar = new JButton("Buscar");
	JButton limpiar = new JButton("Limpiar");
	
	JPanel panel = new JPanel();
	
	Font fuente = new Font("Bahnschrift", Font.BOLD, 15);
	Font fuente2 = new Font("Bahnschrift", Font.BOLD, 13);
	
	public ClaseVista() {
		setTitle("Memoria");
		setSize(400, 220);
		setLayout(new FlowLayout());
		
		panel.setLayout(null);
		panel.setPreferredSize(this.getSize());
		
		numero.setBounds(50, 10, 80, 30);
		numero.setFont(fuente);
		panel.add(numero);
		
		textoNumero.setBounds(160, 10, 120, 30);
		textoNumero.setFont(fuente);
		panel.add(textoNumero);
		
		palabra.setBounds(50, 60, 80, 30);
		palabra.setFont(fuente);
		panel.add(palabra);
		
		textoPalabra.setBounds(160, 60, 150, 30);
		textoPalabra.setFont(fuente);
		panel.add(textoPalabra);
		
		buscar.setBounds(90, 110, 100, 40);
		buscar.setFont(fuente2);
		panel.add(buscar);
		
		limpiar.setBounds(210, 110, 100, 40);
		limpiar.setFont(fuente2);
		panel.add(limpiar);
		
		add(panel);
		this.setVisible(true);
		
	}
	
	
	
}
