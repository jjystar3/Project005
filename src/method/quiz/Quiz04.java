package method.quiz;

public class Quiz04 {

	public static void main(String[] args) {
		
		int value1 = subtract(20, 10);
		int value2 = subtract(5, 1);
		int value3 = subtract(10, 20);
		
		System.out.println("20-10=" + value1);
		System.out.println("5-1=" + value2);
		System.out.println("10-20=" + value3);
		
	}

	public static int subtract(int n1, int n2) {
		
		if (n1 < n2) {
			return -999;
		}
		
		int result = n1 - n2;
		return result;
		
	}

}
