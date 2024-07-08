package hiding.quiz;

public class Quiz02 {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		car.setMaker("현대");
		car.setModel("소나타");
		car.setColor("흰색");
		car.setMaxSpeed(200);
		
		System.out.println("제조사:" + car.getMaker() + " 모델명:" + car.getModel() + " 색:" + car.getColor() + " 최고속도:" + car.getMaxSpeed());
	}

}

class Car {
	private String maker;
	private String model;
	private String color;
	private int maxSpeed;
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
}