package uniajc.edu.model;

public class CargaAcademica {

	private String PEGE_ID;
	private String PEGE_DOCUMENTOIDENTIDAD;
	public String getNOMBRES() {
		return NOMBRES;
	}






	public void setNOMBRES(String nOMBRES) {
		NOMBRES = nOMBRES;
	}






	public String getPERIODO() {
		return PERIODO;
	}






	public void setPERIODO(String pERIODO) {
		PERIODO = pERIODO;
	}


	private String NOMBRES;
	private String MATE_CODIGOMATERIA;
	private String MATE_NOMBRE;
	private String GRUP_NOMBRE;
	private String GRUP_CUPOS;
	private String DOGR_FECHACAMBIO;
	private String DOGR_REGISTRADOPOR;
	private String PERIODO;
	
	
	public CargaAcademica() {
	
	}
		

	



	public CargaAcademica(String pEGE_ID, String pEGE_DOCUMENTOIDENTIDAD, String nOMBRES, String mATE_CODIGOMATERIA,
			String mATE_NOMBRE, String gRUP_NOMBRE, String gRUP_CUPOS, String dOGR_FECHACAMBIO,
			String dOGR_REGISTRADOPOR, String pERIODO) {
		
		PEGE_ID = pEGE_ID;
		PEGE_DOCUMENTOIDENTIDAD = pEGE_DOCUMENTOIDENTIDAD;
		NOMBRES = nOMBRES;
		MATE_CODIGOMATERIA = mATE_CODIGOMATERIA;
		MATE_NOMBRE = mATE_NOMBRE;
		GRUP_NOMBRE = gRUP_NOMBRE;
		GRUP_CUPOS = gRUP_CUPOS;
		DOGR_FECHACAMBIO = dOGR_FECHACAMBIO;
		DOGR_REGISTRADOPOR = dOGR_REGISTRADOPOR;
		PERIODO = pERIODO;
	}






	public String getPEGE_ID() {
		return PEGE_ID;
	}


	public void setPEGE_ID(String pEGE_ID) {
		PEGE_ID = pEGE_ID;
	}


	public String getPEGE_DOCUMENTOIDENTIDAD() {
		return PEGE_DOCUMENTOIDENTIDAD;
	}


	public void setPEGE_DOCUMENTOIDENTIDAD(String pEGE_DOCUMENTOIDENTIDAD) {
		PEGE_DOCUMENTOIDENTIDAD = pEGE_DOCUMENTOIDENTIDAD;
	}

	public String getUNID_NOMBRE() {
		return NOMBRES;
	}


	public void setUNID_NOMBRE(String uNID_NOMBRE) {
		NOMBRES = uNID_NOMBRE;
	}


	public String getMATE_CODIGOMATERIA() {
		return MATE_CODIGOMATERIA;
	}


	public void setMATE_CODIGOMATERIA(String mATE_CODIGOMATERIA) {
		MATE_CODIGOMATERIA = mATE_CODIGOMATERIA;
	}


	public String getMATE_NOMBRE() {
		return MATE_NOMBRE;
	}


	public void setMATE_NOMBRE(String mATE_NOMBRE) {
		MATE_NOMBRE = mATE_NOMBRE;
	}


	public String getGRUP_NOMBRE() {
		return GRUP_NOMBRE;
	}


	public void setGRUP_NOMBRE(String gRUP_NOMBRE) {
		GRUP_NOMBRE = gRUP_NOMBRE;
	}


	public String getGRUP_CUPOS() {
		return GRUP_CUPOS;
	}


	public void setGRUP_CUPOS(String gRUP_CUPOS) {
		GRUP_CUPOS = gRUP_CUPOS;
	}


	public String getDOGR_FECHACAMBIO() {
		return DOGR_FECHACAMBIO;
	}


	public void setDOGR_FECHACAMBIO(String dOGR_FECHACAMBIO) {
		DOGR_FECHACAMBIO = dOGR_FECHACAMBIO;
	}


	public String getDOGR_REGISTRADOPOR() {
		return DOGR_REGISTRADOPOR;
	}


	public void setDOGR_REGISTRADOPOR(String dOGR_REGISTRADOPOR) {
		DOGR_REGISTRADOPOR = dOGR_REGISTRADOPOR;
	}


	public String getPEUN_PERIODO() {
		return PERIODO;
	}


	public void setPEUN_PERIODO(String pEUN_PERIODO) {
		PERIODO = pEUN_PERIODO;
	} 
	


}
