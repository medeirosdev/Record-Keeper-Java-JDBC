package mainPackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import database_connection.DBConn;

public class RemoveData {
	
	public static void OfaUser() 
			throws Exception {
		try {
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			System.out.print("Digite o nome do Usuário para Deletar ");
			String nome = input.nextLine();
			Connection conn = DBConn.getConexao();
			String SQL = "DELETE FROM Newusers WHERE nome = ?";
		    PreparedStatement query = conn.prepareStatement(SQL);
		    query.setString(1, nome);
		    query.executeUpdate();
		    System.out.println("Pessoa Deleta com Sucesso, seu nome era:" + nome);
		}catch (SQLException ex) {
		    // tratar exceção
		    ex.printStackTrace();
		}
	}
}
