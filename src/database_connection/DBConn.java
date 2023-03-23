package database_connection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DBConn {
	static Connection conn = null;
	public static Connection getConexao() throws Exception {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			final String URL = "jdbc:mysql://localhost:3306/jdbc1";
			final String usuario = "root";
			final String senha = "guigui167";
			
			conn =  DriverManager.getConnection(URL , usuario, senha);
			System.out.println("BD Conectado com sucesso!");
		} catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Fecha a conexão com o banco de dados
            if (conn != null) {
            }}
		return conn;
        }



}
