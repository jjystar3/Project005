package method.quiz;

public class Quiz06 {

	public static void main(String[] args) {

		calc(1, 5, '+');
		calc(6, 2, '-');
		calc(2, 5, '*');
		calc(10, 2, '/');
		calc(3, 2, '?');

	}

	public static void calc(int n1, int n2, char operator) {

		int result = 0;

//		switch (operator) {
//		case '+':
//			result = n1 + n2;
//			break;
//		case '-':
//			result = n1 - n2;
//			break;
//		case '*':
//			result = n1 * n2;
//			break;
//		case '/':
//			result = n1 / n2;
//			break;
//		default:
//			System.out.println("연산자를 잘못 입력했습니다.");
//			return;
//		}

		if (operator == '+') {

			result = n1 + n2;

		} else if (operator == '-') {

			result = n1 - n2;

		} else if (operator == '*') {

			result = n1 * n2;

		} else if (operator == '/') {

			result = n1 / n2;

		} else {

			System.out.println("연산자를 잘못 입력했습니다.");
			return;
		}

		System.out.println(n1 + " " + operator + " " + n2 + " = " + result);
	}

}
