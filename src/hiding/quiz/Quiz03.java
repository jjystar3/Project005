package hiding.quiz;

public class Quiz03 {

	public static void main(String[] args) {
		
		MyDate date = new MyDate();
		date.setMonth(13);
		date.setDay(5);
		
		System.out.println(date.getMonth() + "월 " + date.getDay() + "일");
	}

}

class MyDate {
	private int month;
	private int day;
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if(month < 1 || month > 12) {
			System.out.println(month + "은 잘못된 월입니다");
			return;
		}
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	
	
}