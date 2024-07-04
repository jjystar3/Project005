package instance.quiz;

public class Quiz01 {

	public static void main(String[] args) {
		
		Person person = new Person();
		
		person.name = "James";
		person.age = 40;
		person.isMarried = true;
		person.child = 3;
		
	}

}

class Person {
	
	String name;
	int age;
	boolean isMarried;
	int child;
	
}
