package method.quiz;

public class Quiz05 {

	public static void main(String[] args) {
		
		divide(10, 2);
		divide(15, 5);
		divide(10, 0);
		
	}

	public static void divide(int n1, int n2) {
		
		if (n2 == 0) {
			System.out.println("나누는 수는 0이 될 수 없습니다");
		} else {
			int result = n1 / n2;
			System.out.println(n1 + "/" + n2 + "=" + result);
		}
		
	}

}
