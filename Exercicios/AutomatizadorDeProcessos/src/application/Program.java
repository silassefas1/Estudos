package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contrato;
import model.services.Parcela;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		DateTimeFormatter formate = DateTimeFormatter.ofPattern("dd/MM/YY");
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Insira os Dados do Contrato");
		System.out.print("Numero do contrato: ");
		int numeroContrato = scan.nextInt();
		
		Contrato novoContrato = new Contrato(numeroContrato);
		
		System.out.print("Data do Contrato: ");
		LocalDateTime dataContrato = LocalDateTime.parse(scan.nextLine(), formate);
		System.out.print("Informe o valor do contrato: ");
		double valorContrato = scan.nextDouble();
		
		System.out.println("Informe o numero de parcelas do contrato: ");
		int numeroParcelas = scan.nextInt();
		
		Parcela parcela = new Parcela(valorContrato, dataContrato, numeroParcelas);
	

		
		scan.close();
	}

}
