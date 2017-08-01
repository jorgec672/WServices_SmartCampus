/**
 * HistoricoNota.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uniajc.edu.model;

public class NotaActual  implements java.io.Serializable {
    private java.lang.String ESTP_CODIGOMATRICULA;

    private java.lang.String GRUP_NOMBRE;

    private java.lang.String MATE_CODIGOMATERIA;

    private java.lang.String MATE_NOMBRE;

    private java.lang.String PEGE_ID;

    private java.lang.String PEUN_ANO;

    private java.lang.String PEUN_PERIODO;

    private java.lang.String PROG_CODIGOPROGRAMA;

    private java.lang.String REAC_NOTAFINAL;

    private java.lang.String REAC_TIPO;
    
    private String NOMBRES;

    public NotaActual() {
    }

    


    public NotaActual(String eSTP_CODIGOMATRICULA, String gRUP_NOMBRE, String mATE_CODIGOMATERIA, String mATE_NOMBRE,
			String pEGE_ID, String pEUN_ANO, String pEUN_PERIODO, String pROG_CODIGOPROGRAMA, String rEAC_NOTAFINAL,
			String rEAC_TIPO, String nOMBRES) {
		super();
		ESTP_CODIGOMATRICULA = eSTP_CODIGOMATRICULA;
		GRUP_NOMBRE = gRUP_NOMBRE;
		MATE_CODIGOMATERIA = mATE_CODIGOMATERIA;
		MATE_NOMBRE = mATE_NOMBRE;
		PEGE_ID = pEGE_ID;
		PEUN_ANO = pEUN_ANO;
		PEUN_PERIODO = pEUN_PERIODO;
		PROG_CODIGOPROGRAMA = pROG_CODIGOPROGRAMA;
		REAC_NOTAFINAL = rEAC_NOTAFINAL;
		REAC_TIPO = rEAC_TIPO;
		NOMBRES = nOMBRES;
	}




	/**
     * Gets the ESTP_CODIGOMATRICULA value for this HistoricoNota.
     * 
     * @return ESTP_CODIGOMATRICULA
     */
    public java.lang.String getESTP_CODIGOMATRICULA() {
        return ESTP_CODIGOMATRICULA;
    }


    /**
     * Sets the ESTP_CODIGOMATRICULA value for this HistoricoNota.
     * 
     * @param ESTP_CODIGOMATRICULA
     */
    public void setESTP_CODIGOMATRICULA(java.lang.String ESTP_CODIGOMATRICULA) {
        this.ESTP_CODIGOMATRICULA = ESTP_CODIGOMATRICULA;
    }


    /**
     * Gets the GRUP_NOMBRE value for this HistoricoNota.
     * 
     * @return GRUP_NOMBRE
     */
    public java.lang.String getGRUP_NOMBRE() {
        return GRUP_NOMBRE;
    }


    /**
     * Sets the GRUP_NOMBRE value for this HistoricoNota.
     * 
     * @param GRUP_NOMBRE
     */
    public void setGRUP_NOMBRE(java.lang.String GRUP_NOMBRE) {
        this.GRUP_NOMBRE = GRUP_NOMBRE;
    }


    /**
     * Gets the MATE_CODIGOMATERIA value for this HistoricoNota.
     * 
     * @return MATE_CODIGOMATERIA
     */
    public java.lang.String getMATE_CODIGOMATERIA() {
        return MATE_CODIGOMATERIA;
    }


    /**
     * Sets the MATE_CODIGOMATERIA value for this HistoricoNota.
     * 
     * @param MATE_CODIGOMATERIA
     */
    public void setMATE_CODIGOMATERIA(java.lang.String MATE_CODIGOMATERIA) {
        this.MATE_CODIGOMATERIA = MATE_CODIGOMATERIA;
    }


    /**
     * Gets the MATE_NOMBRE value for this HistoricoNota.
     * 
     * @return MATE_NOMBRE
     */
    public java.lang.String getMATE_NOMBRE() {
        return MATE_NOMBRE;
    }


    /**
     * Sets the MATE_NOMBRE value for this HistoricoNota.
     * 
     * @param MATE_NOMBRE
     */
    public void setMATE_NOMBRE(java.lang.String MATE_NOMBRE) {
        this.MATE_NOMBRE = MATE_NOMBRE;
    }


    /**
     * Gets the PEGE_ID value for this HistoricoNota.
     * 
     * @return PEGE_ID
     */
    public java.lang.String getPEGE_ID() {
        return PEGE_ID;
    }


    /**
     * Sets the PEGE_ID value for this HistoricoNota.
     * 
     * @param PEGE_ID
     */
    public void setPEGE_ID(java.lang.String PEGE_ID) {
        this.PEGE_ID = PEGE_ID;
    }


    /**
     * Gets the PEUN_ANO value for this HistoricoNota.
     * 
     * @return PEUN_ANO
     */
    public java.lang.String getPEUN_ANO() {
        return PEUN_ANO;
    }


    /**
     * Sets the PEUN_ANO value for this HistoricoNota.
     * 
     * @param PEUN_ANO
     */
    public void setPEUN_ANO(java.lang.String PEUN_ANO) {
        this.PEUN_ANO = PEUN_ANO;
    }


    /**
     * Gets the PEUN_PERIODO value for this HistoricoNota.
     * 
     * @return PEUN_PERIODO
     */
    public java.lang.String getPEUN_PERIODO() {
        return PEUN_PERIODO;
    }


    public String getNOMBRES() {
		return NOMBRES;
	}

	public void setNOMBRES(String nOMBRES) {
		NOMBRES = nOMBRES;
	}

	/**
     * Sets the PEUN_PERIODO value for this HistoricoNota.
     * 
     * @param PEUN_PERIODO
     */
    public void setPEUN_PERIODO(java.lang.String PEUN_PERIODO) {
        this.PEUN_PERIODO = PEUN_PERIODO;
    }


    /**
     * Gets the PROG_CODIGOPROGRAMA value for this HistoricoNota.
     * 
     * @return PROG_CODIGOPROGRAMA
     */
    public java.lang.String getPROG_CODIGOPROGRAMA() {
        return PROG_CODIGOPROGRAMA;
    }


    /**
     * Sets the PROG_CODIGOPROGRAMA value for this HistoricoNota.
     * 
     * @param PROG_CODIGOPROGRAMA
     */
    public void setPROG_CODIGOPROGRAMA(java.lang.String PROG_CODIGOPROGRAMA) {
        this.PROG_CODIGOPROGRAMA = PROG_CODIGOPROGRAMA;
    }


    /**
     * Gets the REAC_NOTAFINAL value for this HistoricoNota.
     * 
     * @return REAC_NOTAFINAL
     */
    public java.lang.String getREAC_NOTAFINAL() {
        return REAC_NOTAFINAL;
    }


    /**
     * Sets the REAC_NOTAFINAL value for this HistoricoNota.
     * 
     * @param REAC_NOTAFINAL
     */
    public void setREAC_NOTAFINAL(java.lang.String REAC_NOTAFINAL) {
        this.REAC_NOTAFINAL = REAC_NOTAFINAL;
    }


    /**
     * Gets the REAC_TIPO value for this HistoricoNota.
     * 
     * @return REAC_TIPO
     */
    public java.lang.String getREAC_TIPO() {
        return REAC_TIPO;
    }


    /**
     * Sets the REAC_TIPO value for this HistoricoNota.
     * 
     * @param REAC_TIPO
     */
    public void setREAC_TIPO(java.lang.String REAC_TIPO) {
        this.REAC_TIPO = REAC_TIPO;
    }


	
    
}
