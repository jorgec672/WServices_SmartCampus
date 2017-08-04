package uniajc.edu.dao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import uniajc.edu.conexion.ConnectionDB;
import uniajc.edu.model.*;
import uniajc.edu.utilidades.CreaJson;

public class MatriculaAcademicaDaoTest {
	MatriculaAcademicaDao maDao;
	ConnectionDB conn;
	CreaJson json;

	@Before
	public void setUp() throws Exception {
		conn=new ConnectionDB();
		System.out.println("estamos Aqui "+conn);
		json=CreaJson.getJson();
	} 

	@Test
	public void testMatriculaAcademicaDao() {
		if(conn.connect()) {
			MatriculaAcademica ma = new MatriculaAcademica("1192805571","SUESCUN BEDOYA BRYAN","104","TECNOLOGÍA EN ELECTRÓNICA INDUSTRIAL","2",
					"CB012002","MATEMÁTICAS II","3","217","2017 - 02","ACTIVA"," "); //Ingresar Datos de Reales que puedan resultar de la consulta		
			
			System.out.println("estamos Aqui otravez "+ma);
			assertEquals(json.respondeOBJSON(ma), json.respondeOBJSON(maDao.getMatriculaAcademica(1192805571)));//Ingresar los datos de busqueda para la BD
		
		} else {
			fail("Database Connection failure");
		}
		
	}

}
