package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;

public class Program {

	public static void main(String[] args) {
		
		/*Connectar a um banco de dados e atualizando dados dele*/
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = DB.getConnection();
			preparedStatement = connection.prepareStatement(
					"UPDATE seller "
					+ "SET BaseSalary = BaseSalary + ? "
					+ "WHERE "
					+ "(DepartmentId = ?)");
			
			preparedStatement.setDouble(1, 350.0);
			preparedStatement.setInt(2, 2);
			
			int rowsAffected = preparedStatement.executeUpdate();
			
			System.out.println("Done! Rows affected: " + rowsAffected);
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			DB.closeStatement(preparedStatement);
			DB.closeConnection();
		}

		

	}

}
