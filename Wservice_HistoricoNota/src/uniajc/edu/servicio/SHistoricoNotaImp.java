package uniajc.edu.servicio;

import java.util.ArrayList;

import uniajc.edu.dao.HistoricoNotaDao;
import uniajc.edu.model.HistoricoNota;

public class SHistoricoNotaImp implements IHistoricoNota {

	@Override
	 public HistoricoNota getHistoricoNota (String id,String ano,String periodo) {
	  HistoricoNotaDao HistoricoNotaDao = new HistoricoNotaDao();
	  return HistoricoNotaDao.getHistoricoNota(id,ano,periodo);
	
}
	
}
