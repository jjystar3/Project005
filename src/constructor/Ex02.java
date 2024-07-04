package constructor;

public class Ex02 {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.name = "둘리";
		person1.height = 180;
		person1.weight = 80;

		Person person2 = new Person("또치");
		person2.height = 160;
		person2.weight = 50;

		Person person3 = new Person("도우너", 170, 60);
	}

}

class Person {
	String name;
	int height;
	int weight;

	// 디폴트 생성자: 객체만 생성
	public Person() {

	}

	// 이름을 받아서 초기화하는 생성자
	public Person(String nm) {
		name = nm;
	}

	// 이름, 키, 몸무게를 받아서 초기화하는 생성자
	public Person(String nm, int he, int we) {
		name = nm;
		height = he;
		weight = we;
	}
}
