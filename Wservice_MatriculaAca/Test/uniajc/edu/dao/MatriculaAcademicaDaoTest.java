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
		json=CreaJson.getJson();
	}

	@Test
	public void testCargaAcademicaDao() {
		if(conn.connect()) {
			MatriculaAcademica ma = new MatriculaAcademica("dOCUMENTO","nOMBRE","cOD_PROG","pROGRAMA","sEMESTRE",
					"cOD_MATERIA","cRED","mATERIA","gRUPO","pER_MATRIC","eSTADO_MAAC","dOCENTE"); //Ingresar Datos de Reales que puedan resultar de la consulta		
			assertEquals(json.respondeOBJSON(ma), json.respondeOBJSON(maDao.getMatriculaAcademica(1)));//Ingresar los datos de busqueda para la BD
		} else {
			fail("Database Connection failure");
		}
	}

}
