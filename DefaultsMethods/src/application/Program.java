package application;

import java.util.Locale;
import java.util.Scanner;

import services.InterestService;
import services.UsaInterestService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Amount: ");
		double amount = scan.nextDouble();
		System.out.print("Months: ");
		int months = scan.nextInt();
		
		//BrazilInterestService interestService = new BrazilInterestService(2.0);
		//UsaInterestService interestService = new UsaInterestService(1.0); subistituidos pela interface, onde cada classe implementa a interface
		// deixando o programa mas flexivel
		InterestService interestService = new UsaInterestService(2.0);
		double payment = interestService.payment(amount, months);
		
		System.out.println("Payment after " + months + " months:");
		System.out.println(String.format("%.2f", payment));
		
		scan.close();
	}

}
