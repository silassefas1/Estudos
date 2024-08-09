package application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class Program {

	public static void main(String[] args) {
		
		/*Connectar a um banco de dados e atualizando dados dele*/
		
		Connection connection = null;
		Statement statement = null;
		try {
			connection = DB.getConnection();
			statement = connection.createStatement();
			int affectedRows = statement.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");
			
			// Teste de error na trasação
			int x=1;
			if(x<2) {
				throw new SQLException("Fake error");
			}
			int affectedRows2 = statement.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");
			
			System.out.println("AffectedRows 1: " + affectedRows);
			System.out.println("AffectedRows 2: " + affectedRows2);
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			DB.closeStatement(statement);
			DB.closeConnection();
		}

		

	}

}
