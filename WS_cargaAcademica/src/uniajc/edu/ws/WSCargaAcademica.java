package uniajc.edu.ws;

import javax.jws.WebMethod;

import uniajc.edu.servicio.SCargaAcademicaImp;
import uniajc.edu.utilidades.CreaJson;

/**
 * 
 * @author Nousagi
 *
 */
public class WSCargaAcademica {
	
	/**
	 * Variable INstanciada Json Utilidad
	 */
	private CreaJson jsonUtil = CreaJson.getJson();
	

/**
 *   
 * @param IDENTIFICACION identificacion de persona a consultar
 * @param A�O   a�o a consultar
 * @param PERIODO periodo a consulta
 * @return {string} Carga academica en Formato Json
 */
   @WebMethod(operationName = "getCargaAcademicaJSON")
   public String getCargaAcademicaJSON(String IDENTIFICACION, String A�O, String PERIODO) {
       return jsonUtil.respondeOBJSON(new SCargaAcademicaImp().getCargaAcademicafull(IDENTIFICACION,A�O,PERIODO));
   }
  

	
	
}
