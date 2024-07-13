package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import entities.Product;
import util.UpperCaseName;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD Case", 80.90));
		
		/*Passando a função map(Não confundir com a estrura de dados Map) para aplicar o UpperCase na Lista*/
		//A função map e a função que aplica uma função a todos os elementos de uma stream
		//O .collect(Collectors.toList()) transforma a
		List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		
		names.forEach(System.out::println);
	}

}
