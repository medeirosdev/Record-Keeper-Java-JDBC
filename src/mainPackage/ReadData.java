package mainPackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import database_connection.DBConn;

public class ReadData {
	
	@SuppressWarnings("resource")
	public static void ofUser() throws Exception {
		try {
			Connection conn = DBConn.getConexao();
			Scanner input = new Scanner(System.in);
			String nome = input.nextLine();

			String SQL = "SELECT * FROM Newusers WHERE nome like ?";
			PreparedStatement query = conn.prepareStatement(SQL);	
			query.setString(1, nome);
			ResultSet resultofQuery = query.executeQuery();

			while (resultofQuery.next()) {
			    String nomeObtido = resultofQuery.getString("nome");
			    String CPFObtido = resultofQuery.getString("CPF");
			    Number age = resultofQuery.getInt("age");
			    System.out.println("Pessoa obtida com sucesso, seu nome era: " + nomeObtido);
			    System.out.println(resultofQuery);
			    System.out.println(age);
			    System.out.println(nomeObtido);
			    System.out.println(CPFObtido);
			} 

			resultofQuery.close();
			query.close();
			conn.close();
			
		}catch (SQLException ex) {
		    // tratar exceção
		    ex.printStackTrace();
		}
	}
	
	

  
}
