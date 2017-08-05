package uniajc.edu.ws;

import java.util.ArrayList;

import javax.jws.WebMethod;

import uniajc.edu.model.CargaAcademica;
import uniajc.edu.servicio.SCargaAcademicaImp;
import uniajc.edu.utilidades.CreaJson;

/**
 * Clara principal WsCarga Academica
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
 * @param AÑO   año a consultar
 * @param PERIODO periodo a consulta
 * @return {string} Carga academica en Formato Json
 */
/*   @WebMethod(operationName = "getCargaAcademicaJSON")
   public String getCargaAcademicaJSON(String IDENTIFICACION, String AÑO, String PERIODO) { 
	   return jsonUtil.respondeOBJSON(new SCargaAcademicaImp().getCargaAcademicafull(IDENTIFICACION,AÑO,PERIODO));
   }*/

   
   
   
   @WebMethod(operationName = "getCargaAcademicaJSON1")
   public String getCargaAcademicaJSON1(String IDENTIFICACION, String ANO, String PERIODO) {
	   String respuesta = "";
	   int numero;
       if (IDENTIFICACION.isEmpty()) {
           respuesta = "El campo [identificacion] no puede esta vacio.";
       } else {
           if (ANO.isEmpty()) {
               respuesta = "El campo [Año] no puede esta vacio.";
           } else {
               if (PERIODO.isEmpty()) {
                   respuesta = "El campo [Periodo] no puede esta vacio.";
               } else {
                   if (respuesta.equals("[]")) {
                	   respuesta = "No se encontraron Datos Con los parametros Suministrados.";
                   }   
                      try {
                       respuesta=   jsonUtil.respondeOBJSON(new SCargaAcademicaImp().getCargaAcademicafull(IDENTIFICACION,ANO,PERIODO));
                       numero=Integer.parseInt(respuesta);
                       return respuesta;
                       }catch (NumberFormatException e) {
				       System.out.println(e);
				       respuesta = "Se han introducido algun caracteres no numéricos. Verificar En los Campos IDENTIFICACION/AÑO/PERIODO";
			           }
                     
  
           }
       }
    } 	   
      
    	   
	   return respuesta;
   }
	
	
}

