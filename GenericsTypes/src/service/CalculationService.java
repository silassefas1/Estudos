package service;

import java.util.List;

public class CalculationService {
	/*Ao definir um tipo T qualquer para o metodo, ele se tornou um metodo generico que aceita qualquer tipo T, desde que T seja o mesmo tipo */
	
	public static <T extends Comparable<T>>T max(List<T> list) {
		if(list.isEmpty()) {
			throw new IllegalStateException("List can't be empty");
		}
		T max = list.get(0);
		for(T item:list) {
			if(item.compareTo(max)> 0) {
				max = item;
			}
		}
		return max;
		
		
		
		
	}

}
