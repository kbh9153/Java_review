package sec02_Interface.Ex05;

// # 방법 2. 익명이너클래스를 이용한 객체 생성
interface A {
	int a = 3;
	void abc();
}

public class CreateObjectOfInterface2 {

	public static void main(String[] args) {
		// #1. 객체 생성
		A a1 = new A() {
			@Override
			public void abc() {
				System.out.println("방법 #2. 익명이너클래스를 이용한 객체 생성");
			}
		};
		
		A a2 = new A() {
			@Override
			public void abc() {
				System.out.println("방법 #2. 익명이너클래스를 이용한 객체 생성");
			}
		};
		
		// #2. 메소드 호출
		System.out.println(a1.a);	// 3
		a1.abc();	// 방법 #2. 익명이너클래스를 이용한 객체 생성
		
		System.out.println(a2.a);	// 3
		a2.abc();	// 방법 #2. 익명이너클래스를 이용한 객체 생성
	}
}
