package program;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEBufferedWriter {
	
	public static void main(String[] args) {
		/*Instancia de um vetor de string que sera escrito no arquivo*/
		String[] lines = new String[] {"Bom dia" , "Boa Tarde", "Boa noite"};
		/*Caminho do arquivo*/
		String caminho = "c:\\temp\\out.txt";
		/*Intancia do BufferedWrite com o bloco try with resources*/ //Adiciona true para apenas adicionar os dados no arquivo e não recriar
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminho, true))){
			/*For para escrever cada linha do vetor lines no arquivo*/
			for(String line: lines) {
				bw.write(line); // metodo de escrita
				bw.newLine(); // metodo de proxima linha
			}
			/*Captura de excesoes*/
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}

}
