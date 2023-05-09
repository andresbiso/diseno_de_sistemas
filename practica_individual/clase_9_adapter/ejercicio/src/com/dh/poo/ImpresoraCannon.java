package com.dh.poo;

public class ImpresoraCannon implements IImpresoraLinux {

	@Override
	public void imprimir(String mensaje, int numero) {
		System.out.println("Impresora Epson: " + mensaje + " Numero: " + numero);
	}

}
