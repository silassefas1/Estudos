package application;

import dominio.Pessoa;

public class Program {

	public static void main(String[] args) {


		Pessoa p1 = new Pessoa(1, "Bruno Mars", "bruno@gmail.com");
		Pessoa p2 = new Pessoa(1, "Post Malone", "post@gmail.com");
		Pessoa p3 = new Pessoa(1, "Dan Reynolds", "dan@gmail.com");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

	}

}
