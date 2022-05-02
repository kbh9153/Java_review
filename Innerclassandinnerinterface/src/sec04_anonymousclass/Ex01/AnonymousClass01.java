package sec04_anonymousclass.Ex01;

class A {
	C c = new B();
	
	void abc() {
		c.bcd();
	}
	
	class B implements C {
		@Override
		public void bcd() {
			System.out.println("인스턴스 이너클래스");
		}
	}
	
}

interface C {
	void bcd();		// public abstract 컴파일러가 자동으로 추가
}

public class AnonymousClass01 {

	public static void main(String[] args) {
		// #1. 객체 생성 및 메소드 호출
		A a = new A();
		a.abc();	// 인스턴스 이너클래스
	}
}
