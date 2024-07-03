package method.quiz;

public class Quiz03 {

	public static void main(String[] args) {

		int bigNum = compare(10, 5);
		System.out.println("10과 5중에서 더 큰 수는 " + bigNum + "입니다.");

		int bigNum2 = compare(2, 3);
		System.out.println("2과 3중에서 더 큰 수는 " + bigNum2 + "입니다.");
	}

	public static int compare(int n1, int n2) {

		if (n1 > n2) {
			return n1;
		} else {
			return n2;
		}

	}

}
