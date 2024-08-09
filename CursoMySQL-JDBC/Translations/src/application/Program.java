package application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbException;

public class Program {

	public static void main(String[] args) {
		
		/*Connectar a um banco de dados e atualizando dados dele*/
		
		Connection connection = null;
		Statement statement = null;
		try {
			connection = DB.getConnection();
			statement = connection.createStatement();
			
			connection.setAutoCommit(false); // aqui desativa o alto commit das operações
			
			int affectedRows = statement.executeUpdate("UPDATE seller SET BaseSalary = 3010 WHERE DepartmentId = 1");
			/*
			// Teste de error na trasação
			int x=1;
			if(x<2) {
				throw new SQLException("Fake error");
			}*/
			int affectedRows2 = statement.executeUpdate("UPDATE seller SET BaseSalary = 4015 WHERE DepartmentId = 2");
			
			connection.commit(); // passa o update do bloco inteiro, se der erro no caminho não atualiza.
			
			System.out.println("AffectedRows 1: " + affectedRows);
			System.out.println("AffectedRows 2: " + affectedRows2);
		}
		catch(SQLException e) {
			try {
				connection.rollback();// volta o banco ao ultimo estado de integridade
				throw new DbException("Transaction rolled back! Caused by: "+ e.getMessage());
			} catch (SQLException e1) {
				//Erro no rollback
				throw new DbException("Erro trying to rollback! Caused by:  "+ e1.getMessage());
			} 
		}
		finally {
			DB.closeStatement(statement);
			DB.closeConnection();
		}

		

	}

}
