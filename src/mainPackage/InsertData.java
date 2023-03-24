package mainPackage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import database_connection.DBConn;

public class InsertData {
	
	
	public static void OfaUser() 
			throws Exception {
		
		try (Scanner input = new Scanner(System.in);
			     Connection conn = DBConn.getConexao()) {
			    System.out.print("Digite o nome: ");
			    String name = input.nextLine();
			    System.out.print("Digite o CPF: ");
			    String CPF = input.nextLine();
			    System.out.print("Digite a idade: ");
			    int age = input.nextInt();
			    System.out.print("Digite o saldo: ");
			    double balance = input.nextDouble();

			    String SQL = "INSERT INTO Newusers (nome, CPF, age, balance) VALUES (?, ?, ?, ?)";
			    PreparedStatement query = conn.prepareStatement(SQL);
			    query.setString(1, name);
			    query.setString(2, CPF);
			    query.setInt(3, age);
			    query.setDouble(4, balance);
			    query.executeUpdate();
			    System.out.println("Pessoa Adicionada com Sucesso");
			} catch (SQLException ex) {
			    // tratar exceção
			    ex.printStackTrace();
			}
		
	}
}
