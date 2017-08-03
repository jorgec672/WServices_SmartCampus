package uniajc.edu.ws;

import javax.jws.WebMethod;

import uniajc.edu.model.CargaAcademica;
import uniajc.edu.servicio.SCargaAcademicaImp;
import uniajc.edu.utilidades.CreaJson;



public class WSCargaAcademica {
	
	
	private CreaJson jsonUtil = CreaJson.getJson();
	
    /***
    * @param ID    <i>(Identificaci�n unica del Profesor en Academusoft) </i>
    * @return  <b>String (Notaci�n JSON)</b>
   ***/
   @WebMethod(operationName = "getCargaAcademica")
   public CargaAcademica getCargaAcademicafull(String IDENTIFICACION, String A�O, String PERIODO) {
 
	   SCargaAcademicaImp dao = new SCargaAcademicaImp();
	   return dao.getCargaAcademicafull(IDENTIFICACION,A�O,PERIODO);
}
   
   @WebMethod(operationName = "getCargaAcademicaJSON")
   public String getCargaAcademicaJSON(String IDENTIFICACION, String A�O, String PERIODO) {
       return jsonUtil.respondeOBJSON(new SCargaAcademicaImp().getCargaAcademicafull(IDENTIFICACION,A�O,PERIODO));
   }
  

	
	
}
