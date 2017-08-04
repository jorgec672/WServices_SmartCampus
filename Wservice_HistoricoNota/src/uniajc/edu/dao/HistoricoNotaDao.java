package uniajc.edu.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import uniajc.edu.conexion.ConnectionDB;
import uniajc.edu.model.*;
public class HistoricoNotaDao {

	public ArrayList<HistoricoNota> getHistoricoNota(String P_ID,String ANO,String PERIODO)
	{
		HistoricoNota carga = new HistoricoNota();
		ConnectionDB conn = new ConnectionDB();
		ArrayList<HistoricoNota>  Datos= new ArrayList();
		
		 try {
			 conn.connect();
			
			 String v_sqlPrograms = "SELECT PEGE.PEGE_ID,PROG.PROG_CODIGOPROGRAMA AS CODIGOPROGRAMA,"
					+ "PEGE_DOCUMENTOIDENTIDAD AS CODIGO,"
					+ "PENG_PRIMERAPELLIDO||' ' ||PENG_SEGUNDOAPELLIDO||' '||PENG_PRIMERNOMBRE||' '||PENG_SEGUNDONOMBRE AS NOMBRES,"
					+ "GRUP.GRUP_NOMBRE AS GRUPO ,"
					+ "PROG_NOMBRE AS PROGRAMA,"
					+ "PEUN_ANO AS ANO,"
					+ "PEUN_PERIODO AS PERIODO,"
					+ "REG.MATE_CODIGOMATERIA AS COD_MATERIA, "
					+ "MATE_NOMBRE AS MATERIA,"
					+ "REAC_NOTAFINAL AS NOTA_FINAL,"
					+ "REAC_TIPO AS TIPO "
	+ "FROM "
+ "ACADEMICO.HIS_MATRICULAACADEMICA MAAC,"
+ "ACADEMICO.GRUPO GRUP, ACADEMICO.MATERIA MATE,"
+ "ACADEMICO.ESTUDIANTEPENSUM ESTP, ACADEMICO.UNIDADPROGRAMA UNPR,"
+ "ACADEMICO.PROGRAMA PROG, "
+ "ACADEMICO.PERSONAGENERAL PEGE, "
+ "ACADEMICO.PERSONANATURALGENERAL PENG,"
+ " ACADEMICO.REGISTROACADEMICO REG, "
+ "ACADEMICO.PERIODOUNIVERSIDAD PER "

+ "WHERE "
+ "PENG.PEGE_ID=PEGE.PEGE_ID AND "
+ "PENG.PEGE_ID=ESTP.PEGE_ID AND "
+ "ESTP.UNPR_ID=UNPR.UNPR_ID AND "
+ "PROG.PROG_ID=UNPR.PROG_ID AND REG.MAAC_ID(+)= MAAC.MAAC_ID AND GRUP.GRUP_ID(+)=REG.GRUP_ID AND "
+ "REG.MATE_CODIGOMATERIA=MATE.MATE_CODIGOMATERIA AND "
+ "ESTP.ESTP_ID=MAAC.ESTP_ID AND  PER.PEUN_ID=REG.PEUN_ID AND "
+ "PEUN_ANO IN ("+ANO+") "
+ "AND PEUN_PERIODO IN ('"+PERIODO+"') "							   
+ "AND PEGE_DOCUMENTOIDENTIDAD='"+P_ID+"' "
+ "order by peun_ano,peun_periodo";
			
			
			 ResultSet rs = conn.query(v_sqlPrograms);	
			 
		while (rs.next()){
		
			Datos.add(new HistoricoNota (rs.getString("PEGE_ID"),rs.getString("CODIGO"),rs.getString("NOMBRES"),rs.getString("GRUPO"), rs.getString("ANO"),rs.getString("PERIODO"), rs.getString("COD_MATERIA"),rs.getString("PROGRAMA"),rs.getString("MATERIA"), rs.getString("NOTA_FINAL"), rs.getString("TIPO")));
			
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
