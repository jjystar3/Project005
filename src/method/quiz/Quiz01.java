package method.quiz;

public class Quiz01 {

	public static void main(String[] args) {

		arithmetic(10, 5);
		arithmetic(20, 3);

	}

	public static void arithmetic(int n1, int n2) {

		System.out.println(n1 + "+" + n2 + "=" + (n1 + n2));
		System.out.println(n1 + "-" + n2 + "=" + (n1 - n2));
		System.out.println(n1 + "*" + n2 + "=" + (n1 * n2));
		System.out.println(n1 + "/" + n2 + "=" + (n1 / n2));
		System.out.println(n1 + "%" + n2 + "=" + (n1 % n2));
		
	}

}
