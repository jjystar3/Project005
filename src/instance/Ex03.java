package instance;

public class Ex03 {

	public static void main(String[] args) {
		
		Car car = new Car();
		car.setStatus(true);
		car.showStatus();
		
	}

}

// 자동차를 정의하는 클래스
class Car {
	
	boolean status;
	
	public void setStatus(boolean stt) {
		status = stt;
	}
	
	public void showStatus() {
		System.out.println(status);
	}
	
}