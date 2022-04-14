package sec02_method.Ex07;

public class FlexibleSizeArrayArgument {
	
	public static void main(String[] args) {
		// #1.
		method1(1, 2);
		method1(1, 2, 3);
		method1();
		
		// #2.
		method2("안녕", "방가");
		method2("땡큐", "베리", "머취");
		method2();
	}
	
	public static void method1(int... values) {	// 가변길이 배열
		// int... values => int[] values = new int[매개변수값 개수만큼 생성] {매개변수 값들};	
		System.out.println("배열의 길이 : " + values.length);
		
		for (int i : values) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static void method2(String... strings) {
		System.out.println("배열의 길이 : " + strings.length);
		
		for (int i = 0; i < strings.length; i++) {
			System.out.print(strings[i] + " ");
		}
		System.out.println();
	}
	
	
	
}