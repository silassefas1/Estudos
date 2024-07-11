package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import util.ProductPredicate;

public class Program {
	
	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD Case", 80.90));
		
		/*Primeira forma de remover todos os elementos da lista com preço maior que $100
		 * - Predicate: p -> p.getPrice() >= 100 */
		
		//list.removeIf(p -> p.getPrice() >= 100);
		
		/*Segunda forma de remover os elementos com preço maior que 100
		 * Criar uma classe que implementa o predicate de product e retorna os produtos com 
		 * valor maior que 100*/
		
		list.removeIf(new ProductPredicate());
		
		for(Product p: list) {
			System.out.println(p);
		}
	}

}
