package sec02_Interface.Ex06;

interface A {
	void abc();	// 2020년 생성
	default void bcd() {	// 2030년 추가 생성. 접근 지정자 default를 의미하는 것이 아님. 접근 지정자는 인터페이스 문법에 따라 public
		System.out.println("A 클래스의 abc()");
	}
}

class B implements A {	// 2020년 생성
	@Override
	public void abc() {
		System.out.println("B 클래스의 abc()");
	}
}

class C implements A {
	@Override
	public void abc() {
		System.out.println("C 클래스의 abc()");
	}
	
	@Override
	public void bcd() {	 // 일반 메소드처럼 오버라이딩도 가능
		System.out.println("C 클래스의 bcd()");
	}
}

public class DefaultMethod01 {

	public static void main(String[] args) {
		// #1. 객체 생성
		A a1 = new B();
		B b1 = new B();
		A c1 = new C();
		C c2 = new C();
		
		// #2. 메소드 호출
		a1.abc();	// B 클래스의 abc()
		a1.bcd();	// A 클래스의 abc()
		b1.abc();	// B 클래스의 abc()
		b1.bcd();	// A 클래스의 abc()
		c1.abc();	// C 클래스의 abc()
		c1.bcd();	// C 클래스의 bcd()
		c2.abc();	// C 클래스의 abc()
		c2.bcd();	// C 클래스의 bcd()
	}
}
