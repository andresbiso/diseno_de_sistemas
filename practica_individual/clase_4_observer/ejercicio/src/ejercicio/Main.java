package ejercicio;

public class Main {
	public static void main(String[] args) {
		Director dir = new Director();
		MusicoDeCuerda musicoDeCuerda = new MusicoDeCuerda();
		MusicoDeViento musicoDeViento = new MusicoDeViento();
		MusicoDePercusion musicoDePercusion = new MusicoDePercusion();
		dir.addObservador(musicoDeCuerda);
		dir.addObservador(musicoDeViento);
		dir.addObservador(musicoDePercusion);
		dir.notificar();
		dir.setManoDerLevantada(true);
		dir.setManoIzqLevantada(false);
		dir.notificar();
		dir.setManoDerLevantada(false);
		dir.setManoIzqLevantada(true);
		dir.notificar();
		dir.setManoDerLevantada(true);
		dir.setManoIzqLevantada(true);
		dir.notificar();
	}
}
