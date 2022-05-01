package sec02_Interface.Ex07;

interface A {
	default void abc() {
		System.out.println("A 인터페이스의 abc()");
	}
}

class B implements A {
	@Override
	public void abc() {
		A.super.abc();	// 인터페이스명.super.메소드명(); -> 그냥 super.메소드명으로 작성시 인터페이스가 아닌 부모 클래스(이 예제에서는 Object 클래스)에서 abc() 메소드를 찾기 때문에 오류 발생
		System.out.println("B 클래스의 abc()");
	}
}

public class DefaultMethod02 {

	public static void main(String[] args) {
		// #1. 객체 생성
		A ab = new B();
		B bb = new B();
		
		// #2. 메소드 호출
		ab.abc();	// A 인터페이스의 abc() -> B 클래스의 abc()
		bb.abc();	// A 인터페이스의 abc() -> B 클래스의 abc()
	}
}
