package sec05_superkeywordsupermethod.Ex01;

class A {
	void abc() {
		System.out.println("A 클래스의 abc()");
	}
}

class B extends A {
	@Override
	void abc() {
		System.out.println("B 클래스의 abc()");;
	}
	
	void bcd() {
		abc();	// this.abc() => B 클래스의 abc() -> this는 컴파일러가 자동으로 생성해줌
	}
}

public class SuperKeyword01 {

	public static void main(String[] args) {
		// #1. 객체 생성
		B bb = new B();
		
		// #2. 메소드 호출
		bb.abc();	// B 클래스의 abc()
		bb.bcd();	// B 클래스의 abc()
	}
}
