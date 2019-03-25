package Ejercicio2;

public class ClaseModelo2 {
	
	public float CelsiusFahrenheit(String numero) {
		float resultado;
		float fl = Float.parseFloat(numero);
		resultado = (float) ((fl *9.0/5.0) + 32.0);
		return resultado;
	}
	
	public float FahrenheitCelsius(String numero) {
		float resultado;
		float fl = Float.parseFloat(numero);
		resultado = (float)((fl-32.0)*(5.0/9.0));
		return resultado;
	}
}
