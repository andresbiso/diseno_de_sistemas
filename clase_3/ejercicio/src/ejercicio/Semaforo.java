package ejercicio;

public class Semaforo {
	private Color color;
	
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public void cambiar() {
		color.cambiar(this);
	}
}
