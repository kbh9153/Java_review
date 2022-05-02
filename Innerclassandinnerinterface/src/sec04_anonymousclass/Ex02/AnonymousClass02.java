package sec04_anonymousclass.Ex02;

class A {
	C c = new C() {
		@Override
		public void bcd() {
			System.out.println("익명이너클래스");
		}
	};
	
	void abc() {
		c.bcd();
	}
}

interface C {
	void bcd();
}

public class AnonymousClass02 {

	public static void main(String[] args) {
		// #1. 객체 생성 및 메소드 호출
		A a = new A();
		a.abc();	// 익명이너클래스
	}
}
