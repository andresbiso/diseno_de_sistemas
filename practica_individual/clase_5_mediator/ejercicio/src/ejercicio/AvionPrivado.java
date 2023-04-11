package ejercicio;

public class AvionPrivado extends Aeronave {
	public AvionPrivado(Mediador mediador, String nombre) {
		super(mediador, nombre);
	}

	@Override
	public void enviar(String mensaje) {
		System.out.println(this.nombre + ": Enviando Mensaje=" + mensaje);
		mediador.enviarMensaje(mensaje, this);
	}

	@Override
	public void recibir(String mensaje) {
		System.out.println(this.nombre + ": Recibió Mensaje=" + mensaje);
	}
}
