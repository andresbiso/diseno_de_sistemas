package ejercicio;

public class Rojo implements Color {

	@Override
	public void cambiar(Semaforo semaforo) {
		semaforo.setColor(new Verde());
	}

}
