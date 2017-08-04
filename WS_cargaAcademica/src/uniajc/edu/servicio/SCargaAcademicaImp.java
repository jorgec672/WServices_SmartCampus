package uniajc.edu.servicio;

import java.util.ArrayList;

import uniajc.edu.dao.CargaAcademicaDao;
import uniajc.edu.model.CargaAcademica;
import uniajc.edu.servicio.ICargaAcademica;


public class SCargaAcademicaImp implements ICargaAcademica {

   @Override
	public  ArrayList<CargaAcademica> getCargaAcademicafull(String id,String ano,String periodo) {
		  CargaAcademicaDao CargaAcademicaDAO = new CargaAcademicaDao();
		  return CargaAcademicaDAO.getCargaAcademicafull(id,ano,periodo); 
	    }
	
}