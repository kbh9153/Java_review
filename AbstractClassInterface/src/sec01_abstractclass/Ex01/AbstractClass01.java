package sec01_abstractclass.Ex01;

// 추상클래스의 객체 생성방법 #1 (자식클래스 생성 + 자식클래스 생성자를 가지고 객체 생성)
	// 여러 객체를 생성할 떄는 자식클래스를 생성하는 것이 편리함
abstract class A {
	abstract void abc();
}

class B extends A {
	@Override
	void abc() {
		System.out.println("방법 #1. 자식클래스 생성 및 추상메소드 구현");
	}
}

public class AbstractClass01 {

	public static void main(String[] args) {
		// #1. 객체 생성
		B b1 = new B();
		A b2 = new B();
		
		// #2. 메소드 호출
		b1.abc();	// 방법 #1. 자식클래스 생성 및 추상메소드 구현
		b2.abc();	// 방법 #1. 자식클래스 생성 및 추상메소드 구현
	}
}
