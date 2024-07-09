package application;

import java.util.Comparator;

import entities.Product;

public class MyComparator implements Comparator<Product> {
	
	/*Permite a livre alteração da forma de comparação sem precissar acessar outras classes*/

	@Override
	public int compare(Product product1, Product product2) {
		return product1.getName().toUpperCase().compareTo(product2.getName().toUpperCase());
	}

}
