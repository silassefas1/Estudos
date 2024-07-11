package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import util.PriceUpdate;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD Case", 80.90));
		
		/*Passando a classe de presso com o consumer para atualizar o preço em 10% */
		list.forEach(new PriceUpdate());
		/*Usando o forEach na classe do tipo system.out e o parametro println para printa os elementos da lista*/
		list.forEach(System.out::println);

	}

}
