package program;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Application {
	
	public static void main(String[] args) {
		
		File file = new File("c:\\temp\\in.txt"); // instancia um objeto do tipo File que irar acessar o objeto e da funções a ele
		
		Scanner sc = null;
		
		/*criado um bloco try para caso gere execessoes*/
		try {
			sc = new Scanner(file); // Instancia o Scanner passando o arquivo para leitura
			/* Bloco while para ler e imprimir o que estiver dentro do arquivo enquanto houver uma linha*/
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
	
		}catch(IOException e){ // bloco catch para capturar execessoes do tipo IOException geradas pela tentaiva de leitura do arquivo
			System.out.println("Erro: " + e.getMessage());
		}finally {
			/*bloco de fechamento que sera executado independete de cair no try ou catch*/
			if (sc != null) { // fecha o escanner se for diferente de nulo
				sc.close(); // fechamento do scan
			}
			
		}
	}


}
