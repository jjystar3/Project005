package method;

public class Ex04 {

	public static void printHello(int cnt) {
		for (int i = 1; i <= cnt; i++) {
			System.out.println("안녕하세요");
		}
	}
	
	public static void printDiamond(int length) {
		for (int i = 1; i <= length; i++) {
			for (int k = 1; k <= Math.abs(Math.round((float) length / 2) - i); k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= length - (Math.abs(Math.round((float) length / 2) - i) * 2); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		printHello(5);
		printDiamond(5);
	}

}
