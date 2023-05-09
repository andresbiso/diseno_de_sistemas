package com.dh.poo;

public class ImpresoraEpson  implements IImpresoraWindows {

	@Override
	public void print(String mensaje) {
		System.out.println("Impresora Epson: " + mensaje);
	}

}
