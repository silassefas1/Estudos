package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product;

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
		//list.removeIf(new ProductPredicate());
		
		/*Usando um metodo como referencia no lugar do predicato*/
		//list.removeIf(Product::staticProductPredicate);
		
		/*Expressao lambda declarada*/
		//Predicate<Product> predicate = p -> p.getPrice() >= 100.00;
		//list.removeIf(predicate);
		
		for(Product p: list) {
			System.out.println(p);
		}
	}

}
