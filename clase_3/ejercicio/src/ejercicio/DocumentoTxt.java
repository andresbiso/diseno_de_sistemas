package ejercicio;

public class DocumentoTxt implements TipoDocumento {

	@Override
	public void exportar(Documento documento) {
		System.out.println("Exportando a Txt: " + documento.getTexto());
	}

}
