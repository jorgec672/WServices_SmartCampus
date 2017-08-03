package uniajc.edu.dao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import uniajc.edu.conexion.*;
import uniajc.edu.model.*;
import uniajc.edu.utilidades.CreaJson;

public class CargaAcademicaDaoTest {
	CargaAcademicaDao cargaDao;
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
			CargaAcademica ca = new CargaAcademica("pEGE_ID","pEGE_DOCUMENTOIDENTIDAD","nOMBRES","mATE_CODIGOMATERIA","mATE_NOMBRE","gRUP_NOMBRE",
					"gRUP_CUPOS","dOGR_FECHACAMBIO","dOGR_REGISTRADOPOR","pERIODO"); //Ingresar Datos de Reales que puedan resultar de la consulta		
			assertEquals(json.respondeOBJSON(ca), json.respondeOBJSON(cargaDao.getCargaAcademicafull("ID","ANO","Periodo")));//Ingresar los datos de busquedapara la BD
		} else {
			fail("Database Connection failure");
		}
	}

}
