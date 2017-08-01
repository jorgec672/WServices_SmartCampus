package uniajc.edu.servicio;

import java.util.ArrayList;

import uniajc.edu.dao.MatriculaAcademicaDao;
import uniajc.edu.model.MatriculaAcademica;

public class SMatriculaAcademicaImp implements IMatriculaAcademica {

	@Override
	 public MatriculaAcademica getMatriculaAcademica (int id) {
	  MatriculaAcademicaDao MatriculaAcademicaDao = new MatriculaAcademicaDao();
	  return MatriculaAcademicaDao.getMatriculaAcademica(id);
	
}
	
}
