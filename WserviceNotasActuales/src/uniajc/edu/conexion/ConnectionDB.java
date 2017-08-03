package uniajc.edu.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionDB {
	
	private String hostname;
	private String port;
	private String username;
	private String password;
	private String sid;
	
	private Connection connection;

	public ConnectionDB(String hostname, String port, String username, String password, Connection connection, String sid) {
		super();
		this.hostname = hostname;
		this.port = port;
		this.username = username;
		this.password = password;
		this.connection = connection;
		this.sid = sid;
	}

	public ConnectionDB() {
		this.hostname = "10.75.19.4";
		this.port = "1521";
		this.username = "ACADEMICO";
		this.password = "acad23+yxw#";
		this.sid = "/UNIAJC";
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
