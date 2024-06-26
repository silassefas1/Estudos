package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employee;

public class Program {
	
	public static void main(String[] args) {
		
		List<Employee> lista = new ArrayList<>();
		String caminho = "C:\\temp\\in.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(caminho))){
			
				String employeeCsv = br.readLine();
				while(employeeCsv != null) {
					String[] fields = employeeCsv.split(",");
					lista.add(new Employee(fields[0], Double.parseDouble(fields[1]))); //converte um string em um double
					employeeCsv = br.readLine();
				}
				Collections.sort(lista);
				for(Employee emp: lista) {
					System.out.println(emp.getName() +","+emp.getSalary());
				}
		
		}catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());
			
		}
	}

}
