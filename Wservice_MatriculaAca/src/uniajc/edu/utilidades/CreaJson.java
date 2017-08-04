package uniajc.edu.utilidades;
import com.google.gson.Gson;


public class CreaJson {

public static final CreaJson JSON = new CreaJson();
	
	public static CreaJson getJson(){
		return  JSON;
	}
	
	public String respondeOBJSON(Object i){
		return new Gson().toJson(i);
	}
	
}

