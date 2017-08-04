package uniajc.edu.conexion;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
/**
 * 
 * @author Team Nousagi
 *
 */
public class ConnectionDB {
	/**
	 * hostname IP Base datos 
	 */
	private String hostname;
	/**
	 * puerto Base datos
	 */
	private String port;
	/**
	 * Usuario Base datoss
	 */
	private String username;
	/**
	 * Contraseña Usuario Base datos
	 */
	private String password;
	/**
	 * SID Base datos
	 */
	private String sid;
	/**
	 * Conexion Base datos
	 */
	private Connection connection;
	/**
	 * Propiedades proyecto
	 */
	private Properties prop = new Properties();
	/**
	 * Carga de propiedades del proyecto
	 */
	private InputStream input = ConnectionDB.class.getClassLoader().getResourceAsStream("parametros\\archivo.properties");

/**
 * Establece los atributos del objeto en los valores de la base de datos.
 */
	public ConnectionDB() {
		try {
			prop.load(input);
			this.hostname = prop.getProperty("ipBD_OR");
			this.port = prop.getProperty("puertoBD_OR");
			this.username = prop.getProperty("usuarioBD_OR");
			this.password = prop.getProperty("claveBD_OR");
			this.sid = prop.getProperty("Sid_ORD");
			
			
		} catch (IOException e) {
			
		}
	}
	

	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}
	
	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	/**
	 * Conexion a Base datos
	 * @return is connect
	 */
	public boolean connect(){
		
		System.out.print("jdbc:oracle:thin:@"+this.hostname+":"+this.port+""+this.sid+"");
		String url = "jdbc:oracle:thin:@"+this.hostname+":"+this.port+""+this.sid+"";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			this.connection = DriverManager.getConnection(url, this.username, this.password);
			System.out.print("Conectado");
		} catch(SQLException | ClassNotFoundException ex) {ex.printStackTrace();
			this.connection = null;
			
		}
		return this.isConnected();
	}
	
	
	/**
	 * 
	 * @param query Consulta SQL
	 * @return {ResultSet} resultado del query.
	 * @throws SQLException Captura de Exception 
	 */
	public ResultSet query(String query) throws SQLException
	{
		if(!this.isConnected())
			this.connect();
		Statement sm = this.connection.createStatement();
		return sm.executeQuery(query);
	}
	
	/**
	 * 
	 * @return {boolean} valida si la conexion esta abierta
	 */
	public boolean isConnected()
	{
		try {
			return this.connection != null && !this.connection.isClosed();
		} catch (SQLException e) {
			return false;
		}
	}
	
	/**
	 * Cierra conexion Bd
	 */
	public void disconnect()
	{
		try {
			this.connection.close();
		} catch (SQLException e) {
			this.connection = null;
		}
		this.connection = null;
	}
}
