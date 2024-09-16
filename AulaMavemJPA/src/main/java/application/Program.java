package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Program {

	public static void main(String[] args) {

/*		Inserir no banco
		Pessoa p1 = new Pessoa(null, "Bruno Mars", "bruno@gmail.com");
		Pessoa p2 = new Pessoa(null, "Post Malone", "post@gmail.com");
		Pessoa p3 = new Pessoa(null, "Dan Reynolds", "dan@gmail.com");
		*/
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		/*entityManager.getTransaction().begin();
		entityManager.persist(p1);
		entityManager.persist(p2);
		entityManager.persist(p3);
		entityManager.getTransaction().commit();*/
		
		/*Buscar no banco
		
		Pessoa pessoa = entityManager.find(Pessoa.class,2);
		System.out.println(pessoa);*/
		
		/*Removendo do banco*/
		entityManager.getTransaction().begin();
		Pessoa pessoa = entityManager.find(Pessoa.class, 2);
		entityManager.remove(pessoa);
		entityManager.getTransaction().commit();
		
		System.out.println("Done!! ");
		entityManager.close();
		entityManagerFactory.close();

	}

}
