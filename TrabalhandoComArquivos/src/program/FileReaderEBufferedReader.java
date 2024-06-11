package program;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEBufferedReader {
	
	public static void main(String[] args) {
		
		String caminho = "c:\\Temp\\in.txt"; // caminho do arquivo a ser lido
		
		FileReader fr = null; // inicializando o filereader
		BufferedReader br = null; // inicializando o filereader
		
		try {
			
			fr = new FileReader(caminho); // passa o caminho do arquivo para o file reader
			br = new BufferedReader(fr); // usa o buffer reader para ler o file reader de forma mais rapida
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
		finally{
			/*fechando o leitores*/
			try {
				if(br != null) {
					br.close();
				}
				if(fr != null) {
					fr.close();
					}
				}
			/*tratando excessoes na hora de fechar o arquivo*/
			catch(IOException e){
				e.printStackTrace();
			}
		}
		
	}

}
