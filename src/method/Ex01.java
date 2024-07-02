package method;

public class Ex01 {

	public static void main(String[] args) {
		
		method1();
		
		String str = method2();
		System.out.println(str);
		
		method3(15,20);
		
		int i = method4(20,50);
		System.out.println(i);
		
	}
	
	public static void method1() {
		System.out.println("매개변수와 리턴타입이 둘 다 없는 메소드");
		return; // 생략 가능
	}
	
	public static String method2() {
		return "매개변수가 없지만 반환값이 있는 메소드";
	}
	
	public static void method3(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("sum : " + sum);
	}
	
	public static int method4(int num1, int num2) {
		return num1 + num2;
	}
	
}
