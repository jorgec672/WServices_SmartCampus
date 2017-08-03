package uniajc.edu.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MatriculaAcademicaTest {

    MatriculaAcademica ma;
	
	@Before
	public void Before(){
		ma = new MatriculaAcademica();
	}
	@Test
	public void testDOCUMENTO() {
		ma.setDOCUMENTO("1234");
		assertEquals("1234",ma.getDOCUMENTO());		
	}
	@Test
	public void testNOMBRE() {
		ma.setNOMBRE("1234");
		assertEquals("1234",ma.getNOMBRE());		
	}
	@Test
	public void testCOD_PROG() {
		ma.setCOD_PROG("1234");
		assertEquals("1234",ma.getCOD_PROG());		
	}
	@Test
	public void testPROGRAMA() {
		ma.setPROGRAMA("1234");
		assertEquals("1234",ma.getPROGRAMA());		
	}
	@Test
	public void testSEMESTRE() {
		ma.setSEMESTRE("1234");
		assertEquals("1234",ma.getSEMESTRE());		
	}
	@Test
	public void testCOD_MATERIA() {
		ma.setCOD_MATERIA("1234");
		assertEquals("1234",ma.getCOD_MATERIA());		
	}
	@Test
	public void testCRED() {
		ma.setCRED("1234");
		assertEquals("1234",ma.getCRED());		
	}
	@Test
	public void testMATERIA() {
		ma.setMATERIA("1234");
		assertEquals("1234",ma.getMATERIA());		
	}
	@Test
	public void testGRUPO() {
		ma.setGRUPO("1234");
		assertEquals("1234",ma.getGRUPO());		
	}
	@Test
	public void testPER_MATRIC() {
		ma.setPER_MATRIC("1234");
		assertEquals("1234",ma.getPER_MATRIC());		
	}
	@Test
	public void tesESTADO_MAAC() {
		ma.setESTADO_MAAC("1234");
		assertEquals("1234",ma.getESTADO_MAAC());		
	}
	@Test
	public void testDOCENTE() {
		ma.setDOCENTE("1234");
		assertEquals("1234",ma.getDOCENTE());		
	}


}
