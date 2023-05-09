package com.dh.poo;

public class ImpresoraHP implements IImpresoraWindows {

	@Override
	public void print(String mensaje) {
		System.out.println("Impresora HP: " + mensaje);
	}

}
