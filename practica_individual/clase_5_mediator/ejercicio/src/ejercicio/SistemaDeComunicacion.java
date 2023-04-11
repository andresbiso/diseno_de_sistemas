package ejercicio;

import java.util.ArrayList;
import java.util.List;

public class SistemaDeComunicacion implements Mediador {
	private List<Aeronave> aeronaves;

	public SistemaDeComunicacion(){
		this.aeronaves = new ArrayList<>();
	}

	@Override
	public void addAeronave(Aeronave aeronave) {
		this.aeronaves.add(aeronave);
	}

	@Override
	public void enviarMensaje(String mensaje, Aeronave aeronaveMensaje) {
		for (Aeronave aeronave : this.aeronaves) {
			// envío el mensaje a todos menos al que envió el mensaje
			if (aeronave != aeronaveMensaje) {
				aeronave.recibir(mensaje);
			}
		}
	}
}
