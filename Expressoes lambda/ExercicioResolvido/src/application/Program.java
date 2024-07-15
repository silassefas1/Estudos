package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Full file path: ");
		String path = scan.nextLine();
		//"C:\\Users\\Rh\\Desktop\\Projetos\\Estudos\\Expressoes lambda\\ExercicioResolvido";
		
		try(BufferedReader reader = new BufferedReader( new FileReader(path))){
			
			List<Product> list = new ArrayList<>();
			String line = reader.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = reader.readLine();
			}
			
			
			
			
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		scan.close();
	}

}
