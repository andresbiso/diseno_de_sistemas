package ejercicio;

public class Director extends Observado {
	private boolean manoIzqLevantada;
	private boolean manoDerLevantada;
	
	public Director() {
		super();
		this.manoIzqLevantada = false;
		this.manoDerLevantada = false;
	}

	public boolean isManoIzqLevantada() {
		return manoIzqLevantada;
	}

	public void setManoIzqLevantada(boolean manoIzqLevantada) {
		this.manoIzqLevantada = manoIzqLevantada;
	}

	public boolean isManoDerLevantada() {
		return manoDerLevantada;
	}

	public void setManoDerLevantada(boolean manoDerLevantada) {
		this.manoDerLevantada = manoDerLevantada;
	}
}
