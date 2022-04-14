package sec02_method.Ex02;

public class InternalCallMethod {
	
	public static void main(String[] args) {
		// 같은 클래스 안에 있는 내부 메소드 호출
		print();	// 안녕
		
		int a = twice(7);
		System.out.println(a);	// 14
		
		double b = sum(a, 7.2);
		System.out.println(b);	// 21.2
		
	}
	
	public static void print() {
		System.out.println("안녕");
	}
	
	public static int twice(int k) {
		return k * 2;
	}
	
	public static double sum(int m, double n) {
		return m + n;
	}
}
