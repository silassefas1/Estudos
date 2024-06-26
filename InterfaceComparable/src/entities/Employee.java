package entities;

public class Employee implements Comparable<Employee>{
	
	private String name;
	private Double salary;
	
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	/*@Override
	public int compareTo(Employee other) {
		// compara o nome de um funcionario com outro e ordena em ordem crescente
		return name.compareTo(other.getName());
	}
	*/
	@Override
	public int compareTo(Employee other) {
		// compara o salario de um funcionario com outro e ordena em ordem crescente
		return salary.compareTo(other.getSalary());
	}
	
	
	

}
