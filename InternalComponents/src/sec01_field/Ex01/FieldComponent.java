package sec01_field.Ex01;

// 필드와 지역변수의 구분

// #1. 클래스 생성
class A {
	int m = 3;	// 필드
	int n = 4;	// 필드
	
	void work1() {
		int k = 5;	// 지역변수
		System.out.println(k);	// 5. 지역변수 출력
		work2(7);
	}
	
	void work2(int i) {	// (int i) : 매개변수
		// int i 가장 먼저 실행	=> int i 는 지역변수
		// i = 외부에서 전달된 값 => i의 값은 work1() 메소드의 work2(7)에게 7 값을 전달받아 i = 7이 됨
		int j = 4;	// 지역변수
		System.out.println(i + j);	// 11
	}
}

public class FieldComponent {

	public static void main(String[] args) {
		// #2. 클래스를 활용하여 객체 생성
		A a = new A();
		
		// #3-1. 필드값 출력
		System.out.println(a.m);
		System.out.println(a.n);
		
		System.out.println();
		
		// #3-2. 메소드 호출
		a.work1();
		a.work2(10);
		
	}
}
