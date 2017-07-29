package uniajc.edu.dao;

import uniajc.edu.model.*;
import uniajc.edu.conexion.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.google.gson.Gson;

public class CargaAcademicaDao {
	
	public CargaAcademica getCargaAcademicafull(int P_ID,int ANO,int PERIODO) {
		
		
		CargaAcademica cargafull = new CargaAcademica();
		ConnectionDB conn = new ConnectionDB();
		//CargaAcademica lista = new CargaAcademica();
		//String lista;
		//lista = new ArrayList();
		 
		 try {
			 conn.connect();
		        String v_sqlPrograms = ("  SELECT PERSONAGENERAL.PEGE_ID, PEGE_DOCUMENTOIDENTIDAD AS DOCUMENTO, PENG_PRIMERAPELLIDO||' ' ||PENG_SEGUNDOAPELLIDO||' '||PENG_PRIMERNOMBRE||' '||PENG_SEGUNDONOMBRE AS NOMBRES, "
                        +"    UNID_NOMBRE AS UNIDAD_ACADEMICA,GRUPO.MATE_CODIGOMATERIA AS CODIGO_MATERIA ,MATE_NOMBRE AS MATERIA,GRUP_NOMBRE AS GRUPO, GRUP_CUPOS AS MATRICULADOS,DOGR_FECHACAMBIO AS INGRESO_DOCENTE_GRUPO ,"
						   +"    DOGR_REGISTRADOPOR AS REGISTRADO_POR, PEUN_ANO||'-'||PEUN_PERIODO AS PERIODO"
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
		   
			if (rs.next()){
				cargafull.setPEGE_ID(rs.getString("PEGE_ID"));
				cargafull.setPEGE_DOCUMENTOIDENTIDAD(rs.getString("DOCUMENTO"));
				cargafull.setNOMBRES(rs.getString("NOMBRES"));
				cargafull.setUNID_NOMBRE(rs.getString("UNIDAD_ACADEMICA"));	
				cargafull.setMATE_CODIGOMATERIA(rs.getString("CODIGO_MATERIA"));
				cargafull.setMATE_NOMBRE(rs.getString("MATERIA"));
				cargafull.setGRUP_NOMBRE(rs.getString("GRUPO"));
				cargafull.setGRUP_CUPOS(rs.getString("MATRICULADOS"));
				cargafull.setDOGR_FECHACAMBIO(rs.getString("INGRESO_DOCENTE_GRUPO"));
				cargafull.setDOGR_REGISTRADOPOR(rs.getString("REGISTRADO_POR"));
				cargafull.setPERIODO(rs.getString("PERIODO"));
			
				
			}
			
			   return cargafull;
		 } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			  conn.disconnect();
			  return null;
		}
		
	
	}
	
}
