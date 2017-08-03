package uniajc.edu.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NotaActualTest {

   NotaActual hn;
	
	@Before
	public void Before(){
		hn = new NotaActual();
	}
	@Test
	public void tesESTP_CODIGOMATRICULA() {
		hn.setESTP_CODIGOMATRICULA("1234");
		assertEquals("1234",hn.getESTP_CODIGOMATRICULA());		
	}
	@Test
	public void tesGRUP_NOMBRE() {
		hn.setGRUP_NOMBRE("1234");
		assertEquals("1234",hn.getGRUP_NOMBRE());		
	}
	@Test
	public void tesMATE_CODIGOMATERIA() {
		hn.setMATE_CODIGOMATERIA("1234");
		assertEquals("1234",hn.getMATE_CODIGOMATERIA());		
	}
	@Test
	public void tesMATE_NOMBRE() {
		hn.setMATE_NOMBRE("1234");
		assertEquals("1234",hn.getMATE_NOMBRE());		
	}
	@Test
	public void tesPEGE_ID() {
		hn.setPEGE_ID("1234");
		assertEquals("1234",hn.getPEGE_ID());		
	}
	@Test
	public void tesPEUN_ANO() {
		hn.setPEUN_ANO("1234");
		assertEquals("1234",hn.getPEUN_ANO());		
	}
	@Test
	public void tesPEUN_PERIODO() {
		hn.setPEUN_PERIODO("1234");
		assertEquals("1234",hn.getPEUN_PERIODO());		
	}
	@Test
	public void tesNOMBRES() {
		hn.setNOMBRES("1234");
		assertEquals("1234",hn.getNOMBRES());		
	}
	@Test
	public void tesPROG_CODIGOPROGRAMA() {
		hn.setPROG_CODIGOPROGRAMA("1234");
		assertEquals("1234",hn.getPROG_CODIGOPROGRAMA());		
	}
	@Test
	public void tesREAC_NOTAFINAL() {
		hn.setREAC_NOTAFINAL("1234");
		assertEquals("1234",hn.getREAC_NOTAFINAL());		
	}
	@Test
	public void tesREAC_TIPO() {
		hn.setREAC_TIPO("1234");
		assertEquals("1234",hn.getREAC_TIPO());		
	}


}
