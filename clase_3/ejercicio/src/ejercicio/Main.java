package ejercicio;

public class Main {

	public static void main(String[] args) {
		Semaforo semaforo = new Semaforo();
		System.out.println(semaforo.getColor());
		semaforo.setColor(new Verde());
		semaforo.cambiar();
		System.out.println(semaforo.getColor());
		semaforo.cambiar();
		System.out.println(semaforo.getColor());
		semaforo.cambiar();
		System.out.println(semaforo.getColor());
		semaforo.setColor(new Apagado());
		System.out.println(semaforo.getColor());
		semaforo.cambiar();
		System.out.println(semaforo.getColor());
	}

}
