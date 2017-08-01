package uniajc.edu.model;

public class GrupoAcademico {

	private String PEGE_DOCUMENTOIDENTIDAD;
	private String NOMBRES;
	private String DIRECCION;

	


	
	
	public GrupoAcademico(String pEGE_DOCUMENTOIDENTIDAD, String nOMBRES, String dIRECCION) {
		super();
		PEGE_DOCUMENTOIDENTIDAD = pEGE_DOCUMENTOIDENTIDAD;
		NOMBRES = nOMBRES;
		DIRECCION = dIRECCION;
	}






	public String getPEGE_DOCUMENTOIDENTIDAD() {
		return PEGE_DOCUMENTOIDENTIDAD;
	}






	public void setPEGE_DOCUMENTOIDENTIDAD(String pEGE_DOCUMENTOIDENTIDAD) {
		PEGE_DOCUMENTOIDENTIDAD = pEGE_DOCUMENTOIDENTIDAD;
	}






	public String getNOMBRES() {
		return NOMBRES;
	}






	public void setNOMBRES(String nOMBRES) {
		NOMBRES = nOMBRES;
	}






	public String getDIRECCION() {
		return DIRECCION;
	}






	public void setDIRECCION(String dIRECCION) {
		DIRECCION = dIRECCION;
	}






	public GrupoAcademico() {
	
	}
		

	




}
