package sec01_instanceinnerclass.Ex02;

class A {
	int a = 3;
	int b = 4;
	void abc() {
		System.out.println("A 클래스 메소드");
	}
	
	// 인스턴스 이너클래스 정의
	class B {
		int a = 5;
		int b = 6;
		void abc() {
			System.out.println("B 클래스 메소드");
		}
		
		void bcd() {
			// #1. inner class 멤버 호출 또는 사용
			System.out.println(a);	// 5. this를 컴파일러가 자동으로 추가
			System.out.println(b);	// 6. this를 컴파일러가 자동으로 추가
			abc();	// B 클래스 메소드. this를 컴파일러가 자동으로 추가
			
			// #2. outer class 멤버 호출 또는 사용
			System.out.println(A.this.a);	// 3
			System.out.println(A.this.b);	// 4
			A.this.abc();	// A 클래스 메소드
		}
	}
}

public class UseMembersOfOuterClass {

	public static void main(String[] agrs) {
		// #1. outer class 객체 생성
		A a = new A();
		
		// #2. inner class 객체 생성
		A.B b = a.new B();
		b.bcd();
	}
	
}
