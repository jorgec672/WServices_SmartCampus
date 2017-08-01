package uniajc.edu.dao;

import uniajc.edu.model.*;
import uniajc.edu.conexion.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class GrupoAcademicoDao {
	
	public ArrayList<GrupoAcademico> getGrupoAcademicofull(int P_grupo) {
		
		
		GrupoAcademico cargafull = new GrupoAcademico();
		ConnectionDB conn = new ConnectionDB();
		//CargaAcademica lista = new CargaAcademica();
		ArrayList<GrupoAcademico>  Datos= new ArrayList();
		//lista = new ArrayList();
		 
		 try {
			 conn.connect();
		        String v_sqlPrograms = ("  SELECT  "
		        		+ "PEGE.PEGE_DOCUMENTOIDENTIDAD AS DOCUMENTO,"
		        		+ "PENG.PENG_PRIMERAPELLIDO||' '||PENG.PENG_SEGUNDOAPELLIDO||' '||PENG.PENG_PRIMERNOMBRE||' '||PENG.PENG_SEGUNDONOMBRE AS NOMBRE,"
		        		+ " SUBSTR(PEGE_DIRECCION,1,25) as DIRECCION "
		        		+ "FROM"
		        		+ " ACADEMICO.MATRICULAACADEMICA MAAC,"
		        		+ "ACADEMICO.ESTUDIANTEPENSUM ESTP,"
		        		+ "ACADEMICO.UNIDADPROGRAMA UNPR,"
		        		+ "ACADEMICO.PROGRAMA PROG,"
		        		+ "ACADEMICO.PERSONAGENERAL PEGE,"
		        		+ "ACADEMICO.PERSONANATURALGENERAL PENG,"
		        		+ "ACADEMICO.GRUPOMATRICULADO GRMA,"
		        		+ "ACADEMICO.GRUPO GRUP,"
		        		+ "ACADEMICO.MATERIA MATE,"
		        		+ "ACADEMICO.PERIODOUNIVERSIDAD PEUN,"
		        		+ "ACADEMICO.DOCENTEUNIDAD DOCU,"
		        		+ "ACADEMICO.DOCENTEGRUPO DOCG,"
		        		+ "ACADEMICO.DOCENTEACADEMICO DA,"
		        		+ "(SELECT * FROM GENERAL.PERSONANATURALGENERAL) PRO "
		        		+ "WHERE "
		        		+ "MAAC.PEUN_ID=PEUN.PEUN_ID AND "
		        		+ "GRUP.MATE_CODIGOMATERIA=MATE.MATE_CODIGOMATERIA AND "
		        		+ "GRMA.GRUP_ID=GRUP.GRUP_ID AND "
		        		+ "GRMA.MAAC_ID=MAAC.MAAC_ID AND "
		        		+ "PENG.PEGE_ID=PEGE.PEGE_ID AND "
		        		+ "ESTP.PEGE_ID=PEGE.PEGE_ID AND "
		        		+ "ESTP.UNPR_ID=UNPR.UNPR_ID AND "
		        		+ "UNPR.PROG_ID=PROG.PROG_ID AND "
		        		+ "PROG.TPPA_ID=1 AND "
		        		+ "GRMA.GRMA_ESTADO=1 AND "
		        		+ "MAAC.ESTP_ID=ESTP.ESTP_ID "
		        		+ "AND DOCG.DOUN_ID=DOCU.DOUN_ID(+) "
		        		+ "AND DOCG.GRUP_ID(+)=GRUP.GRUP_ID "
		        		+ "AND DOCU.PEGE_ID=DA.PEGE_ID(+) "
		        		+ "AND DA.PEGE_ID=PRO.PEGE_ID(+) "
		        		+ "AND GRUP_NOMBRE='"+P_grupo+"' "
		        		+ "AND PEGE_DIRECCION LIKE 'CALLE%' "
		        		+ "group by PEGE.PEGE_DOCUMENTOIDENTIDAD,"
		        		+ "PENG.PENG_PRIMERAPELLIDO||' '||PENG.PENG_SEGUNDOAPELLIDO||' '||PENG.PENG_PRIMERNOMBRE||' '||PENG.PENG_SEGUNDONOMBRE,"
		        		+ " PEGE_DIRECCION");
                            //+"ORDER BY 3");
		        
			ResultSet rs = conn.query(v_sqlPrograms);	
		   
			while (rs.next()){
				
				Datos.add(new GrupoAcademico(rs.getString("DOCUMENTO"),rs.getString("NOMBRE"),rs.getString("DIRECCION")));
				
			
				
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
