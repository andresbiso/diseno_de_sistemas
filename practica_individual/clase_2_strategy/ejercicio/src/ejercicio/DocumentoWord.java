package ejercicio;

public class DocumentoWord implements TipoDocumento {

	@Override
	public void exportar(Documento documento) {
		System.out.println("Exportando a Word: " + documento.getTexto());
	}

}
