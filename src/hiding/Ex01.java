package hiding;

public class Ex01 {

	public static void main(String[] args) {
		
		MyDate date = new MyDate();
		date.month = 2;
		date.day = 31;
		System.out.println("현재 날짜: " + date.month + "월 " + date.day + "일");
		
		//public 변수는 잘못된 값이 저장되는 것을 막을 수 없다.
		
	}

}


class MyDate {
	public int month;
	public int day;
}