package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.entities.Contrato;
import model.entities.Parcela;
import model.services.PaypalTax;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		DateTimeFormatter formate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
		System.out.println("Insira os Dados do Contrato");
		System.out.print("Numero do contrato: ");
		String numeroContrato = scan.nextLine();
		System.out.print("Data do Contrato: ");				
		LocalDate dataContrato = LocalDate.parse(scan.nextLine(), formate);
		System.out.print("Informe o valor do contrato: ");
		double valorContrato = scan.nextDouble();
		Contrato novoContrato = new Contrato(numeroContrato, dataContrato,valorContrato);
		
		
		System.out.print("Informe o numero de parcelas do contrato: ");
		int numeroParcelas = scan.nextInt();
		
		Parcela parcela = new Parcela(numeroParcelas, new PaypalTax());
		
		parcela.gerarParcelas(novoContrato, numeroParcelas);
		parcela.imprimirParcelas();
		scan.close();
		
	}

}
