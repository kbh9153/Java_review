package sec02_Interface.Ex04;

// # 방법 1. 자식클래스 생성 + 자식클래스 생성자로 객체 생성
interface A {
	int a = 3;
	void abc();
}

class B implements A {
	@Override
	public void abc() {
		System.out.println("방법 #1. 자식클래스 생성 + 자식클래스 생성자로 객체 생성");
	}
}

public class CreateObjectOfInterface01 {

	public static void main(String[] agrs) {
		// #1. 객체 생성
		B b1 = new B();
		A b2 = new B();
		
		// #2. 메소드 호출
		b1.abc();	// 방법 #1. 자식클래스 생성 + 자식클래스 생성자로 객체 생성
		System.out.println(b1.a);	// 3
		b2.abc();	// 방법 #1. 자식클래스 생성 + 자식클래스 생성자로 객체 생성
		System.out.println(b2.a);	// 3
	}
}
