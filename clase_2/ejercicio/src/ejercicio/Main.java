package ejercicio;

import java.util.Calendar;

public class Main {

	public static void main(String[] args) {
		Documento documento = new Documento();
		documento.setAutor("GoF");
		documento.setFechaCreacion(Calendar.getInstance().getTime());
		documento.setNombre("patrones_de_diseño");
		documento.setTitulo("patrones de diseño");
		documento.setSubTitulo("patrones de diseño de GoF");
		documento.setTexto("patrones de diseño de GoF explicación");
		TipoDocumento tipoDocumento = new DocumentoPdf();
		documento.setTipoDocumento(tipoDocumento);
		documento.exportar();
		tipoDocumento = new DocumentoTxt();
		documento.setTipoDocumento(tipoDocumento);
		documento.exportar();
		tipoDocumento = new DocumentoWord();
		documento.setTipoDocumento(tipoDocumento);
		documento.exportar();
	}

}
