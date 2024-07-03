package method.quiz;

public class Quiz03 {

	public static void main(String[] args) {

		int bigNum = compare(10, 5);
		System.out.println("10, 5중에서 더 큰 수는 " + bigNum + "입니다.");

		int bigNum2 = compare(2, 7);
		System.out.println("2, 7중에서 더 큰 수는 " + bigNum2 + "입니다.");

		printBiggerNumber(5, 5);
	}

	public static int compare(int n1, int n2) {

		if (n1 > n2) {
			return n1;
		} else {
			return n2;
		}

	}

	public static void printBiggerNumber(int n1, int n2) {

		if (n1 == n2) {
			System.out.println(n1 + ", " + n2 + "는 같은 수 입니다.");
		} else {
			System.out.println(n1 + ", " + n2 + "중에서 더 큰 수는 " + compare(n1, n2) + "입니다.");
		}

	}

}
