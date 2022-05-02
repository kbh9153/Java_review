package sec05_InnerInterface.Ex01;

class A {
	
	static interface B {	// 인스턴스 이너인터페이스라는 것은 불가. 이너인터페이스는 무조건 static이 붙음. static 생략시 컴파일러가 자동으로 추가
		public abstract void bcd();
	}
	
}

class C implements A.B {
	@Override
	public void bcd() {
		System.out.println("이너인터페이스 구현 클래스 생성");
	}
}

public class CreateObjectOfInnerInterface {

	public static void main(String[] args) {
		// 객체생성 방법 #1. 자식클래스 직접 생성
		A.B ab = new C();
		C c = new C();
		ab.bcd();	// 이너인터페이스 구현 클래스 생성
		c.bcd();	// 이너인터페이스 구현 클래스 생성
		
		// 객체생성 방법 #2. 익명이너클래스 생성
		A.B b = new A.B() {
			@Override
			public void bcd() {
				System.out.println("익명이너클래스로 객체 생성");
			}
		};
		
		b.bcd();	// 익명이너클래스로 객체 생성
	}
}
