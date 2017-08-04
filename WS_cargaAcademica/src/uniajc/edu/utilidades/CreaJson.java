package uniajc.edu.utilidades;

import com.google.gson.Gson;
/**
 * 
 * @author Team Nousagi
 *
 */
public class CreaJson {
/**
 * Variable Json CreaJson
 */
	public static final CreaJson JSON = new CreaJson();
	
	/**
	 * 
	 * @return
	 */
	public static CreaJson getJson(){
		return  JSON;
	}
	/**
	 * 
	 * @param i objeto a trasnformar en Json
	 * @return {string} objeto json
	 */
	public String respondeOBJSON(Object i){
		return new Gson().toJson(i);
	}
	
}
