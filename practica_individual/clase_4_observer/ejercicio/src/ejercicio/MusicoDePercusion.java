package ejercicio;

public class MusicoDePercusion implements Observador {
	@Override
	public void accion(Observado observado) {
		Director dir = (Director) observado;
		if (!dir.isManoIzqLevantada() && !dir.isManoDerLevantada()) {
			System.out.println("MusicoDePercusión Tocando");
		}
	}
}
