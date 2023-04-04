package ejercicio;

public class Verde implements Color {

	@Override
	public void cambiar(Semaforo semaforo) {
		semaforo.setColor(new Amarillo());
	}

}
