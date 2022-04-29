package sec05_superkeywordsupermethod.Ex02;

class A {
	void abc() {
		System.out.println("A 클래스의 abc()");
	}
}

class B extends A {
	@Override
	void abc() {
		System.out.println("B 클래스의 abc()");
	}
	
	void bcd() {
		super.abc();	// sper.abc() : 부모클래스 객체의 abc() 메소드 호출 => A 클래스의 abc()
	}
}

public class SuperKeyword02 {

	public static void main(String[] args) {
		// #1. 객체 생성
		B bb = new B();
		
		// #2. 메소드 호출
		bb.abc();	// B 클래스의 abc()
		bb.bcd();	// A 클래스의 abc()
	}
}
