package uniajc.edu.model;

public class CargaAcademica {

	private String PEGE_ID;
	private String PEGE_DOCUMENTOIDENTIDAD;
	private String PENG_PRIMERAPELLIDO;
	private String PENG_SEGUNDOAPELLIDO;
	private String PENG_PRIMERNOMBRE;
	private String PENG_SEGUNDONOMBRE;
	private String UNID_NOMBRE;
	private String MATE_CODIGOMATERIA;
	private String MATE_NOMBRE;
	private String GRUP_NOMBRE;
	private String GRUP_CUPOS;
	private String DOGR_FECHACAMBIO;
	private String DOGR_REGISTRADOPOR;
	private String PEUN_ANO;
	private String PEUN_PERIODO;
	
	
	public CargaAcademica() {
	
	}
		

	public CargaAcademica(String pEGE_ID, String pEGE_DOCUMENTOIDENTIDAD, String uNID_NOMBRE) {
		PEGE_ID = pEGE_ID;
		PEGE_DOCUMENTOIDENTIDAD = pEGE_DOCUMENTOIDENTIDAD;
		UNID_NOMBRE = uNID_NOMBRE;
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


	public String getPENG_PRIMERAPELLIDO() {
		return PENG_PRIMERAPELLIDO;
	}


	public void setPENG_PRIMERAPELLIDO(String pENG_PRIMERAPELLIDO) {
		PENG_PRIMERAPELLIDO = pENG_PRIMERAPELLIDO;
	}


	public String getPENG_SEGUNDOAPELLIDO() {
		return PENG_SEGUNDOAPELLIDO;
	}


	public void setPENG_SEGUNDOAPELLIDO(String pENG_SEGUNDOAPELLIDO) {
		PENG_SEGUNDOAPELLIDO = pENG_SEGUNDOAPELLIDO;
	}


	public String getPENG_PRIMERNOMBRE() {
		return PENG_PRIMERNOMBRE;
	}


	public void setPENG_PRIMERNOMBRE(String pENG_PRIMERNOMBRE) {
		PENG_PRIMERNOMBRE = pENG_PRIMERNOMBRE;
	}


	public String getPENG_SEGUNDONOMBRE() {
		return PENG_SEGUNDONOMBRE;
	}


	public void setPENG_SEGUNDONOMBRE(String pENG_SEGUNDONOMBRE) {
		PENG_SEGUNDONOMBRE = pENG_SEGUNDONOMBRE;
	}


	public String getUNID_NOMBRE() {
		return UNID_NOMBRE;
	}


	public void setUNID_NOMBRE(String uNID_NOMBRE) {
		UNID_NOMBRE = uNID_NOMBRE;
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


	public String getPEUN_ANO() {
		return PEUN_ANO;
	}


	public void setPEUN_ANO(String pEUN_ANO) {
		PEUN_ANO = pEUN_ANO;
	}


	public String getPEUN_PERIODO() {
		return PEUN_PERIODO;
	}


	public void setPEUN_PERIODO(String pEUN_PERIODO) {
		PEUN_PERIODO = pEUN_PERIODO;
	} 
	


}
