package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		
		Map<String, Integer> totalVotos = new TreeMap<>();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter File Path");
		String path = scan.nextLine();
		
		
		try(BufferedReader reader = new BufferedReader(new FileReader(path))){
			
			String dataCsv = reader.readLine();
			while (dataCsv != null) {
				String aux[] = dataCsv.split(",");
				if(totalVotos.containsKey(aux[0])) {
					int somaVoto = totalVotos.get(aux[0]);
					totalVotos.put(aux[0], somaVoto + Integer.parseInt(aux[1]));
				}else {
					totalVotos.put(aux[0], Integer.parseInt(aux[1]));
				}
					
				
				
				dataCsv = reader.readLine();
			}
			
			for(String key: totalVotos.keySet()) {
				System.out.println(key +", "+ totalVotos.get(key));
			}
			
			
		}
		catch(IOException exception) {
			System.out.println("ERRO: "+ exception.getMessage());
		}
		
		
		scan.close();

	}

}
