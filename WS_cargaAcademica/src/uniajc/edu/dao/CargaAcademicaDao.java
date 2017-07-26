package uniajc.edu.dao;

import uniajc.edu.model.*;
import uniajc.edu.conexion.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.google.gson.Gson;

public class CargaAcademicaDao {
	

/*	public CargaAcademica getCargaAcademica(int id) {
		
		
		CargaAcademica carga = new CargaAcademica();
		ConnectionDB conn = new ConnectionDB();
		 
		 try {
			 conn.connect();
			ResultSet rs = conn.query("SELECT * FROM ACADEMICO.PERSONAGENERAL WHERE PEGE_ID = "+id);
			if(rs.next()){
			    carga.setPEGE_ID(rs.getString("PEGE_ID"));
			    carga.setPEGE_DOCUMENTOIDENTIDAD(rs.getString("PEGE_DOCUMENTOIDENTIDAD"));
			   }
			   return carga;
		 } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			  conn.disconnect();
		}
		
		return null;
	}*/
	
/*	public String getCargaAcademicaJSON(int id) {
		 String data="nada";
		final Gson gson = new Gson();
		CargaAcademica carga = new CargaAcademica();
		ConnectionDB conn = new ConnectionDB();
		 
		 try {
			 conn.connect();
			ResultSet rs = conn.query("SELECT * FROM ACADEMICO.nota WHERE nota_ID = "+id);
			if(rs.next()){
				data= rs.getString("NOTA_DESCRIPCION");
			 //   carga.setPEGE_ID(rs.getString("NOTA_ID"));
			 //   carga.setPEGE_DOCUMENTOIDENTIDAD(rs.getString("NOTA_DESCRIPCION"));
			   }
			//data= gson.toJson(carga.getPEGE_ID());
			System.out.println("Dato obtenido "+ data);
			return data;
		 } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			  conn.disconnect();
			  return "Error";
		}
		
	}*/
	
	public CargaAcademica getCargaAcademicafull(int P_ID) {
		
		
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
						   +"AND GRUPO.PEUN_ID IN (472) "
						   +"AND GRUP_ACTIVO=1 "							   
                           +"AND PERSONAGENERAL.PEGE_ID= "+P_ID+" ");
                            //+"ORDER BY 3");
		       System.out.println(v_sqlPrograms); 
			ResultSet rs = conn.query(v_sqlPrograms);	
		   
			if (rs.next()){
				cargafull.setPEGE_ID(rs.getString("PEGE_ID"));
				cargafull.setPEGE_DOCUMENTOIDENTIDAD(rs.getString("PEGE_DOCUMENTOIDENTIDAD"));
				cargafull.setUNID_NOMBRE(rs.getString("UNID_NOMBRE"));
				
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
