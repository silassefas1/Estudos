package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		
		Map<String, String> cookies = new TreeMap<>(); // TreeMap ordena os elementos pela chave
		
		cookies.put("username", "Maria"); // adiciona um elemento ao map
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "99711122");
		
		cookies.remove("email"); // remove
		cookies.put("phone", "99711133"); // sobrescreve o valor, não aceita repetições
		
		System.out.println("ALL COOKIES");
		//prite dos elementos no map
		//KeySet retorna um Set com a chave do map
		for(String key: cookies.keySet()) {
			System.out.println(key + ": "+cookies.get(key));
		}

	}

}
