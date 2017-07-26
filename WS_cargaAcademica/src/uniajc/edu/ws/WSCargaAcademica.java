package uniajc.edu.ws;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebParam;

import com.google.gson.Gson;

import uniajc.edu.dao.CargaAcademicaDao;
import uniajc.edu.model.CargaAcademica;
import uniajc.edu.servicio.SCargaAcademicaImp;

public class WSCargaAcademica {
	

/*	public  CargaAcademica getCargaAcademica(int id) {
		  return new SCargaAcademicaImp().getCargaAcademica(id);
    }
	
	public  String getCargaAcademicaJSON(int id) {
		  return new SCargaAcademicaImp().getCargaAcademicaJSON(id);
    }*/
	
	
	
    /***
    * Retorna un   Listado  de  Objetos tipo HistorialPrograma con sus respectivas Materias  y calificaciones,
    * el retorno del objeto  se   realiza bajo  notación JSON. 
    *  <i>(presenta  la traza de asignaturas, y estados del programa a lo largo de la carrera cursada)</i>
    * @param pege_id    <i>(Identificación unica del estudiante en Academusoft) </i>
    * @param nombreApp  <i>(Nombre de la App que realiza la solicitud)          </i>
    * @param claveApp   <i>(llave  de la App que realiza la solicitud)           </i>
    * @return  <b>String (Notación JSON)</b>
   ***/
 // @WebMethod(operationName = "obtenerCargaAcademica")
   public CargaAcademica getCargaAcademicafull(int P_ID) {
 
	   SCargaAcademicaImp dao = new SCargaAcademicaImp();
	  System.out.println("re: "+P_ID); 
	   return dao.getCargaAcademicafull(P_ID);
  
   }
  
  @WebMethod(operationName = "nota")
  public String getCargaAcademicafullJson(int P_ID) {

	  System.out.println("1 Metodo a Consultar getCargaAcademicaJSON "+ P_ID);
	   SCargaAcademicaImp imp = new SCargaAcademicaImp();
	   System.out.println(" 2 Metodo a Consultar getCargaAcademicaJSON "+ P_ID);
	   return imp.getCargaAcademicafullJson(P_ID);
 
  }
	
	
}
