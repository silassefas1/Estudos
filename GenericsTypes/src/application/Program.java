package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Product;
import service.CalculationService;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		String path = "C:\\temp\\in.txt";
		/*---Arquivo na pasta temp---
		 * Geladeira,3000 
		 * Máquina de Lavar Roupa, 2500
		 * Forno Micro-ondas, 600
		 * Liquidificador, 150
		 * Cafeteira Elétrica, 200
		 */

		try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
			String line = reader.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = reader.readLine();
			}
			Product max = CalculationService.max(list);
			System.out.println("Max: ");
			System.out.println(max);

		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
