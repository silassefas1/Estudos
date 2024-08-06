package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;
import db.DbIntegrityException;

public class Program {

	public static void main(String[] args) {
		
		/*Connectar a um banco de dados e atualizando dados dele*/
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = DB.getConnection();
			preparedStatement = connection.prepareStatement(
					"DELETE FROM department "
					+ "WHERE "
					+ "(Id = ?)");
			
			preparedStatement.setInt(1, 2); // não pode deletar um chave extrageira com valores associados

			int rowsAffected = preparedStatement.executeUpdate();
			
			System.out.println("Done! Rows affected: " + rowsAffected);
		}
		catch(SQLException e) {
			throw new DbIntegrityException(e.getMessage()); // captura a exceção do jdbc e lança uma personalizada
		}
		finally {
			DB.closeStatement(preparedStatement);
			DB.closeConnection();
		}

		

	}

}
