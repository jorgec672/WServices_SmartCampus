package uniajc.edu.conexion;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ConnectionDB {
	
	private String hostname;
	private String port;
	private String username;
	private String password;
	private String sid;
	
	private Connection connection;
	private Properties prop = new Properties();
	private InputStream input = ConnectionDB.class.getClassLoader().getResourceAsStream("archivo.properties");


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
	
	public ResultSet query(String query) throws SQLException
	{
		if(!this.isConnected())
			this.connect();
		Statement sm = this.connection.createStatement();
		return sm.executeQuery(query);
	}
	
	public boolean isConnected()
	{
		try {
			return this.connection != null && !this.connection.isClosed();
		} catch (SQLException e) {
			return false;
		}
	}
	
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
