package ejercicio;

public class Main {
	public static void main(String[] args) {
		Mediador mediator = new SistemaDeComunicacion();
		Aeronave aeronave1 = new AvionComercial(mediator, "ac1");
		Aeronave aeronave2 = new AvionPrivado(mediator, "ap1");
		Aeronave aeronave3 = new Helicoptero(mediator, "h1");
		mediator.addAeronave(aeronave1);
		mediator.addAeronave(aeronave2);
		mediator.addAeronave(aeronave3);;		
		aeronave1.enviar("¡Hola a todos soy ac1!");
		aeronave2.enviar("¡Hola a todos soy ap1!");
		aeronave3.enviar("¡Hola a todos soy h1!");
	}
}
