package uniajc.edu.ws;

import javax.jws.WebMethod;

import uniajc.edu.model.CargaAcademica;
import uniajc.edu.servicio.SCargaAcademicaImp;
import uniajc.edu.utilidades.CreaJson;



public class WSCargaAcademica {
	
	
	private CreaJson jsonUtil = CreaJson.getJson();
	
    /***
    * @param ID    <i>(Identificación unica del Profesor en Academusoft) </i>
    * @return  <b>String (Notación JSON)</b>
   ***/
   @WebMethod(operationName = "getCargaAcademica")
   public CargaAcademica getCargaAcademicafull(String IDENTIFICACION, String AÑO, String PERIODO) {
 
	   SCargaAcademicaImp dao = new SCargaAcademicaImp();
	   return dao.getCargaAcademicafull(IDENTIFICACION,AÑO,PERIODO);
}
   
   @WebMethod(operationName = "getCargaAcademicaJSON")
   public String getCargaAcademicaJSON(String IDENTIFICACION, String AÑO, String PERIODO) {
       return jsonUtil.respondeOBJSON(new SCargaAcademicaImp().getCargaAcademicafull(IDENTIFICACION,AÑO,PERIODO));
   }
  

	
	
}
