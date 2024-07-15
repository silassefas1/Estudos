package entities;

public class Product {
	
	private String nome;
	private double price;
	
	public Product(String nome, double price) {
		this.nome = nome;
		this.price = price;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Nome" + nome + ", "+ String.format("%.2f", price);
	}
	
	

}
