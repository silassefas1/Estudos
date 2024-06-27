package services;

import java.security.InvalidParameterException;

public interface InterestService {

	double getInterestRate();
	/*o metodo de calculo fica como padrão na interface*/
	default double payment(double amount, int month) {
		if (month < 1) {
			throw new InvalidParameterException("Months must be greater than zero");
		}
		return amount * Math.pow(1.0 + getInterestRate() / 100.0, month);
	}
}
