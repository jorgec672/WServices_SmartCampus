package uniajc.edu.dao;

import static org.junit.Assert.*;

import java.util.ArrayList;

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
			CargaAcademica test = new CargaAcademica("17272","16917124","BOLAÑOS CEBALLOS CARLOS ANDRES","FI200025","ELEC REDES II (SEGURIDAD EN REDES)","711",
					"14","FACULTAD DE INGENIERÍAS","2017-01"); //Ingresar Datos de Reales que puedan resultar de la consulta
			ArrayList<CargaAcademica> real= cargaDao.getCargaAcademicafull("16917124","2017","01");
			assertEquals(json.respondeOBJSON(test), json.respondeOBJSON(real));//Ingresar los datos de busquedapara la BD
		} else {
			fail("Error en la conexion de la base de datos");
		}
	}

}
