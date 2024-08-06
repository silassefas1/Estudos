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
		
		/*Connectar a um banco de dados e inserir dados nele*/
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			connection = DB.getConnection();
			preparedStatement = connection.prepareStatement(
					"INSERT INTO seller "
					+"(Name, Email, BirthDate, BaseSalary, DepartmentId)"
					+"VALUES "
					+"(?, ?, ?, ?, ?)", // O Sinal de ?, é um placeholder que indica um dado a ser preenchido posteriormente.
					Statement.RETURN_GENERATED_KEYS); 
			
			preparedStatement.setString(1, "Carl Purple");
			preparedStatement.setString(2, "Carl@gmail.com");
			preparedStatement.setDate(3, new java.sql.Date(date.parse("22/04/1985").getTime()));
			preparedStatement.setDouble(4, 3250.00);
			preparedStatement.setInt(5, 4);
			
			int rowsAffected = preparedStatement.executeUpdate();
			
			if(rowsAffected >0) {
				ResultSet resulteSet = preparedStatement.getGeneratedKeys();
				while(resulteSet.next()) {
					int id = resulteSet.getInt(1); //coluna 1
					System.out.println("Done! id= "+ id);
				}
			}else {
				System.out.println("No rown affected!");
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		catch(ParseException e) {
			e.printStackTrace();
		}
		finally {
			DB.closeStatement(preparedStatement);
			DB.closeConnection();
		}

		

	}

}