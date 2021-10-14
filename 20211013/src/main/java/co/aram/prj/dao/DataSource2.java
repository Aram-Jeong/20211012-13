package co.aram.prj.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DataSource2 {
	private static DataSource2 dataSource2 = new DataSource2();
	private Connection conn;
	private String driver;
	private String url;
	private String user;
	private String password;

	private DataSource2() {
		dbconfig();

	}

	public static DataSource2 getInstance() {
		return dataSource2;
	}

	private void dbconfig() {
		Properties properties = new Properties();
		String resource = getClass().getResource("/db.properties").getPath();
		try {
			properties.load(new FileReader(resource));
			driver=properties.getProperty("driver");
			url=properties.getProperty("url");
			user=properties.getProperty("user");
			password=properties.getProperty("password");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

}
