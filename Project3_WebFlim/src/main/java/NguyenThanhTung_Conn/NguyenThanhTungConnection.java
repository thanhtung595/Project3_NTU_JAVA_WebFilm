package NguyenThanhTung_Conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class NguyenThanhTungConnection {
	public static Connection getMSSQLConnection() throws SQLException, ClassNotFoundException {
		String hostName = "localhost";
		String sqlInstanceName = "";
		String dbName = "Project3WEbFlim";
		String userName = "root";
		String password = "thanhtung";
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String connectionURL = "jdbc:sqlserver://" + hostName + ":1433;instance=" + sqlInstanceName + ";databaseName="
				+ dbName + ";encrypt=true;trustServerCertificate=true";
		Connection conn = DriverManager.getConnection(connectionURL, userName, password);
		return conn;
	}

	public static void closeQuietly(Connection conn) {
		try {
			conn.close();
		} catch (Exception e) {
		}
	}

	public static void rollbackQuietly(Connection conn) {
		try {
			conn.rollback();
		} catch (Exception e) {
		}
	}
}
