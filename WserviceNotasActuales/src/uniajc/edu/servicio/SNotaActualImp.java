package uniajc.edu.servicio;

import java.util.ArrayList;

import uniajc.edu.dao.NotaActualDao;
import uniajc.edu.model.NotaActual;

public class SNotaActualImp implements INotaActual {

	@Override
	 public NotaActual getNotaActual (int id) {
	  NotaActualDao NotaActualDao = new NotaActualDao();
	  return NotaActualDao.getNotaActual(id);
	
}
	
}
