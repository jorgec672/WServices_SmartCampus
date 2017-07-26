package uniajc.edu.servicio;


import com.google.gson.Gson;

import uniajc.edu.dao.CargaAcademicaDao;
import uniajc.edu.model.CargaAcademica;
import uniajc.edu.servicio.ICargaAcademica;


public class SCargaAcademicaImp implements ICargaAcademica {
   String RESPUESTA="Exito";
   String MENSAJE="mensaje";
/*	@Override
	 public CargaAcademica getCargaAcademica (int id) {
	  CargaAcademicaDao CargaAcademicaDAO = new CargaAcademicaDao();
	  return CargaAcademicaDAO.getCargaAcademica(id);	
     }
	
	@Override
	 public String getCargaAcademicaJSON (int id) {
	  CargaAcademicaDao CargaAcademicaDAO = new CargaAcademicaDao();
	  return CargaAcademicaDAO.getCargaAcademicaJSON(id);
     }*/
	
	@Override
	public CargaAcademica getCargaAcademicafull(int id) {
		  CargaAcademicaDao CargaAcademicaDAO = new CargaAcademicaDao();
		  return CargaAcademicaDAO.getCargaAcademicafull(id); 
	    }

	@Override
	public String getCargaAcademicafullJson(int id) {

		String respuesta = "";
		CargaAcademicaDao CargaAcademicaDAO = new CargaAcademicaDao();

		CargaAcademica carga = CargaAcademicaDAO.getCargaAcademicafull(id);
		System.out.println("re: " + carga);
		Gson gson = new Gson();
		final Gson gson1 = new Gson();

	//	String acade = gson.toJson(carga);
		
		 String data = gson1.toJson(carga);
		 
		 
/*		try {
			JSONObject json = new JSONObject(acade);
			respuesta = json.toString();

		} catch (JSONException e) {

		}*/
		return data;
	}
	
	
	
/*	public  String construirJSONError(String error) {
        try {

            JSONObject json = new JSONObject();
            json.put(RESPUESTA, false);
            json.put(MENSAJE, "Se presento el siguiente error: " + error);
            return json.toString();

        } catch (JSONException ex) {
            ex.printStackTrace();
            return "Error presentado al crear el Obj JSON. " + ex.getMessage();
        }
    }

    public  String construirJSONExitoso(String respuesta) {
        try {

            JSONObject json = new JSONObject();
            json.put(RESPUESTA, true);
            json.put(MENSAJE, respuesta);
            return json.toString();

        } catch (JSONException ex) {
            ex.printStackTrace();
            return "Error presentado al crear el Obj JSON. " + ex.getMessage();
        }
    }*/
	
	
}