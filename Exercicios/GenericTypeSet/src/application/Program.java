package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

import entities.LogEntry;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter file full path: ");
		String path = scan.nextLine();
		
		
		try(BufferedReader reader = new BufferedReader(new FileReader(path))){
			
			Set<LogEntry> set = new HashSet<>();
			String line = reader.readLine();
			while(line != null) {
				
				String[] fields = line.split(" ");
				String username = fields[0];
				Date moment = Date.from(Instant.parse(fields[1]));
				
				set.add(new LogEntry(username, moment));
				
				line = reader.readLine();
			}
			System.out.println("Total Users: "+ set.size());
		}
		catch(IOException e){
			System.out.println("Erro: "+ e.getMessage());
		}
		scan.close();
		
		
	}

}
