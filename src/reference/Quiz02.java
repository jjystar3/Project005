package reference;

public class Quiz02 {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee("김철수", 30, 500, 5);
		Employee emp2 = new Employee("이영희", 27, 600, 6);
		Employee emp3 = new Employee("한민철", 44, 620, 8);
		
		Department dpm = new Department(emp1, emp2, emp3);
		
	}

}

class Department {

	Employee headDpm;
	Employee seniorRsc;
	Employee leadRsc;
	
	public Department(Employee headDpm, Employee seniorRsc, Employee leadRsc) {
		super();
		this.headDpm = headDpm;
		this.seniorRsc = seniorRsc;
		this.leadRsc = leadRsc;
	}
	
}

class Employee {
	
	String name;
	int age;
	int salary;
	int yearsOfService;
	
	public Employee(String name, int age, int salary, int yearsOfService) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.yearsOfService = yearsOfService;
	}
	
}