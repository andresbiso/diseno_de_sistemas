package ejercicio;

public abstract class Aeronave {
	protected String nombre;
	protected Mediador mediador;
	
	public Aeronave(Mediador mediador, String nombre) {
		this.mediador = mediador;
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract void enviar(String mensaje);
	
	public abstract void recibir(String mensaje);
}
