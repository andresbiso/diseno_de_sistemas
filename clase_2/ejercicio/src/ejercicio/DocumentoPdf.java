package ejercicio;

public class DocumentoPdf implements TipoDocumento {

	@Override
	public void exportar(Documento documento) {
		System.out.println("Exportando a Pdf: " + documento.getTexto());
	}

}
