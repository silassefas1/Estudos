package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbException;

public class Program {

	public static void main(String[] args) {
		
		/*Connectar a um banco de dados, recuperar dados de statement e gaudar na variavel resultSet*/
		
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		try {
			
			connection = DB.getConnection(); // faz a conexão com o banco
			statement = connection.createStatement(); // instancia do statement
			resultSet = statement.executeQuery("select * from department"); // passa o comando SQL 
			
			while(resultSet.next()) {
				System.out.println(resultSet.getInt("Id") + ", " + resultSet.getString("Name"));
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			DB.closeResultSet(resultSet);
			DB.closeStatement(statement);
			DB.closeConnection();
		}
		

	}

}
