package co.edureka.ems.configs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;

public class ConnectionFactory {
	private static Connection mySqlCon = null;
	
	public static Connection getDBConnection() throws Exception{
		if(mySqlCon == null) {
			ResourceBundle bundle = ResourceBundle.getBundle("dbconfig");
			
			String dc = bundle.getString("jdbc.driverclass");
			String url = bundle.getString("jdbc.url");
			String uname = bundle.getString("jdbc.username");
			String pass = bundle.getString("jdbc.password");
			
			Class.forName(dc);
			mySqlCon = DriverManager.getConnection(url, uname, pass);
		}
		return mySqlCon;
	}
}
