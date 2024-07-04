package instance.quiz;

public class Quiz02 {

	public static void main(String[] args) {
		
		Order order = new Order();
		
		order.orderNumber = 1111;
		order.orderDate = "2018년3월12일";
		order.ordererName = "둘리";
		order.address = "인천";
		order.showOrderInfo();
		
	}

}

class Order {
	
	int orderNumber;
	String orderDate;
	String ordererName;
	String address;
	
	public void showOrderInfo() {
		System.out.println("주문번호:" + orderNumber + ", 주문날짜:" + orderDate + ", 주문자이름:" + ordererName + ", 배송지:" + address);
	}
	
}
