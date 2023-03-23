package mainPackage;
import java.sql.Connection;
import java.sql.Statement;
import database_connection.DBConn;

public class InsertData {
	
	
	public static void OfaUser(String name ,String CPF , Number age, Number balance ) 
			throws Exception {
		Connection conn = DBConn.getConexao();
		String SQL = " CREATE TABLE  ("
				+ "user_id INT AUTO_INCREMENT PRIMARY KEY,"
				+ "nome VARCHAR(80) NOT NULL"
				+ ")";
		
		
	}
}
