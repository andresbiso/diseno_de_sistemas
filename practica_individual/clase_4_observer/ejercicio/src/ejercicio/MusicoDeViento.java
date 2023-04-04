package ejercicio;

public class MusicoDeViento implements Observador {
	@Override
	public void accion(Observado observado) {
		Director dir = (Director) observado;
		if (!dir.isManoIzqLevantada() && dir.isManoDerLevantada()) {
			System.out.println("MusicoDeViento Tocando");
		}
	}
}
