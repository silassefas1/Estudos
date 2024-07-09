package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product ("TV", 900.00));
		list.add(new Product ("Notebook", 1200.00));
		list.add(new Product ("Tablet", 450.00));
		
		//list.sort(new MyComparator()); // removendo o comparable da class product, mantem-se a classe fechada para alterações no futuro
		
		
		//--------------------------------------------------------------------
		
		/*
		// 1 - forma alternativa com uma classe anonima
		Comparator<Product> comp =new Comparator<Product>(){
			@Override
			public int compare(Product product1, Product product2) {
				return product1.getName().toUpperCase().compareTo(product2.getName().toUpperCase());
			}
			
		};
		
		list.sort(comp); 
		*/
		
		//-------------------------------------------------------------
		

	
		//2 - forma com expressao lambda, tambem é uma função anonima
		Comparator<Product> comp = (product1, product2) ->  product1.getName().toUpperCase().compareTo(product2.getName().toUpperCase());
	
		
		list.sort(comp); // pode ser colocada diretamente aqui no argumento do sort
		
		for (Product product: list) {
			System.out.println(product);
		}
	}

}
