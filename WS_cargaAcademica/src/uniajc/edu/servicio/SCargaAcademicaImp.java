package uniajc.edu.servicio;

import java.util.ArrayList;

import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import uniajc.edu.dao.*;
import uniajc.edu.model.*;


public class SCargaAcademicaImp implements ICargaAcademica {

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
	
	
	
/*	@Override
	public String getCargaAcademicafullJson(int id) {

				try {
			JSONObject json = new JSONObject();
			json.put("nombre", "Jorge");
			json.put("ap1", "Garci");
			json.put("nombre2", "ge");
			
			return json.toString();

		} catch (JSONException e) {
			
			return "Error JSON";

		}
		
	}*/
	
}