package com.dh.poo;

public class ImpresoraCannonAdaptada implements IImpresoraWindows {
	private ImpresoraCannon impresora;

	public ImpresoraCannonAdaptada(ImpresoraCannon impresora) {
		this.impresora = impresora;
	}

	@Override
	public void print(String mensaje) {
		impresora.imprimir(mensaje, 0);
	}

}
