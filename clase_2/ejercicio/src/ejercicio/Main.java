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
		documento.setTipoDocumento(new DocumentoPdf());
		documento.exportar();
		documento.setTipoDocumento(new DocumentoTxt());
		documento.exportar();
		documento.setTipoDocumento(new DocumentoWord());
		documento.exportar();
	}

}
