package program;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
	
public static void main(String[] args) {
		
		String caminho = "c:\\Temp\\in.txt"; // caminho do arquivo a ser lido
		
		/*Nesse modelo de try a String é iniciada dentro do try, não sendo necessario fecha-la*/
		try (BufferedReader br = new BufferedReader(new FileReader(caminho))){

			String line = br.readLine(); // atribui a linha de leitura a uma string
			
			/*Loop while que ira mostra as linhas enquanto forem diferetes de null*/
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch(IOException e){
			// tratando excessoes da leitura do arquivo
			System.out.println("Erro: " +e.getMessage());
			

		}
	}
}
