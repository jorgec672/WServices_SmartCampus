package uniajc.edu.model;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class CargaAcademicaTest {

	CargaAcademica C_acade;
	
	@Before
	public void Before(){
		C_acade = new CargaAcademica();
	}
	@Test
	public void testNOMBRES() {
		C_acade.setNOMBRES("Jorge");
		assertEquals("Jorge", C_acade.getNOMBRES());		
	}
	@Test
	public void testPERIODO() {
		C_acade.setPERIODO("2017");
		assertEquals("2017", C_acade.getPERIODO());		
	}
	@Test
	public void testPEGE_ID() {
		C_acade.setPEGE_ID("1130");
		assertEquals("1130", C_acade.getPEGE_ID());		
	}
	@Test
	public void testPEGE_DOCUMENTOIDENTIDAD() {
		C_acade.setPEGE_DOCUMENTOIDENTIDAD("1130630549");
		assertEquals("1130630549", C_acade.getPEGE_DOCUMENTOIDENTIDAD());		
	}
	@Test
	public void testUNID_NOMBRE() {
		C_acade.setUNID_NOMBRE("1130630549");
		assertEquals("1130630549", C_acade.getUNID_NOMBRE());		
	}
	@Test
	public void testMATE_CODIGOMATERIA() {
		C_acade.setMATE_CODIGOMATERIA("215D");
		assertEquals("215D", C_acade.getMATE_CODIGOMATERIA());		
	}
	@Test
	public void testGRUP_NOMBRE() {
		C_acade.setGRUP_NOMBRE("Matematicas");
		assertEquals("Matematicas", C_acade.getGRUP_NOMBRE());		
	}
}

