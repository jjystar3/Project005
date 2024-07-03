package method.quiz;

public class Quiz02 {

	public static void main(String[] args) {
		
		int sum = add(5, 10);
		System.out.println("5부터 10까지의 합은 " + sum);

		int sum2 = add(3, 7);
		System.out.println("3부터 7까지의 합은 " + sum2);
		
	}

	public static int add(int n1, int n2) {
		
		int result = 0;
		
		for (int i = n1; i <= n2; i++) {
			result += i;
		}
		
		return result;
		
	}

}
