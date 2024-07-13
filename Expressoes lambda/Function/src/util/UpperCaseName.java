package util;

import java.util.function.Function;

import entities.Product;

public class UpperCaseName implements Function<Product, String> {
	/*Um fanction recebe dois tipos de dados sendo o primeiro o tipo de
	 *  entrada e o segundo a saida(Entrada, Saida)*/
	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
	}

}
