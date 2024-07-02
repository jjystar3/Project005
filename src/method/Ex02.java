package method;

public class Ex02 {

	// 두수를 더하는 함수
	public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}

	public static void main(String[] args) {

		int sum1 = add(3, 5);
		int sum2 = add(4, 2);
		System.out.println(sum1 > sum2);

	}

}
