package Ejercicio1;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;


public class Ejercicio1Vista  extends Frame 
{
	private static final long serialVersionUID = 1L;
	Checkbox chkCorrer = new Checkbox("Correr");
	Checkbox chkNadar = new Checkbox("Nadar");
	Checkbox chkAndar = new Checkbox("Andar");
	Checkbox chkLeer = new Checkbox("Leer");
	Checkbox chkCine = new Checkbox("Ir al Cine");
	Checkbox chkBailar = new Checkbox("Bailar");
	Checkbox chkFutbol = new Checkbox("Fútbol");
	Checkbox chkTenis = new Checkbox("Tenis");
	Checkbox chkBaloncesto = new Checkbox("Baloncesto");
	Checkbox chkVela = new Checkbox("Deportes de Vela");
	Button btnComprobar = new Button("Comprobar");
	String resultado = new String("");
	

	public Ejercicio1Vista()
	{
		setLayout(new FlowLayout());
		setTitle("Aficiones");
		add(chkCorrer);
		add(chkNadar);
		add(chkAndar);
		add(chkLeer);
		add(chkCine);
		add(chkBailar);
		add(chkFutbol);
		add(chkTenis);
		add(chkBaloncesto);
		add(chkVela);
		add(btnComprobar);
		
		
		setSize(350,150);
		setResizable (false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new Ejercicio1Vista();
	}

}
