package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entitie.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter file path: ");
		String path = scan.nextLine();
		
		try(BufferedReader reader = new BufferedReader(new FileReader(path))){
			
			List<Employee> list = new ArrayList<>();
			String line = reader.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = reader.readLine();	
			}
			
		System.out.print("Enter Salary: R$ ");
		Double salaryRange = scan.nextDouble();
		
		Comparator<String> comparator = (data1,data2) -> data1.toUpperCase().compareTo(data2.toUpperCase());
		
		List<String> email = list.stream()
				.filter(employee -> employee.getSalary() >= salaryRange)
				.map(employee -> employee.getEmail())
				.sorted(comparator)
				.collect(Collectors.toList());
		email.forEach(System.out::println);
		
		Double name = list.stream()
				.filter(employee -> employee.getName().toUpperCase().startsWith("M"))
				.map(employee -> employee.getSalary())
				.reduce(0.0, (data1,data2) -> (data1+data2));
		
		System.out.println("Sum of Salary of employee with name start with 'M': " + String.format("%.2f", name));
				
				
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		scan.close();

	}

}
