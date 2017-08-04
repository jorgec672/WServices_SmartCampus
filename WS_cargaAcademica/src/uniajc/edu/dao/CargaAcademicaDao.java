package uniajc.edu.dao;

import uniajc.edu.model.*;
import uniajc.edu.conexion.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * 
 * @author Team Nousagi
 *
 */
public class CargaAcademicaDao {
	/**
	 * 
	 * @param P_ID - idenficacion de Docente
	 * @param ANO - Entero que represanta el Año a consultar Carga academica Ej:2017
	 * @param PERIODO  -Entero que representa el Periodo a consulta Ejemplo01,02 
	 * @return {ArrayList} Tipo JSON con la Carga academica consultada del profesor
	 * 
	 */
	public ArrayList<CargaAcademica> getCargaAcademicafull(String P_ID,String ANO,String PERIODO) {
		
		ConnectionDB conn = new ConnectionDB();
		ArrayList<CargaAcademica>  Datos= new ArrayList();
		
		 
		 try {
			 conn.connect();
		        String v_sqlPrograms = (" SELECT PERSONAGENERAL.PEGE_ID, PEGE_DOCUMENTOIDENTIDAD AS DOCUMENTO,"
		        		+ " PENG_PRIMERAPELLIDO||' ' ||PENG_SEGUNDOAPELLIDO||' '||PENG_PRIMERNOMBRE||' '||PENG_SEGUNDONOMBRE AS NOMBRES, "
                        +"    UNID_NOMBRE AS UNIDAD_ACADEMICA,GRUPO.MATE_CODIGOMATERIA AS CODIGO_MATERIA ,"
                        + "MATE_NOMBRE AS MATERIA,GRUP_NOMBRE AS GRUPO, GRUP_CUPOS AS MATRICULADOS,"
                      	+ " PEUN_ANO||'-'||PEUN_PERIODO AS PERIODO"
                        +"  FROM ACADEMICO.PERSONAGENERAL, ACADEMICO.TIPODOCUMENTOGENERAL , ACADEMICO.PERSONANATURALGENERAL,  "
                        + "   ACADEMICO.DOCENTEUNIDAD, ACADEMICO.DOCENTEGRUPO, ACADEMICO.GRUPO, ACADEMICO.MATERIA, ACADEMICO.UNIDAD, ACADEMICO.PERIODOUNIVERSIDAD "
                        + " WHERE ACADEMICO.PERSONAGENERAL.PEGE_ID=ACADEMICO.PERSONANATURALGENERAL.PEGE_ID "
                        +"AND ACADEMICO.TIPODOCUMENTOGENERAL.TIDG_ID=ACADEMICO.PERSONAGENERAL.TIDG_ID "
                        +"AND ACADEMICO.PERSONANATURALGENERAL.PEGE_ID=ACADEMICO.DOCENTEUNIDAD.PEGE_ID "
						   +"AND ACADEMICO.DOCENTEGRUPO.DOUN_ID=ACADEMICO.DOCENTEUNIDAD.DOUN_ID "
						   +"AND ACADEMICO.DOCENTEGRUPO.GRUP_ID=ACADEMICO.GRUPO.GRUP_ID "
						   +"AND ACADEMICO.GRUPO.MATE_CODIGOMATERIA=ACADEMICO.MATERIA.MATE_CODIGOMATERIA "
						   +"AND ACADEMICO.UNIDAD.UNID_ID=ACADEMICO.MATERIA.UNID_ID "
						   +"AND ACADEMICO.PERIODOUNIVERSIDAD.PEUN_ID=ACADEMICO.GRUPO.PEUN_ID "
						   +"AND PEUN_ANO IN ("+ANO+   ") "
						   +"AND PEUN_PERIODO IN ("+PERIODO+") "
						   +"AND GRUP_ACTIVO=1 "							   
                           +"AND PEGE_DOCUMENTOIDENTIDAD= "+P_ID+" ");
                            //+"ORDER BY 3");
		        
			ResultSet rs = conn.query(v_sqlPrograms);	
		   
			while (rs.next()){	
			
			Datos.add(new CargaAcademica (rs.getString("PEGE_ID"),rs.getString("DOCUMENTO"),rs.getString("NOMBRES"),rs.getString("UNIDAD_ACADEMICA"),rs.getString("CODIGO_MATERIA"),rs.getString("MATERIA"),rs.getString("GRUPO"),rs.getString("MATRICULADOS"),rs.getString("PERIODO")));
							
			}
			
			   return Datos;
		 } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			  conn.disconnect();
			  return null;
		}
		
	
	}
	
}
