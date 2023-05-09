package com.dh.poo;


public class Main {

	public static void main(String[] args) {
        IImpresoraWindows impresora = new ImpresoraEpson();
        impresora.print("Imprimiendo en Windows");
        impresora = new ImpresoraHP();
        impresora.print("Imprimiendo en Windows");
        impresora = new ImpresoraCannonAdaptada(new ImpresoraCannon());
        impresora.print("imprimiendo en Windows");
    }
}
