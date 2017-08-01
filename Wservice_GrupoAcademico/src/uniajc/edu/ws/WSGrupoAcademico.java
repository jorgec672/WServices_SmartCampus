package uniajc.edu.ws;

//import java.util.ArrayList;

import javax.jws.WebMethod;

import uniajc.edu.model.GrupoAcademico;
import uniajc.edu.servicio.SGrupoAcademicoImp;
import uniajc.edu.utilidades.CreaJson;



public class WSGrupoAcademico {
	
	
	private CreaJson jsonUtil = CreaJson.getJson();
	
    /***
    * Retorna un   Listado  de  Objetos tipo HistorialPrograma con sus respectivas Materias  y calificaciones,
    * el retorno del objeto  se   realiza bajo  notación JSON. 
    *  <i>(presenta  la traza de asignaturas, y estados del programa a lo largo de la carrera cursada)</i>
    * @param ID    <i>(Identificación unica del Profesor en Academusoft) </i>
    * @return  <b>String (Notación JSON)</b>
   ***/
  // @WebMethod(operationName = "getGrupoAcademico")
  /* public ArrayList<GrupoAcademico>  getGrupoAcademicofull(int GRUPO) {
 
	   SGrupoAcademicoImp dao = new SGrupoAcademicoImp();
	   return dao.getGrupoAcademicofull(GRUPO);
}*/
   
   @WebMethod(operationName = "getGrupoAcademicoJSON")
   public String getGrupoAcademicoJSON(int GRUPO) {
       return jsonUtil.respondeOBJSON(new SGrupoAcademicoImp().getGrupoAcademicofull(GRUPO));
   }
  
	
}
