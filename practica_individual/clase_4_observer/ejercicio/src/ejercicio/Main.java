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
		dir.setManoIzqLevantada(true);
		dir.setManoDerLevantada(false);
		dir.notificar();
		dir.setManoIzqLevantada(false);
		dir.setManoDerLevantada(true);
		dir.notificar();
		dir.setManoIzqLevantada(true);
		dir.setManoDerLevantada(true);
		dir.notificar();
	}
}
