/**
 * WSHistoricoNota.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uniajc.edu.ws;

import javax.jws.WebMethod;

import uniajc.edu.model.NotaActual;
import uniajc.edu.servicio.SNotaActualImp;
import uniajc.edu.utilidades.CreaJson;

public class WSNotaActual {
	
	
	private CreaJson jsonUtil = CreaJson.getJson();
	
    /***
    * Retorna un   Listado  de  Objetos tipo Historial con sus respectivas Materias  y calificaciones,
    * el retorno del objeto  se   realiza bajo  notación JSON. 
    *  <i>(presenta  la traza de asignaturas, y estados del programa a lo largo de la carrera cursada)</i>
    * @param ID    <i>(Identificación unica del Profesor en Academusoft) </i>
    * @return  <b>String (Notación JSON)</b>
   ***/
   @WebMethod(operationName = "getNotaActual")
   public NotaActual getHistoricoNotafull(int IDENTIFICACION) {
 
	   SNotaActualImp dao = new SNotaActualImp();
	   return dao.getNotaActual(IDENTIFICACION);
}
   
   @WebMethod(operationName = "getHistoricoNotaJSON")
   public String getHistoricoNotaJSON(int IDENTIFICACION) {
       return jsonUtil.respondeOBJSON(new SNotaActualImp().getNotaActual(IDENTIFICACION));
   }
  

	
	
}
