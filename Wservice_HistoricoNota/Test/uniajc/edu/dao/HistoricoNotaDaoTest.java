package uniajc.edu.dao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import uniajc.edu.conexion.*;
import uniajc.edu.model.*;
import uniajc.edu.utilidades.CreaJson;

public class HistoricoNotaDaoTest {

	HistoricoNotaDao hnDao;
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
			HistoricoNota hn = new HistoricoNota("eSTP_CODIGOMATRICULA","gRUP_NOMBRE","mATE_CODIGOMATERIA","mATE_NOMBRE",
					"pEGE_ID","pEUN_ANO","pEUN_PERIODO","pROG_CODIGOPROGRAMA","rEAC_NOTAFINAL",
					"rEAC_TIPO","nOMBRES"); //Ingresar Datos de Reales que puedan resultar de la consulta		
			assertEquals(json.respondeOBJSON(hn), json.respondeOBJSON(hnDao.getHistoricoNota("ID","ANO","Periodo")));//Ingresar los datos de busquedapara la BD
		} else {
			fail("Database Connection failure");
		}
	}
}
