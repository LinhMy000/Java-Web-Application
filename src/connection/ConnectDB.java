package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
	private static String jdbcURL = "jdbc:mysql://localhost:3306/demo?useSSL=false&useUnicode=yes&characterEncoding=UTF-8";
	private static String jdbcUsername = "root";
	private static String jdbcPassword = "1";

	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
			System.out.println("Succeed to connect to database !!");
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Fail to connect to database ..");
			e.printStackTrace();
		}
		return connection;
	}
}
