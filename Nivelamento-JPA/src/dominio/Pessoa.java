package dominio;

import java.io.Serializable;

public class Pessoa implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String nome;
	private String Email;
	
	public Pessoa() {
		
	}

	public Pessoa(Integer id, String nome, String email) {
		this.id = id;
		this.nome = nome;
		Email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", Email=" + Email + "]";
	}
	
	

}
