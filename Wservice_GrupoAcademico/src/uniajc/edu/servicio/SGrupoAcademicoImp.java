package uniajc.edu.servicio;

import java.util.ArrayList;

import uniajc.edu.dao.GrupoAcademicoDao;
import uniajc.edu.model.GrupoAcademico;

public class SGrupoAcademicoImp implements IGrupoAcademico {

	@Override
	public ArrayList<GrupoAcademico> getGrupoAcademicofull(int id) {
		// TODO Auto-generated method stub
		GrupoAcademicoDao GrupoAcademicoDAO = new GrupoAcademicoDao();
		return  GrupoAcademicoDAO.getGrupoAcademicofull(id); 
	}



	
	
		
	
	
	
}


	
	   

	
