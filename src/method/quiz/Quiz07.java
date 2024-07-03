package method.quiz;

public class Quiz07 {

	public static void main(String[] args) {

		function(932);
		function(123);

	}

	public static void function(int num) {

		int n1 = num / 100;
		int n2 = (num - n1 * 100) / 10;
		int n3 = num - n1 * 100 - n2 * 10;

		int result = n1 + n2 + n3;
		System.out.println(n1 + " + " + n2 + " + " + n3 + " = " + result);

	}

}
