package ejercicio;

import java.util.ArrayList;

public class Observado {
	private ArrayList<Observador> observadores;
	
	public Observado() {
		this.observadores = new ArrayList<Observador>();
	}

	public ArrayList<Observador> getObservadores() {
		return observadores;
	}

	public void addObservador(Observador observador) {
		this.observadores.add(observador);
	}
	
	public void limpiarObservadores() {
		this.observadores.clear();
	}
	
	
	public void notificar() {
		for (Observador observador : observadores) {
			observador.accion(this);
		}
	}
}
