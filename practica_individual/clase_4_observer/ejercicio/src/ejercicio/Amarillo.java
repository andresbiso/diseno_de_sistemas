package ejercicio;

public class Amarillo implements Color {

	@Override
	public void cambiar(Semaforo semaforo) {
		semaforo.setColor(new Rojo());
	}

}
