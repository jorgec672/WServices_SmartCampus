package uniajc.edu.dao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import uniajc.edu.conexion.ConnectionDB;
import uniajc.edu.model.*;
import uniajc.edu.utilidades.CreaJson;

public class NotaActualDaoTest {
	NotaActualDao hnDao;
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
			NotaActual hn = new NotaActual("eSTP_CODIGOMATRICULA","gRUP_NOMBRE","mATE_CODIGOMATERIA","mATE_NOMBRE",
					"pEGE_ID","pEUN_ANO","pEUN_PERIODO","pROG_CODIGOPROGRAMA","rEAC_NOTAFINAL",
					"rEAC_TIPO","nOMBRES"); //Ingresar Datos de Reales que puedan resultar de la consulta		
			assertEquals(json.respondeOBJSON(hn), json.respondeOBJSON(hnDao.getNotaActual(1)));//Ingresar los datos de busqueda para la BD
		} else {
			fail("Database Connection failure");
		}
	}


}
