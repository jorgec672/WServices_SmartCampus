/**
 * WSHistoricoNota.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uniajc.edu.ws;

import javax.jws.WebMethod;

import uniajc.edu.model.MatriculaAcademica;
import uniajc.edu.servicio.SMatriculaAcademicaImp;

import uniajc.edu.utilidades.CreaJson;

public class WSMatriculaAcademica {
	
	
	private CreaJson jsonUtil = CreaJson.getJson();
	
    //Metodo Que retorna Un JSO de acuerdo a la Identificacion
   
   @WebMethod(operationName = "getMatriculaNotaJSON")
   public String getMatriculaAcademicaJSON(int IDENTIFICACION) {
       return jsonUtil.respondeOBJSON(new SMatriculaAcademicaImp().getMatriculaAcademica(IDENTIFICACION));
   }
  	
	
}
