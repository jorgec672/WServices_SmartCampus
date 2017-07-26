package uniajc.edu.conexion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.*;
import java.util.Properties;
import org.apache.commons.codec.binary.Base64;



public class DBOracle {
	
private Connection conexion;
String usuarioBD = null;
String claveBD =null;
String Sid =null;
String ipBD =null;
String puertoBD =null;
String BD =null;

   public Connection getConexion() {
     return conexion;
   }

   public void setConexion(Connection conexion) {
     this.conexion = conexion;
   }

    public DBOracle conectar() {

    	
   try {
          Class.forName("oracle.jdbc.OracleDriver");
          String BaseDeDatos = "jdbc:oracle:thin:@"+ipBD+":"+puertoBD+":"+Sid+"";

          
		conexion = DriverManager.getConnection(BaseDeDatos,usuarioBD,claveBD); 
   if (conexion != null) {
        System.out.println("Conexion exitosa!");
    } else {
        System.out.println("Conexion fallida!");
    }

    } catch (Exception e) {
     e.printStackTrace();
    }
      return this;
    }

    public void leerArchivo() {
		  try {
		   
		/**Creamos un Objeto de tipo Properties*/
		   Properties propiedades = new Properties();
		    
		   /**Cargamos el archivo desde la ruta especificada*/
		   propiedades
		     .load(new FileInputStream(
		      /** "D:/HENAO/codejavu/Workspace/PruebaProperties/src/properties/archivo.properties"));
		       * 
		       */
		        "C:/Users/jorge.castaño/workspace/WS_prueba/src/parametros/archivo.propierties"));
		 
		   /**Obtenemos los parametros definidos en el archivo*/
		   Sid = propiedades.getProperty("Sid_ORD");		   
		   usuarioBD = propiedades.getProperty("usuarioBD_OR");		   
		   claveBD = propiedades.getProperty("claveBD_OR");		   
		    ipBD = propiedades.getProperty("ipBD_OR");
		    puertoBD = propiedades.getProperty("puertoBD_OR");
		    BD = propiedades.getProperty("BD_OR");
		 
		   /**DecodeBase64*/
		    Sid = new String(Base64.decodeBase64(Sid.getBytes()));
		   usuarioBD = new String(Base64.decodeBase64(usuarioBD.getBytes()));
		   claveBD = new String(Base64.decodeBase64(claveBD.getBytes()));
		   ipBD = new String(Base64.decodeBase64(ipBD.getBytes()));
		   puertoBD = new String(Base64.decodeBase64(puertoBD.getBytes()));
		   BD = new String(Base64.decodeBase64(BD.getBytes()));
		   
		   /**Imprimimos los valores*/
		   System.out.println("Nombre: "+usuarioBD + "\n" +"Pagina: "+ Sid);
		       
		    
		  } catch (FileNotFoundException e) {
		   System.out.println("Error, El archivo no exite");
		  } catch (IOException e) {
		   System.out.println("Error, No se puede leer el archivo");
		  }
		 }

    
}