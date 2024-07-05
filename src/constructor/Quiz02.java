package constructor;

public class Quiz02 {

	public static void main(String[] args) {
		
		Car car1 = new Car("현대", "쏘나타", "흰색", 200);
		Car car2 = new Car("기아", "레이", "검정색", 150);
		
	}

}

class Car{
	String maker;
	String model;
	String color;
	int maxSpeed;
	
	public Car() {
		super();
	}

	public Car(String maker, String model, String color, int maxSpeed) {
		super();
		this.maker = maker;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}