package program;

import java.io.File;
import java.util.Scanner;

public class AbrindoPastasEArquivos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // instancia do scanner
		
		System.out.println("Enter a Folder Path: ");
		String stringCaminho = sc.nextLine(); // recebe o caminho do arquivo
		
		File caminho = new File(stringCaminho); // passa o caminho para a variavel do tipo file.
		
		/*Gera um lista de diretorio no caminho indicado | a função File::isDerectori e um metodo que ira apresentar
		 * apenas pastas na lista*/ 
		File[] pastas = caminho.listFiles(File::isDirectory);
 		
		System.out.println("FODLERS: ");
		for(File folder: pastas) {
			System.out.println(folder);
		}

		System.out.println("FILES: ");
		File[] arquivos = caminho.listFiles(File::isFile);
		for(File file: arquivos) {
			System.out.println(file);
		}
		sc.close();
		
		boolean succeess = new File(stringCaminho + "\\Nova pasta").mkdir();
		if(succeess) {
			System.out.println("Diretorio criado com Sucesso ");
		}else {
			System.out.println("Falha ao criar diretorio");
		}
		
	}

}
