package sec02_method.Ex06;

public class MethodOverloading {

	public static void main(String[] args) {
		print();	// 데이터가 없습니다.
		print(3);	// 3
		print(7.4);	// 7.4
		print(3, 7);	// 3, 7
	}
	
	public static void print() {
		System.out.println("데이터가 없습니다.");
	}
	
	public static void print(int a) {
		System.out.println(a);
	}
	
	public static void print(double a) {
		System.out.println(a);
	}
	
//	public static void print(double b) {	
//		System.out.println(b);
//	}	// 오버로딩시 구분하기 위해 확인되는 메소드 시그니처는 매개변수의 타입! => 이미 더블 타입의 매개변수 하나를 가진 메소드가 존재하기 때문에 사용 불가
	
	public static void print(int a, int b) {
		System.out.println("a : " + a + "\nb : " + b);
	}
	
//	public static int print(int a, int b) {
//		System.out.println("a : " + a + "\nb : " + b);
//		return a + b;
//	}	// 리턴 타입은 메소드 시그니처에 포함되지 않음 => 사용 불가
	
}
