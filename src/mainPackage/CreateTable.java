package mainPackage;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import database_connection.DBConn;
public class CreateTable {
	
	public static void createTable( String nameTable) throws Exception  {
		Connection conn = DBConn.getConexao();
		try {
			String SQL = " CREATE TABLE " + nameTable + " ("
					+ "user_id INT AUTO_INCREMENT PRIMARY KEY,"
					+ "nome VARCHAR(80) NOT NULL,"
					+ "CPF VARCHAR(80) NOT NULL,"
					+ "Age INT,"
					+ "Balance INT"
					+ ")";
			Statement query = conn.createStatement();
			query.execute(SQL);
			System.out.println("Tabela criada com sucesso bro");
			conn.close();
			
		}catch(SQLException e) {
			System.out.println(e);
		}
		
	}

}
