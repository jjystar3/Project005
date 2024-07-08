package hiding;

public class Ex03 {

	public static void main(String[] args) {

		Person person = new Person();
		person.setName("홍길동");
		person.setHeight(190);
		person.setWeight(80);
		System.out.println("이름:" + person.getName());
		System.out.println("키:" + person.getHeight());
		System.out.println("몸무게:" + person.getWeight());
	}

}

class Person {
	private String name;
	private int height;
	private double weight;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

}