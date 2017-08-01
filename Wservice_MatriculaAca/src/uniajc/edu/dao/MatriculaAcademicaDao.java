package uniajc.edu.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import uniajc.edu.conexion.ConnectionDB;
import uniajc.edu.model.*;
public class MatriculaAcademicaDao {

	public MatriculaAcademica getMatriculaAcademica(int P_ID)
	{
		MatriculaAcademica carga = new MatriculaAcademica();
		ConnectionDB conn = new ConnectionDB();
		ArrayList<MatriculaAcademica>  Datos= new ArrayList();
		
		 try {
			 conn.connect();
			
			 String v_sqlPrograms = "SELECT PEGE.PEGE_DOCUMENTOIDENTIDAD AS DOCUMENTO,"
			 		+ "PENG.PENG_PRIMERAPELLIDO||' '||PENG.PENG_SEGUNDOAPELLIDO||' '||PENG.PENG_PRIMERNOMBRE||' '||PENG.PENG_SEGUNDONOMBRE AS NOMBRE,"
			 		+ "PROG.PROG_CODIGOPROGRAMA AS COD_PROG,"
			 		+ "PROG.PROG_NOMBRE AS PROGRAMA,"
			 		+ "ESTP.ESTP_PERIODOACADEMICO AS SEMESTRE,"
			 		+ "MATE.MATE_CODIGOMATERIA AS COD_MATERIA,"
			 		+ "MATE.MATE_PONDERACIONACADEMICA AS CRED,"
			 		+ "MATE.MATE_NOMBRE AS MATERIA,"
			 		+ "GRUP.GRUP_NOMBRE AS GRUPO,"
			 		+ "PEUN.PEUN_ANO||' - '||PEUN.PEUN_PERIODO AS PER_MATRIC,"
			 		+ "MAAC.MAAC_ESTADO AS ESTADO_MAAC,"
			 		+ "(PRO.PENG_PRIMERAPELLIDO||' '||PRO.PENG_SEGUNDOAPELLIDO||' '||PRO.PENG_PRIMERNOMBRE||' '||PRO.PENG_SEGUNDONOMBRE) AS DOCENTE"
			 		+ " FROM "
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
			 		+ "AND PEGE_DOCUMENTOIDENTIDAD='"+P_ID+"' "
			 	    + "ORDER BY "
			 	    + "PROGRAMA, SEMESTRE, NOMBRE";
			 
			 ResultSet rs = conn.query(v_sqlPrograms);	
			 System.out.println(v_sqlPrograms);
		while (rs.next()){
			
			carga.setDOCUMENTO("DOCUMENTO");
			carga.setCOD_MATERIA("COD_MATERIA");
			carga.setCOD_PROG("COD_PROG");
			carga.setMATERIA("METERIA");
			carga.setGRUPO("GRUPO");
	   
			Datos.add(carga);
		}
		 
		System.out.println(Datos.toString());
			return carga;
			
		
		 } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			  conn.disconnect();
			  return null;
		}
		 
		
	}
}
