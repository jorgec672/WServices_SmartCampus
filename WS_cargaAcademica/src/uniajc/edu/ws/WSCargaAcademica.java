package uniajc.edu.ws;

import javax.jws.WebMethod;

import uniajc.edu.model.CargaAcademica;
import uniajc.edu.servicio.SCargaAcademicaImp;
import uniajc.edu.utilidades.CreaJson;



public class WSCargaAcademica {
	
	
	private CreaJson jsonUtil = CreaJson.getJson();
	
    /***
    * Retorna un   Listado  de  Objetos tipo HistorialPrograma con sus respectivas Materias  y calificaciones,
    * el retorno del objeto  se   realiza bajo  notación JSON. 
    *  <i>(presenta  la traza de asignaturas, y estados del programa a lo largo de la carrera cursada)</i>
    * @param ID    <i>(Identificación unica del Profesor en Academusoft) </i>
    * @return  <b>String (Notación JSON)</b>
   ***/
   @WebMethod(operationName = "getCargaAcademica")
   public CargaAcademica getCargaAcademicafull(int IDENTIFICACION, int AÑO, int PERIODO) {
 
	   SCargaAcademicaImp dao = new SCargaAcademicaImp();
	   return dao.getCargaAcademicafull(IDENTIFICACION,AÑO,PERIODO);
}
   
   @WebMethod(operationName = "getCargaAcademicaJSON")
   public String getCargaAcademicaJSON(int IDENTIFICACION, int AÑO, int PERIODO) {
       return jsonUtil.respondeOBJSON(new SCargaAcademicaImp().getCargaAcademicafull(IDENTIFICACION,AÑO,PERIODO));
   }
  

	
	
}
