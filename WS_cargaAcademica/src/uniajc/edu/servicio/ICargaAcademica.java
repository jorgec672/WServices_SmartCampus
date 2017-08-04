package uniajc.edu.servicio;

import java.util.ArrayList;

import uniajc.edu.model.CargaAcademica;


public interface ICargaAcademica {

	public ArrayList<CargaAcademica> getCargaAcademicafull(String id,String ano,String periodo);
		
}
