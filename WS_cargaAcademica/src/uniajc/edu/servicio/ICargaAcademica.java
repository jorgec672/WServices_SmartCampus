package uniajc.edu.servicio;

import java.util.ArrayList;

import uniajc.edu.model.CargaAcademica;

/**
 * 
 * @author Team Nousagi
 *
 */
public interface ICargaAcademica {
/**
 * 
 * @param id   :identificacion docente
 * @param ano  :Año  
 * @param periodo : Periodo
 * @return {Arrraylist} Carga academica consultada
 */
	public ArrayList<CargaAcademica> getCargaAcademicafull(String id,String ano,String periodo);
		
}
