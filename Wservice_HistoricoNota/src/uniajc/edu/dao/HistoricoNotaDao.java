package uniajc.edu.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import uniajc.edu.conexion.ConnectionDB;
import uniajc.edu.model.*;
public class HistoricoNotaDao {

	public HistoricoNota getHistoricoNota(String P_ID,String ANO,String PERIODO)
	{
		HistoricoNota carga = new HistoricoNota();
		ConnectionDB conn = new ConnectionDB();
		ArrayList<HistoricoNota>  Datos= new ArrayList();
		
		 try {
			 conn.connect();
			
			 String v_sqlPrograms = "SELECT PEGE.PEGE_ID,PROG.PROG_CODIGOPROGRAMA AS CODIGOPROGRAMA,"
					+ "ESTP.ESTP_CODIGOMATRICULA AS CODIGO,"
					+ "PENG_PRIMERAPELLIDO||' ' ||PENG_SEGUNDOAPELLIDO||' '||PENG_PRIMERNOMBRE||' '||PENG_SEGUNDONOMBRE AS NOMBRES,"
					+ "GRUP.GRUP_NOMBRE ,PEUN_ANO,PEUN_PERIODO,"
					+ "REG.MATE_CODIGOMATERIA, "
					+ "MATE_NOMBRE,"
					+ "REAC_NOTAFINAL AS NOTA_FINAL,"
					+ "REAC_TIPO "
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
+ "AND PEUN_PERIODO IN ("+PERIODO+") "
+ "AND GRUP_ACTIVO=1 "							   
+ "AND PEGE_DOCUMENTOIDENTIDAD="+P_ID+" "
+ "order by peun_ano,peun_periodo";
			 
			 ResultSet rs = conn.query(v_sqlPrograms);	
			 System.out.println(v_sqlPrograms);
		while (rs.next()){
			
			carga.setPEGE_ID(rs.getString("PEGE_ID"));  
			carga.setESTP_CODIGOMATRICULA(rs.getString("CODIGO"));
			carga.setNOMBRES(rs.getString("NOMBRES"));
			 carga.setPROG_CODIGOPROGRAMA(rs.getString("CODIGOPROGRAMA"));
			  carga.setMATE_CODIGOMATERIA(rs.getString("MATE_CODIGOMATERIA"));
			  carga.setREAC_NOTAFINAL(rs.getString("NOTA_FINAL"));
			   carga.setREAC_TIPO(rs.getString("REAC_TIPO"));
			
			    
			
								
			    
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
